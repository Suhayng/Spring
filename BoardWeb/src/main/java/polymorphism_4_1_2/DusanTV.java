package polymorphism_4_1_2;

public class DusanTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("DusanTV -- 전원을 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("DusanTV -- 전원을 끈다");
	}

	@Override
	public void volumeUp() {
		System.out.println("DusanTV -- 소리를 높인다");
	}

	@Override
	public void volumeDown() {
		System.out.println("DusanTV -- 소리를 낮춘다");
	}

}
