package prob3;

public class Duck extends Bird {

	@Override
	public void fly() {
		System.out.println(
				String.format("오리(%s)는 날지 않습니다.", super.getName()));
	}

	@Override
	public void sing() {
		System.out.println(
				String.format("오리(%s)가 소리내어 웁니다", super.getName())); 
	}

	@Override
	public String toString() {
		return String.format("오리의 이름은 %s입니다.", super.getName());
	}
	
	
}
