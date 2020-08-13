import { Component, OnInit } from '@angular/core';
import {DictionaryService} from './dictionary.service';
import {Route, Router} from '@angular/router';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  dictionary;
  word: string;
  constructor(private dictionaryService: DictionaryService, private router: Router) { }

  ngOnInit(): void {
    this.dictionary = this.dictionaryService.dictionary;
  }
  goDetail(){
    this.router.navigate(['dictionary-detail', this.word]);
  }
}
