package ir.ac.kntu;

import ir.ac.kntu.maputil.MapUtil;

public class Main {
    public static void main(String[] args) {

//        Good for showing one location
        MapUtil.showMap("Shiraz");
        MapUtil.showMap("@29.6257966,52.5563165,17z");
//        Good for showing two locations
        MapUtil.showMap("Tehran","Dubai");
    }
}
