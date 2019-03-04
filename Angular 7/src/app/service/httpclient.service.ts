import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Incident{
  constructor(
  public incidentID:string,
	public incidentType:string,
	public priority:string,
	public reportedDate:string,
	public storeNo:string,
	public country:string,
	public workedBy:string,
	public occurnce:string,
	public breachedTime:string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {
baseUrl: string = 'http://localhost:8080/incident';

  constructor(
    private httpClient:HttpClient
  ) { 
     }

     getIncident()
  {
    console.log("test call");
    return this.httpClient.get<Incident[]>(this.baseUrl+'/list');
  }

  public delete(id) {
    return this.httpClient.delete<Incident>(this.baseUrl +'/delete/'+ id);
  }

  public createInc(incident) {
    return this.httpClient.post<Incident>(this.baseUrl, incident);
  }

  public getIncById(id) {
    return this.httpClient.get<Incident>(this.baseUrl + '/getInc/' + id);
  }

  public update(inc: Incident) {
    return this.httpClient.put(this.baseUrl + '/update/', inc);
  }

}
