import java.io.*;

public class Task12 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder text = new StringBuilder();

        try {
            File dataDir = new File("data");
            if (!dataDir.exists()) {
                dataDir.mkdir();
            }

            for (int i = 5; i > 0; i--) {
                File currentFile = new File("data/log" + (i - 1) + ".txt");
                File nextFile = new File("data/log" + i + ".txt");
                if (currentFile.exists()) {
                    currentFile.renameTo(nextFile);
                }
            }

            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    break;
                }
                text.append(line).append("\n");
            }

            File logFile = new File("data/log0.txt");
            FileWriter writer = new FileWriter(logFile);
            writer.write(text.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while trying to read/write the log files: " + e.getMessage());
        }
    }
}