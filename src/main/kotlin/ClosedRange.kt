data class ClosedRange(val lowerEndPoint: Int, val upperEndPoint: Int) {
    init {
        require(lowerEndPoint <= upperEndPoint)
    }

    override fun toString(): String {
        return "[$lowerEndPoint,$upperEndPoint]"
    }

    fun contains(value: Int): Boolean {
        return (lowerEndPoint..upperEndPoint).contains(value)
    }

    fun contains(other: ClosedRange): Boolean {
        return contains(other.lowerEndPoint) && contains(other.upperEndPoint)
    }
}
