package ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import service.Functions;

public class FunctionProvider implements Functions {

	@Override
	public boolean isPalindrom(String word) {
		boolean palindrom = true;
		
		int start = 0;
		int end = word.length()-1;
		while(start <= end) {
			if(word.charAt(start) == word.charAt(end)) {
				start++;
				end--;
			}else {
				palindrom = false;
				break;
			}
		}
		
		
		return palindrom;
	}

	@Override
	public boolean isAnagram(String word) {
		
		Map<Character,Integer> counts = new HashMap<>();
		
		for(Character ch : word.toCharArray()) {
			Integer freq = counts.get(ch);
			int newFreq = freq == null ? 1 : ++freq;
			counts.put(ch, newFreq);
		}
		
		ArrayList<Integer> values = new ArrayList<>(counts.values());
		int oddCounts =0;
		for(Integer num : values) {
			if(num%2 !=0) {
				oddCounts++;
			}
		}
		
		if(oddCounts > 1) {
			return false;
		}else {
		return true;
		}
	}

}
