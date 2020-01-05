package com.ab.builder;

public class LunchOrderBuilderDemo {
    public static void main(String[] args) {

        LunchOrderBuilder.Builder builder = new LunchOrderBuilder.Builder();

        builder.bread("wheat").condiments("lettuce").dressing("mayo").meat("turkey");

        LunchOrderBuilder lunchOrderBuilder = builder.build();

        System.out.println(lunchOrderBuilder.getBread());
        System.out.println(lunchOrderBuilder.getCondiments());
        System.out.println(lunchOrderBuilder.getDressing());
        System.out.println(lunchOrderBuilder.getMeat());
    }
}
