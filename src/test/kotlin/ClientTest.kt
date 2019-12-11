package barnacle
import kotlin.test.Test
import kotlin.test.assertEquals

class ClientTest {
    private val client = Client()

    @Test
    fun clientShouldSayHello() {
        assertEquals("Hello, world!", client.welcome())
    }
}