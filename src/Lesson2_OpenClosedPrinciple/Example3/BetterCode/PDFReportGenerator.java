package Lesson2_OpenClosedPrinciple.Example3.BetterCode;

public class PDFReportGenerator implements ReportGenerator{

    @Override
    public String generator() {
        return "Generating PDF report...";
    }
}
