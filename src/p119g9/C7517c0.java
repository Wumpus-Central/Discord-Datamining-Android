package p119g9;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: g9.c0 */
/* loaded from: classes5.dex */
public final class C7517c0 extends BufferedOutputStream {

    /* renamed from: k */
    private boolean f16294k;

    public C7517c0(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: b */
    public void m22351b(OutputStream outputStream) {
        C7510a.m22366f(this.f16294k);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f16294k = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th2;
        this.f16294k = true;
        try {
            flush();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        if (th2 != null) {
            C7557q0.m22192L0(th2);
        }
    }

    public C7517c0(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
