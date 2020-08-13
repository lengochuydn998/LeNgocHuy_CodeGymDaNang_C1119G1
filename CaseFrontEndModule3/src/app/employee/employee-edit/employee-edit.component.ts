import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {EmployeeService} from '../employee.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  minDate = new Date(1900 , 1 , 1);
  maxDate = new Date(2002 , 11 , 31);
  employeeEditForm: FormGroup;
  employyeeOfId;
  constructor(private fb: FormBuilder,
              private employeeService: EmployeeService,
              private router: Router,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.employeeEditForm = this.fb.group({
      id: [''],
      name: ['', Validators.required],
      birthday: ['', Validators.required],
      salary: ['', Validators.required],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}|[0-9]{12}$')]],
      numberPhone: ['', [Validators.required, Validators.pattern('^(090|091|84\+90|84\+91)+[0-9]{7}$')]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', Validators.required],
      pos: ['', Validators.required],
      level: ['', Validators.required],
      part: ['', Validators.required]
    });
    this.activatedRoute.params.subscribe(data =>{
      this.employyeeOfId = data.id;
      this.employeeService.findById(this.employyeeOfId).subscribe(next => {
        this.employeeEditForm.patchValue(next);
      });
    });
  }
  onSubmit(){
    if (this.employeeEditForm.valid){
      this.employeeService.editEmployee(this.employeeEditForm.value, this.employyeeOfId).subscribe(data => {
        alert('Bạn đã edit thành công !!!');
        this.router.navigateByUrl('list-employee');
      });
    }else {
      alert('Invalid');
    }
  }
}
