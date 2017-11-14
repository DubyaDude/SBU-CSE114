import java.util.*;

public class A {
	public static void main(String[] args) {
		//CHANGE
		//YES
		//NO
		Weather w = new Weather();
		HighWind hw = new HighWind();
		StormWatch sWatch = new StormWatch();
		TornadoWarning tWarn = new TornadoWarning();
		MyWarning warn = new MyWarning();
		
		//w=hw;
		//w=sWatch;
		//sWatch=warn;
		//warn=tWarn;
		//tWarn = hw;
		//warn.bigWind = tWarn;
		//tWarn = warn.bigWind;
		w=warn.bigWind;
	}
}
