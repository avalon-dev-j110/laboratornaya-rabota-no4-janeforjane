package ru.avalon.java.dev.j10.labs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {

    public static void main(String[] args) throws ParseException {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = new String[20];

	    strings [0] = "The Shawshank Redemption";
		strings [1] = "The Green Mile";
		strings [2] = "Forrest Gump";
		strings [3] = "Schindler's List";
		strings [4] = "Intouchables";
		strings [5] = "Inception";
		strings [6] = "Léon";
		strings [7] = "The Lion King";
		strings [8] = "Fight Club";
		strings [9] = "La vita è bella";
		strings [10] = "Knockin' on Heaven's Door";
		strings [11] = "The Godfather";
		strings [12] = "Pulp Fiction ";
		strings [13] = "The Prestige";
		strings [14] = "A Beautiful Mind";
		strings [15] = "Interstellar";
		strings [16] = "The Lord of the Rings: The Return of the King";
		strings [17] = "Gladiator";
		strings [18] = "Back to the Future";
		strings [19] = "Lock, Stock and Two Smoking Barrels";

		System.out.println("--------");
		System.out.println("Movies before sort");
		System.out.println("--------");
		for (String string : strings) {
			System.out.println(string);
		}


	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Person[20];

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


	    persons [0] = new Girls("Rachel", sdf.parse("02-05-2004"));
		persons [1] = new Girls("Phoebe", sdf.parse("15-06-2003"));
		persons [2] = new Girls("Monica", sdf.parse("22-12-2000"));
		persons [3] = new Girls("Tinker Bell", sdf.parse("05-01-1999"));
		persons [4] = new Girls("Wendy", sdf.parse("29-08-2001"));
		persons [5] = new Girls("Alice", sdf.parse("31-05-2002"));
		persons [6] = new Girls("Leya", sdf.parse("28-07-2000"));
		persons [7] = new Girls("Moana", sdf.parse("01-02-2005"));
		persons [8] = new Girls("Cinderella", sdf.parse("18-11-1995"));
		persons [9] = new Girls("Ariel", sdf.parse("21-03-1998"));
		persons [10] = new Girls("Jasmine", sdf.parse("26-10-1997"));
		persons [11] = new Girls("Snow White", sdf.parse("15-09-2001"));
		persons [12] = new Girls("Aurora", sdf.parse("25-06-1994"));
		persons [13] = new Girls("Rapunzel", sdf.parse("21-01-2005"));
		persons [14] = new Girls("Tiana", sdf.parse("01-02-2007"));
		persons [15] = new Girls("Merida", sdf.parse("17-12-2006"));
		persons [16] = new Girls("Mulan", sdf.parse("23-11-1996"));
		persons [17] = new Girls("Pocahontas", sdf.parse("08-09-1993"));
		persons [18] = new Girls("Anna", sdf.parse("14-04-2004"));
		persons [19] = new Girls("Elsa", sdf.parse("13-10-2004"));

		System.out.println("--------");
		System.out.println("Girls before sort");
		System.out.println("--------");

		for (Person person : persons) {
			System.out.println(person);
		}



        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new MySort();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
//        Comparator comparator = null;
		Comparator myComp = new MyComp();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);

		System.out.println("--------");
        System.out.println("Girls after sort");
		System.out.println("--------");
		for (Person person : persons) {
			System.out.println(person);
		}



        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);

		System.out.println("--------");
        System.out.println("Movies after sort");
		System.out.println("--------");
		for (String string : strings) {
			System.out.println(string);
		}

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */

        sort.sort(strings, myComp);

		System.out.println("--------");
        System.out.println("Movies after sort descending");
		System.out.println("--------");
		for (String string : strings) {
			System.out.println(string);
		}
    }
}
