public class Main {
    public static void main(String[] args) {

        BudgetKnifeStore store = new BudgetKnifeStore();

        Knife knife1 = store.orderKnife("steak");
        knife1.showKnife();

        Knife knife2 = store.orderKnife("chefs");
        knife2.showKnife();
    }
}