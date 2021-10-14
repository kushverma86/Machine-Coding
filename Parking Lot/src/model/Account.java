package model;

public abstract class Account {

    String username;
    String password;
    AccountStatus accountStatus;
    String email;

    public boolean resetPassword() {
        return true;
    }
}
