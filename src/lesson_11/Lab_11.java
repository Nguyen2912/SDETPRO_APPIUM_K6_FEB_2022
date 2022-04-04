package lesson_11;
/*
Please use Strategy Design Pattern to solve below problem
ILOgin: login
NormalLogin implements ILOgin
SSOLogin implements ILOgin
LoginPage - abstract
InternalLoginPage use normal login type
ExternalLoginPage use SSO type
 */
public class Lab_11 {
    public static void main(String[] args) {
        LoginPage internalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();
        internalLoginPage.performLogin();
        externalLoginPage.performLogin();
    }
}
