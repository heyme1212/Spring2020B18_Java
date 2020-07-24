package day40_Encapsulation;

public class CredentialsObjects {
    public static void main(String[] args) {

        Credentials facebook= new Credentials();

        System.out.println(facebook.getPassWord());
        System.out.println(facebook.getPassWord());

        facebook.setUserName("h.catpinar");
        facebook.setPassWord("1234567");

    }
}
