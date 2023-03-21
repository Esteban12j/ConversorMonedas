# ¡Bienvenido al primer desafío del Challenge Java!

En esta oportunidad, a los Devs se nos solicitó crear un conversor de divisas utilizando el lenguaje Java. Las características solicitadas por nuestro cliente son las siguientes:

## Descripción del proyecto
El proyecto consiste en un conversor de divisas que permite convertir de la moneda de origen a cinco monedas diferentes (Dólar, Euros, Libras Esterlinas, Yen Japonés, Won sul-coreano) y también convertir de estas monedas de destino a la moneda de origen. Se utilizó la API de Exchange Rates Data API para obtener los datos de conversión y se implementó una interfaz gráfica de usuario para que el usuario pueda realizar las conversiones.

Además, se planteó como desafío extra la posibilidad de agregar otras conversiones, como la conversión de temperaturas, a la aplicación.

## Funcionamiento de la aplicación
La aplicación cuenta con dos combobox, uno para seleccionar la moneda de origen y otro para seleccionar la moneda de destino. También cuenta con dos textareas, uno para ingresar el valor de la moneda de origen y otro para mostrar el resultado de la conversión en la moneda de destino.

Cuando el usuario modifica uno de los textareas, se identifica cuál de ellos fue modificado y se obtiene su valor. Luego, se utiliza la API para obtener los datos de conversión y se realiza el cálculo correspondiente para mostrar el resultado en el otro textarea.

## Capturas de pantalla
![Ventana Conversor Monedas](Imagenes/VentanaConversorMonedas)
![Opciones de Monedas](Imagenes/DespliegueLista)
![Formato de salida de la API](Imagenes/SalidaApi)


## Tecnologías utilizadas
* Java
* API de Exchange Rates Data API
* Swing (para la interfaz gráfica de usuario)
## Planificación del proyecto
El proyecto se planificó utilizando la metodología ágil de desarrollo y se utilizó Trello como herramienta para el seguimiento del progreso de las tareas. A continuación, se muestran algunas capturas de pantalla del tablero de Trello utilizado:
![Trello](Imagenes/Trello)


## Conclusiones
En este proyecto se implementó un conversor de divisas utilizando Java y una API de conversión de monedas. Además, se agregó la posibilidad de convertir temperaturas y se utilizó la metodología ágil de desarrollo para planificar y llevar a cabo el proyecto.

La implementación de la interfaz gráfica de usuario fue un gran desafío, pero permitió obtener una aplicación más amigable para el usuario. Se considera que el proyecto fue unéxito ya que se cumplieron todos los requisitos solicitados por el cliente, y además se agregó una funcionalidad extra que puede ser útil para el usuario.

Una de las principales ventajas de utilizar una API de conversión de monedas es que los valores de conversión se actualizan automáticamente, lo que garantiza que los datos utilizados sean precisos y confiables. Además, el uso de la metodología ágil permitió un desarrollo más eficiente y una mejor gestión del tiempo.

En cuanto a posibles mejoras, se podría agregar la funcionalidad de conversión de otras unidades de medida, como longitud o peso, lo que podría aumentar la utilidad de la aplicación. También se podría trabajar en la optimización del código para mejorar la velocidad de respuesta y la eficiencia del programa.

En resumen, este proyecto demostró la capacidad de implementar una solución funcional utilizando herramientas de programación modernas y metodologías de gestión de proyectos ágiles. El resultado final es una aplicación útil y fácil de usar que cumple con los requisitos del cliente y puede ser mejorada en el futuro para aumentar su funcionalidad.

El autor de este libro es **Jefeson Esteban Quenguan**.
