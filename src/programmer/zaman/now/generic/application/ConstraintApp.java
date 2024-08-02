package programmer.zaman.now.generic.application;


//  belajar Bounded Type Parameter
public class ConstraintApp {
  public static void main(String[] args) {

    NumberData<Integer> integerNumberData = new NumberData<>(1);
    NumberData<Long> longNumberData = new NumberData<>(1L);

    // NumberData<String> stringNumberData = new NumberData<String>("Aidil"); // ERROR

  }


  public static class NumberData<T extends Number>{

    private T data;
    // bikin constructor
    public NumberData(T data) {
      this.data = data;
    }
    //  bikin getter
    public T getData() {
      return data;
    }
    // setter
    public void setData(T data) {
      this.data = data;
    }
  }
}
