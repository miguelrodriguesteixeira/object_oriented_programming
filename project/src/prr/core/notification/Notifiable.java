package prr.core.notification;

public interface Notifiable {
    /**
     * @param noti accept notification and store it
     */
    void getNotification(Notification noti);

    /**
     * @return does it want to get notification
     */
    boolean wantsNotifications();

    /**
     * @param deliveryMethod method of delivery to change to
     */
    void setDeliveryMethod(NotificationDelivery deliveryMethod);
}
