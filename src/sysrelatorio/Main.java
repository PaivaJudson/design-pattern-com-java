package sysrelatorio;

import sysrelatorio.implementacaoconcreta.RelatorioExcel;
import sysrelatorio.implementacaofabrica.ExcelFactory;
import sysrelatorio.implementacaofabrica.HTMLFactory;
import sysrelatorio.implementacaofabrica.PDFFactory;

public class Main {
    public static void main(String[] args) {

        RelatorioFactory excelFactory = new ExcelFactory();
        RelatorioFactory pdfFactory = new PDFFactory();
        RelatorioFactory htmlFactory = new HTMLFactory();

        excelFactory.elaborarRelatorio();
        pdfFactory.elaborarRelatorio();
        htmlFactory.elaborarRelatorio();

    }
}
