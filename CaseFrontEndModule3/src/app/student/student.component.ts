import { Component, OnInit } from '@angular/core';
import {Student} from './student';
import {StudentService} from './student.service';
declare var $: any;

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  studentList: Student[];
  tempStudent: Student = new Student();
  totalRecords: number;
  page = 1;
  search;
  key = 'name';
  constructor(private studentService: StudentService) { }
  ngOnInit(): void {
    this.studentService.findAll().subscribe(
      next => {this.studentList = next ; this.totalRecords = next.length; },
      error => {
        this.studentList = [];
        console.log(error);
      }
    );
  }
  deleteById(id: number){
    this.studentService.deleteById(id).subscribe(
      next => window.location.reload(),
      error => console.log(error)
    );
  }
  showModel(element: Student) {
    this.tempStudent = element;
    $('#exampleModal').modal('show');
  }
}
