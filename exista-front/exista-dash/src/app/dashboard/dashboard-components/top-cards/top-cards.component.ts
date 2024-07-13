import { Component, OnInit } from '@angular/core';
import {topcard,topcards} from './top-cards-data';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-top-cards',
  templateUrl: './top-cards.component.html'
})
export class TopCardsComponent implements OnInit {

  topcards: topcard[];

  constructor(private httpClient: HttpClient) { // Injete HttpClient
     this.topcards = [];
  // this.topcards=topcards;
  }



  ngOnInit(): void {
    this.httpClient.get<topcard[]>('http://localhost:8080/wallets/topCards').subscribe(data => {
      this.topcards = data;
      console.log(data);
    });
  }
}
