import java.util.Date;

public class SadMood extends Mood {

        public SadMood() {
            super(); // uses current date
        }

        public SadMood(Date date) {
            super(date);
        }

        @Override
        public String getMood() {
            return "I am feeling sad!";
        }
    }

