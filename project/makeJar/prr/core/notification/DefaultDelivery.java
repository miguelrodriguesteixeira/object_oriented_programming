package prr.core.notification;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;


/**
 * Default delivery method registers the notifications and reads them one by one in the order they have been delivered
 */
public class DefaultDelivery implements NotificationDelivery, Serializable {

    @Serial
    private static final long serialVersionUID = 202208091753L;
    /**
     * stores the notifications that have been sent to its user
     */
    private final Queue<Notification> _notifications = new LinkedList<>();


    @Override
    public void deliver(Notification notification) {
        _notifications.add(notification);
    }

    @Override
    public Collection<Notification> readNotifications() {
        Queue<Notification> notifications = new LinkedList<>(_notifications);
        _notifications.clear();
        return notifications;
    }
}
