public class TheSims {
    private static final BigDecimal BASE_PRICE = new BigDecimal(89);

    public BigDecimal getPrice() {
        return BASE_PRICE;
    }

    @Override
    public String toString() {
        return "TheSims";
    }
}