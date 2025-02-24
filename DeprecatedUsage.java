class LegacyAPI{
    //using deprecated to run old feature
    @Deprecated
    public void oldFeature(){
        System.out.println("OldFeature method is running");
    }
    void newFeature(){
        System.out.println("new Feature method is running");
    }
}
public class DeprecatedUsage {
    public static void main(String[] args) {
        LegacyAPI api=new LegacyAPI();
        api.newFeature();
        api.oldFeature();
    }
}
