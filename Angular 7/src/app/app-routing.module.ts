import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IncidentComponent } from './incident/incident.component';
import { AddIncComponent } from './add-inc/add-inc.component';
import {EditIncComponent} from "./edit-inc/edit-inc.component";

const routes: Routes = [

  { path:'', component: IncidentComponent},
  { path:'addInc', component: AddIncComponent},
  { path: 'editInc', component: EditIncComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
