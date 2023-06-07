package Homework.homework12.task1;

public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static boolean enter(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Incorrect login");
        }
        if (password.matches("[0-9]") || password.contains(" ") || !password.equals(confirmPassword) || password.length() > 20) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }
}
