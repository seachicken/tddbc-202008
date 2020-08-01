data class ClosedRange(val lowerEndPoint: Int, val upperEndPoint: Int) {
    override fun toString(): String {
        return "[$lowerEndPoint,$upperEndPoint]"
    }
}
