import java.util.Scanner;

public class proyecto_star_wars {
    //El siguiente enum nos permitirá leer con mayor facilidad el switch
    enum enumeration{DERROTA, FASE1, FASE2, FASE3, FASE4, FASE5, VICTORIA}

    public static void main(String[] args) {
        //El siguiente valor será el valor que comprobará el switch
        int faseNum = 1;
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;
        enumeration fase;

        System.out.print("""
                \u001B[33m      ________________.  ___     .______
                     /                | /   \\    |   _  \\
                    |   (-----|  |----`/  ^  \\   |  |_)  |
                     \\   \\    |  |    /  /_\\  \\  |      /
                .-----)   |   |  |   /  _____  \\ |  |\\  \\-------.
                |________/    |__|  /__/     \\__\\| _| `.________|
                 ____    __    ____  ___     .______    ________.
                 \\   \\  /  \\  /   / /   \\    |   _  \\  /        |
                  \\   \\/    \\/   / /  ^  \\   |  |_)  ||   (-----`
                   \\            / /  /_\\  \\  |      /  \\   \\
                    \\    /\\    / /  _____  \\ |  |\\  \\---)   |
                     \\__/  \\__/ /__/     \\__\\|__| `._______/

                \u001B[0m""");

        System.out.print("""

                === STAR WARS CÓDIGOS SECRETOS ===
                Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke
                Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada
                en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio
                está construyendo para destruirla. (Presiona Intro para continuar)""");

        scanner.nextLine();

        while (jugando) {
            /*la variable faseNum varía en cada case (a excepción de DERROTA y VICTORIA) y se actualiza el valor
            de la variable fase*/
            fase = enumeration.values()[faseNum];
            switch (fase) {
                case DERROTA:
                    System.out.println("""

                            Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(
                            Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!""");
                    jugando = false;
                    break;
                case FASE1:
                    faseNum = fase1(faseNum);
                    break;
                case FASE2:
                    faseNum = fase2(faseNum);
                    break;
                case FASE3:
                    faseNum = fase3(faseNum);
                    break;
                case FASE4:
                    faseNum = fase4(faseNum);
                    break;
                case FASE5:
                    faseNum = fase5(faseNum);
                    break;
                case VICTORIA:
                    System.out.println("""

                            Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a
                            sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se
                            convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea
                            consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan
                            observan por la ventana la imagen de la colosal estrella de la muerte explotando en
                            el silencio del espacio, desapareciendo para siempre junto a los restos del malvado
                            imperio.
                            ¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D""");
                    jugando = false;
                    break;
            }
        }
        System.out.println("\nGracias por jugar :D");

    }
    static boolean EsPrimo(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
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
    static int fase1(int faseNum){
        int S1 = (int) (Math.random() * 9+1);
        int S2 = (int) (Math.random() * (30 - 20 + 1) + 20);
        int solucion = 0;

        System.out.println("""

                Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al
                sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el
                computador tiene problemas para calcular parte de las coordenadas de salto.
                Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.
                Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que
                calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).
                ¿Qué debe introducir?""");

        System.out.println("\nS1:" + S1);
        System.out.println("S2:" + S2+"\n");


        for (int i = S1; i <= S2; i++) solucion += i;

        int respuesta = CastNum();

        if (respuesta == solucion) faseNum++;
        else faseNum = 0;
        return faseNum;

    }
    static int fase2(int faseNum){
        int P1 = (int) (Math.random()*6+1);
        int P2 = (int) (Math.random()*(12-8+1)+8);
        int solucion = 1;

        System.out.println("""

                Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella
                de la muerte. Como van en una nave imperial robada se aproximan lentamente con
                la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí
                agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados
                en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh…
                tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para
                atracar y reparar la nave”. El agente, que no se anda con tonterías, responde
                “Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el
                manual del piloto que estaba en la guantera y da con la página correcta. El código
                es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).
                ¿Cuál es el código?
                """);

        System.out.println("P1:"+P1);
        System.out.println("P2:"+P2+"\n");

        for (int i = P1; i <= P2; i++) solucion*=i;

        int respuesta = CastNum();

        if (respuesta == solucion) faseNum++;
        else faseNum = 0;
        return faseNum;
    }
    static int fase3(int faseNum){
        int N = (int) (Math.random()*(100-50+1)+50);
        int solucion = 1;
        System.out.println("""

                Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se
                equipan con trajes de soldados imperiales que encuentran en la nave para pasar
                desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se
                encuentra el reactor principal. Se dirigen al primer panel computerizado que
                encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita
                introducir una clave de acceso. Entonces recuerda la información que le proporcionó
                Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10
                (redondeando N hacia abajo), donde N es el nº de niveles”.
                ¿Cual es el nivel correcto?
                """);

        System.out.println("N:"+N+"\n");

        for (int i = 1; i<=N/10; i++) solucion*=i;

        int respuesta = CastNum();

        if (respuesta == solucion) faseNum++;
        else faseNum = 0;
        return faseNum;
    }
    static int fase4(int faseNum){
        int P = (int) (Math.random()*(100-10+1)+10);
        boolean valido = false;
        int solucion;

        System.out.println("""

                Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta
                acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para
                intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita
                verificar si el número P es primo o no. Si es primo introduce un 1, si no lo es
                introduce un 0
                """);

        System.out.println("P:"+P+"\n");

        if (EsPrimo(P)) solucion = 1;
        else solucion = 0;
        int respuesta = 0;

        while (!valido){
            respuesta = CastNum();
            if (respuesta == 0 || respuesta ==1) valido = true;
            else System.out.println("Opción incorrecta");
        }

        if (respuesta == solucion) faseNum++;
        else faseNum = 0;
        return faseNum;
    }
    static int fase5(int faseNum){
        int num = (int) (Math.random()*(10-5+1)+5);
        int num2 = (int) (Math.random()*(10-5+1)+5);
        int solucion = 1;
        System.out.println("""

                Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,
                programe el temporizador y salir de allí corriendo. Necesita programarlo para que
                explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar
                antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y
                desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto
                peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar
                el factorial de M y el factorial de S. ¿Qué valor debe introducir?""");
        System.out.println("\nM:"+num);
        System.out.println("S:"+num2+"\n");

        for (int i = 1; i <=num; i++) solucion*=i;

        num = solucion;
        solucion = 1;

        for (int i = 1; i <=num2; i++) solucion*=i;
        solucion+=num;

        int respuesta = CastNum();

        if (respuesta == solucion) faseNum++;
        else faseNum = 0;
        return faseNum;
    }
}

