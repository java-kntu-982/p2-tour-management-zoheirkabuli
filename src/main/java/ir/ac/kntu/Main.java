package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static ArrayList<TourLeader> leaders = new ArrayList<>();
    private static ArrayList<Tour> tours = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static char where;

    public static void main(String[] args) {

//        Good for showing one location
//        MapUtil.showMap("Shiraz");
//        MapUtil.showMap("@29.6257966,52.5563165,17z");
//        Good for showing two locations
//        MapUtil.showMap("Tehran","Dubai");
        mainPage();
    }


    public static void mainPage(){
        print("Enter the number :\n1.Leaders\n2.Tours\n3.Places\n4.Maps");
        where = scanner.next().charAt(0);
        if (where == '1'){
            leadersPage();
        }else if (where == '2'){
            toursPage();
        }else if (where == '3'){

        }else if (where == '4'){

        }
    }

    public static void leadersPage(){
        print("Enter The number :\n1.All Leaders" +
                "\n2.Add Leader\n3.Delete Leader\n4.Edit Leader" +
                "\n5.Search Leader\n6.Back to Main Page");
        where = scanner.next().charAt(0);
        if (where == '1'){
            allLeaders();
        }else if (where == '2'){
            addLeader();
        }else if (where == '3'){

        }else if (where == '4'){

        }else if (where == '5'){

        }else if (where == '6'){
            mainPage();
        }
    }

    private static void addLeader() {
        print("Add Leader: \n" +
                "Enter The first name");
        String fName = scanner.next();
        print("Enter the last name");
        String lName = scanner.next();
        print("Enter the birthDay");
        int birthDay = scanner.nextInt();
        print("Enter the BirthMonth");
        int birthMonth = scanner.nextInt();
        print("enter the birthYear");
        int birthYear = scanner.nextInt();
        Date birth = new Date(birthYear,birthMonth,birthDay);
        print("enter the national Number");
        String nNumber = scanner.next();
        print("enter the ID number");
        String idNumber = scanner.next();
        print("enter the recruitment date like \nyear\nmonth\nday");
        int rYear = scanner.nextInt();
        int rMonth = scanner.nextInt();
        int rDay = scanner.nextInt();
        Date rDate = new Date(rYear,rMonth,rDay);
        print("is Married?\n" +
                "1.Yes\n2.no");
        int married = scanner.nextInt();
        boolean isMarried = false;
        if (married == 1){
            isMarried = true;
        }
        ArrayList<Region> places = leaderPlace();
        TourLeader tourLeader = new TourLeader(fName,lName,nNumber,idNumber,birth,rDate,isMarried,places);
        leaders.add(tourLeader);
        leadersPage();
    }

    private static ArrayList<Region> leaderPlace() {
        ArrayList<Region> holder = new ArrayList<>();
        while (true){
            print("Where leader Knows?\nenter the country");
            String country = scanner.next();
            print("enter the city");
            String city = scanner.next();
            Region region = new Region(country,city);
            holder.add(region);
            print("finnish?\n1.Yes\n2.No");
            int num = scanner.nextInt();
            if (num == 1){
                break;
            }
        }
        return  holder;
    }

    public static void toursPage(){
        print("Enter the number :\n1.Types Of Tours\n2.All Tours" +
                "\n3.Add Type Of Tour\n4.Add Tour\n5.Edit Tour\n6.Delete Tour" +
                "\n7.Search Types of Tours\n8.Search Tours\n9.Back to Main Page");

        where = scanner.next().charAt(0);
        if (where == '1'){

        }else if (where == '2'){
            allTours();
        }else if (where == '3'){
            addTypesTour();
        }else if (where == '4'){
            addTour();
        }else if (where == '5'){

        }else if (where == '6'){

        }else if (where == '7'){

        }else if (where == '8'){

        }else if (where == '9'){
            mainPage();
        }
    }

    private static void addTypesTour() {
        print("Enter the start place like this\ncountry\ncity");
        String country = scanner.next();
        String city = scanner.next();
        Region start = new Region(country,city);
        print("enter the finnish place like this\ncountry\ncity");
        String fCountry = scanner.next();
        String fCity = scanner.next();
        Region end = new Region(fCountry,fCity);
        print("enter the price");
        String price = scanner.next();
        print("enter the length");
        int days = scanner.nextInt();
        print("enter the min and max people like\nmax\nmin");
        int max = scanner.nextInt();
        int min = scanner.nextInt();
        print("Type : 1.ground 2.fly");
        int flied = scanner.nextInt();
        boolean isFlied = false;
        if (flied == 2){
            isFlied = true;
        }
        print("Enter the plan:");
        ArrayList<String> plan = new ArrayList<>();
        for (int i = 0; i < days; i++) {
            print("day "+(i+1));
            String txt = scanner.next();
            plan.add(txt);
        }
        Tour tour = new Tour(days,min,max,price,start,end,plan,isFlied);
        tours.add(tour);
        toursPage();
    }

    private static void addTour() {
        print("Select a Type of Tour");
        for (int i = 0; i < tours.size(); i++) {
            print((i+1)+"."+tours.get(i));
        }
        int holder = scanner.nextInt();
        print("select a leader:");
        for (int i = 0; i < leaders.size(); i++) {
            print((i+1)+"."+leaders.get(i));
        }
        int lHolder = scanner.nextInt();
        tours.get(holder-1).setLeader(leaders.get(lHolder-1));
        print("enter the start Date like \nyear\nmonth\nday");
        int year,month,day;
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();
        Date startDate = new Date(year,month,day);
        tours.get(holder-1).setStartDate(startDate);
        toursPage();
    }

    private static void allTours() {
        while (true){
            print("Enter the Number");
            for (int i = 0; i < tours.size(); i++) {
                print((i+1)+"."+tours.get(i));
            }
            print("Enter 0 to Main Page");
            int holder = scanner.nextInt();
            while (holder < 0 ){

            }
            if (holder == 0){
                mainPage();
            }else if (holder > tours.size()){
                print("wrong!!\nTry Again");
            }else {
                tourPage(tours.get(holder-1));
            }
        }
    }

    private static void tourPage(Tour tour) {

    }

    public static void allLeaders(){
        while (true){
            print("Enter the Number");
            for (int i = 0; i < leaders.size(); i++) {
                print((i+1)+"."+leaders.get(i));
            }
            print("Enter 0 to Main Page");
            int holder = scanner.nextInt();
            while (holder < 0 ){

            }
            if (holder == 0){
                mainPage();
            }else if (holder > leaders.size()){
                print("wrong!!\nTry Again");
            }else {
                leaderPage(leaders.get(holder-1));
            }
        }

    }

    private static void leaderPage(TourLeader tourLeader) {
        print(tourLeader+"");
        print("ID Number : "+tourLeader.getIdNumber()+"\nNational Number : "+tourLeader.getNationalNumber());
        print("Birth Date" + tourLeader.getBorn());
        print("is Married? " + tourLeader.isMarried());
        print("Where he Knows:");
        for (int i = 0; i < tourLeader.getPlaces().size(); i++) {
            print((i+1)+"."+tourLeader.getPlaces().get(i));
        }
        print("Enter 0 to back");
        int back = scanner.nextInt();

    }

    public static void print(String txt){
        System.out.println(txt);
    }
}
