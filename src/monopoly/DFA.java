/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.Random;



/**
 *
 * @author Ashar Ashfaq
 */
public class DFA {
    
    boolean flag = false;
//    int is;
//    int[][] arr;
//    int noOfnodes;
//    int random;
//    
//    public DFA(int is, int[][] arr, int noOfnodes,int random) {
//        this.is = is;
//        this.arr = arr;
//        this.noOfnodes = noOfnodes;
//        this.random = random;
//    }
//    int cs = is;
//    public void validation(int random)
//    {
//        cs = arr[cs][random];
//    }
    
    
    KnowledgeBase KB = new KnowledgeBase();
    ArrayList<location>[] arr = new ArrayList[8];
    information[] players;
    ArrayList<information> playerr;
    int[] turn;
    
    final int same = 7;
    final int block = 1;
    final int chance = 5;
    final int place = 4;
    final int rent = 2;
    final int jail = 3;
    final int nulll = 6;
    
    int[][] tt;
    
    public DFA(int n){
        playerr = new ArrayList<>();
        
        players = new information[n]; 
   //     turn = new int[players.length];
        tt = new int[7][8];
        
        tt[0][0] = 1;
        tt[1][1] = 2;
        tt[1][7] = 1;
        tt[2][2] = 3;
        tt[2][6] = 3;
        tt[2][4] = 3;
        tt[2][5] = 3;
        tt[3][6] = 1;
        tt[4][6] = 1;
        tt[5][6] = 1;
        tt[6][6] = 1;
         
         
         
         
        
        arr[0] = new ArrayList();
        arr[0].add(new location(0,1));
        
        arr[1] = new ArrayList();
        arr[1].add(new location(1,2));
        arr[1].add(new location(1,7));
        
        arr[2] = new ArrayList();
        arr[2].add(new location(2,3));
        arr[2].add(new location(3,6));
        arr[2].add(new location(4,4));
        arr[2].add(new location(5,5));
        
        arr[3] = new ArrayList();
        arr[3].add(new location(6,1));
        
        arr[4] = new ArrayList();
        arr[4].add(new location(6,1));
        
        arr[5] = new ArrayList();
        arr[5].add(new location(6,1));
        
        arr[6] = new ArrayList();
        arr[6].add(new location(6,1));
        
        arr[6] = new ArrayList();
        arr[6].add(new location(6,1));
        
        arr[7] = new ArrayList();
        arr[7].add(new location(7,7));
        arr[7].add(new location(6,1));
        
        
        
        
        
    }
    
    void Operation()
    {
        
        int i = 0;
        turns();    
        bought();
        KB.info();
        int dice;
        while(true){
//            count = players.length;
       //     recursive(players,i);
     //       if(count == 1)
//            {
//                System.out.println((players[i].playerID+1)+ " Player has WON the GAME");
//                break;
//            }
            
            if(i == playerr.size())
            {
                i = 0;
            }
            DeletePlayer(i);
            if(playerr.size() == 1)
            {
                System.out.println(( playerr.get(0).playerID+1)+" Player Has WON the GAME");
                break;
            }
            
            
            System.out.println("*****************************************************");
            System.out.println((playerr.get(i).playerID+1) + " Player turns");
            dice = random();

            validation(playerr.get(i),dice);
            i++;
        }
    }
    
    int count;
    
//    void function(int j)
//    {
//        while(j == players.length)
//        {
//            players[j] = players[j+1];
//            j++;
//        }
//       
//    }
    
    public void DeletePlayer(int i)
    {
       
        
            if(playerr.get(i).credit <= 0)
            {
                System.out.println("funtionnnnn INVOKED");
                System.out.println((playerr.get(i).playerID+1)+" HAS LOST!!!");
                System.out.println("BETTER LUCK NEXT TIME");
                for (int j = 0; j < playerr.get(i).no_of_boughtplaces; j++) {
                    for (int k = 0; k < KB.infonames.size(); k++) {
                        if(playerr.get(i).boughtplaces.get(j) == KB.infonames.get(k).name)
                        {
                            pur[KB.infonames.get(k).place].ifbought = false;
                            break;
                        }
                        
                    }
                    
                    
                }
                playerr.remove(i);
            }
    
        
        
        
        
//    //    for (int j = 0; j < players.length; j++) {
//            if(players[i].credit <= 0)
//            {
//                System.out.println((players[i].playerID+1)+" is "+players[i].credit);
//                System.out.println("so he's OUT!");
//                function(i);
//                
//            }
//            
//            
//        
//        
//        
//        if(i == players.length)
//        {
//            i = 0;
//        }
//        if(players[i].credit <= 0)
//            {
//                System.out.println((players[i].playerID+1)+" is "+players[i].credit);
//                i++;
//                count--;
//                
//                recursive(players,i);
//            }
//        
     
    }
    
    
    purchased[] pur = new purchased[24];
    void bought()
    {
        
        for (int i = 0; i < 24; i++) {
            pur[i] = new purchased();
            pur[i].location = i;
            pur[i].ifbought = false;
        }
    }
    
    int Action(int pos, information player)
    {
            
            
            if(pos == 5 || pos == 14)
            {
                return chance;
            }
            else
                if(pos == 9 || pos == 21)
                {
                    return chance;
                }
                else
                    if(pos == 0 || pos == 6 || pos == 12 || pos == 18)
                    {
                    switch(pos)
                    {
                        case 0: 
                        {
                            System.out.println("you are on GO, please collect 150 from the bank");
                            player.credit = player.credit + 200;
                            break;
                        }
                        case 6:
                        {
                            System.out.println("WAIT here for a while....");
                            break;
                    
                        }
                        case 12: 
                        {
                            System.out.println("you are on FREE PARKING. you can rest now untill your next turn....");
                            break;
                        }
                        case 18:
                        {
                            System.out.println("you are in JAIL !!!");
                            return jail;
                            
                        }
                        default:
                            System.out.println("pay 50");
                            player.credit = player.credit - 50;
                        {
                            break;
                        }
                    }
                    }
                    else
                    if(pur[pos].ifbought == false)
                    {
                     //   player.boughtplaces.add(pos);
                        player.no_of_boughtplaces++;
                        
                        for (int i = 0; i < KB.info.size(); i++) {
                            if(pos == KB.info.get(i).place)
                            {
                                player.credit = player.credit - KB.info.get(i).price;
                                KB.info.get(i).boughtby = player.playerID;
                                break;
                            }
                        }
                       // player.credit = player.credit - KB.info.get(pos).price;
                        
                       System.out.println("you have bought " + KB.infonames.get(pos).name);
                       System.out.println("=========================================================");
                        System.out.println("Amount Player "+(player.playerID+1)+" HAS is "+player.credit);
                        System.out.println("=========================================================");
                        player.boughtplaces.add(KB.infonames.get(pos).name);
                        pur[pos].ifbought = true;
                 //       flag1 = true;
                        
                        return place;
                    }
                    else{
                        for (int i = 0; i < KB.info.size(); i++) {
                            if(pos == KB.info.get(i).place){
                                System.out.println("this place is already been bought by "
                                    + "player : " + KB.info.get(i).boughtby);
                                System.out.println("Pay rent of "+KB.infonames.get(pos).name+
                                      " which is of " + KB.info.get(i).rent);
                                player.credit = player.credit - KB.info.get(i).rent;
//                                players[KB.info.get(i).boughtby].credit = 
//                                      players[KB.info.get(i).boughtby].credit + KB.info.get(i).rent;
                                
                                 playerr.get(KB.info.get(i).boughtby).credit =  
                                      playerr.get(KB.info.get(i).boughtby).credit + KB.info.get(i).rent;
                                
                                 break;
                            }
                            
                        }
                        
                        
                         
                   //     flag1 = true;
                        
                        
                        return rent;
                    
                    }
            
             
            return -1;
    }
    
    int transition(int cs,int on)
    {
        if(cs == 1){
        
            if(flag == true)
            {
                cs = tt[cs][same];
         //       flag = false;
               
            }
            else
            {
               cs = tt[cs][block]; 
               
            }
            return cs;
        }
        else{
            if(cs == 2)
            {
                cs = tt[cs][on];
                
            }
            else
            {
                cs = tt[cs][on];
                
            }
            return cs;
        }
    }
    
    
    boolean flag1= false;
    void validation(information player, int dice)
    {
        
      //  int k = 0;
    //    player.playerID = turn[k];
        
        int on = 0;
        int cs = 1;
        
            for (int i = 0; i < 3; i++) {
            
                cs = transition(cs,on);
                if(cs >=3 && cs <= 6)
                {
                    on = nulll;
                    cs = transition(cs,on);
                }
                if(cs == 1)
                {
                    if(flag == true)
                    {
                        flag = false;
                    }
                    else{
                        break;
                    }
                }
                player.currentposition = forward(player.currentposition,dice);
                System.out.println("New position of player "+(player.playerID+1)
                     +" is on "+KB.infonames.get(player.currentposition).name);
                 on = Action(player.currentposition, player);
                 if(on == -1)
                 {
                     break;
                 }
            }
        
        
    }
    
    int forward(int block, int dice)
    {
        int temp = block;
        temp = temp + dice;
        if(temp == 18)
        {
            temp = 6;
        }
        else
        {
            if(temp > 23)
            {
                temp = temp - 23;
                temp--;
            }
        }
        return temp;
    
    }
    
    void turns()
    {
       
        for (int i = 0; i < players.length; i++) {
            System.out.println((i+1)+" has "+(i+1)+" TURN ");
            players[i] = new information();
            playerr.add(players[i]);
            playerr.get(i).playerID = i;
        }
        
        
        
    }
    
    
    public int random()
    {
        int sum = 0;
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        System.out.println("========================================================");
        System.out.println("Rolling 1st Dice...." );
        System.out.println(n);
        sum = n;
        n = rand.nextInt(6) + 1;
        System.out.println("Rolling 1st Dice...." );
        System.out.println(n);
        if(sum == n)
        {
            System.out.println("you got same numbers on both dice");
            System.out.println("Roll AGAIN !!");
            flag = true;
        }
 //       System.out.println("==========================================================");
        sum = sum + n;
        return sum;
    }
    
    public int random1()
    {
        Random rand = new Random();
        int n = rand.nextInt(playerr.size() - 1) + 0;
        return n;
    }
    
    
    
}
