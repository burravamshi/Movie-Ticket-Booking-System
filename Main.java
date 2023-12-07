package Project;
import java.lang.Thread;
import java.util.Scanner;
public class Main{
	public static final String BLUE="\033[0;34m",BLUE_BOLD_BRIGHT="\u001b[34;1m", CHOCOLATE = "\u001b[1;38;2;210;105;30m",YELLOW="\u001b[1;38;2;255;255;0m", BLUE_STABLE ="\u001b[0;38;2;106;90;205m",ORANGE="\u001b[1;38;2;255;69;0m",SILVER="\u001b[1;38;2;192;192;192m", GREEN_BOLD_BRI = "\u001b[32;1m", ROYAL_BLUE = "\u001b[1;38;2;65;105;225m" ,RESET = "\u001B[0m";
	public static final String RED = "\033[0;31m",MAGNETA="\u001b[35m",CYAN = "\033[0;96m",MAGENTA_DARK="\u001b[1;38;2;139;0;139m",RED_FULL_BRIGHT="\u001b[1;38;2;204;0;0m", LIME ="\u001b[1;38;2;0;255;0m",CYAN_BOLD="\033[1;36m",WHITE_BOLD = "\u001b[1;38;2;245;245;245m",YELLOW_BRIGHT_BOLD="\u001b[1;38;2;255;215;0m";

	public static Scanner sc = new Scanner(System.in);
    	public static void main(String [] args) throws InterruptedException {
			System.out.println(BLUE_BOLD_BRIGHT+"\nWelcome to Online Movie Ticket Booking System......:)"+RESET);
			System.out.println(BLUE_BOLD_BRIGHT+"    -------------* * * * * * * * * *------------"+RESET);
        	SignUp obj = new SignUp();
			Thread.sleep(1000);
			System.out.println(WHITE_BOLD+"\nSelect option for Register/Login: "+BLUE+"\n1.Register \n2.Login");
        	obj.signup(sc.next());
        	Ticket t = new Ticket();
        	Seating s = new Seating();
        	t.BookingSummary();
        	Payment p = new Payment();
        	t.m1();

    	}

}