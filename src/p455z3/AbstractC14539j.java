package p455z3;

import java.io.IOException;
import java.io.OutputStream;
import p394w3.C13747n;

/* renamed from: z3.j */
/* loaded from: classes7.dex */
public abstract class AbstractC14539j extends OutputStream {
    /* renamed from: b */
    public abstract AbstractC14535g mo258b();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C13747n.m2823a(e);
        }
    }

    public abstract int size();
}
