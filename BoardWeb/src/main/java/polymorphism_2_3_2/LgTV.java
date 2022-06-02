package polymorphism_2_3_2;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LgTV -- 전원을 켠다");

	}

	@Override
	public void powerOff() {
		System.out.println("LgTV -- 전원을 끈다");

	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV -- 소리를 높인다");

	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV -- 소리를 낮춘다");

	}

}
