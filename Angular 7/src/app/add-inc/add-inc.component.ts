import { Component, OnInit } from '@angular/core';
import { HttpClientService, Incident } from '../service/httpclient.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-inc',
  templateUrl: './add-inc.component.html',
  styleUrls: ['./add-inc.component.css']
})
export class AddIncComponent implements OnInit {

  inc: Incident = new Incident("","","","","","","","","");

  constructor(
    private httpClientService: HttpClientService, private router: Router
  ) { }

  ngOnInit() {
  }

  createIncident(): void {
    this.httpClientService.createInc(this.inc)
        .subscribe( data => {
        console.log(data);
        
          
        }, error => {
        console.log(error.text);
          alert(error.text);
          this.router.navigate(['']);
        });

       

  };

}
