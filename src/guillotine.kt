fun main() {

    val words: List<String> = listOf("скатерть", "кресло", "шкаф", "кровать", "стол", "диван", "половник")

    val word = words.random()
    val wordLength = (word.count())
    val wordCharArray = word.toCharArray()

    val negativeList = mutableListOf<Char>()
    val positiveList = mutableListOf<Char>()

    println("Отгадайте слово:")
    println("*".repeat(wordLength))

    while (negativeList.size < 4 && positiveList.size < wordLength) {

        println("\nВведите букву:")
        val enteredSymbol: String = readln()
        val enteredSymbolChar = enteredSymbol[0]
        if (enteredSymbol.length != 1) {
            println("Вы ввели не один символ!")
            continue
        } else {
            val letterRange: CharRange = 'а'..'я'
            if (enteredSymbolChar in letterRange) {
                if (positiveList.contains(enteredSymbolChar)) {
                    println("Такая буква уже есть!")
                    continue
                }
                if (wordCharArray.contains(enteredSymbolChar)) {
                    if (positiveList.size < wordLength-1) {
                        println("Верно!")
                    } else {
                        println("Вы победили!")
                    }
                } else {
                    negativeList.add(enteredSymbolChar)
                    if (negativeList.size == 1) println("|\n|\n|\n|")
                    if (negativeList.size == 2) println("/------------\n|\n|\n|\n|")
                    if (negativeList.size == 3) println("/------------\n|           |\n|\n|\n|")
                    if (negativeList.size == 4) println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
                }

                for (i in wordCharArray) {
                    if (enteredSymbolChar == i) {
                        positiveList.add(enteredSymbol[0])
                    }
                    if (positiveList.contains(i)) {
                        print(i)
                    } else {
                        print("*")
                    }
                }
            } else {
                println("Введенный символ - не буква из кириллицы!")
                continue
            }
        }
    }
}