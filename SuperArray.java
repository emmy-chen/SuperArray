public class SuperArray {
  public static void main(String[] args) {
  }
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 10;
  }

  public int size() {
    int count = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        count++;
      }
    }
    return count;
  }

  public boolean add(String element) {
    if (this.size() == data.length) {
      this.resize();
    }
    for (int i = 0; i < data.length; i++) {
      if (data[i] == (null)) {
        data[i] = element;
        return true;
      }
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

  private void resize() {
    String[] data2 = new String[data.length * 2];
    for (int i = 0; i < data.length; i++) {
      data2[i] = data[i];
    }
    data = data2;
  }

  public boolean isEmpty() {
    return (this.size() == 0);
  }

  public void clear() {
    for(int i = 0; i < data.length; i++){
      data[i] = null;
    }
  }

  public String toString() {
    String str = "";
    str  += ("[" + data[0]);
    for (int i = 1; i < (this.size() - 1); i++) {
      str  += (", " + data[i]);
    }
    str  += ("]");
    return str;
  }

  public boolean contains(String s) {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == s) {
        return true;
      }
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    size = initialCapacity;
  }

  public void add(int index, String element) {
    if (this.size() == data.length) {
      this.resize();
    }
    String[] data2 = new String[data.length];
    for (int i = 0; i < index; i++) {
      data2[i] = data[i];
    }
    data2[index] = element;
    for (int i = (index + 1); i < this.size; i++){
      data2[i + 1] = data[i];
    }
    data = data2;
  }
}
