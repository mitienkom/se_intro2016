import java.util.Scanner; 
public class Main { 
public static boolean fun(String s) { 
for (int i = 0; i < s.length() / 2; ++i) { 
if (s.charAt(i) != s.charAt(s.length() - 1 - i)) { 
return false; 
} 
} 
return true; 
} 

public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
String s = sc.nextLine(); 
System.out.println(fun(s)); 
} 

}
