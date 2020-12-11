import { Component, OnInit } from '@angular/core';
import { GetAllService } from '../get-all.service';
import { Governor } from '../governor';
import { HOR } from '../HOR';
import { Mayor } from '../mayor';
import { Senator } from '../senator';
import { Person } from '../person';

@Component({
  selector: 'app-raw-data',
  templateUrl: './raw-data.component.html',
  styleUrls: ['./raw-data.component.css']
})
export class RawDataComponent implements OnInit {

  persons : Person[];
  governors : Governor[];
  hors : HOR[];
  mayors : Mayor[];
  senators : Senator[];

  constructor( private getAllService : GetAllService) { }

  ngOnInit(): void {
    this.getAllPersons();
    this.getAllGovernors();
    this.getAllHors();
    this.getAllMayors();
    this.getAllSenators();
  }

  //get all persons
  getAllPersons() : void {
    this.getAllService.getPersons().subscribe(persons => this.persons = persons);
  }

  //get all governors
  getAllGovernors() : void {
    this.getAllService.getGovernors().subscribe(governors => this.governors = governors);
  }

  //get all hors
  getAllHors() : void {
    this.getAllService.getHORs().subscribe(hors => this.hors = hors);
  }

  //get all mayors
  getAllMayors() : void {
    this.getAllService.getMayors().subscribe(mayors => this.mayors = mayors);
  }

  //get all senators
  getAllSenators() : void {
    this.getAllService.getSenators().subscribe(senators => this.senators = senators);
  }


}
