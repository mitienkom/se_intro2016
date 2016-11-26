import java.util.Random;



public class Main {

    public static void main(String[] args) {
    	
    	int w1 = 0, w2 = 0, dr = 0;
    	
        for (int i = 0; i < 1000; i++){

            int field [][] = new int [3][3];

            int player = 2, it = 0;
            int event = 0;

            do{

                player = ((player + 1) % 2 == 1 ? 1 : 2);

                makeMove(field, player);
                
            	event = isEnd(field, player);

                it++;

            }while(event == 0 && it < 9);

            if (event == 1){
            	w1++;
            }
            else if (event == 2){
            		w2++;
            	}
            	else{
            		dr++;
            	}
            

        }

        System.out.println( w1  +" " + w2+ " " + dr);
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

    private static int isEnd(int[][] field, int player){

        int f = 0;

        for (int i=0; i<3; ++i){

            if (field[0][i] == field[1][i] && field[0][i] == field[2][i] && field[0][i] == player){

                f = player;

            }

            if (field[i][0] == field[i][1] && field[i][0] == field[i][2] && field[i][0] == player){

                f = player;

            }

        }

        if (field[0][0] == field[1][1] && field[0][0] == field[2][2] && field[0][0] == player){

            f = player;

        }

        if (field[0][2] == field[1][1] && field[0][2] == field[2][0] && field[0][2] == player){

            f = player;

        }
        return f;

    }



}
