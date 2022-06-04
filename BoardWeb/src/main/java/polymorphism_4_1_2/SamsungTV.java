package polymorphism_4_1_2;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;	
	
	public SamsungTV() {	//기본 생성자 : 객체가 생성될 때 호출 
		
		System.out.println("==> SamsungTV 객체 생성 ");
		
	}
	
	
	public void initMethod() {	//객체 생성 직후에 제일 먼저 호출되는 메소드 
		System.out.println("initMethod 호출 : 객체 초기화 완료");
	}
	
	public void destroyMethod() {	//객체 종료전 호출되는 메소드 
		
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV -- 전원을 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV -- 전원을 끈다");
	}

	
	//강결합 상태, 프로그램 내에서 객체를 생성할 경우, 새로운 기능의 스피커로 교체할 때 코드를 수정해야 한다. 
	@Override
	public void volumeUp() {
		speaker = new SonySpeaker();	//SonySpeaker 객체 생성 
		speaker.volumeUp();				//SonySpeaker 메소드 호출 
	}

	@Override
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}
