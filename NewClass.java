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
public class NewClass {
     public static long getTotalPoint(long level ,long points,long bounus)
    {long totalPoint=0;
        if ((level >= 1)&&(level <=5))
            {
                totalPoint=points+(long)(Math.sqrt(level)*bounus);
                
            
    System.out.println("totalpoin =" +totalPoint);
            return totalPoint;
            }else{
                System.out.println("loi");
    return -1;}
    }
      public static void main(String[] args) {
        long level=0;
        long points=0;
   final long bounus =20;
        long totalPoints=0;
                totalPoints=getTotalPoint(level,points,bounus);
        // TODO code application logic her
       
        // TODO code application logic here 
    
}
    
}
