package day34_CustomClass;

public class DogObjects2 {
    public static void main(String[] args) {
        String food1="chicken";
        String food2="fish";
        String drink1="milk";
        String drink2="coffee";
        String toy1="PS4";
        String toy2="piano";
        String subject1="java";
        String subject2="soft skills";

        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Chihua Hua","Small",1,"Brown","Tuzik");

        dog2.eating(food1);
        dog1.eating(food2);

        dog2.drinking(drink1);
        dog1.drinking(drink2);

        dog2.drinking(toy2);
        dog1.drinking(toy1);

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        System.out.println("===========================================================");

        Dog [] dogPark= {dog1,dog2, dog3, dog4};

        for(int i=0; i<dogPark.length; i++){
            dogPark[i].eating(food1);
        }

        System.out.println("===========================================================");

        for(Dog each:dogPark){
            each.drinking(drink1);
        }

        for(int i=0; i<dogPark.length; i++){
            dogPark[i].playing("football");
        }

        for(int i=0; i<dogPark.length; i++){
            dogPark[i].studying(subject1);
        }
















    }

}
