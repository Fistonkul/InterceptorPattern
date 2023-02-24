
class PlayButtonInterceptor implements Interceptor {

    @Override
    public void intercept() {
        System.out.println("Play button interceptor activated");
    }
}