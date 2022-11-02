import java.util.Scanner;

/**
 * TicTacToe
 */
public class TicTacToe {

    char array[][] = new char[3][3];
    private boolean Stopper = false;

    void Board() { // Board Using For Loop
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
                for (int k = 0; k < 1; k++) {
                    if (j != 2) {
                        System.out.print(" | ");
                    }
                }
            }
            System.out.print("\n");
            if (i != 2) {
                System.out.println("--------");
            }
        }
    }

    void Display() {// Board Using Print Statement Only.
        System.out.println(array[0][0] + " | " + array[0][1] + " | " + array[0][2]);
        System.out.println("---------");
        System.out.println(array[1][0] + " | " + array[1][1] + " | " + array[1][2]);
        System.out.println("---------");
        System.out.println(array[2][0] + " | " + array[2][1] + " | " + array[2][2]);
    }

    void Winner(){

        String One = "Congratulations! \n Player One Wins The Game.";
        String Two = "Congratulations! \n Player Two Wins The Game.";

        // Cheking Row Wise.
        if(array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
        else if(array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
        else if(array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
        // Cheking Column Wise.
        else if(array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[0][0] == 'O' && array[1][0] == 'O' && array[2][0] == 'O'){
            System.out.println(Two);
            Stopper = true;            
        }
        else if(array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[0][1] == 'O' && array[1][1] == 'O' && array[2][1] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
        else if(array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[0][2] == 'O' && array[1][2] == 'O' && array[2][2] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
        else if(array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
        else if(array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
        else if(array[2][0] == 'X' && array[1][1] == 'X' && array[0][2] == 'X'){
            System.out.println(One);
            Stopper = true;
        }
        else if(array[2][0] == 'O' && array[1][1] == 'O' && array[0][2] == 'O'){
            System.out.println(Two);
            Stopper = true;
        }
    }

    public static void main(String[] args) {
        int counter = 0;
        boolean b = true;
        System.out.println("This is Tic Tac Toe Game.");
        System.out.println("You need to enter O or X with the place where you want to place it.");
        System.out.println("Like I want to Add X at first row third column then type 1 (enter) 3.");
        System.out.println("**********************************************");
        TicTacToe t = new TicTacToe();
        t.Board();
        //t.Display();
        int row, column;
        Scanner s = new Scanner(System.in);
        while (true) {
            // Player One's Turn.
            if (b == true) {
                System.out.println("Player One's Turn: ");
                System.out.println("Enter row: ");
                row = s.nextInt();
                System.out.println("Enter Column: ");
                column = s.nextInt();

                if(row>3 && column >3){
                    System.out.println("Enter correct row or column");
                }else{
                    if(t.array[row-1][column-1] != 'X' && t.array[row-1][column-1] != 'O'){
                        t.array[row-1][column-1] = 'X';
                        t.Board();
                        //t.Display();
                        counter++;
                        b = false;
                    }else{
                        System.out.println("Error! \n Try Again.");
                        b = true;
                    }
                }
            }
            // Cheking Winner after every Round.
            t.Winner();
            if(t.Stopper == true || counter ==9){
                System.out.println("Thanks For Playing .........");
                break;
            }
            // Player Two's Turn.
            if(b == false){
                System.out.println("Player Two's Turn: ");
                System.out.println("Enter row: ");
                row = s.nextInt();
                System.out.println("Enter Column: ");
                column = s.nextInt();

                if(row>3 && column>3){
                    System.out.println("Enter correct row or column");
                }else{
                    if(t.array[row-1][column-1] != 'O' && t.array[row-1][column-1] != 'X'){
                        t.array[row-1][column-1] = 'O';
                        t.Board();
                        //t.Display();
                        counter++;
                        b = true;
                    }else{
                        System.out.println("Error! \n Try Again.");
                        b = false;
                    }
                }
            }
            // Cheking Winner After every Round.
            t.Winner();
            if(t.Stopper == true || counter == 9){
                System.out.println("Thanks For Playing .........");
                break;
            }           
        }
        if(t.Stopper == false){
            System.out.println("Opps \nNo one Wins The Game. \nBetter Luck Next Time :)");
        }
        s.close();
    }
}