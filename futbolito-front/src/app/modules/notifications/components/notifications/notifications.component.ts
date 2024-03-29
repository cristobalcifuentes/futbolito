import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { NotificationsService } from 'src/app/services/notifications.service';
import { Notification } from 'src/app/models/notification.model';
import { NotificationType } from 'src/app/models/enums/notification-type.enum';

@Component({
  selector: 'app-notifications',
  templateUrl: './notifications.component.html',
  styleUrls: ['./notifications.component.css']
})
export class NotificationsComponent implements OnInit {

  notifications: Notification[] = [];
  TEAM_INVITATION : NotificationType = NotificationType.TEAM_INVITATION;
  INVITATION_ACCEPTED : NotificationType = NotificationType.INVITATION_ACCEPTED;
  NEW_MEMBER_TEAM : NotificationType = NotificationType.NEW_MEMBER_TEAM;
  INVITATION_REJECTION : NotificationType = NotificationType.INVITATION_REJECTION;

  constructor(
    private router : Router,
    private notificationsService: NotificationsService,
  ) { }

  ngOnInit(): void {
    this.getnotifications();
    
   
    
  }

  getnotifications(){
    this.notificationsService.getNotifications().subscribe(
            notifications => {
              this.notifications = notifications;
              console.log(this.notifications)

      }
    )
  }

}
