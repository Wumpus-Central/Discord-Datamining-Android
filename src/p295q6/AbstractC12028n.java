package p295q6;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: q6.n */
/* loaded from: classes7.dex */
public abstract class AbstractC12028n {
    /* renamed from: a */
    static AbstractC12028n m7963a(long j) {
        return new C12016h(j);
    }

    /* renamed from: b */
    public static AbstractC12028n m7962b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m7963a(Long.parseLong(jsonReader.nextString()));
                } else {
                    return m7963a(jsonReader.nextLong());
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo7961c();
}
