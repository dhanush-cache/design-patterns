package creational.builder;

public class PDFDocumentBuilder implements PresentationBuilder {
    private final PDFDocument document = new PDFDocument();
    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }

    public PDFDocument getDocument() {
        return document;
    }
}
