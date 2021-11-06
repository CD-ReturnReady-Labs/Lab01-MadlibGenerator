# Lab 01: Madlib Generator

Mad Libs (a play on ad lib, from Latin ad libitum - as you wish) is a word game where one player prompts another for a list of words to substitute for blanks in a story; these word substitutions have a humorous effect when the resulting story is then read aloud.

In this lab you will create your own Madlib generator that will prompt a user for input, then insert their input into the story you create!

## Step 01 - Create the Program just using paper:

1. **The first step** to making your own Mad Libs is coming up with a (very) short story. Your inspiration can come from anywhere (for example, a holiday theme, a song you know, a wedding, a birthday, or even an everyday routine). Think of places or situations in which you might never see a smartphone or laptop (see the example below).
2. **Write a few sentences.** Don’t worry if they’re not funny at first; they will be when you play the game later on.
3. Choose between one and three words to take out of each sentence. Which words should you erase? Read your text once saying “blank” instead of some words. For example, “Steven closed the big, blue BLANK.” If funny ideas start to pop into your head, you’ll know that’s a good word to erase.
4. **Erase** the words you’ve chosen, and replace them with a blank line.
5. For each word you erase, write the part of speech or type of word under the blank line (i.e, noun, verb, adverb, adjective).
6. **Try this!** For one noun, instead of writing “NOUN,” write “TYPE OF SCREEN DEVICE” under the blank line. See the example below. Screen devices include things like laptops, smartphones, and tablets.
7. **Ask a classmate** to give you a word for each blank space in the story. Replace the old words with new words that they give you.
8. **Read aloud** the new version of your story or song.

## Step 02 - Convert into a program

Use IntelliJ to create a new MAVEN project in your home directories `dev` folder. 

Call the project `MadLibGenerator`

> File names should never have Spaces in them.


Create a new file in your project called `Main`

Replace all the code in your `Main` file with the following:

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("What football team do you like?");
        String home = scanner.nextLine();
        String greeting = String.format("Hello %s, nice to meet you. I love the %s", name, home);
        System.out.println(greeting);
    }
}
```

In Treehouse you used the `console.readLine()` to get input from the user, unfortunatly that is not available everywhere so we will be using an alternative:

```
scanner.nextLine();
```

To achive the same effect.

To output a formatted string we will use the `String` library to achieve the same thing as `console.printf()`

```java
String.format()
```

To output a message to the screen use: 

```java
System.out.println();
```