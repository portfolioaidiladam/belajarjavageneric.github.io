package programmer.zaman.now.generic;
// belajar generic class (multiple parameter type)
public class Pair<T, U> {

  private T first;

  private U second;
  // bikin konstruktor
  public Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }
  // bikin getter
  public T getFirst() {
    return first;
  }
  // bikin setter
  public void setFirst(T first) {
    this.first = first;
  }

  public U getSecond() {
    return second;
  }

  public void setSecond(U second) {
    this.second = second;
  }
}
