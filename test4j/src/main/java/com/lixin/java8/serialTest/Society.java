package com.lixin.java8.serialTest;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.nustaq.serialization.FSTConfiguration;
import org.nustaq.serialization.FSTObjectInput;
import org.nustaq.serialization.FSTObjectOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
public class Society implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;
    static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    String name;
    List<Person> persons = new LinkedList<>();

    public Society myreadMethod(InputStream stream) throws Exception {
        FSTObjectInput in = conf.getObjectInput(stream);
        Society result = (Society) in.readObject(Society.class);
        // DON'T: in.close(); here prevents reuse and will result in an exception
        stream.close();
        return result;
    }

    public void mywriteMethod(OutputStream stream, Society toWrite) throws IOException {
        FSTObjectOutput out = conf.getObjectOutput(stream);
        out.writeObject(toWrite, Society.class);
        // DON'T out.close() when using factory method;
        out.flush();
        stream.close();
    }
}
