fun main(args: Array<String>) {
   val fruits = arrayOf("apply","banana","orange")
    println(fruits[1])

    //replace specifically

    val clothes= arrayOf("hoodies","jeans","sneakers","pajama")
    clothes[1]="sweatshirt"
    println(clothes[1])

    //array length size
    val cars = arrayOf("lambo","porche","rollroyce")
    println(cars.size)
    if("lambo" in cars){
        println("well it exists")
    }else{
        println("u dumb? you didnt even insert in the list")
    }

    //check if an element exists


}