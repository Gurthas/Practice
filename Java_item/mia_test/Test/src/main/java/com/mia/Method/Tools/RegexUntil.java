package com.mia.Method.Tools;

import java.util.ArrayList;

import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.MatchResult;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.PatternMatcherInput;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;

public class RegexUntil {
	/*
	 * 正则取值方法
	 * 
	 * @LB 左边界
	 * 
	 * @RB 右边界
	 * 
	 * @response 待处理数据
	 */
	public static ArrayList<String> regexList(String LB, String RB, String response) {

		ArrayList<String> List = new ArrayList<String>();
		Pattern pattern = null;
		String param = LB + "(.+?)" + RB;
		try {
			pattern = new Perl5Compiler().compile(param);
		} catch (MalformedPatternException e) {
			e.printStackTrace();
			return null;
		}

		MatchResult result = null;
		Perl5Matcher matcher = new Perl5Matcher();
		PatternMatcherInput matcherInput = new PatternMatcherInput(response);
		while (matcher.contains(matcherInput, pattern)) {
			result = matcher.getMatch();
			List.add(result.toString().replace(LB, "").replace(RB, "").replace("\"", "").replace(":", "").replace(",",
					""));

		}
		return List;

	}
}
