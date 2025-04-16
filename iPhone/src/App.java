import devices.iPhone;

public class App {
    public static void main(String[] args) throws Exception {
        iPhone iPhone = new iPhone();

        // Phone features
        iPhone.call("+55 21 98765-4321");
        iPhone.answerCall();
        iPhone.voiceMail();

        // MusicPlayer features
        iPhone.select("Journey to The Center of The Earth, Rick Wakeman");
        iPhone.play();
        iPhone.pause();

        // Browser features
        iPhone.showPage("https://web.dio.me/");
        iPhone.refreshPage();
        iPhone.newTab();
    }
}
