package OfficeHours.Practice_06_10_2020;

public class User2 {
    public static void main(String[] args) {

        FacebookUser user = new FacebookUser("jbond5", "007", "James Bond");
        user.createPost("My first post");
        user.createPost("Today was good");
        user.createPost("Okay dinner time");

        System.out.println(user.getAllPosts());

    }

}
