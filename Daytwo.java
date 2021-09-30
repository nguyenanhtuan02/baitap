/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytwo;

/**
 *
 * @author ASUS
 */
public class Daytwo {
    public static long getTotalPoint(long level ,long poitns,long bounus)
    {long totalPoint;
        if ((level >= 1)&&(level <=5))
            {
                totalPoint=points+(Math.sqrt(level)*bounus);
                
            
    System.out.println("totalpoin ="+totalPoint);
            return totalPoint;
            }else{
                System.out.println("loi");
    return -1;}
    }
        
    

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        long level=3;
        long points=100;
   final long bounus=100;
        long totalPoints;
                totalPoints=getTotalPoint(level,points,bounus);
       
        // TODO code application logic here
    }
    
}
