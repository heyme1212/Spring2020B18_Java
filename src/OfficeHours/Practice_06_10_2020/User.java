package OfficeHours.Practice_06_10_2020;

public class User {

    public static void main(String[] args) {
        FacebookUser user= new FacebookUser("java5","kesda");

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        System.out.println("=============================");
        FacebookUser user2= new FacebookUser("jamesB","pass007","James Bond");
        System.out.println(user2.getUsername());
        System.out.println(user2.personalUrl);
        System.out.println(user2.accountLength);
        user2.getFullName();
        System.out.println(user2.getFullName());

    }
}
