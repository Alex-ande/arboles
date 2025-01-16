## Getting Started
Árbol Binario de Búsqueda y Árbol AVL
Este proyecto implementa la inserción de nodos en un Árbol Binario de Búsqueda (BST) y en un Árbol AVL, junto con el cálculo de equilibrio y la rotación de nodos para mantener la propiedad de balanceo de un Árbol AVL.

Estructura
El código está dividido en varias clases y funciones, cada una encargada de una operación específica sobre el árbol. A continuación se describen los principales módulos:

Clases y Funciones
Nodo:
Representa un nodo en el árbol con tres atributos principales: valor, subárbol izquierdo y subárbol derecho.
Árbol Binario de Búsqueda (BST):
insertar(int valor): Inserta un nuevo valor en el árbol siguiendo las reglas de un árbol binario de búsqueda.
buscar(int valor): Busca un valor específico en el árbol.
Árbol AVL:
insertarAVL(int valor): Inserta un valor en el árbol siguiendo las reglas de un árbol binario de búsqueda, pero además mantiene el equilibrio del árbol mediante rotaciones.
rotarIzquierda(Nodo nodo): Realiza una rotación hacia la izquierda en un nodo para equilibrar el árbol.
rotarDerecha(Nodo nodo): Realiza una rotación hacia la derecha en un nodo para equilibrar el árbol.
calcularAltura(Nodo nodo): Calcula la altura de un nodo, que se utiliza para determinar el equilibrio del árbol.
calcularEquilibrio(Nodo nodo): Determina el equilibrio de un nodo, que es la diferencia entre la altura del subárbol izquierdo y el derecho.
Métodos de Equilibrio:
balanceado(Nodo nodo): Verifica si un nodo está balanceado (diferencia de altura entre subárboles izquierdo y derecho es <= 1).
Ejemplos de inserciones y rotaciones:
Se pueden insertar valores de manera secuencial y observar cómo el árbol mantiene su equilibrio a medida que se insertan nuevos nodos. También se pueden visualizar las rotaciones que ocurren para mantener el equilibrio del árbol.
Cómo funciona
El código permite insertar nodos en un Árbol Binario de Búsqueda (BST) y posteriormente convertirlo en un Árbol AVL. El proceso de inserción en un árbol AVL incluye las siguientes etapas:

Inserción en un árbol binario: El valor se inserta siguiendo las reglas del árbol binario de búsqueda:

Los valores menores se colocan a la izquierda.
Los valores mayores se colocan a la derecha.
Verificación de equilibrio: Después de cada inserción, el árbol es evaluado para verificar si está balanceado. Un árbol AVL se considera balanceado si la diferencia entre las alturas de los subárboles izquierdo y derecho de cada nodo es menor o igual a 1.

Rotación para mantener el equilibrio: Si un nodo está desbalanceado (con un balance mayor que 1 o menor que -1), se realizan rotaciones para reequilibrar el árbol:

Rotación simple a la derecha: Se realiza cuando el árbol está desequilibrado en el subárbol izquierdo.
Rotación simple a la izquierda: Se realiza cuando el árbol está desequilibrado en el subárbol derecho.
Rotación doble: Una combinación de rotaciones a la izquierda y a la derecha cuando el árbol presenta un desbalance complejo.
Ejemplo de Ejecución
A continuación se muestra un ejemplo de cómo se inserta un nodo en un Árbol AVL y cómo el árbol se reequilibra:

Insertar el valor 10: El árbol está vacío al principio, por lo que el nodo 10 se convierte en la raíz del árbol.

Insertar el valor 20: El valor 20 es mayor que 10, por lo que se inserta en el subárbol derecho. Después de insertar el nodo, el árbol se mantiene balanceado.

Insertar el valor 15: Al insertar el valor 15, el árbol se desbalancea en el nodo 10. Se realiza una rotación hacia la derecha sobre el nodo 20, y luego una rotación a la izquierda sobre el nodo 10. Esto balancea el árbol.

Insertar otros valores (24, 9, 21, etc.): Los valores se insertan de manera similar y el árbol se ajusta automáticamente mediante rotaciones para mantener el equilibrio.

Uso
Clona o descarga el repositorio en tu máquina local.
Compila el proyecto utilizando tu entorno de desarrollo preferido (por ejemplo, Eclipse o IntelliJ para Java).
Ejecuta el código principal (App.java) para ver cómo se insertan los valores y se realiza el balanceo del árbol.
El árbol resultante puede ser visualizado en formato de texto o utilizando algún visualizador de árboles para mayor claridad.
Requisitos
Java 8 o superior.
Un entorno de desarrollo integrado (IDE) como Eclipse, IntelliJ, o NetBeans.
Dependencias estándar de Java (sin librerías externas adicionales).
Contribuciones
Si deseas contribuir al proyecto, puedes hacer un fork del repositorio y enviar un pull request con mejoras o nuevas funcionalidades.


