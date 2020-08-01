import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClosedRangeTest {
    @Test
    fun `整数閉区間オブジェクトは、下端点を持っていること`() {
        val actual = ClosedRange(1, 2)

        assertEquals(1, actual.lowerEndPoint)
    }

    @Test
    fun `整数閉区間オブジェクトは、上端点を持っていること`() {
        val actual = ClosedRange(1, 2)

        assertEquals(2, actual.upperEndPoint)
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトは、［1,2］を返す`() {
        val sut = ClosedRange(1, 2)

        val actual = sut.toString()

        assertEquals("[1,2]", actual)
    }

    @Test
    fun `下端点が2、上端点が3の整数閉区間オブジェクトは、［2,3］を返す`() {
        val sut = ClosedRange(2, 3)

        val actual = sut.toString()

        assertEquals("[2,3]", actual)
    }
}
