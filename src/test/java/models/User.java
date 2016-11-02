package models;

/**
 * Created by maxim on 02.11.16.
 */
public enum User {

    TEST_USER("user_email", "user_password"),
    WRONG_USER("wrong", "wrong");

    private String login;
    private String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

}
