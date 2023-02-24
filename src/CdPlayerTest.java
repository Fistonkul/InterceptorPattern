import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CdPlayerTest {

    @Test
    void playButtonPushed_shouldTriggerPlayButtonInterceptor() {
        CdPlayer cdPlayer = new CdPlayer(new Button(), new Button());
        TestInterceptor testInterceptor = new TestInterceptor();

        Dispatcher.getInstance().addInterceptor(testInterceptor);
        cdPlayer.playButtonPushed();

        assertTrue(testInterceptor.isActivated());
    }

    @Test
    void stopButtonPushed_shouldTriggerStopButtonInterceptor() {
        CdPlayer cdPlayer = new CdPlayer(new Button(), new Button());
        TestInterceptor testInterceptor = new TestInterceptor();

        Dispatcher.getInstance().addInterceptor(testInterceptor);
        cdPlayer.stopButtonPushed();

        assertTrue(testInterceptor.isActivated());
    }

    private static class TestInterceptor implements Interceptor {
        private int activationCount = 0;

        @Override
        public void intercept() {
            activationCount++;
        }

        public boolean isActivated() {
            return activationCount > 0;
        }
    }
}
