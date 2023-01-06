package fileHandling;

import java.util.StringTokenizer;

public class Stringtokenizer {
	public static void main(String[] args) {
		StringTokenizer stk = new
		StringTokenizer("sachin$ramesh$tendulkar","$");
		//System.out.println(stk);
		int tokenCount = stk.countTokens();
		System.out.println(tokenCount);
		while (stk.hasMoreTokens())
		{
		String data = stk.nextToken();
		System.out.println(data);
		}
		}
		
}
