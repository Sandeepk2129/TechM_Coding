package hello;

public class ModelData {
	
	private String word;
	private boolean palindrome;
	private boolean anagramOfPalindrome;

	
	
	public ModelData(String word, boolean palindrom, boolean anagram) {
		super();
		this.word = word;
		this.palindrome = palindrom;
		this.anagramOfPalindrome = anagram;
	}
	
	
	public ModelData() {
		super();
	}


	public void setWord(String word) {
		this.word = word;
	}


	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}


	public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
		this.anagramOfPalindrome = anagramOfPalindrome;
	}


	public String getWord() {
		return word;
	}


	public boolean isPalindrome() {
		return palindrome;
	}


	public boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}


	

}
