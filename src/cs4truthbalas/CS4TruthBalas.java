/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthbalas;

/**
 *
 * @author TRUTH
 */
public class CS4TruthBalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Idol 1");
	String name1 = "Johnny";
	int age1 = 19;
	int training1 = 1;
	System.out.println("Name: " + name1 + '\n' + "Age: " + age1 + '\n' + "Training Years: " + training1 + '\n');

	System.out.println("Idol 2");
	String name2 = "Ethan";
	int age2 = 21;
	int training2 = 3;
	System.out.println("Name: " + name2 + '\n' + "Age: " + age2 + '\n' + "Training Years: " + training2 + '\n');

	System.out.println("Idol 3");
	String name3 = "Benjamin";
	int age3 = 20;
	int training3 = 2;
	System.out.println("Name: " + name3 + '\n' + "Age: " + age3 + '\n' + "Training Years: " + training3 + '\n');

	boolean longestTraining = training2 > training1 && training2 > training3;
	System.out.println("Ethan is the idol with the longest training period: " + longestTraining + '\n');

	boolean sameAge = age1 == age3;
	System.out.println("Johnny and Benjamin are of the same age: " + sameAge + '\n');

	int ageGap = age2 - age1;
	System.out.println("Difference in years of Johnny and Ethan's ages: " + ageGap);
    }
}
