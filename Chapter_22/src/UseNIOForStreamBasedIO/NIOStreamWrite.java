package UseNIOForStreamBasedIO;
// Demonstrate NIO-based, stream output.

import java.io.*;
import java.nio.file.*;

public class NIOStreamWrite {
    public static void main(String args[])
    {
        // Open the file and obtain a stream linked to it.
        try ( OutputStream fout =
                      new BufferedOutputStream(
                              Files.newOutputStream(Path.of("test.txt"))) )
        {
            // Write some bytes to the stream.
            for(int i=0; i < 26; i++)
                fout.write((byte)('A' + i));

        } catch(InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}

