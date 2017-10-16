import  edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Worksheet2_20QS {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int a = 100;
			double b = 2.3;
			double c = -52.2;
			boolean d = true;
			String e = "I am";
			String f = "a student";
			int g = 0;
			String h = "!";
			final double pi = 3.142; // final prefix due to ensure we declare pi as a constant
			final String name = "Lay"; // final prefix due to ensure we name as a constant
			
			long x; //long x; size of x=64bits compared to integer x=32bits
			double y; // IEEE 754 floating point 
			String z;
			
			// 1: y = a + b
			y = a + b;
			System.out.println(y);
				
			// ERROR. PROGRAM UNABLE TO RUN.
			// 2: y = a + d
			// y = a + d;
			// System.out.println(y);
			/* "Operator + is undefined for argument type(s) int, boolean"
			 * i.e unable to add an integer + boolean value 
			 * y = 100 + true
			*/
			
			// 3: z = e + f
			z = e + f;
			System.out.println(z);
			
			// 4: y = bc
			y = b * c;
			System.out.println(y);
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 5 : pi = 22/7
			// pi = (double) 22/7;
			// System.out.println(pi);
			/* "The final local variable pi cannot be assigned. It must be blank and not using a compound statement"
			 * i.e. The pi has been declared as a constant and it cannot change.
			 */
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 6: z = name/g
			// z = name/g;
			// System.out.println(z);
			/* "Operator / is undefined for argument type(s) String, int"
			 * i.e. Unable to divide string by integer
			 * z = "Lay" / 0
			 */
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 7: z = c/g
			// z = c/g;
			// System.out.println(z);
			/* "Type mismatch: cannot convert from double to string."
			 * i.e 
			 * z = -52.2/0
			 */
			
			// 8: x = 10
			//	  x = x^3
			x = (long) Math.pow(10, 3);
			System.out.println(x);
			
			// 9: name + "is" + f + h
			z = name + "is" + f + h;
			System.out.println(z);
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 10: z = (name + 10)/(name + h)
			// z = (name + 10)/(name + h);
			// System.out.println(z);
			/* "The operator / is undefined for the argument type(s) java.lang.string, java.lang.string"
			 * i.e. You cannot divide a string by a string.
			 * z = Lay+10 / Lay+! 
			 */
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 11: x = (a + b)/(d + c)
			// x = (a + b)/(d + c);
			// System.out.println(x);
			/* "The operator + is undefined for the argument type(s) boolean double"
			 * i.e. You cannot add a boolean value to a double.
			 * x = (100+2.3) / (true+-52.2)
			 */
			
			// 12: y = 100.3
			//	   y = (y/(a+b))-c
			y = (y/(a+b))-c;
			System.out.println(y);
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 13: x^2 = y^2 + z^2;
			// x = y + z;
			// x = x * x;
			// System.out.println(x);
			/* "Type mismatch cannot convert from string to long"
			 * i.e. Left hand side of the equation has to be a variable,  math.pow(x, 2)is not a variable; x is a variable.
			 * x^2 = (double y)^2 + (String z)^2 
			 */
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 14: name = "Is" + f - h
			// name = "Is" + f - h;
			// System.out.println(name);
			/* "The operator - is undefined for the argument type(s) java.lang.string, java.lang.string"
			 * i.e. The name has been declared as a constant and it cannot change.
			 * name = "Is" + "a student" - "!"
			 */
			
			// 15: y = (( pi + 1)/( pi + 2)) / ( pi + 3)
			y = (( pi + 1)/( pi + 2)) / ( pi + 3);
			System.out.println(y);
			
			// 16: y = -2
			// 	   y = Math.pow( y*y/b, 1/3)
			y = -2;
			y = (double) Math.pow( y*y/b, 1.0/3.0);
			// y = (double) Math.cbrt(y*y/b); 
			// You use double to allow the answer to be expressed in decimal form
			System.out.println(y);
					
			
			// 17: y = b / g
			// 	   z = y + name
			y = b / g;
			z = y + name;
			System.out.println(z);
			
			// 18: z = name
			//	   z = b/g + z
			z = name;
			z = b/g + z;
			System.out.println(z);
			
			// 19: y = -2.3
			//	   y = ay^2 + by + c
			y = -2.3;
			y = (a*y)*(a*y) + b*y + c;
			System.out.println(y);
			
			// ERROR. PROGRAM UNABLE TO RUN.
			// 20: y = y - (Math.pow((a-b), Math.pow((b-c), c-d)))
			// y = y - (Math.pow((a-b), Math.pow((b-c), c-d)));
			// System.out.println(y);
			/* " The operator - is undefined for the argument type(s) double, boolean"
			 * i.e. You are subtracting a boolean value from a double in the last order. This is not allowed. If boolean value was an integer, expression would give an output.
			 * y = y - (100 - 2.3)^ ((2.3 - -52.2)^ (-52.2 - true))
			 */
			
			int red;
			int green;
			int blue;
			int duration;
			
			red = 10; // If negative LED will not be set, If 0 no light will be shown, If low(10) red will be dim
			green = red * 2;
			blue = (red + green) / 2;
			duration = red + green + blue;
			
			Finch myfinch = new Finch();
			myfinch.setLED( red, green, blue, duration);
			myfinch.quit();
			
			
			/* Reserved Words
			 * for, while, switch, package, throw, new, class
			 */
							
			
			}
	

	}


