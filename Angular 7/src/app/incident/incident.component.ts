import { Component, OnInit } from '@angular/core';
import { HttpClientService, Incident } from '../service/httpclient.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-incident',
  templateUrl: './incident.component.html',
  styleUrls: ['./incident.component.css']
})
export class IncidentComponent implements OnInit {

  incidents:Incident[];
   
  constructor( private router: Router,
    private httpClientService:HttpClientService
  ) { }

  ngOnInit() {
    this.httpClientService.getIncident().subscribe(
     response =>this.handleSuccessfulResponse(response),
    );
  }

handleSuccessfulResponse(response)
{
    this.incidents=response;
}
edit(inc): void {
    localStorage.removeItem("editIncId");
    localStorage.setItem("editIncId", inc.incidentID.toString());
      this.router.navigate(['editInc']);
  };

delete(inc): void {
  this.httpClientService.delete(inc.incidentID)
    .subscribe( data => {
      this.incidents = this.incidents.filter(u => u !== inc);
    })
};


}
