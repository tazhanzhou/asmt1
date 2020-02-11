package task;

public class CheckTwoEnds {

	public boolean Check(int Array[]) {

		boolean result = false;

		if (Array.length == 0) {
			result = false;
		} 
		else if (Array[0] == Array[Array.length - 1]) {
			result = true;
		}
		else result = false;
		
		return result;
	}

}
