import { Injectable } from '@angular/core';
import {Student} from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  studentList = [
    new Student(1, 'Tien', '2k'),
    new Student(2, 'Hung', '3k'),
    new Student(3, 'Thien', '1999'),
    new Student(4, 'huy', '2k')
  ];
  constructor() { }

  findById(id: number): Student{
    return this.studentList.find(student => student.id === id);
  }
}
