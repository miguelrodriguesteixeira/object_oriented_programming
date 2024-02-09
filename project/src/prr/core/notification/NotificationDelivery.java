package prr.core.notification;


import java.util.Collection;

public interface NotificationDelivery {
    /**
     * @param notification to deliver
     */
    void deliver(Notification notification);

    /**
     * @return notifications to be read
     * clears them as well
     */
    Collection<Notification> readNotifications();
}
