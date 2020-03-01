package parameterTest;


import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class parameterTest {
	
	@DataPoint
	public static int INT_PARAM_1 = 3;
	@DataPoint
	public static int INT_PARAM_2 = 5;
	
	public parameterTest() {
		System.out.println("初期化");
	}
	
	@Theory
	public void testtest(int param) {
		System.out.println("引数をもつテストメソッド + (" + param + ")");
	}
}
