package day54_Maps;

public class GarbageCollector {
    public static void main(String[] args) {
        GarbageCollector obj=new GarbageCollector(); //not collected by garbage collector
        //the object dont have any reference type, if we cant reuse it, it will be collected by garbage collection.
                     new GarbageCollector(); //After this line, this object is eligible for garbage collector.

        System.out.println("Done");

        //2 ways to make unreferenced an object:
        String str= new String("Cybertek");
                str=new String("MIT");

        // First str will be collected by garbage collector.
        //Because it doesnt refer to anything.
        //First one is reassigning it.
        Integer num= new Integer(123);
        num=new Integer(124);

        //After line 19, num object is refering 124 now and 123 is unferenced now.
        //Unreferenced object(123) is collected by garbage collector.


        //2.way: assigning it to null, eligible for garbage collector
        Double n= new Double(0.5); //goes to garbage collector
                n=null;


        //Garbage collector call finalize() method internally.
        //JVM does the garbage collection.

        GarbageCollector obj3= new GarbageCollector();
        //obj3.finalize();  //will throw you throwable if you call it by yourself.

        //finalize()=> it is a method, garbage collector calls it before the object is collected garbage collection


















    }
}
