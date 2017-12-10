import java.net.*;
import java.util.*

fun max(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

fun max_of_three(num1: Int, num2: Int, num3: Int): Int {
    var largest = num1

    if (largest < num2) largest = num2
    if (largest < num3) largest = num3
    return largest
}

fun lenght_of_string(string:String):Int{
    var num = 0
    for(i in string){
        num++
    }
    return num
}

fun isVowel(char:Char):Boolean{

     val vowel_array = listOf<Char>('a','e','i','o','u')

    if (char in vowel_array){
        return true
    }else{
        return false
    }


}

fun translate(word:String):String{

    var final = ""
    for(c in word){
        if (!isVowel(c) && c.isLetter()){
            final+=c+"o"+c
        }
        else{
            final+=c
        }
    }
    return final
}

fun sum(list: List<Number>):Double{

    var result = 0.0

     for(num in list){ result = result.plus(num.toDouble())}
    return result
}

fun multiply(list: List<Number>):Double{

    var result = 1.0

    for(num in list){ result = result.times(num.toDouble())}
    return result
}

fun reverse(string:String):String{

    //although there is a string.reverse function
    var newString = ""
    for(i in string.length-1 downTo 0){
        newString+= string[i]

    }
    return newString
}

fun is_palindrome(string: String):Boolean=string.equals(reverse(string))

fun is_member(i:Char,list: List<Char>):Boolean=i in list


fun overlapping(list1: List<Char>, list2: List<Char>):Boolean{

    for (el in list1){
        if (el in list2){
            return true
        }
    }
    return false
}

fun generate_n_chars(char: Char,n:Int):String=char.toString().repeat(n)

fun histogram(list: List<Int>):String{
    var result = ""
    for (x in list){
        result+=generate_n_chars('*',x)
        result+="\n"
    }
    return result
}

fun max_in_list(list: List<Int>):Int{
    var largest = 0

    for(x in list){
        if(x>largest){
            largest = x
        }
    }
    return largest
}

fun lenght_of_strings(list: List<String>):TreeMap<String,Int>{
    var result = TreeMap<String,Int>()

    for(c in list){
        result[c]= c.length

    }
    return result
}

