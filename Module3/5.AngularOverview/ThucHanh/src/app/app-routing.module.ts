import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {PetComponent} from './pet/pet.component';
import {LoginComponent} from './login/login.component';
import {StudentComponent} from './student/student.component';
import {TimelinesComponent} from './timelines/timelines.component';

const routes: Routes = [
  {path: 'pet', component: PetComponent},
  {path: 'login', component: LoginComponent},
  {path: '*', component: PetComponent},
  {path: 'student-detail/:id', component: StudentComponent},
  {path: 'timelines', component: TimelinesComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
