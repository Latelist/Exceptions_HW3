import controller.Controller;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Controller controller = new Controller();
        controller.workCycle();
    }
}
