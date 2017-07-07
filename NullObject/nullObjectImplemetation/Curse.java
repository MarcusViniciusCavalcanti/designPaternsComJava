package nullObjectImplemetation;

import java.time.LocalTime;

public class Curse implements IECurse {
	private String name;
	private LocalTime curseTime;

	public Curse(String name, LocalTime curseTime) {
		setName(name);
		setCurseTime(curseTime);
	}

	public void setCurseTime(LocalTime curseTime) {
		this.curseTime = curseTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public LocalTime curseTime() {
		return curseTime;
	}

}
