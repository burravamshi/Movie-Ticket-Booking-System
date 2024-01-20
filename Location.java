package Project;

import java.util.Scanner;

public abstract class Location{
    abstract void city() throws InterruptedException;
}
class City extends Location{
    Scanner sc = new Scanner(System.in);
    String City_Name;
    int CityNumber;
    String[][] citiesmul = {{"AndraPradesh:-  ","1.Amalapuram       ", "2.Bhimavaram    ", "3.Eluru"}, {"                4.Guntur", "           5.Kakinada", "      6.Nellore"}, {"                7.Rajahmundry", "      8.Srikakulam", "    9.Tirupathi"}, {"                10.Vijayanagaram", "   11.Vijayawada", "   12.Vizag"}, {"\nTelangana:-", "     13.Adilabad", "        14.Hyderabad", "    15.Karimnagar"}, {"                16.Khammam", "         17.Mahabubnagar", " 18.Medak"}, {"                19.Nalgonda", "        20.Nizamabad", "    21.Warangal"}};
    String[] cities = {"Amalapuram","Bhimavaram","Eluru","Guntur","Kakinada","Nellore","Rajahmundry","Srikakulam","Tirupathi","Vijayanagaram","Vijayawada","Vizag","Adilabad","Hyderabad","Karimnagar","Khammam","Mahabubnagar","Medak","Nalgonda","Nizamabad","Warangal"};


    City() throws InterruptedException {
        System.out.println(Main.WHITE_BOLD+"Please Select Your City");
        city();
    }
    void city() throws InterruptedException {
        //System.out.println(Main.WHITE_BOLD_BRIGHT+"AndraPradesh:-  1.Amalapuram       2.Bhimavaram    3.Eluru \n                4.Guntur           5.Kakinada      6.Nellore\n                7.Rajahmundry      8.Srikakulam    9.Tirupathi\n                10.Vijayanagaram   11.Vijayawada   12.Vizag");
        //System.out.println("\nTelangana:-     13.Adilabad        14.Hyderabad    15.Karimnagar \n                16.Khammam         17.Mahabubnagar 18.Medak\n                19.Nalgonda        20.Nizamabad    21.Warangal");
        for(int i=0;i<citiesmul.length;i++){
            for(int j=0;j<citiesmul[i].length;j++){
                Thread.sleep(200);
                System.out.print(Main.CHOCOLATE +citiesmul[i][j]);
            }
            System.out.println();
        }
        CityNumber = citynumbercheck(sc.next());
        City_Name = cities[CityNumber-1];
    }
    int citynumbercheck(String a){
        if(a.length()==1&&a.charAt(0)>'0'&&a.charAt(0)<='9'){
            return Integer.parseInt(a);

        }
        else if(a.length()==2&&(a.charAt(0)=='1'||a.charAt(0)=='2')&&a.charAt(1)>='0'&&a.charAt(1)<='9') {
            if(Integer.parseInt(a)<22){
                return Integer.parseInt(a);
            }
            else{
                System.out.println(Main.RED+"Please enter valid city number");
                return citynumbercheck(sc.next());
            }
        }
        else{
            System.out.println(Main.RED+"Please enter valid city number");
            return citynumbercheck(sc.next());
        }

    }
}













