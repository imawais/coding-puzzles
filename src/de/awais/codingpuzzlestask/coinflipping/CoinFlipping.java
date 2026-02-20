package de.awais.codingpuzzlestask.coinflipping;


public class CoinFlipping {
    public static void main(String[] args) {
        int numberOfCoins = 1100; //total number of coins
        int numberOfHeads = 0; //variable to store number of heads 
        boolean[] coins = new boolean[numberOfCoins + 1]; // ignore index 0 because i use indices from 1-1100
        
//        first person set all coins to Heads heads = true
        for(int i = 1; i <= numberOfCoins; i++) { //loop over all coins and set to true
        	coins[i] = true;
        }
        numberOfHeads = 1; //As coin 1 is head and never touch again so we have to add/increment here in numberOfHeads 
//      Nested loops for iterating over all coins and all persons to flip the coin
//      Now every person from Person 2 onward flip the coin that is multiple of their number
        for(int person = 2; person <= numberOfCoins; person++) {
        	for(int coin = person; coin <= numberOfCoins; coin += person ) {
        		coins[coin] = !coins[coin]; //flip the coin if coin is head flip to tail and vice versa
        		//counting the number of heads here
        		if(coin == person) { //check person number == coin number 
	        		if(coins[coin]) {  //check whether coin is head or not
	        			numberOfHeads++; // if coin shows heads increment in the heads count variable 
	        		}
        		}
        	}
        }
        System.out.println("Number of Heads::"+ numberOfHeads);
    }
}