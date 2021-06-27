package com.company;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        // данные родителя
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        System.out.println (mom + "\n");

        // данные ребенка
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын,\n ⬇️⬇️⬇️⬇️ \n" + son);

        try {
            // перехват ошибки "Не хватает обяхательных полей"
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // перехват ошибки на "Возраст недопустимый"
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
