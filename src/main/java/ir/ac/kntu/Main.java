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

        }else if (where == '2'){

        }else if (where == '3'){

        }else if (where == '4'){

        }else if (where == '5'){

        }else if (where == '6'){
            mainPage();
        }
    }

    public static void toursPage(){
        print("Enter the number :\n1.Types Of ،ours\n2.All Tours" +
                "\n3.Add Type Of Tour\n4.Add Tour\n5.Edit Tour\n6.Delete Tour" +
                "\n7.Search Types of Tours\n8.Search Tours\n9.Back to Main Page");

        where = scanner.next().charAt(0);
        if (where == '1'){

        }else if (where == '2'){

        }else if (where == '3'){

        }else if (where == '4'){

        }else if (where == '5'){

        }else if (where == '6'){

        }else if (where == '7'){

        }else if (where == '8'){

        }else if (where == '9'){
            mainPage();
        }
    }

    public static void allLeaders(){
        print("Enter the Number");
        for (int i = 0; i < leaders.size(); i++) {
            print(""+(i+1)+leaders.get(i));
        }
    }

    public static void print(String txt){
        System.out.println(txt);
    }
}
