package CriptoAnalizer.dao;

import CriptoAnalizer.dao.DataDao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataDao implements DataDao {

    @Override
    public String getData(String dataName) {
        byte[] dataBytes = new byte[0];

        try {
            dataBytes = Files.readAllBytes(Path.of(dataName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(dataBytes);
    }

    @Override
    public void writeData(String dataName, String data) {
        try {
            Files.write(Path.of(dataName), data.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
