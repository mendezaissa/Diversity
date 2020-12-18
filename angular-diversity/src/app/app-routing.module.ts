import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GovernorsComponent } from './governors/governors.component';
import { HorsComponent } from './hors/hors.component';
import { MayorsComponent } from './mayors/mayors.component';
import { RawDataGovernorsComponent } from './raw-data-governors/raw-data-governors.component';
import { RawDataHorsComponent } from './raw-data-hors/raw-data-hors.component';
import { RawDataMayorsComponent } from './raw-data-mayors/raw-data-mayors.component';
import { RawDataPersonsComponent } from './raw-data-persons/raw-data-persons.component';
import { RawDataSenatorsComponent } from './raw-data-senators/raw-data-senators.component';

import { RawDataComponent } from './raw-data/raw-data.component';
import { SenatorsComponent } from './senators/senators.component';

const routes: Routes = [
  { path : 'homepage', component : RawDataComponent },
  { path : '', component : RawDataComponent },
  { path : 'raw-data-senators', component : RawDataSenatorsComponent },
  { path : 'raw-data-governors', component : RawDataGovernorsComponent },
  { path : 'raw-data-mayors', component : RawDataMayorsComponent },
  { path : 'raw-data-hors', component : RawDataHorsComponent },
  { path : 'raw-data-persons', component : RawDataPersonsComponent },
  { path : 'governors', component : GovernorsComponent},
  { path : 'hors', component : HorsComponent},
  { path : 'mayors', component : MayorsComponent},
  { path : 'senators', component : SenatorsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
