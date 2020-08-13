import { Component, OnInit } from '@angular/core';
import {Student} from '../student';
import {StudentService} from '../student.service';
import {Route, Router} from '@angular/router';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  studentLis: Student[];
  constructor(private studentService: StudentService, private router: Router) {}

  ngOnInit(): void {
    this.studentLis = this.studentService.studentList;
  }
  goDetail(id: number): void{
    this.router.navigate(['student-detail', id]);
  }
}
