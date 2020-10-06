package leetcode.strings;

import java.util.Stack;

public class ValidParantasis {
  public static void main(String[] args) {

    System.out.println(isValid("{()}"));
  }

  private static boolean isValid(String string) {

    if (string.length() % 2 != 0) return false;
    Stack<Character> stack = new Stack<>();

    for (char c : string.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
        stack.pop();
      } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
        stack.pop();
      } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

  public boolean isValidRight(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') stack.push(c);
      else if (stack.empty()) return false;
      else if (c == ')' && !stack.empty() && !stack.pop().equals('(')) return false;
      else if (c == '}' && !stack.empty() && !stack.pop().equals('{')) return false;
      else if (c == ']' && !stack.empty() && !stack.pop().equals('[')) return false;
    }
    return stack.empty();
  }
}
