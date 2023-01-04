package task2;

import java.time.LocalDateTime;

public class MessageSender {
    public String send(String text, Client user, String country) {
        return "Message " + text + " has been sent to " + user.getEmail() + ", " + country + ".";
    }

    public static boolean main(String[] args) {
        MessageSender messageSender = new MessageSender();

        Login loginUser = new Login();
        Client userTwitter = loginUser.login("twitter");
        Client userFacebook = loginUser.login("facebook");

        LocalDateTime localDatetimeForTwitter = LocalDateTime.parse(userTwitter.getLastActiveTime());
        LocalDateTime localDatetimeForFacebook = LocalDateTime.parse(userFacebook.getLastActiveTime());

        LocalDateTime upperBound = LocalDateTime.now();
        LocalDateTime lowerBound = upperBound.minusHours(1);

        if (userTwitter.getCountry().equals("Ukraine") &&
                (localDatetimeForTwitter.isAfter(lowerBound) && localDatetimeForTwitter.isBefore(upperBound))) {
            System.out.println(messageSender.send("Hello twitter", userTwitter, userTwitter.getCountry()));
        } else {
            return false;
        }
        if (userFacebook.getCountry().equals("Ukraine") &&
                (localDatetimeForFacebook.isAfter(lowerBound) && localDatetimeForFacebook.isBefore(upperBound))) {
            System.out.println(messageSender.send("Hello facebook", userFacebook, userFacebook.getCountry()));
        } else {
            return false;
        }
        return true;
    }
}
