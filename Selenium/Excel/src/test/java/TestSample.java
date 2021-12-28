import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDriven d = new dataDriven();
		ArrayList data = d.getData("Add Profile");
		// For selenium if we nedd to pass data from this example in sendKey we will
		// pass data.get(i);i=value of index of array.
		for(int i=0;i<=3;i++) {
		System.out.println(data.get(i));
		}

	}

}
