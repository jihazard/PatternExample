package DecoratorPattern;

public class ClientWithDecolator {
	public static void main(String[] args) {
		IService deco = new Decoreator();
		System.out.println(deco.runSomething());
	}
}
