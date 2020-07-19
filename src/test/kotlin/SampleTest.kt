import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

// テスト
class SampleTest {
    @Test
    @DisplayName("should return Hello TDD Boot Camp!")
    fun `should return Hello TDD Boot Camp`() {
        val sut = Smaple()

        val actual = sut.say()

        assertEquals("Hello TDD Boot Camp!", actual)
    }

    @Test
    fun `1 + 1は2を返す`() {
        val sut = Smaple()

        val actual = sut.plus(1, 1)

        assertEquals(2, actual)
    }
}