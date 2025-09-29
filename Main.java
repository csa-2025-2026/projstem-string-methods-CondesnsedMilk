import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("Give me a word!");
      String word = scan.next();

      System.out.println("Give me another word!");
      String word2 = scan.next();

      System.out.printf("Now give me a number!%n");
      int num = scan.nextInt();

      System.out.printf("Output:%n" + lastFirstN(word, word2, num) + "%n%n");

      System.out.println("This time, give me a word to put in all uppercase!");
      word = scan.next();

      System.out.printf("Now give me another word to make the first letter uppercase!%n");
      word2 = scan.next();

      StringManip result = new StringManip(word, word2);
      System.out.printf("%nOutput:%n%s%n%s%n",result.getStr1(), result.getStr2());
  }

  public static String lastFirstN(String s1, String s2, int n)
  {
      String finalAnswer;

      finalAnswer = s1.substring((s1.length() - n), s1.length());
      finalAnswer += s2.substring(0, n);

      return finalAnswer;
  }
}
