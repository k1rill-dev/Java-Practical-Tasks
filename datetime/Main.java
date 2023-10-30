package datetime;

//12 Составить описание класса для представления
//        времени. Предусмотреть возможности установки времени и
//        изменения его отдельных полей (час, минута, секунда) с
//        проверкой допустимости вводимых значений. В случае
//        недопустимых значений полей выбрасываются исключения.
//        Создать методы изменения времени на заданное количество
//        часов, минут и секунд.

//import org.openjdk.jol.vm.VM;

import javax.management.BadAttributeValueExpException;

public class Main {
    public static void main(String[] args) throws BadAttributeValueExpException {
        Time time = new Time(23, 4, 3);
//        System.out.println(VM.current().addressOf(time));
        System.out.println(time);
        time.changeTime(6, 31, 52);
        System.out.println(time);
//        System.out.println(VM.current().addressOf(newTime));
    }
}