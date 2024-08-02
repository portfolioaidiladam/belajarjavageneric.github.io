package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

// belajar Type Erasure
// Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime

public class TypeErasureApp {
  public static void main(String[] args) {

    MyData myData = new MyData("Aidil");

    MyData<Integer> integerMyData = (MyData<Integer>) myData;
    Integer integer = integerMyData.getData();

  }
}
