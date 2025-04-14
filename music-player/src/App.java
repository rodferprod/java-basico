public class App {
    public static void main(String[] args) throws Exception {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.playMusic();
        smartPhone.pauseMusic();
        smartPhone.stopMusic();

        smartPhone.playVideo();
        smartPhone.pauseVideo();
        smartPhone.stopVideo();
    }
}
