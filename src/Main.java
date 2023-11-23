import Two.Apple;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        //2-ая
        Apple apple = new Apple();
        Field[] fields = Apple.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType());
            System.out.println(fields[i].get(apple));
            String s = "color";
            if (fields[i].getName() == s) {
                fields[i].set(apple, "Red");
                System.out.println(fields[i].get(apple));
            }


        }
    }
}