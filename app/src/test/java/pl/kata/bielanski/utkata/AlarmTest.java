package pl.kata.bielanski.utkata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AlarmTest {
	@Test
	public void returnTrue_asDefault(){
		MyAlarm myAlarm = new MyAlarm();
		boolean flag = myAlarm.getFlag();
		assertThat(flag, is(true));
	}

	@Test
	public void returnFalse_whenSetFalse(){
		MyAlarm myAlarm = new MyAlarm();
		myAlarm.setFlag(false);
		boolean flag = myAlarm.getFlag();
		assertThat(flag, is(false));
	}

	@Test
	public void returnTrue_whenSetTrue(){
		MyAlarm myAlarm = new MyAlarm();
		myAlarm.setFlag(true);
		boolean flag = myAlarm.getFlag();
		assertThat(flag, is(true));
	}
}
