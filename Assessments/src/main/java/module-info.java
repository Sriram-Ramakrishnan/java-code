module com.packages.assessments {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.packages.assessments to javafx.fxml;
    exports com.packages.assessments;
}