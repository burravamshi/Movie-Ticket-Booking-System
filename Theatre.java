package Project;

class Theatre extends City implements MovieLanguage, Movies{

   public static String Movie_Language="";
    String Movie;
    String Theatre_Name;
    String Date,Time;
    String Munchies = "null";
    int Munchies_Price = 0;

    Theatre() throws InterruptedException {
        super();
        Movie_Language = movielanguage(City_Name);
        Movie = movies(Movie_Language);
        TheatreList obj = new TheatreList();
        Theatre_Name = obj.theatrelist(Movie,CityNumber,City_Name);
        System.out.println(Main.WHITE_BOLD+"Enter the date when you want watch Movie(YYYY-MM-DD)");
        Date = Date(sc.next());
        System.out.println(Main.WHITE_BOLD+"Select the Show Time"+Main.RESET+Main.YELLOW+"\n1. 11:00 AM\n2. 02:00 PM\n3. 06:00 PM\n4. 09:00 PM");
        Time = time(sc.next());
        isMunchies(1);
    }

    public String movielanguage(String City_Name){
        System.out.println(Main.WHITE_BOLD+"Explore Latest Movies in "+Main.CHOCOLATE +City_Name+Main.WHITE_BOLD+" by Language"+Main.MAGENTA_DARK+"\n1.Telugu\n2.Hindi\n3.English");
        int a = Main.sc.nextInt();
        if(a==1){
            return "Telugu";
        }
        else if(a==2){
            return "Hindi";
        }
        else if(a==3){
            return "English";
        }
        else{
            System.out.println(Main.RED+"Please choose valid language");
            return movielanguage(City_Name);
        }

    }
    public String movies(String a){
        System.out.println(Main.WHITE_BOLD+"Choose a "+Main.MAGENTA_DARK+a+Main.WHITE_BOLD+" Movie you want to Watch");
        if(a.equals("Telugu")){
            System.out.println(Main.CYAN_BOLD+"1.Leo\n2.Keedaa Cola\n3.Japan\n4.Maa Oori Polimera 2");
            return TeluguMovies(Main.sc.next());
        }
        else if(a.equals("Hindi")){
            System.out.println(Main.CYAN_BOLD+"1.Tiger 3\n2.Ganapath\n3.Jigar Thanda Double X");
            return HindiMovies(Main.sc.next());
        }
        else if (a.equals("English")) {
            System.out.println(Main.CYAN_BOLD+"1.The Marvels\n2.The Jungle Book");
            return EnglishMovies(Main.sc.next());
        }
        return "";
    }
    public String TeluguMovies(String a){
        if(a.equals("1")){
            return "Leo";
        }
        else if(a.equals("2")){
            return "Keedaa Cola";
        }
        else if (a.equals("3")) {
            return "Japan";
        } else if (a.equals("4")) {
            return "Maa Oori Polimera 2";
        }
        else {
            System.out.println(Main.RED+"Please provide valid input");
            return TeluguMovies(Main.sc.next());
        }
    }
    public String HindiMovies(String a){
        if(a.equals("1")){
            return "Tiger 3";
        }
        else if(a.equals("2")){
            return "Ganapath";
        }
        else if (a.equals("3")) {
            return "Jigar Thanda Double X";
        }
        else {
            System.out.println(Main.RED+"Please provide valid input");
            return HindiMovies(Main.sc.next());
        }
    }
    public String EnglishMovies(String a){
        if(a.equals("1")){
            return "The Marvels";
        }
        else if(a.equals("2")){
            return "The Jungle Book";
        }

        else {
            System.out.println(Main.RED+"Please provide valid input");
            return EnglishMovies(Main.sc.next());
        }
    }
     boolean isValidDateFormat(String date) {
        if (date.length() != 10) {
            return false;
        }
        if (date.charAt(4) != '-' || date.charAt(7) != '-') {
            return false;
        }
        try {
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(5, 7));
            int day = Integer.parseInt(date.substring(8, 10));

            return year == 2023 && month >= 1 && month <= 12 && day >= 1 && day <= 31;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    String Date(String a){
        if (isValidDateFormat(a)) {
            return a;
        } else {
            System.out.println(Main.RED+"Invalid date format. Please use YYYY-MM-DD.");
            return Date(sc.next());
        }

    }
    String time(String a){
        if(a.equals("1")){
            return "11:00 AM";
        }
        if(a.equals("2")){
            return "02:00 PM";
        }
        if(a.equals("3")){
            return "06:00 PM";
        }
        if(a.equals("4")){
            return "09:00 PM";
        }
        else {
            System.out.println(Main.RED+"Please choose valid show time");
            return time(sc.next());
        }
    }
    void isMunchies(int c) throws InterruptedException {

        System.out.println(Main.WHITE_BOLD+(c==1?"Do you want add any Food Munchies(YES/NO)":""));
        String a = sc.next();
        if(a.equalsIgnoreCase("yes")){
            BookMuncies();
        } else if (a.equalsIgnoreCase("no")) {

        }
        else {
            isMunchies(c++);
        }
    }
    void BookMuncies() throws InterruptedException {
        String[] combos = {"Diwali Combo","French Fries Combo","Chicken Pizza Combo","Chicken  Burger Combo","Veg Burger Combo"};
	    String [] ComboItems = {"Tub Popcorn Salted 110g + French fries + 2 Coke 300ml","French Fries + Coke 650ml","Chicken Pizza + 1 Coke 650M + Popcorn Salted 55g","Chicken Burger + 1 Coke 650M + Popcorn Salted 55g","Veg Burger + 1 Coke 650M+ Popcorn Salted 55g"};
        int[] comboprice = {520,310,450,420,380};
        System.out.println(Main.WHITE_BOLD+"Add Your Favorite Combo");
        for(int i=0;i<combos.length;i++){
            Thread.sleep(250);
            System.out.println(Main.ROYAL_BLUE +(i+1)+". "+combos[i]+" - Rs."+comboprice[i]+"\n   "+Main.BLUE_STABLE +ComboItems[i]+"\n");
        }
        String a=checkmuchiesinput(sc.next());

            Munchies=combos[(Integer.parseInt(a))-1];
            Munchies_Price = comboprice[Integer.parseInt(a)-1];

    }
    String checkmuchiesinput(String a){
        if(a.charAt(0)>'0'&&a.charAt(0)<'6'){
            return a;
        }
        else {
            System.out.println(Main.RED+"Enter valid input");
            return checkmuchiesinput(sc.next());
        }
    }

}