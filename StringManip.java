public class StringManip
{
  private final String allCAPS;
  private final String oneCAP;

  public StringManip(String str1, String str2)
  {
    String allCAPS;
    String oneCAP = "";

    allCAPS = str1.toUpperCase();

    oneCAP = str2.substring(0,1).toUpperCase();
    oneCAP += str2.substring(1,str2.length()).toLowerCase();

    this.allCAPS = allCAPS;
    this.oneCAP = oneCAP;
  }

  public String getStr1() 
  {
    return allCAPS;
  }

  public String getStr2()
  {
    return oneCAP;
  }

}