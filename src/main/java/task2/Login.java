package task2;

import java.time.LocalDateTime;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("dobosevych@gmail.com", "Ukraine", "2023-01-04T20:15:39.110962952"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("dobosevych@gmail.com", Country.Ukraine, LocalDateTime.now()));
        }
        throw new IllegalArgumentException("No such loginMethod");
    }
}
