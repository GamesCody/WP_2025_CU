public class TheSimsCatsAndDogs extends TheSims {
    private static final BigDecimal CATS_AND_DOGS_PRICE = new BigDecimal(29);

    public TheSimsCatsAndDogs(TheSims baseGame) {
        this.baseGame = baseGame;
    }

    @Override
    public BigDecimal getPrice() {
        return baseGame.getPrice().add(CATS_AND_DOGS_PRICE);
    }
}