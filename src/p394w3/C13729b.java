package p394w3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: w3.b */
/* loaded from: classes7.dex */
public final class C13729b {

    /* renamed from: a */
    static final Logger f30702a = Logger.getLogger(C13729b.class.getName());

    private C13729b() {
    }

    /* renamed from: a */
    public static void m2857a(Closeable closeable, boolean z) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    f30702a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                    return;
                }
                throw e;
            }
        }
    }

    /* renamed from: b */
    public static void m2856b(InputStream inputStream) {
        try {
            m2857a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
