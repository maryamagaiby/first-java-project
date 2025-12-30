import javax.xml.transform.Source;
import java.util.Scanner;

public class WeekOne {
    public static void  main(String[]args){
        /*system.out.print("(6*3+2)/(45 *3.5) = ");
        System.out.println((6*3+2)/(45*3.5));*/
        /*for (int i=1; i <= 5; i++){
            System.out.println("I love Java");
        }*/
        /*int i=0;
        while(i < 5){
            i++;
            System.out.println("I love Jav");

        }*/
        //System.out.println((((7.5*6.5)-(4.5*3))/(47.5-5.5)));

        /*double pi= 4 * (1 -(1.0/3)+(1.0/5)- (1.0/7)+ (1.0/9)- (1.0/11)+ (1.0/13));
        System.out.println(pi);

        double radius= 6.5;
        double perimeter = (2* radius)*pi;
        double area= (radius*radius)*pi;
        System.out.println("the perimeter is " + perimeter + "\n" +"the area is " + area);*/
        /*double width = 5.3;
        double height = 8.6;
        double rectanglePerimeter = (width + height)*2;
        double rectangleArea= width * height;
        System.out.println("The perimeter of rectangle is " + rectanglePerimeter + "and the area of the rectangle if " + rectangleArea);
    */
        /*
    double milesRate= 1.6;
    int kilos_travelled= 15;
    double miles_travelled = kilos_travelled / milesRate;
    int mins_amount= 50;
    int sec_amount= 30;
    int min_to_sec= mins_amount * 60;
    int total_sec= sec_amount + min_to_sec;
    double total_hours= total_sec / (60.0*60);
    double average = (miles_travelled/total_hours) ;
    System.out.println("the average is " + average);
    */
        /*double birth_per_min= (1/7.0) *60.0;
        double death_per_min= (1/13.0) *60.0;
        double imgri_per_min = (1/45.0) * 60.0;
        int initial_pop= 312032486;
        double total_population_per_min= (birth_per_min+ imgri_per_min)- death_per_min;
        double popul_per_year= ((total_population_per_min *60.0) *24.0) *365;
        double pop_aft_five_years= initial_pop+ (popul_per_year*5);
        System.out.println("the population after 5 years is " + (long)pop_aft_five_years + "every year" + popul_per_year + "increasing");
    */
       /* double miles_to_kilos= 1.6;
        double miles= 24.0;
        int hours= 1;
        int mins=40;
        int seconds= 35;
        double time= (hours *60*60) + (mins*60.0) + seconds;
        double kilos_average= ((miles* miles_to_kilos) / ((time)) *(60.0*60));
        double rounded= Math.round(kilos_average);
        System.out.println("the average speed traveled is " + rounded+ "km/h");*/
        /*double a= 3.4;
        double b= 40.2;
        double c= 2.1;
        double d= 0.55;
        double e= 44.5;
        double f= 5.9;
        double denominator= a *d -(b*c);
        if (denominator==0){
            System.out.println("error");}

        else{
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;
            System.out.printf("x = %.3f%n", x);
            System.out.printf("y = %.3f%n", y);
            }*/
        /*Scanner myObj = new Scanner (System.in);
        System.out.println("What is your name? : ");
        String name= myObj.nextLine();


        System.out.println("What is your age? :");
        int age = myObj.nextInt();

        System.out.println("what is your weight?");
        double weight = myObj.nextDouble();
        myObj.nextLine();


        System.out.println("what is your major");
        String major= myObj.nextLine(); // to fix the int/double issue, as int double dont read enter key
        //nextline() reads everything untill Enter


        System.out.println("Your name is: "+ name);

        System.out.println("Your age is: " + age );
        System.out.println("Your weight is: " + weight);
        System.out.println("you major is " + major);*/

        Scanner nums= new Scanner(System.in);
        System.out.println("enter 3 numbers");
        double a= nums.nextDouble();
        double b= nums.nextDouble();
        double c= nums.nextDouble();
        double d= nums.nextDouble();
        double aver= (a+b+c)/3;
        System.out.println("the average is " + aver);



    }


}
