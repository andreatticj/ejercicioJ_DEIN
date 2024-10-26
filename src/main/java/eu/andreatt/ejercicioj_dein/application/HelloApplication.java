package eu.andreatt.ejercicioj_dein.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * La clase HelloApplication es la clase principal de la aplicación JavaFX.
 * Extiende la clase {@link Application} y define el comportamiento de la
 * interfaz gráfica de usuario (GUI) al iniciar la aplicación.
 */
public class HelloApplication extends Application {

    /**
     * El método start es el punto de entrada de la aplicación. Este método se
     * llama al iniciar la aplicación y se utiliza para configurar la ventana
     * principal.
     *
     * @param stage El escenario principal de la aplicación, que representa
     *              la ventana.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML que define la interfaz de usuario
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/eu/andreatt/ejercicioj_dein/fxml/J.fxml"));

        // Crear la escena a partir del contenido cargado del FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Configurar el título de la ventana
        stage.setTitle("MINI COOPER");
        Image icon = new Image(getClass().getResourceAsStream("/eu/andreatt/ejercicioj_dein/images/Cooper.png")); // Cambia "tu_icono.png" por el nombre de tu imagen
        stage.getIcons().add(icon);
        // Asignar la escena al escenario y mostrar la ventana
        stage.setScene(scene);
        stage.show();
    }

    /**
     * El método main es el punto de entrada de la aplicación. Este método
     * se encarga de lanzar la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos pasados a la aplicación.
     */
    public static void main(String[] args) {
        launch();
    }
}
