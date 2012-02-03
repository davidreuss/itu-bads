/**********************************************************************
 *  BADS 2012 assignment 1: GiantBook
 **********************************************************************/

Name1:
Email1:
Name2:
Email2:
Group name:

Operating system:
Compiler:
Text editor / IDE:

Optional: Total hours to complete assignment:


Please mark one of the following boxes with an X

[ ] Yes, to the best of our knowledge, our code works as it should.

[ ] No, our solution does not work. (We will not get credit for this.)
Here's what doesn't work:



/**********************************************************************
 * Simulation results 
 *
 * Fill out the following table with the results of your simulation.
 * I've entered my own results for the first line; you need to
 * replace those with your own values and fill out the rest of the
 * table. N is the input size. T is the number of times you have
 * performed every experiment. 
 * 
 * giant is the average number of rounds
 * needed until the giant component emerges.
 * nosingles and connect denote the events when the last individual
 * becomes connected, and when the entire network is connected.
 * (The standard deviation is given in parentheses after each
 * average).
 * You probably don't have time to run T=100 experiments for
 * N=10,000,000.
 * If your code isn't fast enough to produce a result, write "n/a" in
 * the corresponding entry.
 * *********************************************************************/


       N    T   giant (stddev)   nosingles (stddev)  connect (stddev)
 --------------------------------------------------------------------
     100: 100 7.18e+01 6.0e+00    2.18e+02  1.4e+01  2.66e+02 4.4e+01 
    1000:
   10000:
  100000:
 1000000:
10000000:

/**********************************************************************
 * Algorithm analysis
 **********************************************************************/


Assuming we never run out of memory or heap space, if we let our
algorithm for detecting the emergence of a giant component run for 24
hours, it could compute the answer for

	  N = ...

We've run the code using a quick-find implemention as well.
In 1 hour, the largest instance we could manage had

          N = ...



/**********************************************************************
* Some network science 
* 
* Here we pretend to do a bit of network science using our system.
* We're a few decades too late to get our results published.
* Still, it's a valid example that illustrates how algorithms and
* computers are used in the (other) sciences.
**********************************************************************/

The occurence of a giant component happens at a time 
    [ ] linear in the size of the network
    [ ] quadratic in the size of the network
    [ ] logarithmic in the size of the network
    [ ] something else, maybe ...

The whole network is connected at a time 
    [ ] linear in the size of the network
    [ ] quadratic in the size of the network
    [ ] logarithmic in the size of the network
    [ ] something else, maybe ...

The last isolated individual becomes connected 
    [ ] around the time that the giant component emerges
    [ ] around the time that the whole network becomes connected
    [ ] something else, maybe ...

Finally, was it important that I defined the giant component to be of
size N/2, or could I have used N/10? 9N/10? How did you find your
answer (thinking about it? making an experiment? reading an article?)

...


/**********************************************************************
 *  List whatever help (if any) that you received, including help
 *  from TAs or fellow students. (Such help is allowed, but we want
 *  you to acknowledge it.)
 **********************************************************************/


/**********************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it. In particular, tell us how this exercise 
 *  could be improved.                                             
 **********************************************************************/
