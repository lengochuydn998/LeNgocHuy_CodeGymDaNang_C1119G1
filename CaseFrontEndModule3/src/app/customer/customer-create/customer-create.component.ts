import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  dayPicked;
  customerForm: FormGroup;
  minDate = new Date(1900 , 1 , 1);
  maxDate = new Date(2002 , 11 , 31);
  constructor(private fb: FormBuilder,
              private customerService: CustomerService,
              private router: Router) { }

  ngOnInit(): void {
    this.customerForm = this.fb.group({
      id: [''],
      name: ['', Validators.required],
      birthday: [''],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}|[0-9]{12}$')]],
      numberPhone: ['', [Validators.required, Validators.pattern('^(090|091|84\+90|84\+91)+[0-9]{7}$')]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', Validators.required]
    });
  }
  // onSubmit(){
  //   this.customerService.create(this.customerForm.value).subscribe(
  //     next => window.location.reload(),
  //     error => console.log(error)
  //   );
  // }
  onSubmit(){
    if (this.customerForm.valid){
      this.customerService.create(this.customerForm.value).subscribe(
        next => {
          if (next && next.id){
            alert('Bạn đã thêm mới thành công'),
              this.router.navigate(['list-customer']);
          }
        }
      );
    }else {
      alert('Invalid');
    }
  }
}
