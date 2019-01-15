import scala.collection.mutable.ArrayBuffer
object Checkout extends App{

  var price = 0.0
  var orangeCount= 0.0
  var appleCount = 0.0
  var checkout = scala.collection.mutable.ArrayBuffer(toString)
  println("please enter how meany fruits you want")
  var user_in_num = readInt()
  print("please enter your fruts with lowecse")
  for (i <- 1 to user_in_num) {
    var user_in = readLine
    if (user_in == "apple" || user_in == "orange") {
      checkout.append(user_in)
    }
    else {
      println("not a frute or at least not one we sell We only sell apple and orange with lowercase")
      println( s"you get one more go otherwise i will come over personaly and eat your $user_in personally")
      user_in = readLine
      if (user_in == "apple" || user_in == "orange") {
        checkout.append(user_in)
      }
    }
  }

  checkout.foreach(iteration => {
    if (iteration == "apple")
      {
        appleCount+=1
      }
    if (iteration == "orange")
    {
      orangeCount+=1
    }
  })

  orangeCount=orangeCount/3 * 2 * 0.25 + orangeCount%3 * 0.25
  appleCount=(appleCount/2 * 0.60) + (appleCount%2 *0.60)
  price += appleCount+orangeCount

  print(price)


  //checkout.foreach(println)







}
