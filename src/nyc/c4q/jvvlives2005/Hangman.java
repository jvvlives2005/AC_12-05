package nyc.c4q.jvvlives2005;
/**
 * Created by Joshelyn on 12/5/15.
 *
 * Question #4: For this assignment, your mission is to write a program that plays the game of Hangman. As an assignment,
 * Hangman serves two purposes. First, the program is designed to give you some practice writing programs that manipulate
 * strings and files.

 When the user plays Hangman, the computer first selects a secret word at random from a list built into the program. The
 program then prints out a row of dashes—one for each letter in the secret word and asks the user to guess a letter. If the
 user guesses a letter that is in the word, the word is redisplayed with all instances of that letter shown in the correct
 positions, along with any letters correctly guessed on previous turns. If the letter does not appear in the word, the user
 is charged with an incorrect guess. The user keeps guessing letters until either (1) the user has correctly guessed all the
 letters in the word or (2) the user has made eight incorrect guesses.

 Two sample runs that illustrate the play of the game are shown here:


 Your program only needs to be able to play the Hangman game once through (i.e., the player guessing one word), but it should
 be pretty easy to extend your program to allow the player to play multiple rounds (i.e., guessing a word multiple times).

 Your program must be able to:
 • Choose a random word to use as the secret word. That word is chosen from a word list. First, use a word list hard coded
 with words you like, if you have time you can create this list based on a file like this:
 https://www.dropbox.com/s/33mvg94ewsbe7wv/word_list?dl=0
 • Keep track of the user’s partially guessed word, which begins as a series of dashes and then gets updated as correct
 letters are guessed.
 • Implement the basic control structure and manage the details (ask the user to guess a letter, keep track of the number of
 guesses remaining, print out the various messages, detect the end of the game, and so forth).

 The following points may help to clarify a few issues:
 • At the beginning of your run method, you need to create a new word List and store it in an instance variable.
 • You should accept the user’s guesses in either lower or upper case, even though all letters in the secret words may be
 written in lower_case or upper case.
 • If the user guesses something other than a single letter, your program should tell the user that the guess is illegal and
 accept a new guess.
 • If the user guesses a correct letter more than once, your program should simply do nothing.

 Guessing an incorrect letter a second time should be counted as another wrong guess. (In each case, these interpretations
 are the easiest way to handle the situation, and your program will probably do the right thing even if you don’t think about
 these cases in detail.)
 *
 */
public class Hangman
{
}
