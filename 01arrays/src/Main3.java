import java.util.ArrayList;

public class Main3 {
  public static void main(String[] args) {

    ArrayList<String> arrayList = new ArrayList<String>();
    ArrayList<Integer> arrayListNumber = new ArrayList<Integer>();

    arrayList.add("A");
    arrayList.add("C");
    arrayList.add(1, "B");

    arrayListNumber.add(1);
    arrayListNumber.add(3);
    arrayListNumber.add(1, 2);

    boolean existe = arrayList.contains("C");

    int pos = arrayList.indexOf("C");

    if (existe) {
      System.out.println("Elemento existente, na posição " + pos);
    } else {
      System.out.println("Elemento inválido");
    }

    arrayList.remove(0);

    System.out.println(arrayList.size());

    System.out.println(arrayList);
    System.out.println(arrayListNumber);

  }
}