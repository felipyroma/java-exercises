package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*COVARIANÇA
 * covariância: é quando a operação de get é permitida, porem a de put
 * não é permitida
 * 
 * List<Integer> intList = new ArrayList<Integer>(); intList.add(10);
 * intList.add(5);
 * 
 * List <? extends Number> list = intList
 * 
 * Number x = list.get(0); OK
 * 
 * list.add(20); ERROR
 * 
 * get - OK put - ERROR
 * 
 * 
 * CONTRAVARIANÇA
 * contravariança get - ERROR put - OK
 * 
 * list<Object> myObjs
 * 
 * myObjs.add("Maria"); myObjs.add("Alex");
 * 
 * // qualquer tipo number ou superior a ele, no caso, object List<? super
 * Number> myNums = myObjs;
 * 
 * add 10
 * 
 * number x = myNums.get(0); - ERROR
 * 
 * 
 */

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		printList(myObjs);
		
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
