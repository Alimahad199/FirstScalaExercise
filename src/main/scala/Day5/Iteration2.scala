package Day5

object Iteration2 extends App{
  def squareIteration (paramOne : String, paramTwo : Int ) : Unit = {

    for ( i <- 1 to paramTwo){
      var mult = paramOne * paramTwo

      println(mult)
    }

  }
  squareIteration("G", 4)

}
