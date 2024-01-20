package Project;

public class  Ticket extends Theatre {
    Ticket() throws InterruptedException {
    }

    void BookingSummary() throws InterruptedException {
        float BaseAmount = (float)(15*(150*Seating.GoldCount+110*Seating.SilverCount))/100;
        float IGST = BaseAmount*18/100;
        float GTPrice = 150*Seating.GoldCount;
        float STPrice = 110*Seating.SilverCount;
        float total = (GTPrice+STPrice+BaseAmount+IGST+(float)Munchies_Price );
        System.out.println(Main.WHITE_BOLD+"BOOKING SUMMARY:-->");
        Thread.sleep(400);
        System.out.printf(Seating.GoldCount>0?Main.RED_FULL_BRIGHT +"Gold           :"+Main.YELLOW+Seating.GoldTickets+" ("+Seating.GoldCount+" Tickets X 150) = Rs."+(GTPrice+"\n"):"");
        Thread.sleep(400);
        System.out.printf(Seating.SilverCount>0?Main.RED_FULL_BRIGHT +"Silver         :"+Main.YELLOW+Seating.SilverTickets+" ("+Seating.SilverCount+" Tickets X 110) = Rs."+(STPrice)+"\n":"");
        Thread.sleep(400);
        System.out.printf(Main.RED_FULL_BRIGHT +"Convenience Fee: "+Main.YELLOW+"Base Amount = Rs.%.2f",BaseAmount);
        Thread.sleep(400);
        System.out.print(Main.YELLOW +"\n                 Integrated GST @18% = Rs.");
        System.out.printf("%.2f",IGST);
        Thread.sleep(400);
        System.out.print(Main.RED_FULL_BRIGHT +"\nFood & Beverage: "+Main.YELLOW+Munchies+" = Rs."+Munchies_Price);
        Thread.sleep(400);
        System.out.printf(Main.RED_FULL_BRIGHT+"\n\n*Total Amount Payable is"+Main.YELLOW+" Rs.%.2f\n", total);
        System.out.println();
    }
    void m1() throws InterruptedException {
        System.out.println();
        Thread.sleep(3000);
        System.out.print(Main.RED+"Please wait a moment, your tickets are being generated.");
        Thread.sleep(2500);
        System.out.print(".");
        Thread.sleep(2500);
        System.out.print(".");
        Thread.sleep(2500);
        System.out.print(".");
        Thread.sleep(2500);
        System.out.println(".");
        System.out.println(Main.GREEN_BOLD_BRI+"\nBooking Successful...Here is Your Ticket(s) Details! ");
        System.out.println(Main.ORANGE+"Movie Name              :"+Main.LIME +Movie);
        System.out.println(Main.ORANGE+"Movie Language          :"+Main.LIME +Movie_Language);
        System.out.println(Main.ORANGE+"Date and Show Time      :"+Main.LIME +Date+","+Time);
        System.out.println(Main.ORANGE+"Total Number of Tickets :"+Main.LIME +(Seating.SilverCount+Seating.GoldCount));
        System.out.print(Main.ORANGE+"Seats                   :");
        System.out.print(Seating.GoldCount>0?Main.YELLOW_BRIGHT_BOLD+"Gold -"+Main.LIME +Seating.GoldTickets+" ":"");
        System.out.println(Seating.SilverCount>0?Main.SILVER +"Silver -"+Main.LIME +Seating.SilverTickets:"");
        System.out.println(Main.ORANGE+"Theatre Name            :"+Main.LIME +Theatre_Name+","+City_Name);
        Thread.sleep(4500);
        System.out.print(Main.YELLOW_BRIGHT_BOLD+"\nThank You For Choosing BookMyShow...");
        Thread.sleep(200);
        System.out.println("Visit Again To Book Another Blockbuster Movie Tickets..!! ");
        Thread.sleep(200);
        System.out.println(Main.YELLOW_BRIGHT_BOLD+"HAPPY WATCHING...:)");

    }
}
