package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		switch(function) {
		case "앱":
			System.out.println("앱실행"); break;
		default:
			super.execute(function);
		}
	}

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	
}
