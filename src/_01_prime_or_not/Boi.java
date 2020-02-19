package _01_prime_or_not;

import javax.swing.JOptionPane;

public class Boi {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog(null, "choose a number.");
int b = Integer.parseInt(a);
for (int i = 2; i < b; i++) {
if(b==1) {
	JOptionPane.showMessageDialog(null,"your number is not prime" );
	System.exit(0);
}
	if(b%i==0) {
	JOptionPane.showMessageDialog(null,"your number is not prime" );
System.exit(0);
}

}


	JOptionPane.showMessageDialog(null,"your number is prime" );





























}
}
