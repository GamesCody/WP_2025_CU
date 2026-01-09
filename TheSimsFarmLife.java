public class TheSimsFarmLife extends TheSims {
    private static final BigDecimal FARM_LIFE_PRICE = new BigDecimal(59);
    private final TheSims baseGame;

    public TheSimsFarmLife(TheSims baseGame) {
        this.baseGame = baseGame;
    }

    @Override
    public BigDecimal getPrice() {
        return baseGame.getPrice().add(FARM_LIFE_PRICE);
    }
}
