import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  studentForm: FormGroup;

  constructor(private fb: FormBuilder,
              private studentService: StudentService) { }

  ngOnInit(): void {
    this.studentForm = this.fb.group({
      id: [''],
      name: [''],
      dateOfBirth: [''],
    });
  }
  onSubmit(): void {
    this.studentForm.patchValue({
      id: Math.round(Math.random() * 1000)
    });
    this.studentService.create(this.studentForm.value).subscribe(
      next => window.location.reload(),
      error => console.log(error)
    );
  }
}
