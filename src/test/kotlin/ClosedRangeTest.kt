import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClosedRangeTest {
    @Test
    fun `整数閉区間オブジェクトは、下端点を持っていること`() {
        // Act
        val actual = ClosedRange(1, 2)

        // Assert
        assertEquals(1, actual.lowerEndPoint)
    }

    @Test
    fun `整数閉区間オブジェクトは、上端点を持っていること`() {
        // Act
        val actual = ClosedRange(1, 2)

        // Assert
        assertEquals(2, actual.upperEndPoint)
    }
}
