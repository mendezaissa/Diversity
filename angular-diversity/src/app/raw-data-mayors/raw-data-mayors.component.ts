import { Component, OnInit } from '@angular/core';
import { GetAllService } from '../get-all.service';
import { Mayor } from '../mayor';

@Component({
  selector: 'app-raw-data-mayors',
  templateUrl: './raw-data-mayors.component.html',
  styleUrls: ['./raw-data-mayors.component.css']
})
export class RawDataMayorsComponent implements OnInit {

  mayors : Mayor[];

  constructor(private getAllService : GetAllService) { }

  ngOnInit(): void {
    this.getAllMayors();
  }

  //get all mayors
  getAllMayors() : void {
  this.getAllService.getMayors().subscribe(mayors => this.mayors = mayors);
  }

}
