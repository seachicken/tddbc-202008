import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertDoesNotThrow

class ClosedRangeTest {
    @Nested
    @DisplayName("整数閉区間オブジェクトは、文字列表現を返すこと")
    inner class WhenToString {
        @Test
        fun `下端点が1、上端点が2の整数閉区間オブジェクトは、［1,2］を返す`() {
            val sut = ClosedRange(1, 2)
            assertEquals("[1,2]", sut.toString())
        }
    }

    @Test
    fun `下端点が上端点が同値の整数閉区間オブジェクトは生成できること`() {
        assertDoesNotThrow {
            ClosedRange(1, 1)
        }
    }

    @Test
    fun `下端点が2、上端点が1の整数閉区間オブジェクトは生成できないこと`() {
        assertThrows<IllegalArgumentException> {
            ClosedRange(2, 1)
        }
    }

    @Test
    fun `下端点が1、上端点が3の整数閉区間オブジェクトに2を渡すと、範囲に含んでいると判定できること`() {
        val sut = ClosedRange(1, 3)
        assertTrue(sut.contains(2))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトに2を渡すと、範囲に含んでいると判定できること`() {
        val sut = ClosedRange(1, 2)
        assertTrue(sut.contains(2))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトに1を渡すと、範囲に含んでいると判定できること`() {
        val sut = ClosedRange(1, 2)
        assertTrue(sut.contains(1))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトに0を渡すと、範囲に含んでいないと判定できること`() {
        val sut = ClosedRange(1, 2)
        assertFalse(sut.contains(0))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトに3を渡すと、範囲に含んでいないと判定できること`() {
        val sut = ClosedRange(1, 2)
        assertFalse(sut.contains(3))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトと下端点が1、上端点が2の整数閉区間オブジェクトを比較すると等価と判定できること`() {
        val sut1 = ClosedRange(1, 2)
        val sut2 = ClosedRange(1, 2)
        assertTrue(sut1 == sut2)
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトと下端点が1、上端点が3の整数閉区間オブジェクトを比較すると等価でないと判定できること`() {
        val sut1 = ClosedRange(1, 2)
        val sut2 = ClosedRange(1, 3)
        assertFalse(sut1 == sut2)
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトと下端点が0、上端点が2の整数閉区間オブジェクトを比較すると等価でないと判定できること`() {
        val sut1 = ClosedRange(1, 2)
        val sut2 = ClosedRange(0, 2)
        assertFalse(sut1 == sut2)
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトと下端点が2、上端点が2の整数閉区間オブジェクトを比較すると含んでいると判定できること`() {
        val sut1 = ClosedRange(1, 2)
        val sut2 = ClosedRange(2, 2)
        assertTrue(sut1.contains(sut2))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトと下端点が3、上端点が3の整数閉区間オブジェクトを比較すると含んでいないと判定できること`() {
        val sut1 = ClosedRange(1, 2)
        val sut2 = ClosedRange(3, 3)
        assertFalse(sut1.contains(sut2))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトと下端点が2、上端点が3の整数閉区間オブジェクトを比較すると含んでいないと判定できること`() {
        val sut1 = ClosedRange(1, 2)
        val sut2 = ClosedRange(2, 3)
        assertFalse(sut1.contains(sut2))
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトと下端点が0、上端点が1の整数閉区間オブジェクトを比較すると含んでいないと判定できること`() {
        val sut1 = ClosedRange(1, 2)
        val sut2 = ClosedRange(0, 1)
        assertFalse(sut1.contains(sut2))
    }
}
