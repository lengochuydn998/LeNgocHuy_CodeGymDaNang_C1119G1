import { Component, OnInit } from '@angular/core';
import {StudentService} from '../student.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Student} from '../student';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  student: Student;
  constructor(private studentService: StudentService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const id = Number(param.get('id'));
      this.studentService.findById(id).subscribe(
        next => {
          this.student = next;
          console.log(this.student);
        } ,
        error => console.log(error)
      );
    });
  }

}
