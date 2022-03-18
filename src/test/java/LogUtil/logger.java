package LogUtil;

import java.io.*;


public class logger {
    BufferedWriter bufferedWriter;
   /* ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");
    String fileNameFormat = date.format(formatter);*/
    String fileNameFormat="sa";
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
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }catch (Exception e)
        {
            System.out.println("There is problem with reading file");
        }
    }
}
