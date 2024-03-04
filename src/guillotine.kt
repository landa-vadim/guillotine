import kotlin.collections.mutableListOf as mutableListOf1
import kotlin.collections.mutableListOf as mutableListOf2
fun main() {

    val word: List<String> = listOf("кресло", "шкаф", "кровать", "стол", "диван")

    val vibor = word.random()?.toString()
    val vibor2 = (vibor?.count())!!.toInt()
    val vibory = vibor!!.toCharArray()

    val negative: MutableList<Char> = mutableListOf1()
    val positive: MutableList<Char> = mutableListOf2()

    println("Отгадайте слово:")
    println("*".repeat(vibor2))
    println("Введите букву:")

    val vveli: Char = readln()!!.single()

        if (vibory.contains(vveli)) {
            positive.add(vveli)
               if (positive.size < vibor2)
                   println("Верно!")
            else {
                println("Вы победили!")
                   return
               }
        }
        else {
            negative.add(vveli)
            if (negative.size == 1) println("|\n|\n|\n|")
        }

    for (i in vibory) {
        val a = i == vveli
        if (a) print(i)
        else print("*")
    }


    println("\nВведите букву второй раз:")     // цикл 2
    val vveli2 = readln()!!.single()

    if (vibory.contains(vveli2)) {
        positive.add(vveli)
        if (positive.size < vibor2)
            println("Верно!")
        else {
            println("Вы победили!")
            return
        }
    }
    else {
        negative.add(vveli2)
        if (negative.size == 1) println("|\n|\n|\n|")
        if (negative.size == 2) println("/------------\n|\n|\n|\n|")

    }
    for (i in vibory) {
        val a = i == vveli
        val b = i == vveli2

        if (b || a)
            print(i)
        else
            print("*")
    }

    println("\nВведите букву третий раз:")     // цикл 3
    val vveli3 = readln()!!.single()

    if (vibory.contains(vveli3)) {
        positive.add(vveli)
        if (positive.size < vibor2)
            println("Верно!")
        else {
            println("Вы победили!")
            return
        }
    }
    else {
        negative.add(vveli3)
        if (negative.size == 1) println("|\n|\n|\n|")
        if (negative.size == 2) println("/------------\n|\n|\n|\n|")
        if (negative.size == 3) println("/------------\n|           |\n|\n|\n|")
    }
    for (i in vibory) {
        val a = i == vveli
        val b = i == vveli2
        val c = i == vveli3

        if (b || a || c)
            print(i)
        else
            print("*")
    }

    println("\nВведите букву четвертый раз:")     // цикл 4
    val vveli4 = readln()!!.single()

    if (vibory.contains(vveli4)) {
        positive.add(vveli)
        if (positive.size < vibor2)
            println("Верно!")
        else {
            println("Вы победили!")
            return
        }
    }
    else {
        negative.add(vveli4)
        if (negative.size == 1) println("|\n|\n|\n|")
        if (negative.size == 2) println("/------------\n|\n|\n|\n|")
        if (negative.size == 3) println("/------------\n|           |\n|\n|\n|")
        if (negative.size == 4) {
            println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
            return
        }
    }
    for (i in vibory) {
        val a = i == vveli
        val b = i == vveli2
        val c = i == vveli3
        val d = i == vveli4

        if (b || a || c || d)
            print(i)
        else
            print("*")
    }

    println("\nВведите букву пятый раз:")     // цикл 5
    val vveli5 = readln()!!.single()

    if (vibory.contains(vveli5)) {
        positive.add(vveli)
        if (positive.size < vibor2)
            println("Верно!")
        else {
            println("Вы победили!")
            return
        }
    }
    else {
        negative.add(vveli5)
        if (negative.size == 1) println("|\n|\n|\n|")
        if (negative.size == 2) println("/------------\n|\n|\n|\n|")
        if (negative.size == 3) println("/------------\n|           |\n|\n|\n|")
        if (negative.size == 4) {
            println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
            return
        }
    }
    for (i in vibory) {
        val a = i == vveli
        val b = i == vveli2
        val c = i == vveli3
        val d = i == vveli4
        val e = i == vveli5

        if (b || a || c || d || e)
            print(i)
        else
            print("*")
    }
    println("\nВведите букву шестой раз:")     // цикл 6
    val vveli6 = readln()!!.single()

    if (vibory.contains(vveli6)) {
        positive.add(vveli)
        if (positive.size < vibor2)
            println("Верно!")
        else {
            println("Вы победили!")
            return
        }
    }
    else {
        negative.add(vveli6)
        if (negative.size == 1) println("|\n|\n|\n|")
        if (negative.size == 2) println("/------------\n|\n|\n|\n|")
        if (negative.size == 3) println("/------------\n|           |\n|\n|\n|")
        if (negative.size == 4) {
            println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
            return
        }
    }
    for (i in vibory) {
        val a = i == vveli
        val b = i == vveli2
        val c = i == vveli3
        val d = i == vveli4
        val e = i == vveli5
        val f = i == vveli6

        if (b || a || c || d || e || f)
            print(i)
        else
            print("*")
    }
}



