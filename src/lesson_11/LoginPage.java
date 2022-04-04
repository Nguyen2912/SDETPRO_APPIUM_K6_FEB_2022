package lesson_11;

public abstract class LoginPage {
    ILogin iLogin;
    public void performLogin(){
        iLogin.login();
    }
}
