#Mediator
Un Mediator es un patrón de diseño que define un objeto que hace de procesador central, coordinando las relaciones entre sus asociados o participantes. Permite la interacción de varios objetos, sin generar acoples fuertes en esas relaciones. Todos los objetos se comunican con un mediador y es éste quién realiza la comunicación con el resto.

Cuando muchos objetos interactúan con otros objetos, se puede formar una estructura muy compleja, con muchas conexiones entre distintos objetos. En un caso extremo cada objeto puede conocer a todos los demás objetos. Para evitar esto, el patrón Mediator, encapsula el comportamiento de todo un conjunto de objetos en un solo objeto.

##Usar el patrón Mediator cuando:
Un conjunto grande de objetos se comunica de una forma bien definida, pero compleja.
Reutilizar un objeto se hace difícil por que se relaciona con muchos objetos.
Las clases son difíciles de reutilizar porque su función básica esta entrelazada con relaciones de dependencia.

##Consecuencias
* **Desacopla a los colegas:** el patrón Mediator promueve bajar el acoplamiento entre colegas. Se puede variar y reusar colegas y mediadores independiéntemente.
* **Simplifica la comunicación entre objetos:** los objetos que se comunican de la forma "muchos a muchos" puede ser remplazada por una forma "uno a muchos" que es menos compleja y más elegante. Además esta forma de comunicación es más fácil de entender. Es decir, un objeto no necesita conocer a todos los objetos, tan sólo a un mediador.
* **Clarifica como los objetos se relacionan en un sistema.**
* **Centraliza el control:** el mediador es el que se encarga de comunicar a los colegas, este puede ser muy complejo, difícil de entender y modificar. Para que quién conoce el framework Struts, es muy similar al concepto del archivo struts-config.xml: centraliza el funcionamiento de la aplicación, aunque si llega a ser una aplicación muy compleja el archivo se vuelve un tanto complicado de entender y seguir.

![Diagrama de clases](https://sourcemaking.com/files/v2/content/patterns/Mediator__1.png)
