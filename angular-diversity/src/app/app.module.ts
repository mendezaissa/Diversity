import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';
import { RawDataComponent } from './raw-data/raw-data.component';
import { SenatorsComponent } from './senators/senators.component';
import { PersonsComponent } from './persons/persons.component';
import { MayorsComponent } from './mayors/mayors.component';
import { HorsComponent } from './hors/hors.component';
import { GovernorsComponent } from './governors/governors.component';
import { RawDataSenatorsComponent } from './raw-data-senators/raw-data-senators.component';
import { RawDataGovernorsComponent } from './raw-data-governors/raw-data-governors.component';
import { RawDataMayorsComponent } from './raw-data-mayors/raw-data-mayors.component';
import { RawDataHorsComponent } from './raw-data-hors/raw-data-hors.component';
import { RawDataPersonsComponent } from './raw-data-persons/raw-data-persons.component';
import { TeamComponent } from './team/team.component';

@NgModule({
  declarations: [
    AppComponent,
    RawDataComponent,
    SenatorsComponent,
    PersonsComponent,
    MayorsComponent,
    HorsComponent,
    GovernorsComponent,
    RawDataSenatorsComponent,
    RawDataGovernorsComponent,
    RawDataMayorsComponent,
    RawDataHorsComponent,
    RawDataPersonsComponent,
    TeamComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
