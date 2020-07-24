package Replits.Replit_05152020;

public class TVObject {
    public static void main(String[] args) {

        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());

        tv.volumeDown();
        System.out.println(tv.getVolumeLevel());

        tv.setVolumeLevel(7);
        System.out.println(tv.getVolumeLevel());

        tv.volumeUp();
        System.out.println(tv.isOn());

        tv.setVolumeLevel(5);
        System.out.println(tv.getVolumeLevel());

        tv.volumeUp();

        tv.turnOn();
        System.out.println(tv.isOn());

        tv.volumeUp();
        System.out.println(tv.getVolumeLevel());

        tv.volumeUp();
        System.out.println(tv.getVolumeLevel());

        tv.volumeUp();
        System.out.println(tv.getVolumeLevel());

        tv.turnOn();
        System.out.println(tv.getBrand());
        System.out.println(tv.brand);
        tv.setBrand("Samsung");
        System.out.println(tv.getBrand());


    }
}
