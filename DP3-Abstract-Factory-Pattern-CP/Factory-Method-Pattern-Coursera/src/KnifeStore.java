public abstract class KnifeStore {

    public Knife orderKnife(String knifeType) {
        Knife knife;

        // now creating a knife is a method in the class
        knife = createKnife(knifeType);

        // prepare the Knife
        knife.sharpen();
        knife.polish();
        knife.packaged();

        return knife;
    }
    abstract Knife createKnife(String type);
}
