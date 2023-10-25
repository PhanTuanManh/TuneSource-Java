import java.util.Date;

class SubscriptionAccount {
    private int subscriptionID;
    private int userID;
    private Date subscriptionStartDate;
    private Date subscriptionEndDate;
    private String subscriptionStatus;
    private User user;

    public SubscriptionAccount(int subscriptionID, int userID, Date subscriptionStartDate, Date subscriptionEndDate, String subscriptionStatus) {
        this.subscriptionID = subscriptionID;
        this.userID = userID;
        this.subscriptionStartDate = subscriptionStartDate;
        this.subscriptionEndDate = subscriptionEndDate;
        this.subscriptionStatus = subscriptionStatus;
    }

    public void subscribe() {}
}
