import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.random.Random

fun main(){
    var check = 1
    println("Write 0 to play Samliam Program")
    println("Write 1 to play MiniTax Program")
    println("Write 2 to play Bubblesort Program")
    println("Write 3 to play exit Program")
    print("Input number 1-3 : ")

    var num = readLine()!!.toInt()
    while (check == 1){
        if (num in 0..3){
            if (num == 0){
                Samliam()
            }else if(num == 1){
                MiniTax()
            }else if(num == 2){
                Bubblesort()
            }else if(num == 3){
                check = 0
            }
        }

    }
    print("Exit Program")



}

fun Samliam(){
    print("Input number between 1-9 : ")
    var num = readLine()!!.toInt()
    if(num in 1..9){
        for (i in 1..num){
            for(j in 1..i){
                print(j)
            }
            println()
        }

        for (i in num downTo 1){
            for(j in 1..i-1){
                print(j)
            }
            println()
        }
        print("Samliam Program Complete!!")
        println("\n")
        return main()
    }
}


fun MiniTax(){
    var tax = 0.0
    var sum = 0.0
    print("Input Your money : ")
    var salary = readLine()!!.toInt()
    for(i in 1..10){
        if(i  <= 3){
            tax = (salary.toDouble()+sum)*3/100
            sum+=tax
        }else if(i <= 7){
            tax = (salary.toDouble()+sum)*5/100
            sum+=tax
        }else if(i <= 10){
            tax = (salary.toDouble()+sum)*7/100
            sum+=tax
        }
    }
        sum += salary
    val decimal = BigDecimal(sum).setScale(2,RoundingMode.HALF_UP)
    println("Your money in ten years is $decimal")
    print("Minitax Program Complete!!!")
    println("\n")
    return main()
}

fun Bubblesort(){
    var array1 = arrayOfNulls<Int>(7)
    var array2 = arrayOfNulls<Int>(7)
    var array3 = arrayOfNulls<Int>(7)

    for(i in 0..5){
        array1[i] = (0..100).random()
        array2[i] = (0..100).random()
    }
    print("Array1 : is ")
    for(i in 0..5){
        print(" "+array1[i])
    }

    for(i in 0..5-1){
        for(j in 0..5-i-1){
            var sorting = array1[j]
                if(array1[j]!! > array1[j+1]!!){
                    array1[j] = array1[j+1]
                    array1[j+1] = sorting
                }

        }
    }
    println()
    print("Sorting Array 1 is : ")
    for (i in 0..5){
        print(" "+array1[i])
    }

    println()
    print("Array2 : is ")
    for(i in 0..5){
        print(" "+array2[i])

    }

    for(i in 0..5-1){
        for(j in 0..5-i-1){
            var sorting = array2[j]
            if(array2[j]!! > array2[j+1]!!){
                array2[j] = array2[j+1]
                array2[j+1] = sorting
            }

        }
    }
    println()
    print("Sorting Array 2 is : ")
    for (i in 0..5){
        print(" "+array2[i])
    }
    println()
    print("Array 3 is :")
    for(i in 0..5){
        if (array1[i]!! >= array2[i]!!){
            array3[i] = array1[i]
        }else{
            array3[i] = array2[i]
        }
        print(" "+array3[i])
    }

    println()
    println("Bubblesort Program Complete!!!")
    println("\n")
    return main()
}