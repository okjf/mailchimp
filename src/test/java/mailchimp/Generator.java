package mailchimp;
import java.time.Instant;

public class Generator {

    public static String generateUsername(){
        long unixTime = Instant.now().getEpochSecond();
        return "raoul" + unixTime;
    }

    public static String generatePassword(){
        //password needs to be: at least 8 characters long, one uppercase letter, one lowercase letter, one special character, one number
        return "Test123+";
    }

    public static String generateEmail(){
        long unixTime = Instant.now().getEpochSecond();
        return "raoul" + unixTime + "@gmail.com";
    }

    public static String generateLongUsername() {
        long unixTime = Instant.now().getEpochSecond();
        String username = "raoul" + unixTime;
        while(username.length() <= 101){
            username += unixTime;
        }
        return username;
    }
}