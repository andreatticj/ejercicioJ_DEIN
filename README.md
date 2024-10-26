# ejercicioJ_DEIN 

## Descripción

`ejercicioJ_DEIN` es una aplicación JavaFX diseñada para simular la gestión de un automóvil, permitiendo al usuario encender/apagar las luces y cambiar el color del coche a través de una interfaz gráfica de usuario (GUI) intuitiva. La aplicación utiliza FXML para definir la interfaz y ofrece una experiencia interactiva al usuario.

## Características

    - **Interfaz Gráfica**: Utiliza JavaFX para una experiencia visual atractiva.
    - **Encendido/Apagado de Luces**: Permite al usuario encender y apagar las luces del coche.
    - **Cambio de Color del Coche**: Ofrece opciones para cambiar el color del coche a través de imágenes interactivas.
    - **Gestión de Imágenes**: Carga imágenes de forma dinámica según las acciones del usuario.

## Estructura del proyecto

    1. eu/andreatt/ejercicioj_dein/application `HelloApplication.java`: carga el archivo FXML y muestra la interfaz gráfica.
    2. eu/andreatt/ejercicioj_dein/images Archivos de imagen que se utilizan en la interfaz, como imágenes de coches y luces. Estas imágenes se cargan en la aplicación a través de las rutas especificadas en el código.
    3. eu/andreatt/ejercicioj_dein/controller `JController.java`: Clase que actúa como controlador para la ventana definida en el archivo FXML. Maneja eventos como clics del ratón para encender/apagar luces y cambiar el color del coche.
    4. eu/andreatt/ejercicioj_dein/fxml 'J.fxml`: Archivo que describe la disposición de los elementos de la interfaz (como botones, imágenes, etc.) utilizando el lenguaje de marcado FXML. Este archivo se carga en el controlador correspondiente (`JController.java`) para crear la interfaz visual que los usuarios interactuarán.

## Requisitos

    - JDK 11 o superior.
    - Maven para la gestión de dependencias.
    - JavaFX 11 o superior.

## Instalación

      Clona o descarga el repositorio a tu máquina local.
      Abre el proyecto en tu IDE y asegúrate de tener configurado el JDK y JavaFX correctamente.
      Ejecuta la clase HelloApplication para iniciar la aplicación.
      Interactúa con la interfaz para agregar, modificar o eliminar personas de la lista.
