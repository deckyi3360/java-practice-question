public class ColdBox extends StorageUnit implements Refrigerated{
    int temp = 0;
    @Override
    public void adjustTemp(int t) {
        temp = t;
        System.out.println("the current temperature: "+ t);
    }
}
