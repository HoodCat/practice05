package prob3;

public class Sparrow extends Bird {
	@Override
	public void fly() {
		System.out.println(
				String.format("참새(%s)는 날아다닙니다.", super.getName()));
	}

	@Override
	public void sing() {
		System.out.println(
				String.format("참새(%s)가 소리내어 웁니다", super.getName())); 
	}

	@Override
	public String toString() {
		return String.format("참새의 이름은 %s입니다.", super.getName());
	}
}