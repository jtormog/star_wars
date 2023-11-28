# Documentación

El código de este ejercicio consta de:

- Un enum con el proposito de facilitar la lectura del switch
- Un while del cual el usuario saldrá al finalizar el juego
- un switch (dentro del while) donde encontraremos todas las fases del juego

El switch llama a diferentes metodos nombrados acorde a la fase que representan para que sea más sencillo de entender con una lectura

En cada metodo se han nombrado las variables del mismo modo que son nombradas en los enunciados, los cinco metodos correspondientes a las fases contienen las siguientes lineas donde se comprueba el resultado que el usuario escribe por consola y la solución del problema:

````java
    int respuesta = CastNum();
    
    if (respuesta == solucion) faseNum++;
    else faseNum = 0;
    return faseNum;
````

Estas líneas hacen referencia al método CastNum() el cual retorna un int, CastNum() pide un número por teclado y si este no se puede convertir en int dirá que se esperaba un número entero y volverá a pedirlo, este metodo está hecho para prevenir que el programa finalice la ejecución por una excepción al hacer casting de Scanner a int.

````java
    static int CastNum(){
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        int num = 0;
        while (!valido){
            try {
                num = scanner.nextInt();
                valido = true;
            }catch (Exception e){
                System.out.println("Se esperaba un número entero");
                scanner.next();
            }
        }
        return num;
    }
````

El programa también comprueba si un número es primo o no a través de un método boolean:

````java
    static boolean EsPrimo(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
````

En la Fase 4, dónde queremos saber si un número es o no primo el programa prevee que el usuario pueda escribir otra opción mediante el uso de un while que solo cesará si el usuario ha escrito una opción valida.

````java
while (!valido){
            respuesta = CastNum();
            if (respuesta == 0 || respuesta ==1) valido = true;
            else System.out.println("Opción incorrecta");
        }
````




