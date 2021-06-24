import java.util.*;


class Restro{   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~class Restro~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

	Scanner s = new Scanner(System.in);
	
	int n,i,j,total=0,bill;
	int ans,cc;
	String coupon_c;
	String [] name = new String[100];
	String [] coupon = { "Free100" , "Dis10", "Sumant" , "Aditi" , "Prathamesh" , "BVIT" };
	int [] quantity = new int[100];
	int [] price = new int[100];
	int [] amount = new int[100];


	
   public void food(){     //-----------------------------------------------------------------------void food ----------------------------------------------------------------------------//
	
	
	System.out.println("Enter the Bill Number:");
	bill = s.nextInt();
	
	System.out.println("Enter the No. of Dishes:");
	n = s.nextInt();
	System.out.println(n);

	for(i = 1; i <= n; i++){
	  
	   System.out.println("Enter the Name of Dish "+ i + ":");	//name
	   name[i] = s.next();

	   System.out.println("How many " + name[i] + " you want?:");	//quantity
	   quantity[i] = s.nextInt();

	   System.out.println("Enter the price of one " + name[i] + ":");		//price
	   price[i] = s.nextInt();		   

	   amount[i] = price[i] * quantity[i];	//amount
	   total += amount[i];



	} // end of for loop 

	System.out.println("Do you have any Coupon Code?If yes type the code or type NO");
	coupon_c = s.next();

	if(coupon_c.equalsIgnoreCase(coupon[0])) {
	
	  cc = total - ((total/100)*100);
	}

	else if(coupon_c.equalsIgnoreCase(coupon[1])) {
	
	  cc = total - ((total/100)*10);
	}

	else if(coupon_c.equalsIgnoreCase(coupon[2])) {
	
	  cc = total - ((total/100)*50);
	}

	else if(coupon_c.equalsIgnoreCase(coupon[3])) {
	
	  cc = total - ((total/100)*25);
	}

	else if(coupon_c.equalsIgnoreCase(coupon[4])) {
	
	  cc = total - ((total/100)*15);
	}

	else if(coupon_c.equalsIgnoreCase(coupon[5])) {
	
	  cc = total - ((total/100)*60);
	}



	System.out.println("\n Have Patience!, your mouth watering food is getting cooked");
	System.out.println("\nTo check bill type 0");
	 ans = s.nextInt();

	if(ans == 0){

	   invoice();

    	} // end of if
	
	  

   } // end of void food    //-----------------------------------------------------------------------void food ----------------------------------------------------------------------------//









   public void invoice(){   //------------------------------->>-----------------------------------void invoice------------------------------->>--------------------------------------------------//
	
	

		System.out.println("\n\n\n");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("	Sr.No	||	Name 	||	Quantity	||	Price	||	Amount	");
		System.out.println("--------------------------------------------------------------------------------------------");
 	
	for(i = 1; i <= n; i++){

		System.out.println("\t"+ i+"\t\t"+name[i]+"\t\t"+quantity[i]+"\t\t\t"+price[i]+"\t\t"+amount[i]); 		
	   
	} // end of for loop
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("	Total		||						   		"+ total);
		System.out.println("      For You		||						   		"+ cc);

		System.out.println("\n\n\n");
   
   } // end of void invoice   //------------------------------->>-----------------------------------void invoice------------------------------->>--------------------------------------------------//


} // end of class	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~class Restro~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//






class About{     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~class About~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

   public void info(){   //-------------------------------xxx----------------------------------void info-------------------------------xxx--------------------------------------------------//

	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("Who we are?:");
	System.out.println("The Hotel is a modern, elegant 4-star hotel overlooking the sea, perfect for a romantic, charming vacation, in the enchanting setting of Kharghar,Navi Mumbai");
	System.out.println("While you enjoy a cocktail by the swimming pool on the rooftop terrace, you will be stunned by the breathtaking \nview of the bay of Isola Bella. Here, during your summer \nstays, our bar serves traditional Sicilian dishes, snacks and salads.");
	System.out.println("--->> We are Special in: \n SeaFoods and Non-Veg Indian Cuisine");
	System.out.println("--->>Our Master Chef are: \n 1.Aditi Patil (Seafood) \n 2.Prathamesh Shinde (Indian Cuisine)");
	System.out.println("\n\nLocation: India");
	System.out.println("\nContact:");
	System.out.println("    email: sumant.dusane1966@gmail.com");
	System.out.println("    phone: +91 9137581887");
	System.out.println("    add  : Kharghar,Navi Mumbai");
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

   }   //-------------------------------xxx----------------------------------void info-------------------------------xxx--------------------------------------------------//

}   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~class About~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//


public class restraunt_manage1 {
   public static void main(String [] args){

	Scanner s = new Scanner(System.in);
	  int ch,i=1;
	Restro f = new Restro();
	About ab = new About();

     while(i <= 5){
	System.out.println("1.Order Food:");
	System.out.println("2.Ask for Invoice:");
	System.out.println("3.About US!");
	System.out.println("4.Exit");
	System.out.println("\nEnter the Choice:");
	ch = s.nextInt();
	
	switch(ch){

	case 1:
	 f.food();
	break;

	case 2:
	f.invoice();
	break;

	case 3:
	 ab.info();
	break;

	case 4:
	 System.exit(0);
	break;

	} // end of switch

       i++;

      } // end of while

    } // end of void main()

  } // end of class



