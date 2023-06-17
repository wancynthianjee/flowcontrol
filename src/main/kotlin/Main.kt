fun main() {

    ageClassifier(11)
    ageClassifier(15)
    ageClassifier(23)
    ageClassifier(1)
    ageClassifier(3)
    ageClassifier(17)
    nation("Rwanda")
    nation("Uganda")
    nation("Portugal")
    nation("Wale")
 numbers(arrayOf(57,52,66,107,36,91))

    var languages = arrayOf("Zulu","KIswahili","Luyha","Kisii")
    for(lang in languages){
        println("I can speak $lang")
    }
val name="Adalab"
    for(char in name){
        println(char)
    }
}
fun ageClassifier(age:Int) {
    when (age){
        in 0..1 -> println("You are a baby")
        in 2..3 -> println("You are a toddler")
        in 4..17 -> println("You are a child")
        else -> println("You are an adult")
    }
//    if (age in 0..1) {
//        println("You are a  teenager")
//    } else if (age in 2..3) {
//        println("You are a toddler")
//
//    } else if (age in 4..17) {
//        println("You are a child")
//    } else {
//
//        println("You are an adult")
//    }
}
//write a function that takes in a country name and prints out the corresponding
//nationality for each of the following countries:
//Rwanda,Ghana, Portugal,,Wale.Any other should  default to "Not appilcable"

 fun nation(names:String){
     when (names){
         "Rwanda"-> println("Rwandese")
         "Uganda"-> println("Ugandan")
             "Portugal"-> println("Portugese")
             "Wales"-> println("Walian")
         else ->println("Not applicable")

     }
}

//Write a function that takes in an array of random integers
//and prints out whether each is odd or even

fun numbers(num:Array<Int>){
    var numbers= arrayOf(57,52,66,107,36,91)
    for (num in numbers)
        if(num % 2 ==0){
            println("even")

    }
    else{
        println("odd")
        }
}







