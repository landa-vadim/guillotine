fun main() {

    val words: List<String> = listOf("кукумбер", "креслок", "шкафш", "кроватьк", "столл", "диванн")

    val word = words.random()
    val wordLength = (word.count())
    val wordCharArray = word.toCharArray()

    val list1 = mutableListOf<Char>()
    val list2 = mutableListOf<Char>()

    println("Отгадайте слово:")
    println("*".repeat(wordLength))

    while (list1.size < 4 && list2.size < wordLength) {

        println("\nВведите букву:")
        var readLine: Char = readln()!!.single()
    if (list2.contains(readLine)) {
        println("Такая буква уже есть!")
        continue
    }
        if (wordCharArray.contains(readLine)) {
                        if (list2.size < wordLength)
                println("Верно!")
            else {
                println("Вы победили!")
            }
        } else {
            list1.add(readLine)
            if (list1.size == 1) println("|\n|\n|\n|")
            if (list1.size == 2) println("/------------\n|\n|\n|\n|")
            if (list1.size == 3) println("/------------\n|           |\n|\n|\n|")
            if (list1.size == 4) println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
        }

        for (i in wordCharArray) {
            if (readLine == i) list2.add(readLine)
                 if (list2.contains(i)) print(i)
            else print("*")
        }
    }
}
