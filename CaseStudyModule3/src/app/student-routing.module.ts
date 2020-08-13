import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';
import {StudentDetailComponent} from './student-page/student-detail/student-detail.component';
import {CreateStudentComponent} from './student-page/create-student/create-student.component';

const routers = [
  {path: 'student-detail/:id', component: StudentDetailComponent},
  {path: 'create-student', component: CreateStudentComponent}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers)
  ]
})
export class StudentRoutingModule { }
