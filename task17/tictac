import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int field [][] = new int [3][3];
		int player = 1, it = 0;
		while (isEnd(field, (player - 1) % 2 == 1 ? 2 : 1) != true && it < 9){
	    	makeMove(field, player);
	    	player = ((player + 1) % 2 == 1 ? 1 : 2);
	    	it++;
		}
		System.out.println("Draw");
   	}
    private static void makeMove(int[][] field, int player) {
        Random random = new Random();
        int x = random.nextInt(9);
        while (field [x / 3][x % 3] != 0) {
                random = new Random();
                x = random.nextInt(9);
        }
        field[x / 3][x % 3] = player;
    }
    private static boolean isEnd(int[][] field, int player){
   	   boolean f = false;
       for (int i=0; i<3; ++i){
          if (field[0][i] == field[1][i] && field[0][i] == field[2][i] && field[0][i] == player){
          	f = true;
          }
          if (field[i][0] == field[i][1] && field[i][0] == field[i][2] && field[i][0] == player){
          	f = true;
          }
       }
        if (field[0][0] == field[1][1] && field[0][0] == field[2][2] && field[0][0] == player){
          	f = true;
        }
        if (field[0][2] == field[1][1] && field[0][2] == field[2][0] && field[0][2] == player){
          	f = true;
        }
        if (f == true){
        	System.out.print("win ");
        	System.out.println(player);
        	System.exit(0);
        }
        return f;
   }
}
