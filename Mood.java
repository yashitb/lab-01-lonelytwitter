import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}