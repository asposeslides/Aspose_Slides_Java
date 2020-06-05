package com.aspose.slides.examples.charts;

import com.aspose.slides.Chart;
import com.aspose.slides.ChartType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class GetWidthHeightFromChartPlotArea
{
    public static void main(String[] args)
    {
        //ExStart:GetWidthHeightFromChartPlotArea
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation(dataDir + "test.Pptx");
        try
        {
            Chart chart = (Chart) pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 350);
            chart.validateChartLayout();

            double x = chart.getPlotArea().getActualX();
            double y = chart.getPlotArea().getActualY();
            double w = chart.getPlotArea().getActualWidth();
            double h = chart.getPlotArea().getActualHeight();

            // Save presentation with chart
            pres.save(dataDir + "Chart_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }


        //ExEnd:GetWidthHeightFromChartPlotArea
    }
}
