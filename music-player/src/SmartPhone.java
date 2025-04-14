public class SmartPhone implements MusicPlayer, VideoPlayer {

    @Override
    public void playVideo() {
        System.out.println("Smartphone playing Video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Smartphone stoping Video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Smartphone pausing Video");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone playing Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone stoping Music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smartphone pausing Music");
    }

}
