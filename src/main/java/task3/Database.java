package task3;

public class Database extends БазаДаних{
    public String retrieveUserData() {
        return super.отриматиДаніКористувача();
    }

    public String retrieveStaticData() {
        return super.отриматиСтатистичніДані();
    }
}
