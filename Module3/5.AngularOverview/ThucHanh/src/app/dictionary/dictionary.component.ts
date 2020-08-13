import { Component, OnInit } from '@angular/core';
import {Dictionary} from './dictionary';
import {DictionaryService} from './dictionary.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-dictionary',
  templateUrl: './dictionary.component.html',
  styleUrls: ['./dictionary.component.css']
})
export class DictionaryComponent implements OnInit {
  dictionary: Dictionary[];
  constructor(private dictionaryService: DictionaryService, private routers: Router) { }
  ngOnInit(): void {
    this.dictionary = this.dictionaryService.dictionaryBig;
  }
  goDetail(key: string){
    this.routers.navigate(['dictionary', key]);
  }
}
