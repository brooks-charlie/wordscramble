/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author Sara
 */
public class Timer { 
   private long startTime=0;
   private long stopTime=0;
   private boolean running=false;
   
   public long start(){
        this.startTime=System.currentTimeMillis();
        this.running=true;
     //   System.out.println("Start Time is " + startTime);
        return startTime;
    
           }
   public void loopy(int maxAttempts, int userGuess){
   for(;userGuess<=maxAttempts; ) {  
        if(userGuess<maxAttempts) {
            this.running=true;
        }
        else if (userGuess==maxAttempts){
        this.stop();
        }
        break;
}
   }
   
   public void stop(){
   this.stopTime=System.currentTimeMillis();
   this.running=false;
   }
    //elaspsed time in milliseconds
    public long getElapsedTime() {
        long elapsed;
        if (running) {
             elapsed = (System.currentTimeMillis() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    
    //converting to seconds
    public float getElapsedTimeSecs(long startTime) {
        float elapsed;
      //  System.out.println("is the game running? " + running);
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }
        else {
            elapsed = ((stopTime - startTime)/1000);// / 1000);
            //elapsed = (elapsed /1000);
        }
      //  System.out.println("start time is: " + startTime);
       // System.out.println("stop time is " + stopTime);
        
        return elapsed;
    }
   

}   