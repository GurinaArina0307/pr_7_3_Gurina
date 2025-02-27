fun main(){
    try {
        print("Введите четырехзначное число: ")
        val number = readln().toInt()

        when{
            number > 1000 && number < 9999 -> {
                val sum = sumCalcul(number)
                print("Сумма цифр числа = $sum")
            }
            else -> {
                print("Необходимо четырехзначное число!")
                return
            }
        }
    }
    catch (e:Exception){
        println("Неверный ввод данных!")
    }
}
fun sumCalcul (number: Int): Int {
    var sum = 0
    var temp = number

    while (temp > 0)  {
            sum += temp % 10
            temp /= 10
        }
    return sum
}
