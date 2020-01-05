package com.ab.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {
        String sql = "Select * from movies where title = ?";
        List<String> parameters = new ArrayList<String>();
        parameters.add("Star Wars");
        Record record = new Record();

        Statement statement = new Statement(sql,parameters,record);

        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());

        Statement anotherStatement = statement.clone();
        //shallow copy
        //Dangerous: the changes done in List elements or record object will be reflected in both statement

        System.out.println(anotherStatement.getSql());
        System.out.println(anotherStatement.getParameters());
        System.out.println(anotherStatement.getRecord());
    }

}
