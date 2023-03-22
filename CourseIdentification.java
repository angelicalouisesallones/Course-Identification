import java.util.Scanner;

class CourseIdentification
{
      public static void main (String args[])
      {
      Scanner input= new Scanner(System.in);
      String[] profile = new String [4];
      int[] others = new int[3];
      
      System.out.println("Enter the needed Information.");
      System.out.println(" ");
      System.out.println("Firstname, Lastname, Address, Email ");
      String firstname = input.next();
      String lastname = input.next();
      String address = input.next();
      String email = input.next();
      
      System.out.println(" ");
      
      System.out.println("BMI, Contact, Zipcode: ");
      int bmi = input.nextInt();
      int contact = input.nextInt();
      int zipcode = input.nextInt();

      
      others[0]= bmi;
      others[1]= contact;
      others[2]= zipcode;
      profile[0]= firstname;
      profile[1]= lastname;
      profile[2]= address;
      profile[3]= email;
      System.out.println(" " );
      System.out.println(" " );
      
      
        if(bmi < 18.5) 
        {
            System.out.println(" ===== You are underweight =====");
        }
        else if (bmi < 25) 
        {
            System.out.println(" ===== You are normal =====");
        }
        else if (bmi < 30) {
            System.out.println(" ===== You are overweight =====");
        }
        else 
        {
            System.out.println(" ===== You are obese =====");
        }
        
      System.out.println(" " );
      System.out.println(" " );
      System.out.println("Display the profile information: " );
      System.out.print("Firstname: " );
      System.out.println(profile[0]);
      System.out.print("Lastname: " );
      System.out.println(profile[1]);
      System.out.print("Address: " );
      System.out.println(profile[2]);
      System.out.print("Email: " );
      System.out.println(profile[3]);
      System.out.println(" " );
      System.out.println("Display the other information: " );
      System.out.println(others[0]);
      System.out.println(others[1]);
      System.out.println(others[2]);
      
      }
      
}