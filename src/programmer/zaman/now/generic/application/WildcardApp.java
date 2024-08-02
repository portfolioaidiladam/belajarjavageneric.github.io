package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;
// belajar wildcard
// Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
// Misal kita hanya ingin mem-print data T, tidak peduli tipe apapun
// Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ?
public class WildcardApp {
  public static void main(String[] args) {

    print(new MyData<Integer>(100));
    print(new MyData<String>("Aidil"));
    print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

  }
  // bikin wildcard
  public static void print(MyData<?> myData){
    System.out.println(myData.getData());
  }
}
