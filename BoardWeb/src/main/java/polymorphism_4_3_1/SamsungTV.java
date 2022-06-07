package polymorphism_4_3_1;

public class SamsungTV implements TV {
	
	private Speaker speaker;    // Speaker 는 인터페이스 : SonySpeaker, AppleSpeaker
	private int price ; 			// 정수 변수 선언 
	
	public SamsungTV() {  //기본 생성자 : 객체가 생성될때 호출 
		
		System.out.println("===> SamsungTV 객체 생성 ");
		
	}
	
	
	public void setSpeaker (Speaker speaker) {
		System.out.println("=====> setSpeaker () 호출 : Setter 호출");
		this.speaker = speaker; 
	}
	public void setPrice(int price) {
		System.out.println("====> setPrice() 호출 : Setter 호출");
		this.price = price; 
	}
	
	public void initMethod() {   // 객체 생성 직후에 제일 먼저 호출 되는 메소드 
		System.out.println("initMethod 호출 : 객세 초기화 완료");
	}
	
	public void destroyMethod()	{  // 객체 종료전 호출 되는 메소드 
		System.out.println("destoryMethod 호출 : 객체 제거전 호출되는 메소드 ");
	}
	

	@Override
	public void powerOn() {
		System.out.println("삼성TV -- 전원을 켠다 (가격 : " + price  + " )");

	}

	@Override
	public void powerOff() {
		System.out.println("삼성TV -- 전원을 끈다");

	}

	//강결합 상태 , 프로그램 내에서 객체를 생성할 경우, 새로운 기능의 스피커로 교체 할때 코드를 수정해야 한다. 
	
	
	@Override
	public void volumUp() {
		
		speaker.volumUp();      //Speaker 메소드 호출 (AppleSpeaker, SonySpeaker) 

	}

	@Override
	public void volumDown() {

		speaker.volumDown();      

	}

}
