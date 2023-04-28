package ph;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: ph.j */
/* loaded from: classes8.dex */
public class C11710j {

    /* renamed from: a */
    public static final byte[] f26163a;

    /* renamed from: b */
    public static final ByteBuffer f26164b;

    /* renamed from: ph.j$a */
    /* loaded from: classes8.dex */
    public interface AbstractC11711a {
        int getNumber();
    }

    /* renamed from: ph.j$b */
    /* loaded from: classes8.dex */
    public interface AbstractC11712b<T extends AbstractC11711a> {
        /* renamed from: a */
        T mo8811a(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f26163a = bArr;
        f26164b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static boolean m8813a(byte[] bArr) {
        return C11746y.m8700e(bArr);
    }

    /* renamed from: b */
    public static String m8812b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
