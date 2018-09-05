/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Ashar Ashfaq
 */
public class placeinfo {
    int place;
    int price;
    int rent;
    String name;
    
    boolean ifbought;
    int boughtby;
    

    public placeinfo(int place, String name) {
        this.place = place;
        this.name = name;
    }
    public placeinfo(int place, boolean ifbought)
    {
        this.place = place;
        this.ifbought = ifbought;
    }
    public placeinfo(int place, int price,int rent) {
        this.place = place;
        this.price = price;
        this.rent = rent;
    }
    
    
}
