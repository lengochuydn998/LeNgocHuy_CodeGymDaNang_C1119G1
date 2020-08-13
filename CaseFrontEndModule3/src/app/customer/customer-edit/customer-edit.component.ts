import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../customer.service';
import {Customer} from '../customer';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {FormBuilder, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customer = new Customer();
  customerForm: FormGroup;
  dayPicked;
  minDate = new Date(1900 , 1 , 1);
  maxDate = new Date(2002 , 11 , 31);
  constructor(private customerService: CustomerService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const id = Number(param.get('id'));
      this.customerService.findById(id).subscribe(
        next => {this.customer = next ; this.change();
        },
        error => console.log(error),
      );
    });
    this.customerForm = this.fb.group({
      id: [''],
      name: [''],
      birthday: [''],
      idCard: [''],
      numberPhone: [''],
      email: [''],
      address: ['']
    });
  }
  onSubmit(): void {
    this.customerService.editById(this.customerForm.value).subscribe(
      next => {alert('Bạn Đã Update Thành Công'),
        this.router.navigate(['list-customer']); }
        ,
      error => console.log(error)
    );
  }
  onDateChange(event): void {
    let dd = event.getDate();
    let mm = event.getMonth() + 1;
    const yyyy = event.getFullYear();
    if (dd < 10) {
      dd = '0' + dd;
    }
    if (mm < 10) {
      mm = '0' + mm;
    }
    this.dayPicked = dd + '/' + mm + '/' + yyyy;
  }
  change() {
    this.customerForm.patchValue({
      id: this.customer.id,
      name: this.customer.name,
      birthday: this.customer.birthday,
      idCard: this.customer.idCard,
      numberPhone: this.customer.numberPhone,
      email: this.customer.email,
      address: this.customer.address
    });
  }
}
