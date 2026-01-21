package ex_05_OOPs;

public class LoginPage {

    String email;
    String password;

    public LoginPage(String email) {
        this.email = email;
    }

    public LoginPage(String email, String password) {
        this(email);
        this.password = password;
    }

    static void main() {

        LoginPage loginPage = new LoginPage("Ram@j.com", "123");
        System.out.println(loginPage.email);
        System.out.println(loginPage.password);

    }


}
