package nyc.c4q.jvvlives2005;
/**
 * Created by Joshelyn on 12/5/15.
 *
 * Problem #3:
 * The problem can be expressed as follows: Pick some positive integer and call it n. If n is even, divide it by two.
 * If n is odd, multiply it by three and add one. Continue this process until n is equal to one.
 Starting with the number 15:
 15 is odd, so I make 3n+1: 46
 46 is even, so I take half: 23
 23 is odd, so I make 3n+1: 70
 70 is even, so I take half: 35
 35 is odd, so I make 3n+1: 106
 106 is even, so I take half: 53
 53 is odd, so I make 3n+1: 160
 160 is even, so I take half: 80
 80 is even, so I take half: 40
 40 is even, so I take half: 20
 20 is even, so I take half: 10
 10 is even, so I take half: 5
 5 is odd, so I make 3n+1: 16
 16 is even, so I take half: 8
 8 is even, so I take half: 4
 4 is even, so I take half: 2
 2 is even, so I take half: 1

 As you can see from this example, the numbers go up and down, but eventually—at least for all numbers that have ever been
 tried—comes down to end in 1. Write a program that reads in a number from the user and then displays the sequence for that
 number of steps taken to reach 1.

 How many steps, for example, does your program take when n is 27?
 *
 */
public class Hailstone
{
}
