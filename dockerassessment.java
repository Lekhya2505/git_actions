import java.util.*;

class DockerAssessment 
{
    public static void main(String[] args) 
    {
        String regNo;
        String name;
        String date;

        regNo = "22MIC0074";
        name = "Somavarapu Lavanya";
        date = new Date().toString();

        System.out.println(regNo + " - " + name);
        System.out.println("Compiled at: " + date);
    }
}
