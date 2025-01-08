# Conversor de Monedas

## Descripción del Proyecto
El Conversor de Monedas es una aplicación desarrollada en Java que permite realizar conversiones entre diferentes monedas. 

### Monedas soportadas:
- Dólar a Peso Argentino
- Peso Argentino a Dólar
- Dólar a Real Brasileño
- Real Brasileño a Dólar
- Dólar a Peso Colombiano
- Peso Colombiano a Dólar

Este proyecto fue creado como parte del módulo "Java Orientado a Objetos" del programa ONE Oracle Next Education de Alura LATAM, con el propósito de afianzar los conocimientos en programación adquiridos durante el curso.

---

## Requisitos Previos
- **Java:** Versión 21.0.4
- **IDE:** IntelliJ IDEA (o cualquier otro compatible con Java 21.0.4)

---

## Configuración del Proyecto

1. **Clonar el Repositorio**:
   ```bash
   git clone https://github.com/KeVO-99/conversor-de-monedas.git
   ```
2. **Abrir en IntelliJ IDEA**:
   - Abre IntelliJ IDEA.
   - Selecciona `File > Open` y elige la carpeta raíz del proyecto.
3. **Configurar el SDK**:
   - Ve a `File > Project Structure...`.
   - En la sección `Project Settings`, selecciona el SDK `JDK 21.0.4`.
4. **Ejecutar el Proyecto**:
   - Busca la clase `Main` que contiene el método `public static void main(String[] args)`.
   - Haz clic derecho en la clase y selecciona `Run` para iniciar la aplicación.

---

## Uso del Programa
1. Una vez iniciado el programa, aparecerán opciones en la consola para elegir el tipo de conversión de moneda.
2. Escribe el número correspondiente a la conversión deseada.
3. Ingresa el monto que deseas convertir.
4. El programa mostrará el resultado de la conversión.
5. Puedes continuar eligiendo opciones de conversión o seleccionar la opción "salir" para finalizar la aplicación.

---

## Funcionalidades Principales
- **Conversiones Disponibles:**
  - Ver apartado "Monedas soportadas" en la descripción.
- **Validaciones:**
  - Solo se aceptan números del 1 al 7 en las opciones del menú.
  - Cualquier número menor que 1 o mayor que 7 se considera una opción inválida.

---

## Tecnologías y Librerías
- **Librerías:**
  - `gson-2.11.0`: Para trabajar con datos en formato JSON.
- **API:**
  - `Exchange Rate API`: Para obtener tasas de cambio en tiempo real y garantizar la precisión de las conversiones.

---

## Créditos
El proyecto fue desarrollado por **Kevin Velazquez Ocampo** como parte del programa ONE Oracle Next Education de Alura LATAM. 

### Reconocimientos
Quiero agradecer a:
- Los profesores del equipo Alura LATAM por transmitir sus conocimientos y guiar a los estudiantes.
- Todo el equipo de Alura LATAM por hacer posible el programa ONE Oracle Next Education, que brinda oportunidades de formación en tecnología a quienes más lo necesitan.
