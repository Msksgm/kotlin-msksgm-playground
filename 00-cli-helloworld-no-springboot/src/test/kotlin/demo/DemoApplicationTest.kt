package demo

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DemoApplicationTest {
    @Test fun instanceHasAGetHelloMethod() {
         val instance = DemoApplication()
        assertNotNull(instance.getHello(), "getHello メソッドを持っている")
    }
    @Test fun getHelloMethodReturnHelloWorldString() {
        val expected = "HelloWorld"
        val actual = DemoApplication().getHello()
        assertEquals(expected, actual, "getHelloメソッドは\"HelloWorld\"を返す")
    }
}