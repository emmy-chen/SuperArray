public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public int size() {
    return (this.size);
  }

  public boolean add(String element) {
    if (this.size() == data.length) {
      return false;
    }
    else {
      this.add(element);
    }
    return true;
  }

  public String get(int index) {
    return (data[index]);
  }

  public String set(int Index, String element) {
    String old = data[Index];
    data[Index] = element;
    return old;
  }

}
