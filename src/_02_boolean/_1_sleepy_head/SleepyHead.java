package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        //boolean only has two values TRUE or FALSE
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        
        int weekday =
        JOptionPane.showConfirmDialog(null, "Is it a weekday ?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int vacation = 
        		JOptionPane.showConfirmDialog(null, "Are you on vacation ?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        
        if( weekday == 0 ) { 
        	isWeekday = true; 
        } else { isWeekday = false;
        	
        }
        isVacation = vacation == 0 ? true: false;
        
        //&& - combines T/F statements T/T = T, T/F = F, F/F = F 
//        if(isVacation && isWeekday) { ____ }
        //|| - combines T/F statements via OR
//        if(isVacation || isWeekday) { ____ }
        //! - does the reverse of True or False. So false becomes true and true becomes false
        // !isWeekday - does the inverse
        
//            Mon Tue Wed Thur Fri     Sat Sun
//isWeekday    T   T   T   T    T       F   F
//!isWeekday   F    F  F   F    F       T   T

        
        if (!isWeekday || isVacation) {	
        	//GOAL : print out this code block when it is a weekend
        	System.out.println ("Sleep in!" ); 
        }
        else if  ( isWeekday || !isVacation ) {
       	System.out.println ("Get up lazybones!"); }
        

        /*
         * Print "sleep in"? if it is a vacation or a weekend. 
         * If it's a weekday, print "get up lazybones!"? 
         * If it's a weekday, but we are on vacation,  print "sleep in"?.
         */
    }
}
