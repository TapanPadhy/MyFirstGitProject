import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) 
    {
		System.out.println("try to modified");
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
        
    }        

}
