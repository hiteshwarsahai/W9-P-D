package sh1;
import java.util.Scanner;

/*
 * @author Hiteshwar Sahai
 * @version 1.0    2018-03-06  
 */

public class sh1 {

		
		public static void main(String[] args) {
			Scanner R = new Scanner(System.in);
			
			
			System.out.println("Enter your first value");
			double mValue1 = R.nextDouble();
			
			System.out.println("Enter ErrorTerm of first value");
			double errorterm1 = R.nextDouble();

			
			System.out.println("Enter your second value");
			double mValue2 = R.nextDouble();
					
			System.out.println("Enter ErrorTerm of second value");
			double errorterm2 = R.nextDouble();
		
			
			System.out.println("Specify the function you want to do(*//)");
			
			double add_result = mValue1 + mValue2;
			double errorterm_add = errorterm1 + errorterm2;
			
			double sub_result = mValue1 + mValue2;
			double errorterm_sub = errorterm1 + errorterm2;
			
			double product_result = (mValue1 * mValue2);
			double error_fraction1 = (errorterm1 / Math.abs(mValue1));
			double error_fraction2 = (errorterm2 / Math.abs(mValue2));
			double product_error_term = ((error_fraction1 + error_fraction2) * Math.abs(product_result ));
			
			double Quotient_result = (mValue1 / mValue2);
			double Quotient_error_term = ((error_fraction1 + error_fraction2) * Math.abs(Quotient_result));
			
			String input = R.next();
			
			if (input.equals("+")) {
				System.out.println("Answer " + add_result + " ± " + errorterm_add);
			}
			else if(input.equals("-")) {
				System.out.println("Answer " + sub_result + " ± " + errorterm_sub);
			}
			else if(input.equals("*")){
				System.out.println("Answer" + product_result + " ± " + product_error_term);
			}
			else if(input.equals("/")) {
				System.out.println("Answer" + Quotient_result + " ± " + Quotient_error_term);
			}
			else {
				System.out.println("choose from (+,-,* and /");
			}
			R.close();
		}

	}

