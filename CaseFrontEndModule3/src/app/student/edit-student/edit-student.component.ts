import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-edit-student',
  templateUrl: './edit-student.component.html',
  styleUrls: ['./edit-student.component.css']
})
export class EditStudentComponent implements OnInit {
  studentEditForm: FormGroup;
  studentOfId;
  constructor(private fb: FormBuilder,
              private studentService: StudentService,
              private router: Router,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.studentEditForm = this.fb.group({
      id: [''],
      ten_sinh_vien: ['', [Validators.required, Validators.pattern('^[a-zA-Z0-9\\_\\-\\sÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹế]+$')]],
      ten_nhom: ['', Validators.required],
      ten_de_tai: ['', Validators.required],
      giao_vien_huong_dan: ['', Validators.required],
      email: ['', [Validators.required, Validators.pattern('^[a-zA-Z]{1}[a-zA-Z0-9\\_]{1,100}\\@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}$')]],
      so_dien_thoai: ['', [Validators.required, Validators.pattern('([0-9]{10}|[0-9]{12})')]]
    });
    this.activatedRoute.params.subscribe(data => {
      this.studentOfId = data.id;
      this.studentService.findById(this.studentOfId).subscribe(next => {
        this.studentEditForm.patchValue(next);
      });
    });
  }
  onSubmit(){
    if (this.studentEditForm.valid){
      this.studentService.editEmployee(this.studentEditForm.value, this.studentOfId).subscribe(data => {
        alert('Bạn đã edit thành công !!!');
        this.router.navigateByUrl('list-student');
      });
    }else {
      alert('Invalid');
    }
  }
  removelist(){
    this.router.navigate(['list-student']);
  }
}
