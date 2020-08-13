import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateStudentComponent } from './create-student/create-student.component';
import { EditStudentComponent } from './edit-student/edit-student.component';
import { StudentComponent } from './student.component';
import {StudentRoutingModule} from './student-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {RouterModule} from '@angular/router';
import {Ng2OrderModule} from 'ng2-order-pipe';
import {Ng2SearchPipeModule} from 'ng2-search-filter';



@NgModule({
  declarations: [CreateStudentComponent, EditStudentComponent, StudentComponent],
  imports: [
    CommonModule,
    StudentRoutingModule,
    FormsModule,
    NgxPaginationModule,
    RouterModule,
    Ng2OrderModule,
    Ng2SearchPipeModule,
    ReactiveFormsModule
  ]
})
export class StudentModule { }
