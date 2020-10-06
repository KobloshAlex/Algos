package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    final String s = sc.next();
    final int k = sc.nextInt();

    final ArrayList<String> arrayList = new ArrayList<String>();

    for (int i = 0; i <= s.length() - k; i++) {
      final String tmp = s.substring(i, k + i);
      arrayList.add(tmp);
    }

    System.out.println(arrayList);
    Collections.sort(arrayList);
    System.out.println(arrayList);
    System.out.println(arrayList.get(0));
    System.out.println(arrayList.get(arrayList.size() - 1));
  }
}
