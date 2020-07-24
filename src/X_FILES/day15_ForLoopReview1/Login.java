package X_FILES.day15_ForLoopReview1;


public class Login {
    public static void main(String[] args) {
        Credentials Fatih= new Credentials();
        //obj.username="Fatih";
       // obj.password="9876";
       // System.out.println(obj.username);
       // System.out.println(obj.password);

       // System.out.println(Fatih.getUsername());
       // System.out.println(Fatih.getPassword());

        Fatih.setPassword("98745");
        Fatih.setUsername("Fatih");

        System.out.println(Fatih.getUsername());
        System.out.println(Fatih.getPassword());


    }



}

