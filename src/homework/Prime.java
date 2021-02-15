package homework;

import java.util.*;

import customExceptions.NotNumericInputException;
import customExceptions.OutOfRangeException;

public class Prime {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws OutOfRangeException, NotNumericInputException {
		int toFindUpto;
		System.out.println("Enter number of prime numbers required : ");
		try {
			toFindUpto = scanner.nextInt();
			if (toFindUpto <= 0) {
				throw new NotNumericInputException("Invalid input, Enter a positive Integer value ");
			}

		} catch (InputMismatchException e) {
			throw new NotNumericInputException("Invalid input, Enter a Integer value ");
		}

		int sum = 1;
		int count = 0;
		List li = new ArrayList<>();
		for (int i = 2; i < 100000; i++) {

			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					sum = sum + 1;
				}
			}

			if (sum == 1) {
				li.add(i);
				count++;
			}
			sum = 1;
			if (count == toFindUpto) {
				break;
			}
		}
		System.out.println("Enter the nth number to found ");
		try {
			int nT = scanner.nextInt();
			if (nT <= count) {
				System.out.println("The " + nT + " prime number is: ");
				System.out.println(li.get(nT - 1));
			} else {
				throw new OutOfRangeException(
						"Entered element is not in the range of " + toFindUpto + " prime numbers");

			}
		} catch (InputMismatchException e) {
			throw new NotNumericInputException("Invalid Input, Enter a interger value between 1 to " + toFindUpto);
		}

	}

}

