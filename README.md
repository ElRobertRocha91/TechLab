# Proyecto TechLab

Bienvenido a mi proyecto académico, lo desarrolle durante mi participación en el programa de Talento Tech perteneciente al Ministerio de Educación del Gobierno de la Ciudad de Buenos Aires.

## Objetivos del proyecto

El objetivo de este proyecto es desarrollar un SISTEMA DE GESTIÓN, poniendo en practica los conocimientos adquiridos en programación con Java:

Programación Oriendata a Objetos y Principios de diseño:
  - Dividir la lógica en clases y métodos: Producto, Cliente, Pedido y Menú.
  - Emplear encapsulamiento con atributos privados y getters/setters.
  - Herencia y polimorfismo.

Manejo de Excepciones:
 - Manejar con try/catch los errores de conversión de tipo, al ingresar valores no válidos.

Organización en Paquetes y Módulos:
- Separando las clases en paquetes lógicos. Asegurando la escalabilidad del proyecto.

Estructuración del Código y Legibilidad:
- Mantener un código limpio, con nombres descriptivos y funciones cortas, que faciliten su lectura y comprención.
- Evitar métodos excesivamente largos, que mezclen muchas responsabilidades en una sola clase.

### Caracteristicas y funcionalidades

El sistema de gestión tendra: 

1) MENÚ PRINCIPAL INTERACTIVO:
   Con las siguientes opciones:
```
---- SISTEMA DE GESTIÓN - TECHLAB ----
 1) Agregar producto
 2) Listar producto
 3) Buscar producto
 4) Eliminar producto
 5) Crear un pedido
 6) Listar pedidos
 0) Salir
```

2) INGRESAR PRODUCTOS:
   
   Implementara una funcionalidad para agregar productos con:
   - Nombre (String).
   - Precio (double).
   - Cantidad de Stock (int).
   Estos se almacenaran en una collección dinámina (ej: ArrayList<Productos>).

3) VISUALIZAR PRODUCTOS:
   
   Listara todos los productos, mostrando:
   - ID (autogenerado o posición en la lista).
   - Nombre, Precio y Stock.

4) BUSCAR PRODUCTO:
   
   Permitira buscar un producto por ID. Si el producto no existe, mostrara un mensaje de error, caso contrario mostrara su información:
   - Nombre.
   - Precio.
   - Stock.
    Ej: ID: 1 | Café Premiun - $1200.0 - Stock: 100 unidades.

5) ELIMINACIÓN DE PRODUCTO:

   Permitira la eliminación de un poducto por su ID.
   
6) CREACIÓN DE PEDIDOS:
   
    Solicitara datos del cliente antes de su creación para generar la orden:
    - Nombre del cliente.
    - Email de contacto.

    Luego de mostrara la lista de productos disponibles y solicitara al usuario que productos desea seleccionar por su ID.
    Tendra una verificación de stock en caso de haber stock insuficiente y actualizara el stock del producto solicitado.
    
7) LISTAR PEDIDOS GENERADOS:

    Mostrara todos los pedidos generados con el costo total de cada uno de ellos, donde se podra visualizar:
    - Número de Orden (ID).
    - Nombre del cliente.
    - Email de contacto.
    - Costo total del pedido.

## Contacto

Gracias por visitar mi proyecto, si te gusto, me encantaria que me cuentes que mejoras puedo implementar y si tienes una propuesta para desarrollar un proyecto con gusto me encantaria escucharla.

- Gmail: [robertoestebanrocha91@gmail.com](https://www.google.com/intl/es-419/gmail/about/)
- LinkedIn: [Roberto Esteban Rocha](https://www.linkedin.com/in/roberto91)
