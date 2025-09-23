module se.kth.karark.labb3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.kth.karark.labb3 to javafx.fxml;
    exports se.kth.karark.labb3;
}