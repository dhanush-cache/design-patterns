package behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        new TransferMoneyTask().execute();
        new GenerateReportTask().execute();
    }
}
