import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DictionaryPageComponent } from './dictionary-page.component';
import { DictionaryDetailComponent } from './dictionary-detail/dictionary-detail.component';
import {DictionaryRoutingModule} from './dictionary-routing.module';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';



@NgModule({
  declarations: [DictionaryPageComponent, DictionaryDetailComponent],
  exports: [
    DictionaryPageComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    DictionaryRoutingModule,
    FormsModule
  ]
})
export class DictionaryPageModule { }
