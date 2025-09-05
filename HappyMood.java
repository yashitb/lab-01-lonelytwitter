import java.util.Date;

public class HappyMood extends Mood {

        public HappyMood() {
            super(); // uses current date
        }

        public HappyMood(Date date) {
            super(date); // uses given date
        }

        @Override
        public String getMood() {
            return "I am feeling happy!";
        }
    }
