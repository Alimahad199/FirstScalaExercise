package Day5

object Iteration extends App {

  def twoParam (paramOne : String, paramTwo : Int ) : Unit = {

    for (i <- 1 to paramTwo) {

      println(paramOne)
    }


  }
  twoParam ("Alimahad",9)

}
