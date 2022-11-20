public class KnifeStore {

    private final KnifeFactory factory;

    // require a KnifeFactory object to be passed
    // to this constructor:
    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife;

        // use the create method in the factory
        knife = factory.createKnife(knifeType);

        // prepare the Knife
        knife.sharpen();
        knife.polish();
        knife.packaged();

        return knife;
    }

    public static void main(String[] args) {
        KnifeStore store = new KnifeStore(new KnifeFactory());

        Knife knife1 = store.orderKnife("Steak");
        knife1.showKnife();

        Knife knife2 = store.orderKnife("chefs");
        knife2.showKnife();
    }
}
