package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
final class C2996r extends Writer {

    /* renamed from: k */
    private final String f4324k;

    /* renamed from: l */
    private StringBuilder f4325l = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2996r(String str) {
        this.f4324k = str;
    }

    /* renamed from: b */
    private void m35886b() {
        if (this.f4325l.length() > 0) {
            Log.d(this.f4324k, this.f4325l.toString());
            StringBuilder sb2 = this.f4325l;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m35886b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m35886b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m35886b();
            } else {
                this.f4325l.append(c);
            }
        }
    }
}
