//Game File

public class Game {
	//game NEEDS an Answer
	private String mAnswer;

	//Constructor: To create a game that takes an answer thats a Stiing
	public Game(String answer){
		mAnswer = answer;
		mHits = "";
		mMisses= "";
	}
	//Allow user to apply a guess
	public boolean applyGuess(char letter){
		//if index exsist then letter is present
		boolean isHit = mAnswer.indexOf(letter)>=0;

		//increase if true
		if(isHit){
			mHits+= letter;
		}
		else{
			//decrease if False
		mMisses += letter;
		}
		//show value of Hits/Miss
		return isHit;
	}
}