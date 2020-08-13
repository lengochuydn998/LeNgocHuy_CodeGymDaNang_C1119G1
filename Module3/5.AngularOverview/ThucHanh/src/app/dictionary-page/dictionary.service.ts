import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionary = [
    {en: 'hello', vn: 'xinchao'},
    {en: 'huyen', vn: 'xinhdep'},
    {en: 'huy', vn: 'lovehinhin'}
  ];
  constructor() { }
  findByWord(word: string){
    return this.dictionary.find (item => item.en === word);
  }
}
