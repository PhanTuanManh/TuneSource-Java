import java.util.Date;

class TransactionHistory {
    private int transactionID;
    private int userID;
    private int musicID;
    private Date purchaseDate;
    private User user;
    private Music music;

    public TransactionHistory(int transactionID, int userID, int musicID, Date purchaseDate) {
        this.transactionID = transactionID;
        this.userID = userID;
        this.musicID = musicID;
        this.purchaseDate = purchaseDate;
    }

    public void getTransactionDetails() {}
}
