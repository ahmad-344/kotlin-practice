// 1
/*fun main() {  
  print("enter the num: ")
  var num=readln().toInt()
  if (num%2==0){
    print("Number is positive $num")
  } else{
    print("Number is negative $num")
  }
}*/

// 2
/*fun main(){
  print("Enter the num1: ")
  val num1=readln().toInt()
  print("Enter the num2: ")
  val num2=readln().toInt()
  print("Enter the num3: ")
  val num3=readln().toInt()
  if(num1>num2){
    if(num1>num3){
      print("num1 is greator")
    } else{
      print("num3 is greator")
    }
  } else{
    if (num2>num3){
      print("num 2 is greator")
    } else{
      print("num3 is greator")
    }
  }
}*/


// 3
/*fun main() {
    for (i in 1..20) {
        println(i)
    }
}*/

// 4
/*fun main(){
  print("Enter the num: ")
  val num= readln().toInt()
  var i=1
  while(i<=10){
    println("$num * $i = ${num*i}")
    i++
  }
}*/


// 5
// fun main() {
//     var sum = 0
//     for (i in 1..100) {
//         if (i % 2 == 0) {
//             sum += i
//         }
//     }
//     println("Sum of even numbers from 1 to 100 = $sum")
// }


fun greeting(message: String,userId: Int = 0)
 { print("$message")}

fun main() {
    // Uses 0 as the default value for 'userId'
    // greeting(message = "Hello!")
    
    // Error: No value passed for parameter 'userId'
    greeting("Hello!")
}