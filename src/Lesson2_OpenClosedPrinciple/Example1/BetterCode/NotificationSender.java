package Lesson2_OpenClosedPrinciple.Example1.BetterCode;
import Lesson2_OpenClosedPrinciple.Example1.ProblematicCode.NotificationType;

import java.util.List;

public class NotificationSender {
    //we are keeping List<> since a user can opt for multiple notifications, i.e., user can
    // opt for say all 3 notification types i.e., SMS, Whatsapp, Email, so we will have a list of notification types.
    public void sendNotification(List<Notification> notifications)
    {
    for(Notification notification: notifications)
    {
        notification.send();
    }

    }
}
