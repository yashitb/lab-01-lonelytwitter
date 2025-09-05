import java.util.Date;

public abstract class Tweet {
    private Date date;
    private String message;


    public Tweet(String message) {
        this.message = message;
        this.date = new Date(); // current time
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();


    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}

