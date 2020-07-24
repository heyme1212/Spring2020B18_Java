package day47_Abstraction;

public abstract class RemoteWebDriver {
    //final class(word)restricts the inheritance, abstract and final cant be together.
    //abstraction is achieved only by giving abstract class and inheritance

    protected abstract  void get(String URL);
    //private and static method cant be abstract method.
    //final method cant be overriden.

    public abstract void quit();

}
