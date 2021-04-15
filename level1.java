package olacab;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class level1 {
	
	
	public static void main(String[] args) {
		
		float Total;
		System.out.println("Enter Mobile No.:");
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		System.out.println("Enter Mobile No.: "+num);
		
		System.out.println("Enter Password");
		String s = sc.next();
		System.out.println("Password: "+s);
		
		String numString = String.valueOf(num);
		if(numString.length() == 10) {
			if(s.length()==8) {
				Button b = new Button("SUBMIT");
				}
			else {
				System.out.println("Enter Correct password");
			     }
			}
		else {
			System.out.println("Enter Valid Number");
		}
		
		
		System.out.println("CAB TYPES");
		
		
		System.out.println("Price Estimator");
		
		System.out.println("Type 1 --->  Micro Cab Rs.10/Km");
		System.out.println("Type 2 ---> Mini Cab Rs.15/km");
		System.out.println("Type 3 ---> Prime Cab Rs.20/Km");
		
		String [] cabTypes = new String[3];
		cabTypes[0] = "micro";
		cabTypes[1] = "mini";
		cabTypes[2] = "prime";
		System.out.println("Cab Types "+Arrays.toString(cabTypes));
		System.out.println("No. of cabTypes:"+cabTypes.length);
		for(int i=0;i<cabTypes.length;i++) {
			String type = cabTypes[i];
			System.out.println(type);
		}
		
		System.out.println("Enter Cab Choice");
		String S = sc.next();
		System.out.println("Enter Cab Choice: "+S);
		System.out.println("Enter Kilometers");
		int km = sc.nextInt();
		System.out.println("Enter kilometers: "+km);
		
		if(S.equalsIgnoreCase("MICRO")) {
			int fare = 10 * km;
			System.out.println("Fare is : "+fare);
			System.out.println("GST 7%");
			float f1 = (float) fare;
			float gst = f1 * 0.07F;
			System.out.println("7% GST is: "+gst);
			Total = fare - gst;
			System.out.println("Total Billing Amount:"+Total);
			
			Booking();
			
			System.out.println("Enter pick up Time");
			Scanner in = new Scanner(System.in);
			String pickUpTime = in.next();
			System.out.println("Enter Time: "+pickUpTime);
			LocalTime pickUpTimeobject = LocalTime.parse(pickUpTime);
			System.out.println(pickUpTimeobject);	
			LocalTime time = LocalTime.now();
			if(pickUpTimeobject.isAfter(time)) {
				System.out.println("Select Submit Button");
			}
			if(pickUpTimeobject.isBefore(time)) {
				System.out.println("Give the Correct Time");
			}
			int hour = pickUpTimeobject.getHour();
			System.out.println("Hour:"+hour);
			if(hour>=17 && hour<=19) {
				System.out.println("It's Peak Hour");
				float n = Total * 0.0125F;
			float peakprice = Total + n;
			System.out.println("Amount During Peak Hours: "+peakprice);
			
			System.out.println("Enter Date of Birth");
			Scanner SC = new Scanner(System.in);
			String dobstr = SC.next();
			System.out.println("Enter dob: "+dobstr);
			LocalDate dobobject = LocalDate.parse(dobstr);
			System.out.println(dobobject);
			LocalDate today = LocalDate.now();
			Period p = Period.between(dobobject, today);
			System.out.println("Days: "+p.getDays());
			System.out.println("Months: "+p.getMonths());
			System.out.println("Years: "+p.getYears());
			if(p.getYears()>=60) {
				float Amount = peakprice / 2;
				System.out.println("Billing Amount : "+Amount);
			}
			}
		}
		
		if(S.equalsIgnoreCase("MINI")) {
			int fare1 = 15 * km;
			System.out.println("Fare is :"+fare1);
			System.out.println("GST 7%");
			float f2 = (float) fare1;
			float gst1 = f2 * 0.07F;
			System.out.println("7% GST is: "+gst1);
			Total = fare1 - gst1;
			System.out.println("Total Billing Amount:"+Total);
			
			Booking();
			
			System.out.println("Enter pick up Time");
			Scanner mn = new Scanner(System.in);
			String pickUpTime1 = mn.next();
			System.out.println("Enter Time: "+pickUpTime1);
			LocalTime pickUpTime1object = LocalTime.parse(pickUpTime1);
			System.out.println(pickUpTime1object);	
			LocalTime time = LocalTime.now();
			if(pickUpTime1object.isAfter(time)) {
				System.out.println("Select Submit Button");
			}
			if(pickUpTime1object.isBefore(time)) {
				System.out.println("Give the Correct Time");
			}
			int hour1 = pickUpTime1object.getHour();
			System.out.println("Hour:"+hour1);
			if(hour1>=17 && hour1<=19) {
				System.out.println("It's Peak Hour");
				float n = Total * 0.0125F;
				float peakprice1 = Total + n;
			System.out.println("Amount During Peak Hours: "+peakprice1);
			
			System.out.println("Enter Date of Birth");
			Scanner uv = new Scanner(System.in);
			String dobstr1 = uv.next();
			System.out.println("Enter dob: "+dobstr1);
			LocalDate dob1object = LocalDate.parse(dobstr1);
			System.out.println(dob1object);
			LocalDate today1 = LocalDate.now();
			Period p1 = Period.between(dob1object, today1);
			System.out.println("Days: "+p1.getDays());
			System.out.println("Months: "+p1.getMonths());
			System.out.println("Years: "+p1.getYears());
			if(p1.getYears()>=60) {
				float Amount = peakprice1 / 2;
				System.out.println("Billing Amount : "+Amount);
			}
			}
		}
		
		if(S.equalsIgnoreCase("PRIME")) {
			int fare2 = 20 * km;
			System.out.println("Fare is : "+fare2);
			System.out.println("GST 7%");
			float f3 = (float) fare2;
			float gst2 = f3 * 0.07F;
			System.out.println("7% GST is: "+gst2);
			Total = fare2 - gst2;
			System.out.println("Total Billing Amount:"+Total);
			
			Booking(); 
			
			System.out.println("Enter pick up Time");
			Scanner li = new Scanner(System.in);
			String pickUpTime2 = li.next();
			System.out.println("Enter Time: "+pickUpTime2);
			LocalTime pickUpTime2object = LocalTime.parse(pickUpTime2);
			System.out.println(pickUpTime2object);	
			LocalTime time = LocalTime.now();
			if(pickUpTime2object.isAfter(time)) {
				System.out.println("Select Submit Button");
			}
			if(pickUpTime2object.isBefore(time)) {
				System.out.println("Give the Correct Time");
			}
			int hour2 = pickUpTime2object.getHour();
			System.out.println("Hour:"+hour2);
			if(hour2>=17 && hour2<=19) {
				System.out.println("It's Peak Hour");
				float n = Total * 0.0125F;
				float peakprice2 = Total + n;
			System.out.println("Amount During Peak Hours: "+peakprice2);
			
			System.out.println("Enter Date of Birth");
			Scanner ab = new Scanner(System.in);
			String dobstr2 = ab.next();
			System.out.println("Enter dob: "+dobstr2);
			LocalDate dob2object = LocalDate.parse(dobstr2);
			System.out.println(dob2object);
			LocalDate today2 = LocalDate.now();
			Period p2 = Period.between(dob2object, today2);
			System.out.println(p2.getDays());
			System.out.println(p2.getMonths());
			System.out.println(p2.getYears());
			if(p2.getYears()>=60) {
				float Amount = peakprice2 / 2;
				System.out.println("Billing Amount : "+Amount);
			}
			}	
		}
		
	}
		
		public static void Booking() {
		
		System.out.println("Booking");
		System.out.println("Enter Cab Choice");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("Enter the Cab Type :"+s1);
		System.out.println("Enter Journey Date");
		String journeydate = sc.next();
		System.out.println("Enter Journey Date: "+journeydate);
		LocalDate journeydateobject = LocalDate.parse(journeydate);
		LocalDate today = LocalDate.now();
		System.out.println(journeydateobject);
		if(journeydateobject.isAfter(today)) {
			System.out.println("Give the Pickup Time");	
		}
		
			else if(journeydateobject.isEqual(today)) {
			System.out.println("Give the Pickup Time");	
		}
		
			else if(journeydateobject.isBefore(today)) {
			System.out.println("Give the Correct Date");		
			Booking();
		}		
   }
}		
	


