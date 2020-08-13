import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateStudentComponent } from './create-student/create-student.component';
import { StudentDetailComponent } from './student-detail/student-detail.component';
import {RouterModule} from '@angular/router';
import {StudentRoutingModule} from '../student-routing.module';
import {StudentPageComponent} from './student-page.component';
import {ReactiveFormsModule} from '@angular/forms';



@NgModule({
  declarations: [CreateStudentComponent, StudentDetailComponent, StudentPageComponent],
  exports: [
    StudentPageComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    StudentRoutingModule,
    ReactiveFormsModule
  ]
})
export class StudentPageModule { }
