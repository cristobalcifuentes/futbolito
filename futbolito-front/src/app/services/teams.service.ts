import { HttpClient, HttpParams } from '@angular/common/http';
import { EventEmitter, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Team } from 'src/app/models/team';
import { environment } from 'src/environments/environment';
import { TeamWithAthletes } from '../models/team-with-athletes';

@Injectable({
  providedIn: 'root'
})
export class TeamsService {

  idMyTeam: number = 0;

  teamsURL: string = environment.apiUrl + '/team';

  constructor(private httpClient: HttpClient) { }

  public newTeam(newTeam: Team) : Observable<Team>{
    return this.httpClient.post<Team>(this.teamsURL + '/new-team', newTeam)
  }

  public getMyTeams() : Observable<Team[]>{
    return this.httpClient.get<Team[]>(this.teamsURL + '/my-teams')
  }

  public getMyTeam(idTeam: number) :  Observable<TeamWithAthletes>{
    let param: any = {'idTeam': idTeam};
    return this.httpClient.get<TeamWithAthletes>(this.teamsURL + '/my-team/', {params: param});
  }

  public setIdMyTeam(idMyTeam: number){
    this.idMyTeam = idMyTeam;
  }

  public createdInvitationMyTeam(idTeam :number, idGuest:number) : Observable<boolean>{
    let body: any = {'idTeam' :idTeam, 'idGuest': idGuest};
    return this.httpClient.post<boolean>(environment.apiUrl + '/invitation/created-invitation', body);
  }

  public getTeam(idTeam: number) :  Observable<TeamWithAthletes>{
    let param: any = {'idTeam': idTeam};
    return this.httpClient.get<TeamWithAthletes>(this.teamsURL + '/team/', {params: param});
  }








  

 



}
