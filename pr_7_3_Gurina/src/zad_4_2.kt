fun main(){
    try {
        print("Введите x : ")
        val x = readln().toDouble()
        print("Введите y : ")
        val y = readln().toDouble()
        print("Введите z : ")
        val z = readln().toDouble()

        var maxXY: Double
        var minXY: Double
        var rez: Double

        when {
            y < 0 -> {
                maxXY = maxOf(x, y)
                rez = minOf(z, maxXY)
                println("min(z,max(x,y)) = $rez")
            }

            else -> {
                minXY = minOf(x, y)
                rez = maxOf(z, minXY)
                println("max(z,min(x,y)) = $rez")
            }
        }
    }
    catch (e:Exception){
        println("Неверный ввод данных!")
    }
}