package day46_Final_Abstract;

public class BrowserObjects {
    public static void main(String[] args) {
        ChromeBrowser chrome= new ChromeBrowser("Chrome Browser");
        chrome.close();
        chrome.maximize();
        chrome.get("https://www.google.com");
        System.out.println("------------------------");
        FireFoxBrowser firefox= new FireFoxBrowser("FireFox Browser");
        firefox.close();
        firefox.maximize();
        firefox.get("https://outlook.live.com");
        System.out.println("------------------------");
        OperaBrowser opera= new OperaBrowser("Opera Browser");
        opera.close();
        opera.maximize();
        opera.get("https://www.facebook.com/");
    }
}
