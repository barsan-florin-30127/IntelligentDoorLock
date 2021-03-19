package isp.lab8.Exercise1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class that contains the encryption process (writeEncryptedData method).
 * Decryption of the file is made by shifting to the left each character from the FileReader
 * in order to do that we start a input file reader pipe and a output file writer
 */
public class Encrypt {
    FileReader inputFileReader = null;
    FileWriter firstFileWriter = null;

    /**
     * Main method that do the decryption process.
     * Although the encryptedFileNAme and the decryptedFileName should be the same in our problem
     * We give them separately to the method in order to better handle the files that we use.
     *
     * @param readFileName  - String that represents file name
     * @param writeFileName - String that represents encrypted file name
     */
    public void writeEncryptedData(String readFileName, String writeFileName) {
        try (final FileReader firstFileReader = new FileReader(readFileName);
             final FileWriter firstFileWriter = new FileWriter(writeFileName)) {
            int c;
            while ((c = firstFileReader.read()) != -1) {
                firstFileWriter.write(c << 1);
            }
            System.out.println("Encryption has been made with success!");
        } catch (FileNotFoundException e) {
            System.out.println("File name not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Input/Output exception.");
            e.printStackTrace();
        }
    }
}
