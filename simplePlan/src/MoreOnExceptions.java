import java.io.FileNotFoundException;


public class MoreOnExceptions {

	public static void main(String[] args) {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new NumberFormatException();
	}

}
