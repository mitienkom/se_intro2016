import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int field [][] = new int [3][3];
		int player = 2, it = 0;
		do{
	    	player = ((player + 1) % 2 == 1 ? 1 : 2);
	    	makeMove(field, player);
	    	PrintField(field, player);
	    	it++;
		}
		while(isEnd(field, player) != true && it < 9);
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
        	System.out.println("win " + player);
        	System.exit(0);
        }
        return false;
   }
   private static void PrintField(int[][] field, int player){
   	System.out.println("Player" + player + ":");
	    	for (int i = 0; i < 3; ++i){
        		for (int j = 0; j < 3; ++j){
        			System.out.print(field[i][j] + " ");
        		}
        		System.out.println();
        	}
   }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	int w1 = 0, w2 =0, dr = 0;
    	for (int i = 0; i < 1000; i++){
        int field [][] = new int [3][3];
		int player = 2, it = 0;
		do{
	    	player = ((player + 1) % 2 == 1 ? 1 : 2);
	    	makeMove(field, player);
	    	PrintField(field, player);
	    	it++;
		}
		while(isEnd(field, player) != true && it < 9);
		dr++;
    	}
    	System.out.println(w1 + w2 + dr);
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
        	if( player == 1){
        		w1++;
        	}
        	else w2++;
        	System.exit(0);
        }
        return false;
   }
   
}
