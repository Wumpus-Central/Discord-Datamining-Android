package p163j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.h */
/* loaded from: classes2.dex */
public final class C9176h extends AbstractC9169a implements Serializable {

    /* renamed from: a */
    public static final C9176h f20141a = new C9176h();

    private C9176h() {
    }

    /* renamed from: a */
    public static boolean m16727a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
