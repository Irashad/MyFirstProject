package LogUtil;

import java.io.*;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class mockLogger {
    BufferedWriter bufferedWriter;
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");
    String fileNameFormat = date.format(formatter);
    BufferedReader bufferedReader;

    // create log file

    public void createLogFile() throws IOException
    {
        File dir = new File("C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\MyLogFiles");
        File logFile = new File(dir+ "\\"+ fileNameFormat+".log");
        FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
        bufferedWriter = new BufferedWriter(fileWriter);
    }

    public void write(String message)
    {
        try {
            formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy/HH:mm:ss");
            String dateFormat = date.format(formatter);
            bufferedWriter.write("["+dateFormat+"]" +message);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }catch (Exception e)
        {

        }
    }

    public void reader() throws IOException {
        FileReader fileReader =
                new FileReader("C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\MyLogFiles\\18_03_2022.log");
       bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());

    }
}
