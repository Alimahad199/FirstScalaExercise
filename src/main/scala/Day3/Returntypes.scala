package Day3

class Person(var name : String, var age : Int)

object returntypes extends App {

    def showReturnOnCall () : Unit = {
      def person = new Person ("Gucci",23)

      println("The individuals name is" +" " + person.name)
      println("The individuals age is" +" " + person.age)


    }


      showReturnOnCall()
  }




