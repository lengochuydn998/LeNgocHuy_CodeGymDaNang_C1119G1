import { Injectable } from '@angular/core';
import {Dictionary} from './dictionary';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionaryBig = [
    new Dictionary('huy', 'deptrai'),
    new Dictionary('love', 'yeu'),
    new Dictionary('huyen', 'xinhdep')
  ];
  constructor() { }

  findByKey(key: string): Dictionary {
    return this.dictionaryBig.find(item => item.key === key);
  }
}
