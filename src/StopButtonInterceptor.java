public class StopButtonInterceptor implements Interceptor{

        private CdPlayer cdPlayer;

  public StopButtonInterceptor(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

        public void intercept() {
        System.out.println("Performing action before stop button is pushed");
        cdPlayer.stopButtonPushed();
    }
    }

