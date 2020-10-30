//import javax.swing.Popup
//
//fun main(){
//    val a1: Point= Point()
//    a1.x= 7F
//    a1.y= 17F
//    println(a1.toString())
//    println(a1.sim())
//
//}
//class Point {
//    var x = 0F
//    var y = 0F
//
//    override fun toString(): String {
//        return "x=$x,y=$y"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Point) {
//            if ((x == other.x) and (y == other.y)) {
//                return true
//            }
//        }
//        return false
//    }
//}
//fun sim(){
//    x = -x
//    return println("სიმეტრიულად იგრეკ ღერძს მიმართ აისახება ($x,$y) წერტილში")
//}












//import kotlin.math.max
//fun main() {
//   val f1 = Fraction(2F, 4F)
//    val f2 = Fraction(3F, 7F)



//}
///class Fraction (n: Float, d: Float) {
//
//    var numerator: Float = n
//    var denominator: Float = d
//
//fun shekveca(): Float {
//        fun maxGamyofi(): Float {
//            val m = max(numerator, denominator)
//            var maxGamyofi = 1
//            for (i in m.toInt() downTo 0) {
//                if (i in m.toInt() % i == 0 && denominator.toInt() % i == 0) {
//                    maxGamyofi = i
//                    break
//                }
//            }

//            return maxGamyofi.toFloat()
//        }
//        numerator= numerator/maxGamyofi()
//        denominator=denominator/maxGamyofi()
//        return numerator/denominator

//         fun namravli(other: Fraction) {
//             val a=numerator*other.numerator
//             val b=denominator*other.denominator
//             return "$a/$b"


//     fun jami(other: Any?): String {
//         var numerator=0
//         var denominator=0
//         if(other is Fraction) {
//             numerator=(numerator*other.denominator+other.numerator*denominator).toInt()
//             denominator=(denominator*other.denominator).toInt()
//             return "sum=$numerator/$denominator"
//         }
//     }
//
//
//     }
//}










