public class Launcher {
    public static void main(String[] args) {
        TheSims base = new TheSims();
        TheSims CatsAndDogs = new TSCatsAndDogs(base);
        TheSims FarmLife = new TSFarmLife(CatsAndDogs);

        for (TheSims Sims4 : List.of(base, CatsAndDogs, FarmLife)) {
            System.out.println(String.format("%s costs %s.", Sims4, (Sims4.getPrice())));
        }
    }
}