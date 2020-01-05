package com.ab.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example");
        builder.append(" of builder pattern");
        builder.append("it has methods to append");
        builder.append(" almost anything we want to string ");
        builder.append(42);
        System.out.println(builder.toString());
    }
}
