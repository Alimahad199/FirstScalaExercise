package Day4

//Create a method that accepts 4 parameters, two being a String and two being a character,
//your method will then join both strings together and then replace all occurrences of the
//character provided with the second character provided

  object Strings2 extends App {

// creating a method that takes in two strings and two characters and returns a string.
    def stringConnect( word : String, words : String, firstChar : Char, secondChar : Char) : String = {

// create a new variable and assign it the concatenated two strings( word and words)
      val coronaVirus = word.concat (words)
// Using the variable that was just created you can call a function that replaces the first character with the3 second character
      coronaVirus.replace(firstChar,secondChar)

    }
// characters are defined using 'a' and strings are defined as ""
    println( stringConnect ("Ha","llo",'a' , 'e'))


  }


