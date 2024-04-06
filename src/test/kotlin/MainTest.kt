import com.literandltx.main
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `test main function with valid input`() {
        val input = "New York"
        val expectedOutput = "Enter your city: \nUser lives in New York\n"
        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        main()

        assertEquals(expectedOutput, outputStream.toString())
    }
}