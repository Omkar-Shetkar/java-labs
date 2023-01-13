package com.javalabs.enums;

import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {
//        printSeason(SeasonConstants.FALL);
//        printSeason("Foggy");

//        printSeason(Season.Foggy);

//        Arrays.stream(Season.values()).forEach(s -> System.out.println(s.name() + " "+s.ordinal()));

        System.out.println(Season.SPRING.hashCode());
        System.out.println(Season.valueOf("SPRING").hashCode());

    }

    public static void printSeason(String season) {
        switch (season) {
            case SeasonConstants.WINTER:
                System.out.println("Its Winter!");
                break;
            case SeasonConstants.SPRING:
                System.out.println("Its Spring!");
                break;
            case SeasonConstants.SUMMER:
                System.out.println("Its Summer!");
                break;
            case SeasonConstants.FALL:
                System.out.println("Its Fall!");
                break;
            default:
                System.out.println("Unknown season!");
                break;
        }

    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Its Winter!");
                break;
            case SPRING:
                System.out.println("Its Spring!");
                break;
            case SUMMER:
                System.out.println("Its Summer!");
                break;
            case FALL:
                System.out.println("Its Fall!");
                break;
            default:
                System.out.println("Unknown season!");
                break;
        }
    }
}

enum Season {
    WINTER, SPRING, SUMMER, FALL
}

class SeasonConstants {
    public static final String WINTER = "winter";
    public static final String SPRING = "spring";
    public static final String SUMMER = "summer";
    public static final String FALL = "fall";
}