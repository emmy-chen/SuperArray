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
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index" + index + "is out of bounds");
    }
    return (data[index]);
  }

  public String set(int Index, String element) {
    if (Index < 0 || Index >= size()) {
      throw new IndexOutOfBoundsException("index" + Index + "is out of bounds");
    }
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
    if (this.size() == 0) {
      return "[]";
    }
    String str = "";
    str  += ("[" + data[0]);
    for (int i = 1; i < this.size(); i++) {
      str  += (", " + data[i]);
    }
    str  += ("]");
    return str;
  }

  public boolean contains(String s) {
    if (this.size() == 0) {
      return false;
    }
    for (int i = 0; i < this.size(); i++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("initial capacity" + initialCapacity + "cannot be negative");
    }
    data = new String[initialCapacity];
    size = initialCapacity;
  }

  public void add(int index, String element) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index" + index + "is out of bounds");
    }
    if (this.size() == data.length) {
      this.resize();
    }
    String[] before = new String[data.length + 1];
    for (int i = 0; i < index; i++) {
      before[i] = data[i];
    }
    before[index] = element;
    for (int i = index; i < data.length; i++) {
      before[i+1] = data[i];
    }
    data = before;
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index" + index + "is out of bounds");
    }
    String val = data[index];
    if (index < 0 || index >= data.length) {
      return val;
    }
    String[] data2 = new String[data.length - 1];
    for (int i = 0, k = 0; i < data.length; i++) {
      if (i != index) {
        data2[k++] = data[i];
      }
    }
    /*
    for (int i = 0; i < index; i++) {
      data2[i] = data[i];
    }
    for (int i = index; i < data.length; i++) {
      data2[i] = data[i + 1];
    }
    */
    data = data2;
    return val;
  }

  public int indexOf(String s) {
    for (int i = 0; i < this.size(); i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] str = new String[this.size()];
    for (int i = 0; i < this.size(); i++) {
      str[i] = data[i];
    }
    /*
    int s = 0;
    for (int i = 0; i< this.size; i++) {
      if (data[i] != null) {
        s++;
      }
    }
    String[] copy = new String[s];
    for (int i = 0; i < s; i++) {
      if (data[i] != null) {
        copy [i] = data[i];
      }
    }
    return copy;
    */
    return str;
  }

  public int lastIndexOf(String value){
    for (int i = this.size(); i >= 0; i--) {
      if (this.get(i).equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    if (this.size() != other.size()) {
      return false;
    }
    for (int i = 0; i < other.size(); i++) {
      if (other.get(i) != this.get(i)) {
        return false;
      }
    }
    return true;
  }
}
