package Lesson2_OpenClosedPrinciple.Example1.BetterCode;

import Lesson2_OpenClosedPrinciple.Example1.ProblematicCode.NotificationSender;
import Lesson2_OpenClosedPrinciple.Example1.ProblematicCode.NotificationType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    NotificationSender ns = new NotificationSender();
    List<NotificationType> notificationTypes= new ArrayList<>();
    notificationTypes.add(NotificationType.SMS);
    notificationTypes.add(NotificationType.WHATSAPP);
    ns.sendNotification(notificationTypes);
    ns.sendNotification(notificationTypes);
    }
}