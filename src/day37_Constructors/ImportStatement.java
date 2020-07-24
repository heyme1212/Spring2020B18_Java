package day37_Constructors;

//import java.util.Arrays; //only imports arrays class from java util
import java.util.*; //every single class that in the jav.util package.

import static day37_Constructors.Data.staticVariable; //you need to specify which option you want for static imports.
import static day37_Constructors.Data.staticMethod;

public class ImportStatement {
    public static void main(String[] args) {
        int [] arr={4,3,2,1};

        //One way is to import only Java.util package or all packages
        //import PackageName.ClassName; imports one class
        //import PackageName.*; imports all the classes in that package.

        Arrays.sort(arr);
        staticMethod();
        System.out.println(staticVariable);

        /*
        Syntax:
        import PackageName.ClassName;  // imports one class from package
        import PackageName.*;  // imports all classes from the package

        static imports: we can import static variables or methods
        Syntax:
        import static PackageName.className.name;  // only imports one static from the class
        import static PackageName.className.*; // imports all static variables and methods from the class

         */

    }
}
