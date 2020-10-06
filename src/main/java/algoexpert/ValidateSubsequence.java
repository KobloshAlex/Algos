package algoexpert;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);

    ArrayList<Integer> sequence = new ArrayList<>();
    sequence.add(2);
    sequence.add(3);

    System.out.println(isValidSubsequence(arrayList, sequence));
  }

  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
    int seqIdx = 0;
    for (int value : array) {
      if (seqIdx == sequence.size()) {
        break;
      }
      if (sequence.get(seqIdx) == value) {
        seqIdx += 1;
      }
    }
    return seqIdx == sequence.size();
  }
}
