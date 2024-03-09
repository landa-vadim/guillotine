fun main() {

    val words: List<String> = listOf("половода") //"скатерть", "кресло", "шкаф", "кровать", "стол", "диван", "половник")

    val word = words.random()
    val wordLength = (word.count())
    val wordCharArray = word.toCharArray()
    val letterRange: CharRange = 'а'..'я'

    val negativeList = mutableListOf<Char>()
    val positiveList = mutableListOf<Char>()

    println("Отгадайте слово:")
    println("*".repeat(wordLength))

    while (negativeList.size < 4 && positiveList.size < wordLength) {
        println("\nВведите букву:")
        val enteredSymbol: String = readln()
        val enteredSymbolChar = enteredSymbol[0]
        val predicate: (Char) -> Boolean = { it == enteredSymbolChar }
        val countEnteredSymbols = wordCharArray.count(predicate)

        if (isSymbolValid(
                enteredSymbol,
                enteredSymbolChar,
                letterRange,
                positiveList,
            )
        ) {
            if (countEnteredSymbols >= 1) {
                for (i in 1..countEnteredSymbols) {
                    positiveList.add(enteredSymbolChar)
                }
                for (i in wordCharArray) {
                    if (positiveList.contains(i)) {
                        print(i)
                    } else {
                        print("*")
                    }
                }
                if (positiveList.size < wordLength - countEnteredSymbols) {
                    println("\nВерно!")
                } else {
                    println("\nВы вигрыли!")
                }
            } else {
                negativeList.add(enteredSymbolChar)
                if (negativeList.size == 1) {
                    println("|\n|\n|\n|")
                }
                if (negativeList.size == 2) {
                    println("/------------\n|\n|\n|\n|")
                }
                if (negativeList.size == 3) {
                    println("/------------\n|           |\n|\n|\n|")
                }
                if (negativeList.size == 4) {
                    println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
                }

            }
        }
    }
}

fun isSymbolValid(
    enteredSymbol: String,
    enteredSymbolChar: Char,
    letterRange: CharRange,
    positiveList: MutableList<Char>,
): Boolean {
    if (enteredSymbol.length != 1) {
        println("Вы ввели не один символ!")
        return false
    }
    if (enteredSymbolChar !in letterRange) {
        println("Введенный символ - не буква из кириллицы!")
        return false
    }
    if (positiveList.contains(enteredSymbolChar)) {
        println("Вы уже угадали эту букву!")
        return false
    } else {
        return true
    }
}