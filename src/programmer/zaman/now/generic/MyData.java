package programmer.zaman.now.generic;
// belajar generic class
public class MyData<T> {

  private T data;
  // bikin konstrator
  public MyData(T data) {
    this.data = data;
  }
  // bikin get data
  public T getData() {
    return data;
  }
  // bikin set data
  public void setData(T data) {
    this.data = data;
  }
}
