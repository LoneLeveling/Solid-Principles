package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;
import java.util.List;
public class NotificationSender {
    //we are keeping List<> since a user can opt for multiple notifications, i.e., user can
    // opt for say all 3 notification types i.e., SMS, Whatsapp, Email, so we will have a list of notification types.
    public void sendNotification(List<NotificationType> notificationTypes)
    {
        for (NotificationType type:notificationTypes)
        {
            if (type==NotificationType.SMS)
            {
                type.SendSMSNotification();
            } else if (type==NotificationType.EMAIL)
            {
                type.SendEmailNotification();
            } else if (type==NotificationType.WHATSAPP)
            {
                type.SendWhatsAppNotification();
            }
        }
        }
}
