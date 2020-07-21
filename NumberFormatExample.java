import java.text.NumberFormat;

public class NumberFormatExample {

	public static void main(String[] args) {
		float salary = 12456.78F;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(salary);
		System.out.println(result);

	}

}
