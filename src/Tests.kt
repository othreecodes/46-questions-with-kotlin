import org.testng.annotations.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@Test
fun test_max_of_three(){
    val result = max_of_three(2,5,8)
    assert(result==8)

    val result1 = max_of_three(12,5,8)
    assert(result1==12)

    val result2 = max_of_three(2,50,8)
    assert(result2==50)
}

@Test
fun test_max_of_two(){
    var result = max(3,5)
    assert(result==5)

    result = max(30,5)
    assert(result==30)

}

@Test
fun test_lenght_of_string(){

    var lenght = lenght_of_string("obiuchennadavid")

    assert(lenght==15)
}

@Test
fun test_is_vowel(){

    assertTrue { isVowel('e') }
    assertTrue { isVowel('a') }
    assertTrue { isVowel('i') }
    assertFalse { isVowel('c') }
    assertFalse { isVowel('f') }
}

@Test
fun test_translation(){

    val result = translate("this is fun")
    assertEquals("tothohisos isos fofunon",result)

}

@Test
fun test_sum(){
    val result = sum(listOf(1,2,3,4))
    assert(result==10.0)

}

@Test
fun test_multiplication(){
    val result = multiply(listOf(1,2,3,4))

    assert(result==24.0)
}

@Test
fun test_reverse(){
    val result = reverse("I am testing")

    assert(result.equals("gnitset ma I"))
}

@Test
fun test_is_palindrome(){
    val result = is_palindrome("radar")
    assertTrue { result }
}

@Test
fun test_is_member(){

    val result = is_member('e', listOf('a','b','c','d','e','f','g'))

    assertTrue { result }
}

@Test
fun test_overlapping(){

    val result = overlapping(listOf('h','i','j','k','l','m','c'), listOf('a','b','c','d','e','f','g'))

    assertTrue { result }
}

@Test
fun test_generate_n_chars(){

    val result = generate_n_chars('r',7)

    assertEquals("rrrrrrr",result)
}

@Test
fun test_histogram(){

    val result = histogram(listOf(4, 9, 7))

    assertEquals("****\n*********\n*******\n",result)
}

@Test
fun test_largest(){

    val result = max_in_list(listOf(1,2,3,4,2,5,8,9,4,2,4,5,2,4,3,3,22,1,2))
    assert(result==22)
}
