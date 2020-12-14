import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GovernorsComponent } from './governors/governors.component';
import { HorsComponent } from './hors/hors.component';
import { MayorsComponent } from './mayors/mayors.component';

import { RawDataComponent } from './raw-data/raw-data.component';
import { SenatorsComponent } from './senators/senators.component';

const routes: Routes = [
  { path : 'raw-data', component : RawDataComponent },
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
