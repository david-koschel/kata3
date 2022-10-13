package kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay(String title) {
        super(title);
        setContentPane(createPanel());
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        return ChartFactory.createBarChart("Histogram Display", "Dominios emails",
                "Nº emails", dataSet, PlotOrientation.VERTICAL,false, false,
                rootPaneCheckingEnabled);
    }

    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(3, "", "ulpgc.es");
        dataSet.addValue(1, "", "dis.ulpgc.es");
        dataSet.addValue(7, "", "eii.ulpgc.es");
        dataSet.addValue(13, "", "gmail.com");
        dataSet.addValue(5, "", "hotmail.es");

        return dataSet;
    }

    public void execute() {
        setVisible(true);
    }
}
