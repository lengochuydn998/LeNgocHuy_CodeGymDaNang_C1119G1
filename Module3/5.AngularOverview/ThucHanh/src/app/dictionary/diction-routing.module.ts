import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {DictionarySmallComponent} from './dictionary-small/dictionary-small.component';
import {RouterModule} from '@angular/router';

const routers = [
  {path: 'dictionary/:key', component: DictionarySmallComponent}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers)
  ]
})
export class DictionRoutingModule { }
