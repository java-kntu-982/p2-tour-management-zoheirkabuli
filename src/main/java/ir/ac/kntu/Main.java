package ir.ac.kntu;

import ir.ac.kntu.maputil.MapUtil;
import java.util.Scanner;


public class Main {
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
        print("Enter the number :\n1.Leaders\n2.Tours");
        where = scanner.next().charAt(0);
        if (where == '1'){
            toursPage();
        }else if (where == '2'){

        }
    }

    public static void toursPage(){
        print("Enter The number\n1.All Leaders\n2.Add Leader\n3.Delete Leader\n4.Edit Leader\n5.Search Leader\n6.Back to Main Page");
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

    public static void print(String txt){
        System.out.println(txt);
    }
}
