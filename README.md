# Java Chord / Mode Speller
An Object-Oriented Java Chord / Mode Speller

[PHP - Chord / Mode speller](https://github.com/burnedfaceless/Chord-Mode-Speller) - This was one of the first projects that I completed a few months after I started programming. I've had the repo hidden for some time, but I wanted to rewrite this project using Java and better practices.

Two glaring issues with this are that I used inheritance to extend a class without a proper parent-child relationship. And I also assigned a number to calculate the correct pitch. This is kind of stupid. It seems preferable to have methods for calculating major and minor thirds that simply state (if the pitch is an A, the minor third up is C). If you do that for all pitches, it's more readable than assigning a number to a pitch and then converting that number back to a pitch.
