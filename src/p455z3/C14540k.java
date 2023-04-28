package p455z3;

import java.io.InputStream;
import java.io.OutputStream;
import p163j$.util.Spliterator;
import p394w3.C13740j;

/* renamed from: z3.k */
/* loaded from: classes7.dex */
public class C14540k {

    /* renamed from: a */
    private final int f32964a;

    /* renamed from: b */
    private final AbstractC14529a f32965b;

    public C14540k(AbstractC14529a aVar) {
        this(aVar, Spliterator.SUBSIZED);
    }

    /* renamed from: a */
    public long m257a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.f32965b.get(this.f32964a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f32964a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            } finally {
                this.f32965b.release(bArr);
            }
        }
    }

    public C14540k(AbstractC14529a aVar, int i) {
        C13740j.m2839b(Boolean.valueOf(i > 0));
        this.f32964a = i;
        this.f32965b = aVar;
    }
}
