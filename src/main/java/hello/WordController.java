package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ServiceImpl.FunctionProvider;
import service.Functions;

@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
	
	Functions driver = new FunctionProvider();
	
	@RequestMapping(path = "/words/{word}")
	public ModelData checkWord(@PathVariable("word") String word) {
		ModelData res = new ModelData();
		res.setWord(word);
		res.setAnagramOfPalindrome(driver.isAnagram(word));
		res.setPalindrome(driver.isPalindrom(word));
		return res;
		
	}
}
