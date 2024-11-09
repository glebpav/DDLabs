package ru.mephi.lab2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                User.builder().id(1).firstName("Alisa").lastName("Smelova").age(20).country("Russia").build(),
                User.builder().id(2).firstName("Boris").lastName("Elcin").age(25).country("Canada").build(),
                User.builder().id(3).firstName("Charlota").lastName("Wasilvna").age(30).country("Russia").build(),
                User.builder().id(4).firstName("Danila").lastName("Kashin").age(35).country("Uzbekistan").build(),
                User.builder().id(5).firstName("Yulia").lastName("Romanova").age(22).country("France").build()
        );

        System.out.println("Users sorted by lastName:");
        UserUtils.getUsersSortedByLastName(users).forEach(System.out::println);

        System.out.println("Users sorted by age:");
        UserUtils.getUsersSortedByAge(users).forEach(System.out::println);

        System.out.println("All users have age > 7: " + UserUtils.areAllUsersAboveAge(users, 7));
        System.out.println("Average age of users: " + UserUtils.calculateAverageAge(users));
        System.out.println("Number of unique countries: " + UserUtils.countUniqueCountries(users));
    }

}
