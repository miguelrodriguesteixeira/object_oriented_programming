package prr.core.notification;


public interface Notificator {
    /**
     * @param n notifiable to add to notifiables stored
     */
    void attach(Notifiable n);

    /**
     * @param n notifiable to remove form notifiables stored
     */
    void dettach(Notifiable n);

    /**
     * @param event that set off the notification
     */
    void sendNotifications(String event);

}
