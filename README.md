# Proyecto TechLab

Bienvenido a mi proyecto académico, lo desarrolle durante mi participación en el programa de Talento Tech perteneciente al Ministerio de Educación del Gobierno de la Ciudad de Buenos Aires.

## Objetivos del proyecto

El objetivo de este proyecto es desarrollar un sistema de gestión para una empresa ficticia conocida como TechLab S.A., líder en servicios de gestión. 
Desarrollando un programa con la funcionalidad de registrar, mostrar y gestionar productos, así como crear pedidos que involucren varios productos, 
poniendo en práctica los conocimientos adquiridos en programación con Java SE 21:

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
=============================================
------- SISTEMA DE GESTIÓN - TECHLAB --------
=============================================
 1) Agregar producto
 2) Listar producto
 3) Buscar producto
 4) Eliminar producto
 5) Crear un pedido
 6) Listar pedidos
 0) Salir
 
 Ingresar una opción: 
```

2) INGRESAR PRODUCTOS:
   
   Implementara una funcionalidad para agregar productos con:
   - Nombre (String).
   - Precio (double).
   - Cantidad de Stock (int).
   
   Estos se almacenaran en una colección dinámina (Ej: ArrayList<Productos>).

```
=============================================
------- INGRESAR PRODUCTOS - TECHLAB --------
=============================================
Nombre del producto: 
Café
Precio del producto:
1200
Ingresar stock: 
500
Producto agregado exitosamente. ✅
```

3) VISUALIZAR PRODUCTOS:
   
   Listara todos los productos, mostrando:
   - ID (autogenerado o posición en la lista).
   - Nombre, Precio y Stock.

```
=============================================
------------ PRODUCTOS - TECHLAB ------------
=============================================
ID: 1 | Café - $1200.0 - Stock: 500
ID: 2 | Mate - $1000.0 - Stock: 250
```

4) BUSCAR PRODUCTO:
   
   Permitira buscar un producto por ID. Si el producto no existe, mostrara un mensaje de error, caso contrario mostrara su información:
   - Nombre.
   - Precio.
   - Stock.
    
   Ej: ID: 1 | Café Premiun - $1200.0 - Stock: 100 unidades.

```
=============================================
--------- BUSCAR PRODUCTO - TECHLAB ---------
=============================================
Ingresar ID del producto: 
5

=============================================
------------ PRODUCTO - TECHLAB -------------
=============================================
Producto inexistente. ❌

=============================================
--------- BUSCAR PRODUCTO - TECHLAB ---------
=============================================
Ingresar ID del producto: 
1

=============================================
------------ PRODUCTO - TECHLAB -------------
=============================================
ID: 1 | Café - $1200.0 - Stock: 500
```

5) ELIMINACIÓN DE PRODUCTO:

   Permitira la eliminación de un producto por su ID.
```
=============================================
------------ PRODUCTO - TECHLAB -------------
=============================================
Ingresar ID del producto a eliminar: 
1

=============================================
------------ PRODUCTO - TECHLAB -------------
============================================= 
Producto eliminado correctamente. ✅
```
   
6) CREACIÓN DE PEDIDOS:
   
    Solicitara datos del cliente antes de su creación para generar la orden:
    - Nombre del cliente.
    - Email de contacto.

    Luego de mostrara la lista de productos disponibles y solicitara al usuario que productos desea seleccionar por su ID.
    Tendra una verificación de stock en caso de haber stock insuficiente y actualizara el stock del producto solicitado.


```
=============================================
-- INGRESE LOS DATOS DEL CLIENTE - TECHLAB --
=============================================
Nombre del cliente:
Roberto
Email del cliente:
roberto@gmail.com

=============================================
------------ PRODUCTOS - TECHLAB ------------
=============================================
ID: 1 | Café - $1200.0 - Stock: 500
ID: 2 | Mate - $1000.0 - Stock: 250
Ingresar ID del producto a agregar (0 para terminar):
1
Ingresar la cantidad del producto a agregar:
50
Producto agregado exitosamente. ✅

=============================================
------------ PRODUCTOS - TECHLAB ------------
=============================================
ID: 1 | Café - $1200.0 - Stock: 450
ID: 2 | Mate - $1000.0 - Stock: 250
Ingresar ID del producto a agregar (0 para terminar):
2
Ingresar la cantidad del producto a agregar:
300
Error al solicitar el producto: 
El stock de este producto es insuficiente para agregar al pedido. ❌

=============================================
------------ PRODUCTOS - TECHLAB ------------
=============================================
ID: 1 | Café - $1200.0 - Stock: 450
ID: 2 | Mate - $1000.0 - Stock: 250
Ingresar ID del producto a agregar (0 para terminar):
2
Ingresar la cantidad del producto a agregar:
50
Producto agregado exitosamente. ✅

=============================================
------------ PRODUCTOS - TECHLAB ------------
=============================================
ID: 1 | Café - $1200.0 - Stock: 450
ID: 2 | Mate - $1000.0 - Stock: 200
Ingresar ID del producto a agregar (0 para terminar):
0
Pedido creado con exito. ✅
```
    
7) LISTAR PEDIDOS GENERADOS:

    Mostrara todos los pedidos generados con el costo total de cada uno de ellos, donde se podra visualizar:
    - Número de Orden (ID).
    - Nombre del cliente.
    - Email de contacto.
    - Costo total del pedido.

```
=============================================
------------- PEDIDOS - TECHLAB -------------
=============================================
Pedido #1 - Cliente: Roberto - Email: roberto@gmail.com - Total: $110000.0
Pedido #2 - Cliente: José - Email: jose@gmail.com - Total: $50000.0
```

## Contacto

Gracias por visitar mi proyecto, si te gusto, me encantaria que me cuentes que mejoras puedo implementar y si tienes una propuesta para desarrollar un proyecto con gusto me encantaria escucharla.

- Gmail: [robertoestebanrocha91@gmail.com](https://www.google.com/intl/es-419/gmail/about/)
- LinkedIn: [Roberto Esteban Rocha](https://www.linkedin.com/in/roberto91)
