import java.util.ArrayList;
import java.util.List;

class User {
    private int userID;
    private String username;
    private String password;
    private String email;
    private List<TransactionHistory> transactionHistories;
    private List<SubscriptionAccount> subscriptionAccounts;
    private List<MusicDownloadGiftCard> musicDownloadGiftCards;

    public User(int userID, String username, String password, String email) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.transactionHistories = new ArrayList<>();
        this.subscriptionAccounts = new ArrayList<>();
        this.musicDownloadGiftCards = new ArrayList<>();
    }

    public void register() {}

    public void login() {}

    public void logout() {}

    public void searchForMusic() {}

    public void listenToMusicSamples() {}

    public void purchaseIndividualDownloads() {}

    public void purchaseSubscriptionAccount() {}

    public void purchaseMusicDownloadGiftCards() {}
}
