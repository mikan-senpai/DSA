fun main(args: Array<String>) {
    
    // println("Hello World")

    // in kotlin every variable has a type
    // so we can say that kotlin is statically typed



    val firstname: String = "rahul"   // this is readonly
    // feature is type inference
    println(firstname)

    // val is readonly

    // var : is read and write
    // var weight =160
    // val myVariable : Double = 12.3;
    // val myVariable1 : Boolean = true;

    val s1 ="call me"
    val s2 =" maybe "
    val combined = s1+s2
    println(combined)




    val myString="KOTLIN"
    println(myString[0])
    println(myString[1])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2,4))
    println("the  string is $myString")

    // variabble which holds a bunch of values at a time
    // val name1="mikan"
    // val name2="bebo"
    // val name3="scooby"

    val names = listOf("mikan" + "bebo" +"scooby")
    println(names[2])


}
