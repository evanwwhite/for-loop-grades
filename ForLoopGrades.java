//Evan White
import java.util.Scanner;
public class ForLoopGrades {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

int AsGrades = 6;
int BsGrades = 4;
int CsGrades = 10;
int DsGrades = 2;
int FsGrades = 1;
int BottomLine = 20;

System.out.println("   " + '\u2502');
System.out.print(  "As " + '\u2502');

for(int i = 0; i <= AsGrades; i++)
{
	System.out.print('\u2588');
}

System.out.println();
System.out.println("   " + '\u2502');
System.out.print(  "Bs " + '\u2502');

for(int i = 0; i <= BsGrades; i++)
{
    System.out.print('\u2588');
}

System.out.println();
System.out.println("   " + '\u2502');
System.out.print(  "Cs " + '\u2502');

for(int i = 0; i <= CsGrades; i++)
{
	System.out.print('\u2588');
}

System.out.println();
System.out.println("   " + '\u2502');
System.out.print(  "Ds " + '\u2502');

for(int i = 0; i <= DsGrades; i++)
{
	System.out.print('\u2588');
}

System.out.println();
System.out.println("   " + '\u2502');
System.out.print(  "Fs " + '\u2502');

for(int i = 0; i <= FsGrades; i++)
{
	System.out.print('\u2588');
}

System.out.println();
System.out.print("   " + '\u2514' );
for(int i = 0; i < BottomLine; i++)
{
	System.out.print('\u2500');
}
System.out.println();
System.out.print("         5    10    15" );
	}

}
/*
As │███████
   │
Bs │█████
   │
Cs │███████████
   │
Ds │███
   │
Fs │██
   └────────────────────
         5    10    15
*/