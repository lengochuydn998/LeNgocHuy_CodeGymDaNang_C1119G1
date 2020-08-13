import { Component, OnInit } from '@angular/core';
import {Student} from '../student';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  student: Student;
  constructor(private activatedRoute: ActivatedRoute,
              private studentService: StudentService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) =>{
      const id = Number(param.get('id'));
      this.student = this.studentService.findById(id);
    });
  }

}
