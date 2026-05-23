package patterns.structural.facade;

public class MediaFacade {
    private MusicPlayer musicPlayer;
    private ImageViewer imageViewer;

    public MediaFacade() {
        this.musicPlayer = new MusicPlayer();
        this.imageViewer = new ImageViewer();
    }


    // doesn't have to be if else/switch statements. the idea is to have a facade/single interface
    // which hides the complexities from the client. Internally, the facade routes the request to
    // the appropriate subsystem

    public void performAction(String action) {
        switch (action.toLowerCase()) {
            case "playmusic":
                musicPlayer.decodeAudio();
                // other functions
            case "viewimage":
                imageViewer.loadImageFile();
                //etc etc
        }
    }
}
