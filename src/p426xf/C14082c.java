package p426xf;

import java.io.Closeable;
import kotlin.Metadata;
import nf.C11067f;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¨\u0006\u0005"}, m15073d2 = {"Ljava/io/Closeable;", "", "cause", "", "a", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: xf.c */
/* loaded from: classes8.dex */
public final class C14082c {
    /* renamed from: a */
    public static final void m1713a(Closeable closeable, Throwable th2) {
        if (closeable == null) {
            return;
        }
        if (th2 == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th3) {
            C11067f.m10981a(th2, th3);
        }
    }
}
