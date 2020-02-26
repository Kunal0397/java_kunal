package collectt;
import java.util.regex.Pattern;
public class Car {

	public String setSpeed( int speed) {
		
		try {
			if(speed>=10 && speed<=20)
				return "Good Speed";
			else
				throw new SpeedException("Bad Speed");
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
		
	}
	
	 public String setVechicleNumber( String vnumber) {
		    
		 // check vechile number format : AAA123-12
		   // if not , generate cumtom exception : VechicleNumberException
		   // otherwise show "valid number"
		 try {
			 boolean flag=Pattern.matches("^[A-Z]{3}[0-9]{3}-[0-9]{2}$", vnumber);
			 if(flag)
				 return "valid number";
			 else
				 throw new VechicleNumberException("Invalid Number");
		 }
		 catch(Exception e) {
			 return e.getMessage();
		 }
		 }
	public static void main( String arg[]) {
	      // make instance of class- Car , object name : car
		Car car= new Car();
	      //call method setSpeed(12) with object
		System.out.println(car.setSpeed(12));
	      //call method setSpeed(1) with object
	      System.out.println(car.setSpeed(1));
	      /*call method setVechicleNumber("abC123) with object
	      call method setVechicleNumber("XYA579-53") with object*/
	      System.out.println(car.setVechicleNumber("XYZ123-78"));
	      System.out.println(car.setVechicleNumber("abc152"));
	      
	  }

	}
	
