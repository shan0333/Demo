import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IncidentComponent } from './incident/incident.component';
import { HttpClientModule } from '@angular/common/http';
import { AddIncComponent } from './add-inc/add-inc.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { EditIncComponent } from './edit-inc/edit-inc.component';
import { DatePipe } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    IncidentComponent,
    AddIncComponent,
    HeaderComponent,
    FooterComponent,
    EditIncComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [DatePipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
