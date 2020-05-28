object Q2 {
  def main(args:Array[String]){
    println(salary(10,10))

    println(profit(10))
    println(profit(15))
    println(profit(20))
    println(profit(25))
    println(profit(30))

  }

  def salary(nomalHours : Double, otHours : Double): Double ={
    val nPay :Double =150
    val otPay :Double =75

    var wage :Double =nomalHours * nPay
    var ot :Double =otHours * otPay
    var income : Double = wage+ot
    var  tax = income* .1
    var takeHome = income-tax
    takeHome
  }

  def profit(price:Int):Int ={
    var attendees =120+(15-price)/5*20
    var revenue = attendees * price
    var cost = 500 + attendees
    var profit = revenue - cost
    profit


  }


}
