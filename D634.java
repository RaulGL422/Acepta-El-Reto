import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedOutputStream;

/**
 * D634
 */
public class D634 {

    public static void main(String[] args) throws IOException {
        FastReader reader = new FastReader();
        StringBuilder result = new StringBuilder();
        
        int casos = reader.nextInt();
        while (casos-- > 0) {
            int acumulador = 1, suma = 0;
            String line = reader.readLine();
            for (int i = 0; i < line.length(); i++) {
                char input = line.charAt(i);
                if (input == 'O') {
                    suma += 10 * acumulador;
                    acumulador++;
                } else {
                    acumulador = 1;
                }
            }
            result.append(suma).append('\n');
        }

        OutputStream out = new BufferedOutputStream(System.out);
        out.write(result.toString().getBytes());
        out.flush();
    }
}

class FastReader {
    private final int BUFFER_SIZE = 1 << 16;
    private DataInputStream dis;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public FastReader() {
        dis = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException {
        byte[] buf = new byte[1024]; // Line length assumption
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (neg) return -ret;
        return ret;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }

    private void fillBuffer() throws IOException {
        bytesRead = dis.read(buffer, 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
        bufferPointer = 0;
    }

    public void close() throws IOException {
        if (dis != null) dis.close();
    }
}
