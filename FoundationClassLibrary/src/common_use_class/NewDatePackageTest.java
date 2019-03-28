package common_use_class;

import java.time.Clock;
import java.time.Duration;

public class NewDatePackageTest {

	public static void main(String[] args) {

		Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		Duration d = Duration.ofSeconds(6000);
		System.out.println(d.toMinutes() + "分");
		System.out.println(d.toHours() + "小时");
		System.out.println(d.toDays() + "天");
		Clock clock2 = Clock.offset(clock, d);
		System.out.println(clock2.instant());
		
		
	}

}
