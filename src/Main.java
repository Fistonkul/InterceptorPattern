public class Main {
    public static void main(String[] args) {

        Dispatcher dispatcher =  Dispatcher.getInstance();

        CdPlayer cdPlayer = new CdPlayer(new Button(), new Button());

        PlayButtonInterceptor playInterceptor = new PlayButtonInterceptor();

        StopButtonInterceptor stopInterceptor = new StopButtonInterceptor();

        dispatcher.addInterceptor(playInterceptor);
        dispatcher.addInterceptor(stopInterceptor);

        cdPlayer.playButtonPushed();
        System.out.println();

        dispatcher.remove(playInterceptor);

        cdPlayer.stopButtonPushed();

        System.out.println();

    }
}