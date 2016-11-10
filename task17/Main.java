import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = true;
        for (int i = 0; i < s.length() / 2; ++i) {
        	if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        		b = false;
        		break;
        	}
        }
        if (b) System.out.println("True");
        else System.out.println("False");      
    }
}
