# javaPoo
Prácticas con Programación Orientada a Objetos en JAVA

## Estructura del Proyecto

El proyecto implementa un sistema de dispositivos inteligentes utilizando herencia y polimorfismo en Java.

### Clase Base: SmartDevice
- **Archivo:** `src/main/java/poo/SmartDevice.java`
- **Descripción:** Clase abstracta que representa un dispositivo inteligente genérico. Define los atributos comunes a todos los dispositivos (sistema operativo, versión, fabricante, modelo, peso, pantalla, procesador y memoria).
- **Herencia:** Es la clase padre de SmartPhone y SmartWatch.

### Clase derivada: SmartPhone
- **Archivo:** `src/main/java/poo/SmartPhone.java`
- **Descripción:** Extiende SmartDevice Añade atributos específicos: `phone` (indica si tiene capacidad telefónica) y `operador` (operadora móvil).
- **Herencia:** Hereda de SmartDevice.

### Clase derivada: SmartWatch
- **Archivo:** `src/main/java/poo/SmartWatch.java`
- **Descripción:** Extiende SmartDevice. Añade atributos específicos: `watch` (indica si es un reloj) y `correa` (material de la correa).
- **Herencia:** Hereda de SmartDevice.

### Clase Main
- **Archivo:** `src/main/java/poo/Main.java`
- **Descripción:** Clase principal que instancia SmartPhone y SmartWatch, y muestra sus atributos por consola.

## Errores corregidos

1. **SmartPhone.java:** Typo en el parámetro `opeardor` → `operador`
2. **SmartPhone.java:** Constructor ahora llama correctamente al constructor padre `super()` en lugar de asignar campos manualmente
3. **SmartWatch.java:** Constructor ahora llama correctamente al constructor padre `super()`
4. **Main.java:** Errores ortográficos "inteligentel" → "inteligente"