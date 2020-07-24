package Replits.Replit_05152020;

public class TV {
    /*
    #1. Write a custom class TV that has 4 instance variables: int channel=1, int volumeLevel=1, boolean on = false,
    String brand = "undefined".
    #2.Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".
    #3.Also, create one more constructor that defines instance variable brand, and displays message:
    "Creating TV object using 1 arg - constructor".
    #4.Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel) and
    brand (getBrand/setBrand) instance variables.

    #5.Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
    #6.Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.
    7.Create isOn(), turnOn() and turnOff() methods for "on" instance variable.
    If tv is already on, no need to turn it on again, display message: "TV is already ON".
    If tv is already off, then no need to turn it off again, display message: "TV is already OFF".
    8.Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
    If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
    9.Volume can be only in the range between 1 and 7. You may change volume only if TV is on.
    Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level". Create isOn() method that will check tv status.
     */

    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand="undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void setChannel(int channel){
        if(channel>0&& channel<120 && isOn()){
            this.channel=channel;
        }else{
            System.out.println("Tv is either OFF or invalid channel");
        }

    }

    public int getChannel(){
        return channel;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return brand;
    }


    public int getVolumeLevel(){
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel){
        if(isOn()&& volumeLevel>=1 &&volumeLevel<=7){
            this.volumeLevel=volumeLevel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }

    public void channelUp(){
        if(isOn()&& channel<=0 &&channel>120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else{
            this.channel=channel;
        }
        channel+=1;
    }
    public void channelDown(){
        if(isOn()&&channel<=0 &&channel>120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else{
            this.channel=channel;
        }
        channel-=1;
    }

    public void volumeUp(){
        if(isOn() && getVolumeLevel() >=1 && getVolumeLevel()<7){
            volumeLevel+=1;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void volumeDown() {
        if (isOn() && getVolumeLevel() >1 && getVolumeLevel()<=7) {
            volumeLevel -= 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public boolean isOn(){
       return on;
    }

    public void turnOn(){
        if(isOn()){
            System.out.println("TV is already ON");
        }else{
            on=true;
        }
    }

    public void turnOff(){
        if(isOn()){
            System.out.println("TV is already OFF");
        }else{
            on=false;
        }
    }




}

