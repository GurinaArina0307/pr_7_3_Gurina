import kotlin.math.sqrt

fun main()
{
    try {
        print("Введите длину стороны A : ")
        val a = readln().toDouble()
        print("Введите длину стороны B : ")
        val b = readln().toDouble()
        print("Введите длину стороны C : ")
        val c = readln().toDouble()

        when{
            a > 0 && b > 0 &&  c > 0 -> {
                val P = a + b + c //Периметр
                val p = P / 2 // Полупериметр
                val s = Math.sqrt(p*(p-a)*(p-b)*(p-c)) // Площадь
                val h = 2 * s / a // Высота

                println("Высота треугольника h = $h")
            }
            else -> {
                println("Длины сторон не могут быть меньше 0!")
                return
            }
        }

    }
    catch (e:Exception){
        println("Неверный ввод данных!")
    }
}