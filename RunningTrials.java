/**
 * Running Trials
 * Author: Sharon Bogdan and Carolyn Yao
 * Does this compile or finish running within 5 seconds? Y/N
 */

public class RunningTrials {

  // Do not change the parameters!
  public int runTrialsRecur(int possibleSpeeds, int days) {
    int minTests = 0;
    // Your code here
    int range = possibleSpeeds; //declare variable to be passed down as new range
    int leftRange, rightRange; //the ranges to the right and left of mid poss. speed
    // int low, high; 
    int d = days;   
    if (range == 0) {
    	return minTests; //if no range of values returns 0 minTests
    }
    if ((range/2 == 0) && (range%2 == 1)) { // if range is 1
    	//if (original range > 1) { //determine how to check previous range???
    	//	minTests = minTests++; //if the new range is 1 but prev. range was greater, increase minTests
    	//}    //increase minTests because must test final speed to see if that is top speed or the previous is top
    	return minTests ;
    } 	
    minTests++; // if range is not 0 or 1, increase minTests because at least 1 test must be run
    //int lowerSpeeds[] = {};
    //int higherSpeeds[] = {};
    //for (int i = ((range/2) + 1) - (range/2); i <= (range/2); i++){
    //	lowerSpeeds[i] = i;
    //}
    //for (int i = ((range/2) + 1); i <= range; i++){
    //	higherSpeeds[i] = i;
    //}
    //low = lowerSpeeds[range/2];
    //high = higherSpeeds[(range/2) + 1];
    //if (lowerSpeeds[range/2] > 1 || higherSpeeds[(range/2) + 1] > 1){
        
    leftRange = range/2; //the range of values to the left of mid value
    rightRange = ((range/2) + (range%2)); //the range of speed values to the right of mid value
    range = Math.max(leftRange, rightRange); //return the larger range of values b/c testing for worst case scenario
    return 1 + runTrialsRecur(range, d); //add 1 to combat counter being reset and return new range
  }

  // Optional:
  // Pick whatever parameters you want to, just make sure to return an int.
  public int runTrialsMemoized() {
    int minTests = 0;
    // Your optional code here
    return minTests;
  }

  // Do not change the parameters!
  public int runTrialsBottomUp(int possibleSpeeds, int days) {
    int minTests = 0;
    // Your code here
    return minTests;
  }

  public static void main(String args[]){
      RunningTrials running = new RunningTrials();

      // Do not touch the below lines of code, your output will automatically be formatted
      int minTrials1Recur = running.runTrialsRecur(12, 5);
      int minTrials1Bottom = running.runTrialsBottomUp(12, 5);
      int minTrials2Recur = running.runTrialsRecur(8, 8);
      int minTrials2Bottom = running.runTrialsBottomUp(20, 8);
      System.out.println("12 speeds, 5 weeks: " + minTrials1Recur + " " + minTrials1Bottom);
      System.out.println("20 speeds, 8 weeks: " + minTrials2Recur + " " + minTrials2Bottom);
  }
}
