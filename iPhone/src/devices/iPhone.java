package devices;

import features.Browser;
import features.MusicPlayer;
import features.Phone;

public class iPhone implements Phone, MusicPlayer, Browser {
    private String url;
    private String music;
    private String number;

    public void call(String number) {
        this.number = number;
        System.out.println("You're calling to the number " + this.number);
    }

    public void answerCall() {
        System.out.println("You just answered a call!");
    }

    public void voiceMail() {
        System.out.println("You're listening a voice mail message!");
    }

    public void select(String music) {
        this.music = music;
        System.out.printf("The music '%s' was selected!\n", this.music);
    }

    public void play() {
        if (this.music == null) {
            warningBlankMusic();
            return;
        }
        System.out.printf("You're now playing '%s'...\n", this.music);
    }

    public void pause() {
        if (this.music == null) {
            warningBlankMusic();
            return;
        }
        System.out.printf("Pausing '%s'...\n", this.music);
    }

    private void warningBlankMusic() {
        System.out.println("Please, select one music first!");
    }

    public void showPage(String url) {
        this.url = url;
        System.out.printf("Navigating to the page '%s'\n", this.url);
    }

    public void newTab() {
        System.out.println("Opening a new tab in the browser...");
    }

    public void refreshPage() {
        if (this.url == null) {
            System.out.println("Please, provide an url first!");
            return;
        }
        System.out.println("Refreshing the page " + this.url);
    }
}
