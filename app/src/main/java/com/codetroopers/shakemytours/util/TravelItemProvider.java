package com.codetroopers.shakemytours.util;

import com.codetroopers.shakemytours.R;
import com.codetroopers.shakemytours.core.entities.Travel;

public class TravelItemProvider {


    public static Travel getRandomTravel(int position) {
        switch (position) {
            case 0:
                return getMorning1();
            case 1:
                return getLaunch();
            case 2:
                return getAfternoon1();
            case 3:
                return getAfternoon2();
            case 4:
                return getSomething();
        }
        return null;
    }

    public static Travel getMorning1() {
        return new Travel()
                .setName("Morning" + Strings.nextSessionId())
                .setDistance("10km")
                .setTarif("20€")
                .setBackground(R.drawable.lake);
    }


    public static Travel getLaunch() {
        return new Travel()
                .setName("Launch " + Strings.nextSessionId())
                .setDistance("10km")
                .setTarif("20€")
                .setBackground(R.drawable.shop);
    }


    public static Travel getAfternoon1() {
        return new Travel()
                .setName("AfterNoon " + Strings.nextSessionId())
                .setDistance("10km")
                .setTarif("20€")
                .setBackground(R.drawable.musee);
    }

    public static Travel getAfternoon2() {
        return new Travel()
                .setName("Afternoon " + Strings.nextSessionId())
                .setDistance("10km")
                .setTarif("20€")
                .setBackground(R.drawable.vin);
    }

    public static Travel getSomething() {
        return new Travel()
                .setName("Afternoon " + Strings.nextSessionId())
                .setDistance("10km")
                .setTarif("20€")
                .setBackground(R.drawable.noel);
    }
}
