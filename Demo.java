public class Demo{
  public static void removeDuplicates(SuperArray s) {
    for  (int i = 0; i < s.size(); i++) {
      for (int j = i + 1; j < s.size(); j++) {
        if (s[i] == s[j]) {
          s.remove(i);
        }
      }
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
      if (b.contains(a[i])) {
        dupes.add(a[i]);
      }
    }
    removeDuplicates(dupes);
    return (dupes.toString());
  }

}
