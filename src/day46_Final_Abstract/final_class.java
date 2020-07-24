package day46_Final_Abstract;

//public class final_class extends String{} yazamayiz cunku String class in icinde final var.
//Final class cant be inherited, so final class can never be subclassess, yani cant be super class!!
//Any final class CAN NOT BE A SUPER CLASS.

//super class cant be final.
//final class Data{} 'da olmaz.
class Data{


}



//sub class CAN BE final!!
public final class final_class extends Data{
/*
    final {

    }

    final static {

    }

    //We cant apply final to blocks, either static or instance.

 */
}

//class Data2 extends final_class{} //final class can Never be super class, yukarida final ekledik.It can inherit this class.

/*
public class final_class extends String {
    //Since string class is called final(immutable), we cant extend or inherit it.
    //Can never have subclasses.
}
*/



 