// 3. Specify the Context Objects

public class Button  {
    public void push() {
        System.out.println("Button Pushed");
        Dispatcher.getInstance().dispatch();
    }
}



