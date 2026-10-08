

//EJERCICIO1

/*Se pide modificar el código a fin de eliminar los errores de compilación existentes. Los errores de
compilación tienen que ver con el manejo de tipos de datos básicos. Las modificaciones se
realizarán sobre el método ejercicio01() de la clase Apartado030101.
*/

import java.math.BigDecimal;

public void ejercicio01() {
    // 1. 'Int' con mayúscula es incorrecto. Los tipos primitivos van en minúscula ('int').
    int entero = 6;

    // 2. 1.000 es un literal de tipo double/decimal, no se puede asignar a un long sin casting.
    // Además, para literales long se suele añadir la sufijo 'L'.
    long otroEntero = 1000L;

    // 3. 7.0 es decimal (double), no puede ser asignado a un tipo entero (long).
    double decimal = 7.0;

    // 4. Correcto (double admite literales decimales).
    double otroDecimal = 7.0;

    // 5. 10000 supera el rango permitido para un byte (-128 a 127).
    byte enteroDe8Bits = 100; 

    // 6. Los caracteres simples van entre comillas simples ('a'), no sin comillas.
    char caracter = 'a';

    // 7. Las comillas dobles "a" son para un String, no para un char.
    String otrocaracter = "a";

    // 8. "true" entre comillas es un String. El tipo boolean lleva los literales true o false sin comillas.
    boolean booleano = true;

    // 9. 50000 supera el rango permitido para un short (-32768 a 32767).
    short enteroDe16Bits = 30000;

    // 10. 'static' es una palabra reservada de Java, no puede usarse como nombre de variable.
    byte unByte = 5;

    // 11. 'int' es una palabra reservada del lenguaje.
    byte otroByte = 3;

    // 12. El guion medio '-' es el operador de resta. No está permitido en nombres de identificadores.
    double otra_variable = 2.0;
}

//EJERCICIO2

//Se pide completar el código a fin de determinar el tipo de dato más adecuado para cada literal. 

public void ejercicio02() {
    int variable1 = 637;          // Entero estándar
    long variable2 = 637L;        // Entero largo (sufijo L)
    double variable3 = 6.37;      // Decimal estándar por defecto
    float variable4 = 6.37f;      // Decimal de simple precisión (sufijo f)
    double variable5 = 6.37d;     // Decimal de doble precisión (sufijo d)
    char variable6 = '6';         // Carácter individual entre comillas simples
    String variable7 = "6.37";    // Cadena de texto entre comillas dobles
    char variable8 = 'a';         // Carácter individual
    String variable9 = "a";       // Cadena de texto de un solo carácter
    boolean variable10 = true;    // Valor lógico/booleano
}

//EJERCICIO3

//Se pide definir variables que permitan representar la información referida en los comentarios

public void ejercicio03() {
    // Número de asignaturas de un curso
    int numAsignaturas = 6;

    // Nota media de la asignatura
    double notaMedia = 7.5;

    // Edad de una persona
    int edad = 20;

    // Salario mensual de un empleado
    double salarioMensual = 1500.50;

    // Nombre de una asignatura
    String nombreAsignatura = "Programación I";

    // Constante PI
    final double PI = 3.141592653589793;

    // Constante VERDADERO
    final boolean VERDADERO = true;

    // Portal de la dirección de una vivienda
    int portal = 12;

    // Piso de la dirección de una vivienda
    int piso = 3;

    // Puerta de la dirección de una vivienda
    char puerta = 'A';
}

//EJERCICIO4

/*Se pide:
§ Compilar y ejecutar el método ejercicio04() de la clase Apartado030101.
§ Analizar los resultados obtenidos.
§ Explicar en el fichero LEEME.TXT el porqué de los resultados */

public void ejercicio04() {
    double valor1 = 2.8;
    double valor2 = 1.5;
    double resultado = valor1 - valor2;
    System.out.println(valor1 + " - " + valor2 + " = " + resultado);
}


//EJERCICIO5

/*Se pide:
§ Compilar y ejecutar el método ejercicio05() de la clase Apartado030101.
§ Analizar los resultados obtenidos.
§ Explicar en el fichero LEEME.TXT el porqué de los resultados.
*/

public void ejercicio05() {
    BigDecimal valor1 = new BigDecimal("2.8");
    BigDecimal valor2 = new BigDecimal("1.5");
    System.out.println(valor1 + " - " + valor2 + " = " + valor1.subtract(valor2));
}

//OPERADORES

//EJERCICIO6

public void ejercicio06() {
    final int CONST = 128;
    int op1 = 5; // Le asignamos un valor inicial para poder operar
    int op2;
    int resultado;

    // Preincrementa op1 y multiplícalo por 12
    // ++op1 incrementa op1 en 1 antes de multiplicar
    op1 = ++op1 * 12;

    // El valor de op2 es la suma op1 predecrementado con CONST
    // --op1 decrementa op1 en 1 antes de sumarlo a CONST
    op2 = --op1 + CONST;

    // Halla el resto de dividir op2 entre op1 y guárdalo en resultado
    resultado = op2 % op1;

    // Muestra por pantalla los valores de op1, op2 y resultado
    System.out.println("op1: " + op1 + ", op2: " + op2 + ", resultado: " + resultado);
}

//EJERCICIO7


public void ejercicio07() {
    int edad = 45;
    int numeroPartes = 1;
    boolean deportivo = false;
    boolean rebaja;

    // Condición 1: Edad entre 40 y 60 (ambos inclusive) Y menos de 3 partes
    boolean condicion1 = (edad >= 40 && edad <= 60) && (numeroPartes < 3);

    // Condición 2: Mayor de 20 años, como mucho 1 parte Y no es deportivo
    boolean condicion2 = (edad > 20) && (numeroPartes <= 1) && (!deportivo);

    // Se cumple una u otra condición
    rebaja = condicion1 || condicion2;

    System.out.println("Rebaja = " + rebaja);
}


//EJERCICIO08

public void ejercicio08() {
    int segundos, horas, minutos;
    int totalsegundos = 56000;

    // Una hora equivale a 3600 segundos (60 min * 60 s)
    horas = totalsegundos / 3600;

    // Obtenemos los segundos sobrantes tras calcular las horas completas (totalsegundos % 3600)
    // y los dividimos entre 60 para obtener los minutos completos
    minutos = (totalsegundos % 3600) / 60;

    // Los segundos restantes que no llegan a formar un minuto son el resto de dividir por 60
    segundos = totalsegundos % 60;

    System.out.println(horas + "h " + minutos + "m " + segundos + "s ");
}

//OPERACIONES MATEMATICAS


//EJERCICIO09

public void ejercicio09() {
    double resultado = Math.sqrt(256);
    System.out.println("La raíz cuadrada de 256 es: " + resultado);
}


//EJERCICIO10
public void ejercicio10() {
    double resultado = Math.pow(9, 3);
    System.out.println("9 elevado al cubo es: " + resultado);
}


//EJERCICIO11

public void ejercicio11() {
    // Math.random() genera un double aleatorio en el intervalo [0.0, 1.0)
    // Para cambiar de intervalo: limiteInferior + Math.random() * (limiteSuperior - limiteInferior)
    double aleatorio = 5 + Math.random() * (10 - 5);
    
    System.out.println("Número aleatorio entre 5 y 10: " + aleatorio);
}


//EJERCICIO12

public void ejercicio12() {
    double radio = 10;
    
    // Fórmula: Área = PI * radio^2
    double superficie = Math.PI * Math.pow(radio, 2);
    
    System.out.println("La superficie del círculo es: " + superficie);
}
