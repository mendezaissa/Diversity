import { Component, OnInit } from '@angular/core';
import { GetAllService } from '../get-all.service';
import { Person } from '../person';

@Component({
  selector: 'app-raw-data-persons',
  templateUrl: './raw-data-persons.component.html',
  styleUrls: ['./raw-data-persons.component.css']
})
export class RawDataPersonsComponent implements OnInit {

  person: Person;
  persons : Person[];

  constructor(private getAllService : GetAllService) { 
  }

  ngOnInit(): void {
    this.getAllPersons();
  }

  //get all persons
  getAllPersons() : void {
    this.getAllService.getPersons().subscribe(persons => this.persons = persons);
  }

}
