package polymorphism_4_2_2;

public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker () {
		System.out.println("====> AppleSpeaker 객체 생성 ");
	}

	@Override
	public void volumUp() {
		System.out.println("AppleSpeaker - 볼륨 업");

	}

	@Override
	public void volumDown() {
		System.out.println("AppleSpeaker - 볼륨 다운");

	}

}
