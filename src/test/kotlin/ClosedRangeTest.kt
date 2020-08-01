import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class ClosedRangeTest {
    @Test
    fun `整数閉区間オブジェクトは、下端点を持っていること`() {
        val sut = ClosedRange(1, 2)
        assertEquals(1, sut.lowerEndPoint)
    }

    @Test
    fun `整数閉区間オブジェクトは、上端点を持っていること`() {
        val sut = ClosedRange(1, 2)
        assertEquals(2, sut.upperEndPoint)
    }

    @Test
    fun `下端点が1、上端点が2の整数閉区間オブジェクトは、［1,2］を返す`() {
        val sut = ClosedRange(1, 2)
        assertEquals("[1,2]", sut.toString())
    }

    @Test
    fun `下端点が2、上端点が3の整数閉区間オブジェクトは、［2,3］を返す`() {
        val sut = ClosedRange(2, 3)
        assertEquals("[2,3]", sut.toString())
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
}
