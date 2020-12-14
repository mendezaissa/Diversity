import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators'; 

import { Governor } from './governor';
import { HOR } from './HOR';
import { Mayor } from './mayor';
import { Senator } from './senator';
import { Person } from './person';

@Injectable({
  providedIn: 'root'
})
export class GetAllService {
  url:string = "http://18.219.31.96/api";
  

  httpOptions = {
    headers: new HttpHeaders( { 'Content-type': 'application/json' })
  };

  constructor( private http: HttpClient ) { }

  //get all persons
  getPersons(): Observable<Person[]>{
    return this.http.get<Person[]>(`${this.url}/persons`)
      .pipe(
        catchError(this.handleError<Person[]>('getPersons', []))
      );
  }

    //get all governors
    getGovernors(): Observable<Governor[]>{
      return this.http.get<Governor[]>(`${this.url}/governors`)
        .pipe(
          catchError(this.handleError<Governor[]>('getGovernors', []))
        );
    }

    //get all HORs
    getHORs(): Observable<HOR[]>{
    return this.http.get<HOR[]>(`${this.url}/HORs`)
      .pipe(
        catchError(this.handleError<HOR[]>('getHORs', []))
      );
  }

    //get all mayors
    getMayors(): Observable<Mayor[]>{
    return this.http.get<Mayor[]>(`${this.url}/mayors`)
      .pipe(
        catchError(this.handleError<Mayor[]>('getMayors', []))
      );
  }

    //get all senators
    getSenators(): Observable<Senator[]>{
      return this.http.get<Senator[]>(`${this.url}/senators`)
        .pipe(
          catchError(this.handleError<Senator[]>('getSenators', []))
        );
    }



    private handleError<T>(operation = 'operation', result?: T){
      return (error: any): Observable<T> => {
        return of(result as T);
      }
    }
}
