
package monopoly;

import java.util.Scanner;

/**
 *
 * @author Ashar Ashfaq
 */
public class Monopoly {

    /**
     * @param args the command line arguments
     */
    public static boolean flag = false;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        int bankmoney = 10000000;
//        
//     
//        int temp2 = 1;
//        boolean flag = true;
//        int[][] mono = new int[25][13];
//        int temp = 2;
//        int temp1 = temp;
//        for (int i = 0; i < 25; i++) {
//            
//            mono[i][0] = 0;
//            mono[i][1] = 24;
//            flag= true;
//            for (int j = 2; j < 13; j++) {
//                if(temp > 23 && flag)
//                {
//                    temp = 1;
//                    flag = false;
//                }
//                mono[i][j] = temp;
//                temp++;
//            }
//            temp = temp1 + temp2;
//            temp2++;
//            
//        }
//        
//        mono[23][0] = 0;
//        mono[23][1] = 24;
//        mono[23][2] = 2;
//        mono[23][3] = 3;
//        mono[23][4] = 4;
//        mono[23][5] = 5;
//        mono[23][6] = 6;
//        mono[23][7] = 7;
//        mono[23][8] = 8;
//        mono[23][9] = 9;
//        mono[23][10] = 10;
//        mono[23][11] = 11;
//        mono[23][12] = 12;
//        
//        mono[6][12] = 6;
//        mono[7][11] = 6;
//        mono[8][10] = 6;
//        mono[9][9] = 6;
//        mono[10][8] = 6;
//        mono[11][7] = 6;
//        mono[12][6] = 6;
//        mono[13][5] = 6;
//        mono[14][4] = 6;
//        mono[15][3] = 6;
//        mono[16][2] = 6;
//        
//        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("========================*******=================");
        System.out.println("\t\t MONOPOLY");
        System.out.println("========================*******=================");
        
        System.out.println("To play Press 1");
        System.out.println("To quit Press 2");
        
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
            {
                System.out.println("Number of player must be from 2 to 4");
                System.out.println("Enter number of players : ");
                int n = sc.nextInt();
                DFA monopoly = new DFA(n);
                monopoly.Operation();
                System.out.println("==================================================");
                System.out.println("Do you want to Play Again");
                System.out.println("1. YES");
                System.out.println("2.NO");
                int playagain = sc.nextInt();
                switch(playagain)
                {
                    case 1:
                    {
                        main(args);
                    }
                    case 2:
                    {
                        System.exit(0);
                    }
                }
            }
            case 2:
            {
                System.exit(0);
            }
        }
        
     }
}
