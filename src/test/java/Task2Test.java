import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2.*;

import java.time.LocalDateTime;

public class Task2Test {
    @Test
    public void Task2test() {
        MessageSender messageSender = new MessageSender();
        Login loginUser = new Login();
        Client userFacebook = loginUser.login("facebook");

        Assertions.assertEquals(messageSender.send(
                "!message!", userFacebook, userFacebook.getCountry()),
                "Message !message! has been sent to dobosevych@gmail.com, Ukraine.");

        Assertions.assertFalse(MessageSender.main(null));
    }
}
