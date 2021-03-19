package isp.lab8.safehome;

import java.io.*;

public class WriteAccessLog {
    public void writeDataLog(AccessLog accessLog) {
        int rand = (int) (Math.random() * 100);
        int secounds = accessLog.getDateTime().getSecond() - rand;
        try (
                final FileOutputStream fileOutputStream = new FileOutputStream("accessLog-{" + accessLog.getDateTime().getHour() + "-" + accessLog.getDateTime().getMinute() + "-" + secounds + "}.dat");
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(accessLog);
        } catch (FileNotFoundException e) {
            System.out.println("File name not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Input/Output exception.");
            e.printStackTrace();
        }
    }
}
