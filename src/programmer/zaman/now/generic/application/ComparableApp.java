package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Person;

import java.util.Arrays;
// belajar Comparable Interface

public class ComparableApp {
  public static void main(String[] args) {

    Person[] people = {
        new Person("Aidil", "Indonesia"),
        new Person("Budi", "Indonesia"),
        new Person("Joko", "Indonesia")
    };

    Arrays.sort(people);

    System.out.println(Arrays.toString(people));

  }
}
