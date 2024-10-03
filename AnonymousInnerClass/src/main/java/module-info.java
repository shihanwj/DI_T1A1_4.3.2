module es.ieslosmontecillos.anonymousinnerclass {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens es.ieslosmontecillos.anonymousinnerclass to javafx.fxml;
    exports es.ieslosmontecillos.anonymousinnerclass;
}