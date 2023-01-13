package com.javalabs.enums;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumsWithState {
    public static void main(String[] args) {
        EnumSet set = EnumSet.of(SeasonWithVistors.FALL);
        System.out.println(set.size());
        EnumSet<SeasonWithVistors> set2 = EnumSet.of(SeasonWithVistors.FALL, SeasonWithVistors.WINTER);
        System.out.println(set2.size());
        set2.forEach(System.out::println);

        for(SeasonWithVistors season: EnumSet.range(SeasonWithVistors.WINTER, SeasonWithVistors.FALL)) {
            System.out.println(season);
        }

        EnumMap<SeasonWithVistors, String> map = new EnumMap<SeasonWithVistors, String>(SeasonWithVistors.class);

        map.put(SeasonWithVistors.FALL,"fall");
        map.put(SeasonWithVistors.SUMMER,"summer");
        map.put(SeasonWithVistors.WINTER,"winter");

        map.entrySet().forEach(System.out::println);
    }
}


enum SeasonWithVistors {
    WINTER("Low") {
        @Override
        void printWorkingHours() {
            System.out.println("9AM-4PM");
        }
    },
    SPRING("Medium") {
        @Override
        void printWorkingHours() {
            System.out.println("9AM-5PM");
        }
    },
    SUMMER("High") {
        @Override
        void printWorkingHours() {
            System.out.println("9AM-6PM");
        }
    },
    FALL("Medium") {
        @Override
        void printWorkingHours() {
            System.out.println("9AM-5PM");
        }
    };

    private final String expectedVisitors;

    private SeasonWithVistors(String expectedVisitors) {
//        System.out.println("Called constructor for " + this.name());
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

    abstract void printWorkingHours();
}
