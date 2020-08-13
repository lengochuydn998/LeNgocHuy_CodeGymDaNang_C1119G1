import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DictionaryComponent } from './dictionary.component';
import { DictionarySmallComponent } from './dictionary-small/dictionary-small.component';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {DictionRoutingModule} from './diction-routing.module';



@NgModule({
  declarations: [DictionaryComponent, DictionarySmallComponent],
  exports: [
    DictionaryComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    DictionRoutingModule,
    FormsModule
  ]
})
export class DictionaryModule { }
