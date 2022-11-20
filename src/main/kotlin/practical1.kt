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



/*
//Q8
fun main() {
    print("Please enter size of array:")
    val input1 = readLine()!!
    val array_size: Int = input1.toInt()
    val array1 = Array<Int>(array_size) { 0 }
    val array2 = array1
    println("Please enter elements")
    for (i in 0..array_size - 1) {
        print("arr[$i]=")
        array1.set(i, readLine()!!.toInt())
    }
    var temp: Int
    for (i in 0..array_size - 1) {
        for (j in 0..array_size - 1) {
            if (array1[i] <= array1[j]) {
                temp = array1[i]
                array1[i] = array1[j]
                array1[j] = temp
            }
        }
    }

    println("#Method 1 - Without using inbuilt function")
    println("----Sorted Array---- ")
    for (i in 0..array_size - 1) {
        println("arr[$i]=" + array1[i])
    }
    println("#Method 2 - Using inbuilt function")
    println("----Sorted Array---- ")
    array2.sort()
    for (i in 0..array_size - 1) {
        println("arr[$i]=" + array2[i])
    }
}








//Q9
fun main() {
    print("Please enter size of array:")
    val array_size: Int = readLine()!!.toInt()
    val array1 = Array<Int>(array_size) { 0 }
    for (i in 0..array_size - 1) {
        print("arr[$i]=")
        array1.set(i, readLine()!!.toInt())
    }
    var max = array1[0]
    var min = array1[0]
    for (i in 0..array_size - 1) {
        if (array1[i] >= max) {
            max = array1[i]
        }
        if(array1[i]<=min)
        {
            min = array1[i]
        }
    }
    println("Max number in given array is: $max")
    println("Min number in given array is: $min")
}










//Q10
fun main(){
println("Please enter the elements in Array A")
val A = Array(3) { IntArray(3) }
val B = Array(3) { IntArray(3) }
val C = Array(3) { IntArray(3) }
val D = Array(3) { IntArray(3) }
for (i in 0..2) {
    for (j in 0..2) {
        print("A[$i][$j]=")
        A[i][j] = readLine()!!.toInt()
    }
}
println("---------------------------------")
println("Please enter the elements in Array B")
for (i in 0..2) {
    for (j in 0..2) {
        print("B[$i][$j]=")
        B[i][j] = readLine()!!.toInt()
    }
}
for (i in 0..2) {
    for (j in 0..2) {
        C[i][j] = A[i][j] + B[i][j]
    }
}
for (i in 0..2) {
    for (j in 0..2) {
        D[i][j] = A[i][j] - B[i][j]
    }
}
println("-----------------Addition----------------------")
for (i in 0..2) {
    for (j in 0..2) {
        print(A[i][j])
        print(" ")
    }
    print("\n")
}
println("  + ")
for (i in 0..2) {
    for (j in 0..2) {
        print(B[i][j])
        print(" ")
    }
    print("\n")
}
println("------")
println("------")
for (i in 0..2) {
    for (j in 0..2) {
        print(C[i][j])
        print(" ")
    }
    print("\n")
}
println("-----------------Subtraction----------------------")
for (i in 0..2) {
    for (j in 0..2) {
        print(A[i][j])
        print(" ")
    }
    print("\n")
}
println("  -  ")
for (i in 0..2)
{
    for (j in 0..2) {
        print(B[i][j])
        print(" ")
    }
    print("\n")
}
println("------")
println("------")
for (i in 0..2) {
    for (j in 0..2) {
        print(D[i][j])
        print(" ")
    }
    print("\n")
}


println("-----------------Multiplication----------------------")
val r1 = 2
val c1 = 3
val r2 = 3
val c2 = 2
val firstMatrix = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))
val secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4))

// Mutliplying Two matrices
val product = Array(r1) { IntArray(c2) }
for (i in 0..r1 - 1) {
    for (j in 0..c2 - 1) {
        for (k in 0..c1 - 1) {
            product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
        }
    }
}

// Displaying the result
for (row in firstMatrix) {
    for (column in row) {
        print("$column    ")
    }
    println()
}
println("  *  ")
for (row in secondMatrix) {
    for (column in row) {
        print("$column    ")
    }
    println()
}

println("------")
println("------")
println("Product of two matrices is: ")

for (row in product) {
    for (column in row) {
        print("$column    ")
    }
    println()
}
}
