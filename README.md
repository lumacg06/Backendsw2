# Proyecto Backends2

¡Bienvenido a mi Proyecto Backends2! Este es un repositorio donde la magia y el deseo por aprender se han hecho presentes y como resultado de ello, se ha creado este maravilloso proyecto, que es tan solo el inicio a grandes cosas.

## Descripción 

- La creacion de la API **backends2** está diseñada para llevar un registro del tipo de cafe que se maneja en cada finca en zona rural, con el fin de tener presente el tipo de cafe que sale de cada finca y medir su calidad.

## Resumen Ejecutivo

**Proyecto Backends2** es una iniciativa innovadora que busca revolucionar la manera en que las fincas cafeteras en zonas rurales gestionan y registran la calidad de su café. Este proyecto nace de la pasión por el aprendizaje y el deseo de crear soluciones tecnológicas que tengan un impacto real en la industria del café.

Con la API **backends2**, ofrecezco una herramienta poderosa y fácil de usar que permite a los productores de café llevar un registro detallado del tipo y calidad del café producido en cada finca. Mi objetivo es proporcionar una plataforma que no solo facilite la gestión de datos, sino que también ayude a mejorar la calidad del café a nivel mundial.

Este proyecto está en constante desarrollo, evolucionando con las contribuciones de una comunidad dedicada y el liderazgo experto de mi mentor. Estoy comprometida con la excelencia y la innovación, y emocionada de ver cómo **Proyecto Backends2** se convierte en una herramienta indispensable para la industria cafetera.

### Estado del proyecto 

- Actualmente el proyecto se encuentra en desarrollo, a la espera de un front en el cual se esta trabajando de la mano con el docente con mucho esfuerzo y dedicación. 

#### Requisitos del  entorno 

- Para trabajar en el proyecto backends2 requieres tener instalado en tu equipo Visual Studio Code.
- En tu Visual Studio Code deberas descargar la extensión de Spring Boot Extensión Pack para trabajar con el entorno de Spring Boot.
- Tambien deberas instalar la Extension Pack for Java, para trabajar con este lenguaje de programación.
- Para completar tu area de trabajo instala en Visual Studio Code la extensión Thunder Client.
- Deberas tener una base de datos como MySQL, en este caso se ha utilizado MySQL Workbench.

##### Instalación y Funcionamiento

Para comenzar a trabajar con **Proyecto Backends2**, sigue estos pasos:

1. Clona el repositorio
2. Navega a la carpeta del proyecto
3. Instala las dependencias necesarias.
4. Abre `http://localhost:8080/api/registrob/` en tu navegador para ver la aplicación en funcionamiento.

###### Tecnologias utilizadas 

1. Visual Studio Code.
2. Extension Spring boot.
3. Extension Thunder Client.
4. Extension Java.
5. My MySQL Workbench.
6. Extension BlackBox


**Bugs conocidos y soluciones**

- El error principal se encontraba en la conexion a la base de datos, en la carpeta resources en el __archivo aplication.properties__ este error se debia a que el __spring.datasource.url__ no estaba correctamente lo cual no nos dejaba tener una conexion limpia con la base de datos y no permitia que apareciera la tabla registros, este error se soluciono estableciendo correctamente la url.

- Se tuvo un error en la carpeta __RegistroController__, en la linea 27, debido a que no se estaban listando los registros correctamente a causa de que no se estaba importando la libreria java.util.List, el error fue solucionado importando la libreria y cambiando la escritura de la linea de codigo 27.

***Contribuciones*** 

Las contribuciones son bienvenidas y apreciadas en este proyecto.

- Reportar bugs: Utilizando la sección de issues para reportar bugs. Por favor, incluye toda la información relevante para reproducir el problema.
- Sugerir  mejoras: Si tienes sugerencias para mejorar el proyecto no dudes en expresarlas abriendo un issues.
- Documentación: Si eres bueno con la documentacion y deseas mejorarla tu contribucion sera muy valiosa.
- Ayuda con el diseño: Si tienes habilidades de diseño y quieres mejorar la interfaz de usuario del proyecto, tu ayuda sera bien recibida.

****Contacto****

- Si tienes preguntas acerca del proyecto no dudes en contactarme.
- Correo Electronico: luisa.chavarria2@correo.tdea.edu.co

*****Agradecimientos***** 

Quiero expresar mi más sincero agradecimiento a:

- **Daniel Agudelo**, por sus valiosas contribuciones y apoyo incondicional en el desarrollo de este proyecto y su excelente manera de enseñar hace que todo el proceso de aprendizaje sea mucho mas ameno. 

