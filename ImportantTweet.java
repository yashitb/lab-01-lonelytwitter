import java.util.Date;

public class ImportantTweet extends Tweet {

    // Constructor with only message
    public ImportantTweet(String message) {
        super(message);
    }

    // Constructor with message + date
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE; // important tweets are always important
    }
}
