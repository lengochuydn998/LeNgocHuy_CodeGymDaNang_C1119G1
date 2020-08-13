import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  filterStatus = 'xem_tat_ca';
  name = '';
  imgUrl = 'https://vcdn-ngoisao.vnecdn.net/2019/09/25/ANH-1-9778-1569408745.png';
  forgot = false;
  isHighLight = true;
  evenStyle = {color: 'red', fontSize: '30px'};
  oddStyle = {color: 'blue', fontSize: '30px'};
  currentClass = {circle: !this.isHighLight, square: this.isHighLight};
  isShow = true;
  isShowForm = false;
  arrHung = ['HungNgu', 'HungOcCho' , 'HungBeDe'];
   arrWords = [
    { id: 1, en: 'action', vn: 'hành động', memorized: true },
    { id: 2, en: 'actor', vn: 'diễn viên', memorized: false },
    { id: 3, en: 'activity', vn: 'hoạt động', memorized: true },
    { id: 4, en: 'active', vn: 'chủ động', memorized: true },
    { id: 5, en: 'bath', vn: 'tắm', memorized: false },
    { id: 6, en: 'bedroom', vn: 'phòng ngủ', memorized: true }
  ];
   newEn = '';
   newVn = '';
   constructor() { }
  ngOnInit(): void {
  }
  showEvent(event){
    this.name = event.target.value;
  }
  toggleForgot(){
    this.forgot = !this.forgot;
  }
  addWord(){
     this.arrWords.unshift({
       id: this.arrWords.length + 1,
       en: this.newEn,
       vn: this.newVn,
       memorized: false,
     });
     this.newEn = '';
     this.newVn = '';
     this.isShowForm = false;
  }
  delete(id: number){
     const index = this.arrWords.findIndex(word => word.id === id);
     this.arrWords.splice(index, 1);
  }
  status(memorized: boolean){
     const dkXemTatCa = this.filterStatus === 'xem_tat_ca';
     const dkXemDaNho = this.filterStatus === 'xem_da_nho' && memorized;
     const dkXemChuaNho = this.filterStatus === 'xem_chua_nho' && !memorized;
     return dkXemTatCa || dkXemDaNho || dkXemChuaNho ;
  }
}
