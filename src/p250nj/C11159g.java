package p250nj;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.Reader;

/* renamed from: nj.g */
/* loaded from: classes8.dex */
class C11159g extends Reader {

    /* renamed from: k */
    private final PushbackInputStream f24837k;

    /* renamed from: l */
    private BufferedReader f24838l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11159g(InputStream inputStream) {
        this.f24837k = new PushbackInputStream(inputStream, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r1[2] == (-65)) goto L_0x0027;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m10667b() {
        /*
            r6 = this;
            java.io.BufferedReader r0 = r6.f24838l
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 3
            byte[] r1 = new byte[r0]
            java.io.PushbackInputStream r2 = r6.f24837k
            r3 = 0
            int r2 = r2.read(r1, r3, r0)
            if (r2 != r0) goto L_0x0026
            byte r0 = r1[r3]
            r4 = -17
            if (r0 != r4) goto L_0x0026
            r0 = 1
            byte r4 = r1[r0]
            r5 = -69
            if (r4 != r5) goto L_0x0026
            r4 = 2
            byte r4 = r1[r4]
            r5 = -65
            if (r4 != r5) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r0 = r3
        L_0x0027:
            if (r0 != 0) goto L_0x0030
            if (r2 <= 0) goto L_0x0030
            java.io.PushbackInputStream r0 = r6.f24837k
            r0.unread(r1, r3, r2)
        L_0x0030:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.PushbackInputStream r2 = r6.f24837k
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r6.f24838l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p250nj.C11159g.m10667b():void");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        BufferedReader bufferedReader = this.f24838l;
        if (bufferedReader == null) {
            this.f24837k.close();
        } else {
            bufferedReader.close();
        }
    }

    /* renamed from: g */
    public String m10666g() {
        m10667b();
        return this.f24838l.readLine();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        m10667b();
        return this.f24838l.read(cArr, i, i2);
    }

    @Override // java.io.Reader
    public boolean ready() {
        m10667b();
        return this.f24838l.ready();
    }
}
