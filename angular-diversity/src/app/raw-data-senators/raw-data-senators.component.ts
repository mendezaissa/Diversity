import { Component, OnInit } from '@angular/core';
import { GetAllService } from '../get-all.service';
import { Senator } from '../senator';

@Component({
  selector: 'app-raw-data-senators',
  templateUrl: './raw-data-senators.component.html',
  styleUrls: ['./raw-data-senators.component.css']
})
export class RawDataSenatorsComponent implements OnInit {

  senators : Senator[];

  constructor(private getAllService : GetAllService) { }

  ngOnInit(): void {
    this.getAllSenators();
  }

  //get all senators
  getAllSenators() : void {
  this.getAllService.getSenators().subscribe(senators => this.senators = senators);
  }

}
