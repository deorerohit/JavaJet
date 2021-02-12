import java.util.function.Consumer;


class ConsumerInterfaceExample {
	static void printMessage(String name) {
		System.out.println("Hii " + name);
	}

}


public class ConsumerInterface {

    public static void main(String[] args) {
	// write your code here

        Consumer<String> consumer = ConsumerInterfaceExample::printMessage;
        consumer.accept("Rohit");
    }
}
