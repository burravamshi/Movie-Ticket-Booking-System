package Project;

public class Payment {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    Payment() throws InterruptedException {
        Thread.sleep(3500);
        System.out.println(Main.WHITE_BOLD+"Select the Mode of Payment"+Main.CHOCOLATE+"\n1.UPI\n2.Card Payment");
        SelectPayment(sc.next());
    }

    void SelectPayment(String a) throws InterruptedException {
        int b = CheckInput(a);
        if(b==1){
            UpiPayment();
        }
        else{
            CardPayment();
        }


    }
    void UpiPayment() throws InterruptedException {
        System.out.println(Main.WHITE_BOLD+"Choose your UPI App "+Main.MAGNETA+" \n1.Google Pay \n2.PhonePe\n3.Paytm");
        int x = CheckInput(sc.next(),1);
        System.out.println(Main.WHITE_BOLD+"Choose your transaction Method "+Main.MAGNETA+"\n1.UPI ID \n2.Phone Number");
        int a = CheckInput(sc.next());
        if(a==1){
            System.out.println(Main.WHITE_BOLD+"Enter your UPI ID");
            String b = sc.next();
        }
        else{
            System.out.println(Main.WHITE_BOLD+"Enter Your PhoneNumber");
            SignUp obj = new SignUp();
            obj.MobileCheck(sc.next());
        }
        System.out.println(Main.WHITE_BOLD+"Enter your UPI PIN");
        CheckUpiPin(sc.next());
        System.out.print(Main.RED+"Please Wait Your Transaction is in Progress.");
        Thread.sleep(2500);
        System.out.print(".");
        Thread.sleep(2500);
        System.out.print(".");
        Thread.sleep(2500);
        System.out.print(".");
        Thread.sleep(2500);
        System.out.println(".");
        System.out.println(Main.GREEN_BOLD_BRI+"Transaction Successful");

    }
    void CardPayment() throws InterruptedException {
        System.out.println(Main.WHITE_BOLD+"Choose your Card transaction Method"+Main.MAGNETA+"\n1.Debit Card \n2.Credit Card");
        int a = CheckInput(sc.next());
        if(a==1||a==2){
            System.out.println(Main.WHITE_BOLD+"Enter your "+((a==1)?"Debit":"Credit")+" Card Number");
            CheckCard(sc.next());
            System.out.println("Enter Expiry Date of Card");
            CheckExpiry(sc.next());
            System.out.println("Enter CVV of Card");
            CheckCVV(sc.next());
            System.out.println("Enter Card Holder Name");
            String b = sc.next();
            System.out.println("Enter OTP");
            String otp = sc.next();
            System.out.print(Main.RED+"Please Wait Your Transaction is in Progress");
            Thread.sleep(2500);
            System.out.print(".");
            Thread.sleep(2500);
            System.out.print(".");
            Thread.sleep(2500);
            System.out.print(".");
            Thread.sleep(2500);
            System.out.println(".");

            System.out.println(Main.GREEN_BOLD_BRI+"Transaction Successful");

        }
    }
    int CheckInput(String a){
        if(a.equals("1")){
            return 1;
        }
        else if(a.equals("2")){
            return 2;
        }

        else{
            System.out.println(Main.RED+"Please enter valid input");
            return CheckInput(sc.next());
        }

    }
    int CheckInput(String a,int b){
        if(a.equals("1")){
            return 1;
        }
        else if(a.equals("2")){
            return 2;
        }
        else if(a.equals("3")){
            return 3;
        }
        else{
            System.out.println(Main.RED+"Please enter valid input");
            return CheckInput(sc.next(),b);
        }

    }
    boolean CheckCard(String a){
        if(a.length()==16&&NumInStringCheck(a)){
            return true;
        }



        else{
            System.out.println(Main.RED+"Please enter valid 16 digit Card Number");
            CheckCard(sc.next());

        }
        return true;
    }

    int CheckExpiry(String a){
        if(a.length()==5&&a.charAt(2)=='/'&&Integer.parseInt(a.substring(0,2))>0&&Integer.parseInt(a.substring(0,2))<=12&&Integer.parseInt(a.substring(3,5))>23)
        {
            return 1;
        }
        else
        {
            System.out.println(Main.RED+"Please enter valid Expiry Date");
            return CheckExpiry(sc.next());

        }
    }
    boolean CheckCVV(String a){
        if(a.length()==3&&NumInStringCheck(a)){
            return true;
        }
        else{
            System.out.println(Main.RED+"Please enter valid CVV Number");
            CheckCVV(sc.next());
            return true;

        }
    }
    boolean NumInStringCheck(String a){
        for(int i=0;i<a.length();i++){
            if(!(a.charAt(i)>='0')||!(a.charAt(i)<='9')){
                return false;
            }
        }
        return true;

    }
    boolean CheckUpiPin(String a){
        if((a.length()==4||a.length()==6)&&NumInStringCheck(a)){
            return true;
        }
        else {
            System.out.println(Main.RED+"Please Enter Valid UPI PIN (4 OR 6) Digits");
            return CheckUpiPin(sc.next());
        }
    }

}
