import java.util.Date;

public class NormalTweet extends Tweet {

    // Constructor with only message
    public NormalTweet(String message) {
        super(message);
    }

    // Constructor with message + date
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE; // normal tweets are not important
    }
}
