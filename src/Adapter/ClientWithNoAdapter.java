package Adapter;

//어뎁터패턴 적용하지 않은 경우1
public class ClientWithNoAdapter {
	public static void main(String[] args) {
		ServiceA sa1 = new ServiceA();
		ServiceB sb1 = new ServiceB();
		
		sa1.runServiceA();
		sb1.runServiceB();
	}
}
