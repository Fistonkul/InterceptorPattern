// 4. Specify the Interceptors

class StopButtonInterceptor implements Interceptor {
    @Override
    public void intercept() {
        System.out.println("Stop button interceptor activated");
    }
}