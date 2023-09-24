package Coding_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array_Elements {

	// private int i;

	public static int create_array(int arr[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();

		// Add elements in array

		System.out.println("enter elements of array");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// print elemnents of array

		for (int i = 0; i < n; i++) {
			System.out.println("elements of array are:" + arr[i]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				int temp = 0;

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		// print sorted array
		for (int i = 0; i < n; i++) {

			System.out.println("sorted array is :" + arr[i]);

		}

		System.out.println("2nd laargest element is: " + arr[n - 2]);

		return arr[n - 2];

	}

	
	
	public static void main(String[] args) {

		// int arr[]= {5,8,9,7};
		int arr[] = new int[10];
		Array_Elements ae = new Array_Elements();
		ae.create_array(arr);

	}
}
