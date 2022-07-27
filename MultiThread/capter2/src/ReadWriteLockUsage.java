import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockUsage {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();

    public void reader(){
        readLock.lock();
        try{

        }finally {
            readLock.unlock();
        }
    }

    public void writer(){
        writeLock.lock();
        try{

        }finally {
            writeLock.unlock();
        }
    }
}
