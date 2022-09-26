package models.dataSaver;

public class FileDataSaver<T> implements DataSaver<T> {
    private T data;

    @Override
    public void save(T a) {
        data = a;
    }

    @Override
    public T load() {
        return data;
    }
}
