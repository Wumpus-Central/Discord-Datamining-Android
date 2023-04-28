package p455z3;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: z3.g */
/* loaded from: classes7.dex */
public interface AbstractC14535g extends Closeable {

    /* renamed from: z3.g$a */
    /* loaded from: classes7.dex */
    public static class C14536a extends RuntimeException {
        public C14536a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: a */
    ByteBuffer mo267a();

    /* renamed from: f */
    int mo266f(int i, byte[] bArr, int i2, int i3);

    boolean isClosed();

    /* renamed from: j */
    byte mo265j(int i);

    /* renamed from: k */
    long mo264k();

    int size();
}
