package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;
// belajar Covariant
public class CovariantApp {
  public static void main(String[] args) {

    MyData<String> stringMyData = new MyData<>("Aidil");
    process(stringMyData);
    // bisa bikin seperti ini
    MyData<? extends Object> myData = stringMyData;
  }
    // atau bisa bikin seperti ini
  public static void process(MyData<? extends Object> myData){
    System.out.println(myData.getData());

    // myData.setData(1); tidak boleh, karena berbahaya
  }
}
