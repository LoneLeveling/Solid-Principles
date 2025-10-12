package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP,

    PushNotification;


    public void SendSMSNotification()
    {
        System.out.println("Sending SMS notification");
    }

    public void SendEmailNotification()
    {
        System.out.println("Sending Email notification");
    }

    public void SendWhatsAppNotification()
    {
        System.out.println("Sending Whatsapp notification");
    }
}
