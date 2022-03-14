package com.company;

public class NotificationService {
    public static void main(String[] args) {

        try {
            NotificationFactory notificationFactory = new NotificationFactory();

            // Notification notification = notificationFactory.createNotification("SMS");
            //  Notification notification = notificationFactory.createNotification("EMAIL");

            Notification notification = notificationFactory.createNotification("PUSH");
            notification.notifyUser();
        }catch (Exception e){
            System.out.println("please try it later.");
        }
    }
}
