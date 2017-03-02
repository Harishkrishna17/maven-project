package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("==================");
		System.out.println("\n The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println("==================\n");
		System.out.println(greeter.sayHell());
		System.out.println("==================");
		System.out.println("\n Hello INIT GUYS ");
		System.out.println("==================");
		System.out.println("Iam in banglore \n ");
		System.out.println("==================");
		System.out.println("Iam in india \n ");
		System.out.println("==================");
		
	}
}
