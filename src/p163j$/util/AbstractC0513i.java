package p163j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* renamed from: j$.util.i */
/* loaded from: classes2.dex */
public abstract class AbstractC0513i {
    /* renamed from: a */
    public static Optional m16505a(C0512h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar.m16507c() ? Optional.of(hVar.m16508b()) : Optional.empty();
    }

    /* renamed from: b */
    public static OptionalDouble m16504b(C0514j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.m16499c() ? OptionalDouble.of(jVar.m16500b()) : OptionalDouble.empty();
    }

    /* renamed from: c */
    public static OptionalInt m16503c(C0515k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.m16495c() ? OptionalInt.of(kVar.m16496b()) : OptionalInt.empty();
    }

    /* renamed from: d */
    public static OptionalLong m16502d(C0516l lVar) {
        if (lVar == null) {
            return null;
        }
        return lVar.m16491c() ? OptionalLong.of(lVar.m16492b()) : OptionalLong.empty();
    }
}
