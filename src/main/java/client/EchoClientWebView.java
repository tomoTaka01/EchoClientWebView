package client;

import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;

/**
 * The Echo Client using WebView
 * 
 * @author tomo
 */
public class EchoClientWebView extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        URL url = getClass().getResource("EchoClient.html");
        engine.load(url.toExternalForm());
        root.setCenter(webView);
        Label label = new Label();
        String javaVer = System.getProperty("java.version");
        label.setText(String.format("Echo Web Client (Java Version:%s)", javaVer));
        root.setTop(label);
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }
    
    public static void main(String... args) {
        launch();
    }
}
