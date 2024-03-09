fun main() {

    val words: List<String> = listOf("скатерть", "кресло", "шкаф", "кровать", "стол", "диван", "половник")

    val word = words.random()
    val wordLength = (word.count())
    val wordCharArray = word.toCharArray()
    val letterRange: CharRange = 'а'..'я'

    val negativeList = mutableListOf<Char>()
    val positiveList = mutableListOf<Char>()

    // в этой строчке ты присваиваешь в переменную значение размера списка на текущий момент
    // если список изменится, эта переменная не обновится автоматически и всегда будет равна 0 (об этом подсвечивает студия)
    val negativeListSize = negativeList.size
    // в этой строчке аналогично
    val positiveListSize = positiveList.size

    println("Отгадайте слово:")
    println("*".repeat(wordLength))

    // здесь из-за этого мы получаем while(true) - сможем выйти только через return-ы ниже
    while (negativeListSize < 4 && positiveListSize < wordLength) {
        println("\nВведите букву:")
        val enteredSymbol: String = readln()
        val enteredSymbolChar = enteredSymbol[0]
        if (enteredLenghtCheck(enteredSymbol)) {
            println("Вы ввели не один символ!")
            continue
        } else {

            if (enteredSymbolCharRangeCheck(enteredSymbolChar, letterRange)) {
                if (positiveListCheck(positiveList, enteredSymbolChar)) {
                    println("Такая буква уже есть!")
                    continue
                }
                if (rightCharCheck(wordCharArray, enteredSymbolChar)) {
                    if (positiveListSizeCheck(positiveList, wordLength)) {
                        println("Верно!")
                    } else {
                        println("Вы победили!")
                        return
                    }
                } else {
                    negativeList.add(enteredSymbolChar)
                    if (negativeList.size == 1) println("|\n|\n|\n|")
                    if (negativeList.size == 2) println("/------------\n|\n|\n|\n|")
                    if (negativeList.size == 3) println("/------------\n|           |\n|\n|\n|")
                    if (negativeList.size == 4) {
                        println("/------------\n|           |\n|           *\n|          /\\ \n|          /\\ \nВы проиграли!")
                        return
                    }
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


// не совсем такие я функции имел в виду, в таких действительно большого смысла нет
// вообще функция у которой тело состоит из одной строчки это чаще всего антипаттерн, т.е. лучше не писать
fun enteredLenghtCheck(enteredSymbol: String): Boolean {
    val enteredLenghtCheck = enteredSymbol.length != 1
    return (enteredLenghtCheck)
}

fun enteredSymbolCharRangeCheck(enteredSymbolChar: Char, letterRange: CharRange): Boolean {
    val enteredSymbolRangeCheck = enteredSymbolChar in letterRange
    return enteredSymbolRangeCheck
}

fun positiveListCheck(positiveList: List<Char>, enteredSymbolChar: Char): Boolean {
    val positiveListCheck = positiveList.contains(enteredSymbolChar)
    return positiveListCheck
}

fun rightCharCheck(wordCharArray: CharArray, enteredSymbolChar: Char): Boolean {
    val rightCharCheck = wordCharArray.contains(enteredSymbolChar)
    return rightCharCheck
}

fun positiveListSizeCheck(positiveList: List<Char>, wordLength: Int): Boolean {
    val positiveListSizeCheck = positiveList.size < wordLength-1
    return positiveListSizeCheck
}

/**
 * Функция которая проверяет введен ли валидный символ c консоли
 *  true - если символ валидный
 *  false - если нет
 *  дополнительно печатает причину
 */
fun isValidSymbol(inputString: String): Boolean {
    if (inputString.length != 1) {
        println("Такая буква уже есть!")
        return false
    }
    val letterRange: CharRange = 'а'..'я'
    if (inputString[0] !in letterRange) {
        println("Введенный символ - не буква из кириллицы!")
        return false
    }
    return true
}