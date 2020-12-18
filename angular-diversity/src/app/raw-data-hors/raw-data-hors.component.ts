import { Component, OnInit } from '@angular/core';
import { HOR } from '../HOR';
import { GetAllService } from '../get-all.service';

@Component({
  selector: 'app-raw-data-hors',
  templateUrl: './raw-data-hors.component.html',
  styleUrls: ['./raw-data-hors.component.css']
})
export class RawDataHorsComponent implements OnInit {

  hors : HOR[];

  constructor(private getAllService : GetAllService) { }

  ngOnInit(): void {
    this.getAllHors();
  }

  //get all hors
  getAllHors() : void {
    this.getAllService.getHORs().subscribe(hors => this.hors = hors);
  }

}
