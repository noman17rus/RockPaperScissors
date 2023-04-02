import java.util.*

val options = arrayOf("Камень", "Ножницы", "Бумага")

fun main() {
    var isUserTryAgain = true
    var userChose: String = ""
    while (isUserTryAgain){
        if(userChose == "" || userChose == "Да") {
            startGame()
            val userInput = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
            userChose = userInput
        } else isUserTryAgain = false
    }
}

fun getGameChose(optionParam: Array<String>) = optionParam[(Math.random() * optionParam.size).toInt()]

fun getPlayerChose(optionParam: Array<String>): String {
    var isValidChose = false
    var userChose = ""
    while (!isValidChose) {
        println("Пожалуйста введите один из вариантов:")
        for (item in optionParam) {
            println(" $item")
            println(".")
        }
        //прочитать пользовательский ввод
        val userInput = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        if (userInput != null && userInput in optionParam) {
            isValidChose = true
            userChose = userInput
        } else if (!isValidChose) {
            println("Введите допустимый вариант")
        }
    }
    return userChose
}

fun getResult(gameChose: String, userChose: String) {
    val result: String
    if (gameChose == userChose) result = "Ничья"
    else if ((userChose == "Камень" && gameChose == "Ножницы") ||
        (userChose == "Ножницы" && gameChose == "Бумага") ||
        (userChose == "Бумага" && gameChose == "Ножницы")
    ) result = "Вы победили"
    else result = "Вы проиграли"
    println("Вы выбрали $userChose. Компьютер выбрал $gameChose. $result. Желаете сыграть еще раз?")
}

fun startGame(){
    val gameChose = getGameChose(options)
    println("Игра сделала свой выбор, теперь Ваш ход: ")
    val playerChose = getPlayerChose(options)
    getResult(gameChose, playerChose)
}