
fun main() {
    println("Hello World!")

    println("Practical 1.1")

    val a: Int = 55
    println("integer value = $a")

    val b: Float = 5.5F
    println("Float value = $b")

    val c: Char = 'F'
    println("Character value = $c")

    val d: String = "Shlok Patel"
    println("String value = $d")

    val e: Boolean = false
    println("Boolean  value = $e")

    val f: Double = 3.122001
    println("Double value = $f")

    val g: Long = 7383590175
    println("Long value = $g")

    val h: Short = -55
    println("Short value = $h")

    val i: Byte = 126
    println("Byte value = $i")

    println("Practical 1.2")
    val intNo: Int = 15
    val doubleNo: Double =intNo.toDouble()
    println("Type conversion integer to double = $doubleNo")

    val stringNo: String = "15"
    val intNo1: Int = stringNo.toInt()
    val doubleNo1: Double =stringNo.toDouble()
    println("Type conversion String to Integer = $intNo1")
    println("Type conversion String to Double = $doubleNo1")


    println("Practical 1.3")
    print("Enter your Enrollment No: ")
    val Eno: Long= readLine()!!.toLong()
    print("Enter your Name: ")
    val name: String= readLine()!!
    print("Enter your Branch: ")
    val branch: String= readLine()!!
    print("Enter your Class: ")
    val cls: String= readLine()!!
    print("Enter your College name: ")
    val clg: String= readLine()!!
    print("Enter your University name: ")
    val uni: String= readLine()!!
    print("Enter your Age: ")
    val Age: Int= readLine()!!.toInt()

    println("")
    println("")
    println("Student's Data")
    println("Your name: $Eno")
    println("Your name: $name")
    println("Your name: $branch")
    println("Your name: $cls")
    println("Your name: $clg")
    println("Your name: $uni")
    println("Your name: $Age")

    println("Practical 1.4")
    println("Enter no to Check ODD or EVEN")
    val no:Int = readLine()!!.toInt()
    if (no % 2 ==0)
        println("$no is Even")
    else
        println("$no is Odd")


    println("Practical 1.5")
    println("Enter Month no")
    val monthno:Int = readLine()!!.toInt()
    if (monthno == 1)
        println("$monthno is January")
    else if(monthno == 2)
        println("$monthno is February")
    else if(monthno == 3)
        println("$monthno is March")
    else if(monthno == 4)
        println("$monthno is April")
    else if(monthno == 5)
        println("$monthno is May")
    else if(monthno == 6)
        println("$monthno is June")
    else if(monthno == 7)
        println("$monthno is July")
    else if(monthno == 8)
        println("$monthno is August")
    else if(monthno == 9)
        println("$monthno is September")
    else if(monthno == 10)
        println("$monthno is October")
    else if(monthno == 11)
        println("$monthno is November")
    else if(monthno == 12)
        println("$monthno is December")
    else
        println("$monthno is not valid no")

    println("Practical 1.6")
    println("Enter Value A: ")
    val x: Int = readLine()!!.toInt()
    println("Enter Value B: ")
    val y: Int = readLine()!!.toInt()
    println("Enter Value C: ")
    val z: Int= readLine()!!.toInt()
    val sum: Int =x+y+z
    val SUB: Int =x-y-z
    val MUL: Int =x*y*z
    val DIV: Int =x/y/z
    println(" Addition: $x + $y +$z = $sum")
    println(" Subtraction: $x - $y - $z = $SUB")
    println(" Multiplication: $x * $y * $z = $MUL")
    println(" Division: $x / $y / $z = $DIV")

    println("Practical 1.7")
    println("Enter a number to find it's Factorial: ")
    val No: Int = readLine()!!.toInt()
    println("Factorial of $No is: "+Fact(No))

    print("Enter a number you want it's factorial: ")
    val n = readLine()!!.toInt()
    println("Factorial using Recursion " + recursionFact(n))
    println("Factorial using tailrec " + fact(n))
}
fun recursionFact(n: Int): Int {
    if (n == 1 || n == 0) {
        return 1
    }
    return n * recursionFact(n - 1)
}
tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1) {
        temp
    } else {
        fact(n - 1, temp * n)
    }
}