package p367uc;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: uc.f */
/* loaded from: classes3.dex */
public class C13256f {

    /* renamed from: a */
    private static final byte f29748a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f29749b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m4205b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m4204c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m4206a() {
        byte[] c = m4204c(UUID.randomUUID(), new byte[17]);
        byte b = c[0];
        c[16] = b;
        c[0] = (byte) ((b & f29749b) | f29748a);
        return m4205b(c);
    }
}
