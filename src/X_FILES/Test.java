package X_FILES;

public class Test {
    public static void main(String[] args) {
        TestData obj= new TestData();
      //  System.out.println(obj.name);

        System.out.println(obj.getName());
        String str= obj.getName();

        System.out.println(obj.getID());
        int a=obj.getID();


        obj.setName("Muhtar");
        System.out.println(obj.getName());

        obj.setID(400);
        System.out.println(obj.getID());







    }
}
