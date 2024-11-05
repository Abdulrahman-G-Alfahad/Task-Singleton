
public class Main {
    public static void main(String[] args) {

        IphoneSettings instance = IphoneSettings.getInstance();
        System.out.println(instance.toString());
        instance.setWifi("joincoded.com");
        instance.setBrightness(10);
        instance.setVersion("18X");
        instance.setVolume(0);
        System.out.println(instance.toString());
        instance.setBrightness(5);
        instance.setVolume(8);
        System.out.println(instance.toString());

    }
}