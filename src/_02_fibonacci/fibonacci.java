package _02_fibonacci;

public class fibonacci {
	public static void main(String[] args) {
		int a=0; int b=1; int c=2;
c=a;
a=b;
b=c;
System.out.println(b);
System.out.println(a);
for (int i = 0; i < 10; i++) {
		c=a;
		a=b;
		b=c;
		b=a+b;
		System.out.println(a+b);
		}
	}
}
