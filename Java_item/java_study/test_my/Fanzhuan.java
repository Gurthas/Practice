package java_study.test;

import java.util.Stack;

public class Fanzhuan {
public static void main(String[] args) {
	String str = "penglaoshi nb";
    String[] array = str.split("\\s");
     
    Stack<String> stack = new Stack<String>();
    for (String c : array)
        stack.push(c);

    int size = stack.size();
    while(size-->0){
        System.out.print(stack.pop()+" ");
	
}
}
}

