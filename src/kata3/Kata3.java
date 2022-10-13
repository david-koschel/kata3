package kata3;

public class Kata3 {

    public static void main(String[] args) {
        //MODEL
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("ulpgc.es"); //AUMENTA 1 EN LA ENTRADA PERTINENTE ULPGC
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gmail.com");


        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM DISPLAY", histogram);
        histogramDisplay.execute();
    }
}
