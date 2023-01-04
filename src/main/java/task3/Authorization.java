package task3;

public class Authorization extends Авторизація {
    public boolean authorize(Database db) {
        db.retrieveUserData();
        return true;
    }
}
