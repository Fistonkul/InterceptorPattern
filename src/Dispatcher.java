// 5. Specify the Dispatchers

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private static Dispatcher dispatcher = new Dispatcher();
    private List<Interceptor> interceptors = new ArrayList<>();

    public void addInterceptor(Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void remove(Interceptor interceptor) {
        for (int i = 0; i < interceptors.size(); i++) {
            if (interceptors.get(i) == interceptor) {
                interceptors.remove(i);
                break;
            }
        }
    }

    public void dispatch() {
        for (Interceptor interceptor : this.interceptors) {
            interceptor.intercept();
        }
    }

    public static Dispatcher getInstance() {

        return dispatcher;
    }
}

