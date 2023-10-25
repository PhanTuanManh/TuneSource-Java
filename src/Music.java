import java.util.ArrayList;
import java.util.List;

class Music {
    private int musicID;
    private String title;
    private String artist;
    private String genre;
    private float price;
    private List<TransactionHistory> transactionHistories;
    private MusicData musicData;

    public Music(int musicID, String title, String artist, String genre, float price) {
        this.musicID = musicID;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
        this.transactionHistories = new ArrayList<>();
    }

    public void getMusicInfo() {}
}
