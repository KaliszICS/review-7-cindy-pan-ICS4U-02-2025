public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String evenOrOdd(int tester){
		if (tester%2==0){
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	
	public static String teacherOrStudent(String word){
		if (word.equals("Kalisz")){
			return "Teacher";
		}
		else {
			return "Student";
		}
	}

	public static int fartherFromZero(int number){
		if (number>0){
			return (number+5);
		}
		else if (number<0){
			return (number-5);
		}
		else {
			return 0;
		}
	}

	public static String isFive(int isItFive){
		if (isItFive ==5){
			return "The number is Five";
		}
		else {
			return "The number is not Five";
		}
	}
	
	public static String positiveOrNegative(double isItPositive){
		if (isItPositive>0){
			return "Positive";
		}
		else {
			return "Negative";
		}
	}
	public static String highOrLow(int isItHigh){
		if (isItHigh>100){
			return "High";
		}
		else {
			return "Low";
		}
	}

	public static String isHello(String isItHello){
		if (isItHello.equals("Hello")){
			return "The word is Hello";
		} 
		else {
			return "The word is not Hello";
		}
	}
}
