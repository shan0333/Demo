import { Component, OnInit } from '@angular/core';
import { HttpClientService, Incident } from '../service/httpclient.service';
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {first} from "rxjs/operators";
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-edit-inc',
  templateUrl: './edit-inc.component.html',
  styleUrls: ['./edit-inc.component.css']
})
export class EditIncComponent implements OnInit {
 start: Date;
  inc: Incident;
  editForm: FormGroup;
  constructor(private formBuilder: FormBuilder,private router: Router, private httpClientService: HttpClientService, public datepipe: DatePipe) { }

  ngOnInit() {
    let incId = localStorage.getItem("editIncId");
    if(!incId) {
      alert("Invalid action.")
      this.router.navigate(['']);
      return;
    }
     this.editForm = this.formBuilder.group({
      
      incidentID: ['', Validators.required],
      incidentType: ['', Validators.required],
      priority: ['', Validators.required],
      reportedDate: ['', Validators.required],
      storeNo: ['', Validators.required],
      country: ['', Validators.required],
      workedBy: ['', Validators.required],
      occurnce: ['', Validators.required],
      breachedTime: ['', Validators.required]
    });
    this.httpClientService.getIncById(incId)
      .subscribe( data => {
        
      data.reportedDate = this.datepipe.transform(new Date(data.reportedDate), 'yyyy-MM-dd');
       data.breachedTime = this.datepipe.transform(new Date(data.breachedTime), 'yyyy-MM-dd');
        this.editForm.setValue(data);
      });
  }

  onSubmit() {
    this.httpClientService.update(this.editForm.value)
      .pipe(first())
      .subscribe(
        data => {
        
          this.router.navigate(['']);
          
        },
        error => {
          alert(error);
        });
  }

}
