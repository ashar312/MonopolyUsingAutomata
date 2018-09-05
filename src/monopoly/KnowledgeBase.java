/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;

/**
 *
 * @author Ashar Ashfaq
 */
public class KnowledgeBase {
    
    ArrayList<placeinfo> info = new ArrayList<placeinfo>();
    ArrayList<placeinfo> infonames = new ArrayList<placeinfo>();
    
    public void homecities()
    {
        int home = 12;
        int cities = 160;
    }
    
    
    public void info()
    {
        info.add(new placeinfo(1,60,12));
        info.add(new placeinfo(2,200,50));
        info.add(new placeinfo(3,80,16));
        info.add(new placeinfo(4,120,18));
        info.add(new placeinfo(7,140,20));
        info.add(new placeinfo(8,160,24));
        info.add(new placeinfo(10,190,26));
        info.add(new placeinfo(11,210,28));
        info.add(new placeinfo(13,220,30));
        info.add(new placeinfo(15,240,32));
        info.add(new placeinfo(16,260,34));
        info.add(new placeinfo(17,200,50));
        info.add(new placeinfo(17,280,36));
        info.add(new placeinfo(20,300,38));
        info.add(new placeinfo(22,320,44));
        info.add(new placeinfo(23,340,50));
        
        
        infonames.add(new placeinfo(0,"GO"));
        infonames.add(new placeinfo(1,"a1"));
        infonames.add(new placeinfo(2,"Train-1"));
        infonames.add(new placeinfo(3,"a2"));
        infonames.add(new placeinfo(4,"a3"));
        infonames.add(new placeinfo(5,"Chance"));
        infonames.add(new placeinfo(6,"Jail/wait"));
        infonames.add(new placeinfo(7,"b1"));
        infonames.add(new placeinfo(8,"b2"));
        infonames.add(new placeinfo(9,"Hash"));
        infonames.add(new placeinfo(10,"c1"));
        infonames.add(new placeinfo(11,"c2"));
        infonames.add(new placeinfo(12,"Free Parking"));
        infonames.add(new placeinfo(13,"d1"));
        infonames.add(new placeinfo(14,"Chance"));
        infonames.add(new placeinfo(15,"d2"));
        infonames.add(new placeinfo(16,"d3"));
        infonames.add(new placeinfo(17,"Train-2"));
        infonames.add(new placeinfo(18,"Go To Jail"));
        infonames.add(new placeinfo(19,"e1"));
        infonames.add(new placeinfo(20,"e2"));
        infonames.add(new placeinfo(21,"Hash"));
        infonames.add(new placeinfo(22,"f1"));
        infonames.add(new placeinfo(23,"f2"));
        
        
        
    }
    
}
