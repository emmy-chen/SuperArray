public class Demo{
  public static void removeDuplicates(SuperArray s) {
    try {
    for  (int i = 0; i < s.size(); i++) {
      for (int j = i + 1; j < s.size(); j++) {
        if (s.get(i) == s.get(j)) {
          s.remove(j);
        }
      }
    }
  }
  catch (IllegalArgumentException e){
    System.out.println ("IllegalArgumentException");
  }
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray dupes = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        dupes.add(a.get(i));
      }
    }
    removeDuplicates(dupes);
    return dupes;
  }

  public int lastIndexOf(String value){

    /*
    for (int i = -this.size; i >= 0; i--) {
      if (this.get(i).equals(value)) {
        return i;
      }
    }
    return -1;
    */
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

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray merge = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      merge.add(a.get(i));
      merge.add(b.get(i));
    }
    return merge;
  }

}
