# 630library

A library that will aide users perform better in card games (specifically Go-Stop) that use the Hwatu (Hanafuda Korean) card set.  

## Contributions:
Contributions are enthusiastically encouraged.  Please read CONTRIBUTIONS.MD (found here []()) for more information.  If you choose to contribute, please familiarize yourself with and adhere to our repository's code of conduct, found here [https://github.com/llee4/630library/blob/main/CODE_OF_CONDUCT.md](https://github.com/llee4/630library/blob/main/CODE_OF_CONDUCT.md).

## Current Features:
- Deck Class - defines and creates the card deck fo Hwatu specifically using a numbers system for each card.  
- Players Class -definies and creates "Player" objects for gameplay.
- Minimax Class - will aid later in efficient gameplay, can be used more broadly as a "best results" algorithm.
- Shuffle Class - a class that can take an arrayList and re-arrange it randomly.  

## Upcoming Features:
- Actual gameplay against a computer.
- Gameplay aid - see IDEAS.md for more information here:  [https://github.com/llee4/630library/blob/main/IDEAS.md](https://github.com/llee4/630library/blob/main/IDEAS.md)

## Installation:
The program's jar file with all java source packaged in it can be found in directory 630library/lib with the name lib.jar.  

Here's an easy way to use one of the features:

Download lib.jar and move it to your Desktop, then, make a new directory within your desktop and add file uselib.java to that directory.  Uselib.java creates an arraylist (which you can modify) - the purpose of this activity is just to demonstrate that you can install lib.jar and run classes from it. 

Go to the command line, cd into your directory, and run command:

`javac -cp .:../lib.jar uselib.java`

This should compile uselib.java using the written Shuffle class, which is in lib.jar.  

Enjoy!


