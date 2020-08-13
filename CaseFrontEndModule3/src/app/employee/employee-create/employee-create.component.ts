import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {EmployeeService} from '../employee.service';

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  dayPicked;
  minDate = new Date(1900, 1, 1);
  maxDate = new Date(2002, 11, 31);
  employeeForm: FormGroup;

  constructor(private fb: FormBuilder,
              private employeeService: EmployeeService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.employeeForm = this.fb.group({
      id: [''],
      name: ['', [Validators.required, Validators.pattern('^[a-zA-Z0-9\\_\\-\\sÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹế]+$')]],
      birthday: ['', Validators.required],
      salary: ['', Validators.required],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}|[0-9]{12}$')]],
      numberPhone: ['', [Validators.required, Validators.pattern('^(090|091|84\+90|84\+91)+[0-9]{7}$')]],
      email: ['', [Validators.required, Validators.pattern('^[a-zA-Z]{1}[a-zA-Z0-9\\_]{1,100}\\@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}$')]],
      address: ['', [Validators.required, Validators.pattern('^[a-zA-Z0-9\\-\\/\\sÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹế]+$')]],
      pos: ['', Validators.required],
      level: ['', Validators.required],
      part: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.employeeForm.valid) {
      this.employeeService.create(this.employeeForm.value).subscribe(
        next => {
          if (next && next.id) {
            alert('Bạn đã thêm mới thành công');
            this.router.navigate(['list-employee']);
          }
        }
      );
    } else {
      alert('Invalid');
    }
  }
}

