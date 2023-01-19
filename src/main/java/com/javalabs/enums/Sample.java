package com.javalabs.enums;

import java.util.*;

public class Sample {

    public static void main(String[] args) {

//        Set<Season> set = EnumSet.of(Season.WINTER, Season.FALL, Season.SPRING);
//
//        set.forEach(s -> System.out.println(s.name() + " "+s.ordinal()));

        Map<Season, String> map = new EnumMap<Season, String>(Season.class);
        map.put(Season.FALL, "Its fall!");
        map.put(Season.SUMMER, "Its summer!");
        map.put(Season.SPRING, "Its spring!");

        map.entrySet().forEach(e -> System.out.println(e.getKey().name()+ " "+e.getKey().ordinal()));
    }


    private static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("It's winter!");
                break;
            case FALL:
                System.out.println("It's fall!");
                break;
        }
    }


    enum Season {
        WINTER("winter") {
            @Override
            void printDescription() {
                System.out.println(this.description);
            }

            @Override
            public void moreDescription() {
                System.out.println("It's very cold here!");
            }
        },
        SPRING("spring"){
            @Override
            void printDescription() {
                System.out.println(this.description);
            }
        },
        SUMMER("summer"){
            @Override
            void printDescription() {
                System.out.println(this.description);
            }
        },
        FALL("fall"){
            @Override
            void printDescription() {
                System.out.println(this.description);
            }
        };

         final String description;

        Season(String description) {
            this.description = description;
        }

        abstract void printDescription();

        public void moreDescription() {
            System.out.println("More of "+description);
        }

    }


}