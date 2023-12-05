module es.ieslosmontecillos.tooltipv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tooltipv2 to javafx.fxml;
    exports es.ieslosmontecillos.tooltipv2;
}