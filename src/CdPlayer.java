class CdPlayer implements CdPlayerBehaviour {

    Button stopbutton;
    Button playButton;
    public CdPlayer(Button stopButton, Button playButton ){

        this.stopbutton = stopButton;
        this.playButton = playButton;
    }
    public void playButtonPushed() {
        System.out.println("Playing the CD");
        playButton.push();
    }



    public void stopButtonPushed() {
        System.out.println("Stopping the CD");
        stopbutton.push();
    }
}