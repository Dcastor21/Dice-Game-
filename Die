import java.util.*;
import java.io.*;
import java.util.concurrent.*;


/**
the die class simulaites a six sided die
do a pause  then show the roll.
of money to play then.
menu of game 
show credits
*/


 public class Die
{
//variables
	public static int side;
	public static int value;

	/*
	param@ numSides for number of sides on die
	return@ side of die
	*/
	public Die(int numSides){
		side = numSides;
		
	}

	/*
	rolls die to get value
	*/
	public static void roll(){
		Random rand = new Random();
		value = rand.nextInt(side)+1;
	}
	
	/*
	param@
	return@ side of the die
	*/
	public static int getSide(){
		return side;
	}
	
	/**
	param@
	return@ value of die sides.
	*/
	public static int getValue(){
		return value;
	}
}
