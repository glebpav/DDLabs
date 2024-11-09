package ru.mephi.lab2;

import java.util.Comparator;
import java.util.List;

public class UserUtils {

    public static List<User> getUsersSortedByLastName(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getLastName))
                .toList();
    }

    public static List<User> getUsersSortedByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
    }

    public static boolean areAllUsersAboveAge(List<User> users, int age) {
        return users.stream()
                .allMatch(user -> user.getAge() > age);
    }

    public static double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
    }

    public static long countUniqueCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
    }

}
