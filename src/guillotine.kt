fun main() {

    val word: List<String> = listOf("кресло", "шкаф", "кровать", "стол", "диван")

    val vibor = word.random()?.toString()
    val vibor2 = (vibor?.count())!!.toInt()
    val vibory = vibor!!.toCharArray()

    val negative: MutableList<Char> = mutableListOf()
    val positive: MutableList<Char> = mutableListOf()

    println("Отгадайте слово:")
    println("*".repeat(vibor2))

    while (negative.size < 4 && positive.size < vibor2) {

        println("\nВведите букву:")
        var vveli: Char = readln()!!.single()
    if (positive.contains(vveli)) {
        println("Такая буква уже есть!")
        continue
    }
        if (vibory.contains(vveli)) {
            positive.add(vveli)
            if (positive.size < vibor2)
                println("Верно!")
            else {
                println("Вы победили!")
                return
            }
        } else {
            negative.add(vveli)
            if (negative.size == 1) println("|\n|\n|\n|")
            if (negative.size == 2) println("/------------\n|\n|\n|\n|")
            if (negative.size == 3) println("/------------\n|           |\n|\n|\n|")
            if (negative.size == 4) println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
        }

        for (i in vibory) {
            var a = i == vveli || positive.contains(i)
            if (a) print(i)
            else print("*")
        }
    }
}
