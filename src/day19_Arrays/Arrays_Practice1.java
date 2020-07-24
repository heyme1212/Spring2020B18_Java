package day19_Arrays;

import java.util.Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String[] friends= {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};

        //System.out.println(friends[6]); //Murodil
       // String name=friends[2]; Saim
        // System.out.println(name);

        for(int i=0; i<=6; i++){
            String name= friends[i];
            System.out.println(name);
        }

        System.out.println(Arrays.toString(friends));


        String[] emails={"cybertek@yahoo.com", "cybertek@gmail.com", "cybetek@hotmail.com","cybertek@outlook.com"};
        for(int i=0; i<=3; i++){

            String email=emails[i];
            if(email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }













    }



}
