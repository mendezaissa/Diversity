import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RawDataComponent } from './raw-data/raw-data.component';

const routes: Routes = [
  { path : 'raw-data', component : RawDataComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
