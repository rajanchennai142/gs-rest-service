package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * Mylrajan Muthusamy 04/11/2018
 */
 

@RestController
public class WordController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/words/{word}")
	public PalindromeWord isPalindromeAnagram2(@PathVariable("word") String s) {
		return new PalindromeWord(s, isPalindrome(s), isAnagramOfPalindrome(s));
	}
	
	
	public boolean isPalindrome(String text) {
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    StringBuilder plain = new StringBuilder(clean);
	    StringBuilder reverse = plain.reverse();
	    return (reverse.toString()).equals(clean);
	}
	
	private static boolean isAnagramOfPalindrome(String word) {
		int oddOccur = 0;
		int[] count = new int[256];
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			count[ch]++;
		}
		
		for(int cnt : count)
		{
			if(oddOccur > 1)
			{
				return false;
			}
			if(cnt%2 == 1)
			{
				oddOccur++;
			}
		}
		return true;
	}
	
}
