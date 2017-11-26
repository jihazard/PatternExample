package DecoratorPattern;

public class Decoreator implements IService{
	IService service ;
	@Override
	public String runSomething() {
		// TODO Auto-generated method stub
		System.out.println("호출에 대한 장식 주목적, 클라이언트에게 반환 결과에 장식을 더하여 ");
		service = new Service();
		
		return "정말" + service.runSomething();
	}
	
}
