import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int count = 0;
    String inp = sc.next ();
    inp = inp.replaceAll ("[aeiouAEIOU]", "#");
    //OR
    //inp = inp.replaceAll ("(?i)[aeiou]", "#");
    for (int i = 0; i < inp.length (); i++)
      {
	char c = inp.charAt (i);
	if (c == '#')
	  {
	    count = count + 1;
	  }

      }
    if (count > 0)
      {
	System.out.println (inp);
      }
    else
      {
	System.out.println ("NO VOWELS " + inp);

      }

  }
}
