public class BudgetKnifeStore extends KnifeStore{
    // up to any subclass of KnifeStore to define this method
    @Override
    Knife createKnife(String knifeType) {
        if (knifeType.equalsIgnoreCase("steak")) {
            return new BudgetSteakKnife();
        } else if (knifeType.equalsIgnoreCase("chefs")) {
            return new BudgetChefsKnife();
        }
        return null;
    }
}
