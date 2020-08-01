import java.lang.IllegalArgumentException

data class ClosedRange(val lowerEndPoint: Int, val upperEndPoint: Int) {
    init {
        if (lowerEndPoint > upperEndPoint) {
            throw IllegalArgumentException()
        }
    }

    override fun toString(): String {
        return "[$lowerEndPoint,$upperEndPoint]"
    }
}
