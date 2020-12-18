import { Component, OnInit } from '@angular/core';
import { GetAllService } from '../get-all.service';
import { Governor } from '../governor';

@Component({
  selector: 'app-raw-data-governors',
  templateUrl: './raw-data-governors.component.html',
  styleUrls: ['./raw-data-governors.component.css']
})
export class RawDataGovernorsComponent implements OnInit {

  governors : Governor[];

  constructor(private getAllService : GetAllService) { }

  ngOnInit(): void {
    this.getAllGovernors();
  }

  //get all governors
  getAllGovernors() : void {
  this.getAllService.getGovernors().subscribe(governors => this.governors = governors);
  }

}
