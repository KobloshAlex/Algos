package leetcode.strings;

public class VacumRoute {
    /*This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes,
    return whether or not it will return to its original position.
    The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return tr*/
  public static void main(String[] args) {
    //

    System.out.println(vacumRouter("RUULLDRD"));
  }
  public static final boolean vacumRouter(String s) {
      int upDown = 0;
      int leftRight = 0;


    for (int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'L') {
          leftRight++;
      } else if (s.charAt(i) =='R') {
          leftRight --;
      }

      if(s.charAt(i) == 'U') {
          upDown ++;
      } else if(s.charAt(i) == 'D') {
          upDown --;
      }
    }

    return leftRight == upDown;
  }
}
