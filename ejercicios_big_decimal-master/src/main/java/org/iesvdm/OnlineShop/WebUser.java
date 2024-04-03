package org.iesvdm.OnlineShop;

public class WebUser {
private String login_id;
String password;
UserState state;

    public WebUser(String login_id, String password, UserState state) {
        this.login_id = login_id;
        this.password = password;
        this.state = state;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }
}
