package class20;

public class FileTester {
    public static void main(String[] args) {
        File f1 = new PdfFile("MyPdfFile",10);
        File f2 = new WordFile("myWordFile",10);
        f1.close();
        f1.edit("My file ");
        f1.open("MyFile",15);
    }
}
