import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { RawDataComponent } from './raw-data/raw-data.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { SenatorsComponent } from './senators/senators.component';
import { PersonsComponent } from './persons/persons.component';
import { MayorsComponent } from './mayors/mayors.component';
import { HorsComponent } from './hors/hors.component';
import { GovernorsComponent } from './governors/governors.component';

@NgModule({
  declarations: [
    AppComponent,
    RawDataComponent,
    SenatorsComponent,
    PersonsComponent,
    MayorsComponent,
    HorsComponent,
    GovernorsComponent
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
