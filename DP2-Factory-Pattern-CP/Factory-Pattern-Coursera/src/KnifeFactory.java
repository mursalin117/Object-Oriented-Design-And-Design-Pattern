public class KnifeFactory {
    public Knife createKnife(String knifeType) {
        Knife knife = null;
        // create Knife object
        if (knifeType.equalsIgnoreCase("steak")) {
            knife = new SteakKnife();
        } else if (knifeType.equalsIgnoreCase("chefs")) {
            knife = new ChefsKnife();
        }
        return knife;
    }
}
