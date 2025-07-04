package work2;

public class AccountReportGenerator implements JsonReportGenerator {
    @Override
    public String generateJson() {
        return "{ \"account\": { \"owner\": \"Tanya\", \"balance\": 1000 } }";
    }
}
