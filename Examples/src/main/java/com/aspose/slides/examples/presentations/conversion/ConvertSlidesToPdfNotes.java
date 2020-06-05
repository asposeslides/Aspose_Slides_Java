package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class ConvertSlidesToPdfNotes
{
    public static void main(String[] args)
    {
        //ExStart:ConvertSlidesToPdfNotes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation(dataDir + "SelectedSlides.pptx");
        Presentation auxPresentation = new Presentation();

        ISlide slide = presentation.getSlides().get_Item(0);

        auxPresentation.getSlides().insertClone(0, slide);

        // Setting Slide Type and Size 
        //auxPresentation.getSlideSize().setSize(presentation.getSlideSize().getSize().getWidth(), presentation.getSlideSize().getSize().getHeight(),SlideSizeScaleType.EnsureFit);
        auxPresentation.getSlideSize().setSize(612F, 792F, SlideSizeScaleType.EnsureFit);


        PdfOptions pdfOptions = new PdfOptions();
        INotesCommentsLayoutingOptions options = pdfOptions.getNotesCommentsLayouting();
        options.setNotesPosition(NotesPositions.BottomFull);


        auxPresentation.save(dataDir + "PDFnotes_out.pdf", SaveFormat.Pdf, pdfOptions);
        //ExEnd:ConvertSlidesToPdfNotes
    }
}

