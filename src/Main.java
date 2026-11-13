import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WriteIntoFile writeIntoFile = new WriteIntoFile();
        StringBuilder builder= new StringBuilder("c'era una volta...");
        builder.append("Una principessa in castello..");
        builder.append("Un drago e un cavaliere..");
        writeIntoFile.ScriviDentroUnFile(builder.toString());
    }
}