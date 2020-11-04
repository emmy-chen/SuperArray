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

  private void resize() {
    String[] data2 = new String[data.length + 1];
    for (int i = 0; i < data.length; i++) {
      data2[i] = data[i];
    }
    data = data2;
  }

}
