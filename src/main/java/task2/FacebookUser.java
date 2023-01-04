package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

enum Country {
    Ukraine, USA, Poland;
}

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDateTime getUserActiveTime;
}
