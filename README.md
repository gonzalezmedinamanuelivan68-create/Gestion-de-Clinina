# Gestion-de-Clinina

Aplicación de escritorio desarrollada en JavaFX para la gestión administrativa, médica y operativa de una clínica. Este proyecto implementa interfaces gráficas conectadas a un modelo de clases orientado a objetos, aplicando herencia y el patrón arquitectónico MVC.

## Tecnologías Utilizadas
* **Lenguaje:** Java 
* **Interfaz Gráfica:** JavaFX (Archivos .fxml)
* **Arquitectura:** Patrón MVC (Modelo - Vista - Controlador)
* **Gestión de UI:** Contenedores VBox, HBox, TableView, ComboBox.

## Estructura del Proyecto
El proyecto está dividido en paquetes para separar responsabilidades:
* `edu.utj.dsm.poo.clinica.modelo`: Clases que representan las entidades del negocio (Persona, Médico, Paciente, Cita, etc.).
* `edu.utj.dsm.poo.clinica.controlador`: Clases que gestionan los eventos de la interfaz e instancian los objetos del modelo.
* `src/main/resources/edu/utj/dsm/poo/clinica/...`: Archivos `.fxml` que definen la estructura visual de cada módulo.

## Funcionalidades Implementadas
* **Operaciones CRUD:** Creación, lectura, actualización y eliminación de registros en memoria (sin persistencia en base de datos).
* **Gestión de Estados:** Uso de `ComboBox` para restringir la selección de estados válidos (ej. Estado Clínico, Disponibilidad del Médico, Estatus de Cita).
* **Gestor de Archivos:** Carga de imágenes locales (identificaciones, firmas, radiografías) usando `FileChooser` y visualización previa con `ImageView`.
* **Validación de Formularios:** Alertas visuales para evitar la creación de registros con campos obligatorios vacíos.
* **Manejo de Herencia:** Las interfaces de Paciente, Médico y Administrador alimentan atributos heredados de la clase base `Persona`.


## Autor
**Manuel Ivan González Medina**
Desarrollo de Software Multiplataforma
Universidad Tecnológica de Jalisco (UTJ)
