package day25_MethodsRecap;

public class Driver {
    //public name
    //specifier; can be called though class name
    //return type: if it is void, does not return any

//switch statement da boolean double long float kabul etmez

    public static void main(String[] args) {
        //call method to execute;
        //getDriver1(); //Argument is mandatory
        String str = getDriver1("Cybertek");

        System.out.println(str);

        String str2   =  getDriver2("ChRoMe");  //

        System.out.println(str2);

        String str3 = getDriver3("FiReFox");

        System.out.println(str3);


    }
    //if name is fire fox->firefox: browsername.toLowerCase.toReplace(" ", "");
    //browser name is parameter name
    public static String getDriver1(String browserName) {
        String result = "";
        switch (browserName.toLowerCase()){
            case "chrome": result="Chrome Driver";
                            break;
            case "firefox": result="Firefox Driver";
                            break;
            case "safari": result="Safari Driver";
                            break;
            case "opera": result="Opera Driver";
                            break;
            case "edge": result="Edge Driver";
                            break;
            default: result="Invalid Driver";
                            break;
        }

        return result;

    }

    public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();  //to ignore case sensitivity
        String result = "";
        if(browserName.equals("chrome")){
            result = "Chrome Driver";
        }else if(browserName.equals("firefox")){
            result = "FireFox driver";
        }else if(browserName.equals("safari")){
            result = "Safari Driver";
        }else if(browserName.equals("edge")){
            result = "Edge Driver";
        }else if(browserName.equals("opera")){
            result = "Opera Driver";
        }else{
            result = "Invalid Driver";
        }

        return result;
    }
    //:()?, : ,  ()?
    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome"))? "Chrome Driver"
                :(browserName.equals("firefox"))? "Firefox Driver"
                :(browserName.equals("safari"))? "Safari Driver"
                :(browserName.equals("edge"))? "Edge Driver"
                :(browserName.equals("Opera"))?"Opera Driver" : "Invalid Driver" ;

        return result;
    }

}