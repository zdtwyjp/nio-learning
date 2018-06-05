package nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("E:/nio-data.txt", "rw");
        FileChannel fileChannel = accessFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = fileChannel.read(buf);
        while (bytesRead != -1) {
            buf.flip();
            System.out.println("Read " + bytesRead);
            while(buf.hasRemaining()) {
                System.out.println((char)buf.get());
            }
            buf.clear();
            bytesRead = fileChannel.read(buf);
        }
        accessFile.close();


    }

}
