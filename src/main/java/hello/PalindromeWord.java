package hello;

public class PalindromeWord {
	
	String word;
	boolean palindrome;
	boolean anagramOfPalindrome;

	public PalindromeWord(String word, boolean palindrome, boolean anagramOfPalindrome) {
		super();
		this.word = word;
		this.palindrome = palindrome;
		this.anagramOfPalindrome = anagramOfPalindrome;
	}
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean getPalindrome() {
		return palindrome;
	}
	
	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}
	
	public boolean getAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}
	
	public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
		this.anagramOfPalindrome = anagramOfPalindrome;
	}
	
}
