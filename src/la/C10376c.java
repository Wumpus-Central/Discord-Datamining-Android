package la;

import android.util.Base64;
import java.util.Random;

/* renamed from: la.c */
/* loaded from: classes3.dex */
public final class C10376c {

    /* renamed from: a */
    private static final Random f22768a = new Random();

    /* renamed from: a */
    public static String m13532a() {
        byte[] bArr = new byte[16];
        f22768a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
