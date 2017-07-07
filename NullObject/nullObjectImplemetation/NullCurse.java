package nullObjectImplemetation;

import java.time.LocalTime;

public class NullCurse extends Curse{

	public NullCurse() {
		this("", LocalTime.of(0,0));
	}
	
	public NullCurse(String name, LocalTime curseTime) {
		super(name, curseTime);
	}

}
