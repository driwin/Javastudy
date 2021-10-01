module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens top.driwin.java.jfx.ctrl to javafx.fxml;
    exports top.driwin.java.jfx;
}