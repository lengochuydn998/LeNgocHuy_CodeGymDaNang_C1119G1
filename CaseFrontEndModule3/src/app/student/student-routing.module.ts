import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';
import {StudentComponent} from './student.component';
import {EditStudentComponent} from './edit-student/edit-student.component';

const routers = [
  {path: 'list-student', component: StudentComponent},
  {path: 'edit-student/:id', component: EditStudentComponent}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers)
  ]
})
export class StudentRoutingModule { }
