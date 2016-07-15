package codecheck.example;

import org.apache.commons.cli.CommandLine;
import java.util.Arrays;

public class App {
  public static void run(CommandLine cmd) {
    Arrays.asList(cmd.getArgs()).forEach(v -> System.out.println(v));
  }
  
  public static int getArgs (int param) {
  	if (param == 1) {
    	int value = 1;
      	return value;
    }
    else {
      int start = 1;
      int end = 1;
    	while (start <= param) {
          	start++;
        	String s = String.valueOf(end);
          	int i = 0;
        	while (i <= (s.length()-1)) {
            	String str1 = s.substring(i, i + 1);
               	String str2 = s.substring(i + 1, i + 2);
              		if (str1 === str2 ){
                    	if (i = 0)
                    		String pend;
                    		pend = (str1 + str2);
                    	}
              			else {
                        	pend += str2;
                        }
              		else {
                      String ans;
                      	if (i = 0) {
                        int n = str1.length();
                       
                        }
              			else {
                        int n = pend.length();
                        } 
                      String j = String.valueOf(n);
                      String k = str1;
                      ans = j + k;
                      result += ans;
                    }
              i++;
            }
        }
    }
    System.out.println(result);
  }
}
