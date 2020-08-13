import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';
import {DictionaryDetailComponent} from './dictionary-detail/dictionary-detail.component';
const routers = [
  {path: 'dictionary-detail/:en', component: DictionaryDetailComponent}
];


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers)
  ]
})
export class DictionaryRoutingModule { }
