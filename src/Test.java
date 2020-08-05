import java.util.Arrays;
import java.util.Stack;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		
	}
	void setup(){
		Double[] nums = {4.0,16.0,64.0};
	Stream<Double> dubStream = Arrays.stream(nums);
	
	dubStream.forEach((i)->System.out.println(i));
	}
	
	
}
