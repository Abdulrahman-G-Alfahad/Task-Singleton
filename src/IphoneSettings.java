public class IphoneSettings {
    private int brightness;
    private String wifi;
    private int volume;
    private String version;

    private static IphoneSettings instance;

    private IphoneSettings(int brightness, String wifi, int volume, String version) {
        this.brightness = brightness;
        this.wifi = wifi;
        this.volume = volume;
        this.version = version;
    }

    public static IphoneSettings getInstance(){
        if (instance != null) {
            return instance;
        } else {
            return  new IphoneSettings(0,"",0,"");
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "IphoneSettings{" +
                "brightness=" + brightness +
                ", wifi='" + wifi + '\'' +
                ", volume=" + volume +
                ", version='" + version + '\'' +
                '}';
    }
}
