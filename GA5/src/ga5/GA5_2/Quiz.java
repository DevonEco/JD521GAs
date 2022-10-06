/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga5.GA5_2;

/**
 *
 * @author Devon
 */
import java.util.*;

public class Quiz
{
public static void main(String args[])
        {
            String questions[]={
                "1. Does a CPU work in GHz?",
                "2. Freeware is software that is available for use at no monetary cost.",
                "3. The Language that the computer can understand is called Machine Language.",
                "4. GNU / Linux is a open source operating system.",
                "5. A compiler is a translation program that converts high-level instructions into a set of binary instructions (machine code) for execution.",
                "6. A machine cycle is the time it takes a microprocessor to fetch and execute a complete instruction.",
                "7. CPU is an acronym for Command Processing Unit.",
                "8. A computer can directly understand a high-level language.",
                "9. The programs that run on a computer are referred to as hardware." ,
                "10. Java was originally intended for use in intelligent consumer-electronic devices." 
            };

int a,j,d=0;
char act_answers[]={'A','A','A','A','A','A','A','B','B','A'};
char answer;
Scanner scan = new Scanner(System.in);


for(a=0;a<10;a++)
{
    System.out.println(questions[a]);
    System.out.println("A.True");
    System.out.println("B.False");
    System.out.println("C. Not sure.");
    answer=scan.nextLine().charAt(0);


if(answer==act_answers[a])
{
    System.out.println("Correct!");
    d++;
}
else
{
    System.out.println("The correct answer is "+act_answers[a]);
}
}
    System.out.println("Number of correct answers are "+d);
}
}