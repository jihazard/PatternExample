package TemplateMethodPattern;

public abstract class Animal {
	//템플릿메서드
	public void playWithOwner() {
		// TODO Auto-generated method stub
			System.out.println("귀염둥이 이리온 ! ");
			play();
			runSomething();
			System.out.println("굿보이!");
	}
	
	abstract void play();
	
	//hook 갈고리 메서드
	void runSomething(){
		System.out.println("꼬리를 살랑 살랑");
	}
}
