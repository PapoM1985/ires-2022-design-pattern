package it.euris.ires.exercises.template;

public class Main {

  public static void main(String[] args) {

    PdfDocument pdf = new PdfDocument();
    String currentData = pdf.extractData();
    PdfAnalyzer pdfAnalyzer = new PdfAnalyzer();
    int currentAnalysis = pdfAnalyzer.analyze(currentData);
    System.out.println("Document analysis value is: " + currentAnalysis);

    XlsDocument xls = new XlsDocument();
    currentData = xls.extractData();
    XlsAnalyzer xlsAnalyzer = new XlsAnalyzer();
    currentAnalysis = xlsAnalyzer.analyze(currentData);
    System.out.println("Document analysis value is: " + currentAnalysis);

    TextDocument text = new TextDocument();
    currentData = text.extractData();
    TextAnalyzer textAnalyzer = new TextAnalyzer();
    currentAnalysis = textAnalyzer.analyze(currentData);
    System.out.println("Document analysis value is: " + currentAnalysis);
  }
}
