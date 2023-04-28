package p089ek;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, m15073d2 = {"Lek/f;", "", "Lokio/Buffer$a;", "cursor", "", "key", "", "b", "", "code", "", "a", "c", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ek.f */
/* loaded from: classes8.dex */
public final class C6963f {

    /* renamed from: a */
    public static final C6963f f15179a = new C6963f();

    private C6963f() {
    }

    /* renamed from: a */
    public final String m23827a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        } else {
            return "Code " + i + " is reserved and may not be used.";
        }
    }

    /* renamed from: b */
    public final void m23826b(Buffer.C11434a cursor, byte[] key) {
        C9971q.m14633g(cursor, "cursor");
        C9971q.m14633g(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.f25536o;
            int i2 = cursor.f25537p;
            int i3 = cursor.f25538q;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (cursor.m9755b() != -1);
    }

    /* renamed from: c */
    public final void m23825c(int i) {
        boolean z;
        String a = m23827a(i);
        if (a == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9971q.m14636d(a);
            throw new IllegalArgumentException(a.toString());
        }
    }
}
