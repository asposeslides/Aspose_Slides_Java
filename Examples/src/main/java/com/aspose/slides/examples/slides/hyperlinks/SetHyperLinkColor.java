package com.aspose.slides.examples.slides.hyperlinks;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class SetHyperLinkColor
{
    public static void main(String[] args)
    {

        //ExStart:SetHyperLinkColor
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Hyperlink();
        Presentation presentation = new Presentation();
        try
        {
            IAutoShape shape1 = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 450, 50, false);
            shape1.addTextFrame("This is a sample of colored hyperlink.");
            shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setHyperlinkClick(new Hyperlink("https://www.aspose.com/"));
            shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getHyperlinkClick().setColorSource(HyperlinkColorSource.PortionFormat);
            shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.RED);
            IAutoShape shape2 = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 200, 450, 50, false);
            shape2.addTextFrame("This is a sample of usual hyperlink.");
            shape2.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setHyperlinkClick(new Hyperlink("https://www.aspose.com/"));

            presentation.save(dataDir + "presentation-out-hyperlink.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetHyperLinkColor
    }
}

