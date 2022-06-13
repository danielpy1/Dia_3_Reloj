import java.util.Scanner;

public class RelojDemo {
    public static void main(String[] args) {
        System.out.println("**** Bootcamp Roshka DIA 3 ****");
        System.out.println("Ejercicio 1\n");
        Reloj r=new Reloj();
        r.setReloj(12344);
        System.out.println("setReloj(12344)");
        System.out.println("La hora del reloj es: "+r.toString());
        r.tick();
        System.out.println("La hora del reloj es (Tick): "+r.toString());
        r.tick();
        System.out.println("La hora del reloj es (Tick): "+r.toString());
        System.out.print("\nIntroduzca la hora en segundos por favor: ");
        Scanner input=new Scanner(System.in);
        double hora_usuario=input.nextDouble();
        if(r.setReloj(hora_usuario)){
            System.out.println("La hora del reloj es: "+r.toString()+"\n------------");
            for(int i=0;i<10;i++){
                r.tickDecrement();
                System.out.println("La hora del reloj es: "+r.toString());
            }
            System.out.println("------------");
            Reloj r2=new Reloj(13,55,26);
            System.out.println("Reloj 1: "+r.toString());
            System.out.println("Reloj 2: "+r2.toString());
            System.out.println("La diferencia entre horas es: "+r.restaReloj(r2));
        }
    }
}
