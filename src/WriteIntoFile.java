import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public String ScriviDentroUnFile(String testo) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleziona il file in cui salvare il testo");
        int selezioneutente = fileChooser.showSaveDialog(null);
        // Se l'utente annulla l'operazione, il programma termina
        if (selezioneutente != JFileChooser.APPROVE_OPTION) {
            System.out.println("Operazione annullata dall'utente.");
            return null;
        }
        //sorgente dell'outputstream
        File fileSelezionato = fileChooser.getSelectedFile();
        System.out.println("File selezionato: " + fileSelezionato.getAbsolutePath());

        FileWriter scrittoreFile = null;
        try {
            scrittoreFile = new FileWriter(fileSelezionato);
            scrittoreFile.write(testo + System.lineSeparator());
            scrittoreFile.close();
        } catch (IOException e) {
            System.err.println(e);
        }



        return null;
    }

}
