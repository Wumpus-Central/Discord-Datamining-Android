package p028b8;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: b8.c */
/* loaded from: classes7.dex */
public final class C3398c {

    /* renamed from: a */
    private final ByteArrayOutputStream f5434a;

    /* renamed from: b */
    private final DataOutputStream f5435b;

    public C3398c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f5434a = byteArrayOutputStream;
        this.f5435b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m34516b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: c */
    private static void m34515c(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    /* renamed from: a */
    public byte[] m34517a(C3396a aVar) {
        this.f5434a.reset();
        try {
            m34516b(this.f5435b, aVar.f5428k);
            String str = aVar.f5429l;
            if (str == null) {
                str = "";
            }
            m34516b(this.f5435b, str);
            m34515c(this.f5435b, aVar.f5430m);
            m34515c(this.f5435b, aVar.f5431n);
            this.f5435b.write(aVar.f5432o);
            this.f5435b.flush();
            return this.f5434a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
