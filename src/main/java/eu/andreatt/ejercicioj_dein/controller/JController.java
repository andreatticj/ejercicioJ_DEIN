package eu.andreatt.ejercicioj_dein.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Controlador para la interfaz gráfica de la aplicación de automóviles.
 * Maneja la lógica de encendido/apagado de luces y el cambio de color del coche.
 */
public class JController {

    // Elementos de la interfaz que se conectan a través de FXML
    @FXML
    private ImageView azulClaro; // Color azul claro
    @FXML
    private ImageView azulOscuro; // Color azul oscuro
    @FXML
    private ImageView grisClaro; // Color gris claro
    @FXML
    private ImageView grisOscuro; // Color gris oscuro
    @FXML
    private ImageView imgCoche; // Imagen del coche
    @FXML
    private ImageView imgEncenderApagar; // Imagen del botón de encendido/apagado
    @FXML
    private ImageView imgLuces; // Imagen del estado de las luces
    @FXML
    private ImageView miniBlazingRed; // Miniatura rojo ardiente
    @FXML
    private ImageView miniElectricBlue; // Miniatura azul eléctrico
    @FXML
    private ImageView miniMidnightBlack; // Miniatura negro medianoche
    @FXML
    private ImageView miniPepperWhite; // Miniatura blanco pimienta
    @FXML
    private ImageView miniThunderGray; // Miniatura gris trueno
    @FXML
    private ImageView miniVolcaninOrange; // Miniatura naranja volcánico

    private boolean lucesApagadas; // Estado de las luces del coche

    /**
     * Inicializa el controlador y establece el estado inicial de las luces como apagadas.
     */
    @FXML
    void initialize() {
        lucesApagadas = true; // Las luces están apagadas al inicio
    }

    /**
     * Maneja el evento de clic para encender o apagar las luces del coche.
     *
     * @param event El evento de clic del ratón.
     */
    @FXML
    void accionApagarEncender(MouseEvent event) {
        String path1; // Ruta para la imagen de luces encendidas
        String path2; // Ruta para la imagen de luces apagadas

        if (lucesApagadas) { // Si las luces están apagadas
            // Asignar la ruta de la imagen de luces encendidas
            path1 = "/eu/andreatt/ejercicioj_dein/images/autoLuz.png";
            Image imgC = new Image(getClass().getResource(path1).toString());
            imgLuces.setImage(imgC); // Mostrar imagen de luces encendidas

            // Asignar la ruta de la imagen del botón de encender/apagar
            path2 = "/eu/andreatt/ejercicioj_dein/images/lucesOn.png";
            Image imgL = new Image(getClass().getResource(path2).toString());
            imgEncenderApagar.setImage(imgL); // Mostrar imagen de luces encendidas

            lucesApagadas = false; // Actualizar estado de las luces
        } else { // Si las luces están encendidas
            imgLuces.setImage(null); // Ocultar imagen de luces
            path2 = "/eu/andreatt/ejercicioj_dein/images/lucesOff.png"; // Asignar la ruta de la imagen de luces apagadas
            Image imgL = new Image(getClass().getResource(path2).toString());
            imgEncenderApagar.setImage(imgL); // Mostrar imagen de luces apagadas

            lucesApagadas = true; // Actualizar estado de las luces
        }
    }

    /**
     * Maneja el evento de clic para cambiar el color del coche.
     *
     * @param event El evento de clic del ratón.
     */
    @FXML
    void accionCambiarColor(MouseEvent event) {
        ImageView imgViwe = (ImageView) event.getSource(); // Obtener la imagen que fue clickeada
        // Construir la ruta de la imagen correspondiente al color seleccionado
        String path = "/eu/andreatt/ejercicioj_dein/images/" + imgViwe.getId() + ".png"; // Asignar la ruta de la imagen del color
        Image imagen = new Image(getClass().getResource(path).toString()); // Cargar la nueva imagen
        imgCoche.setImage(imagen); // Cambiar la imagen del coche
    }
}
