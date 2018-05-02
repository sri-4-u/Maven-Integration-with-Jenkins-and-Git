
public class FizzBuzz {
	public String FizzBuzz(int number) throws IllegalArgumentException{
		if(number % 3==0 && number % 5 ==0) {
			return "fizzbuzz";
		}
		else if(number % 3==0) {
			return "fizz";
		}
		else if(number%5==0) {
			return "buzz";
		}
		else if(number ==0) {
			throw new IllegalArgumentException();
		}
		return String.valueOf(number);
	}
}
