package net.time4j;

import java.util.Comparator;
import net.time4j.AbstractC11036w;
import p143hj.AbstractC8049d0;
import p143hj.AbstractC8071l0;
import p143hj.AbstractC8086w;

/* renamed from: net.time4j.o0 */
/* loaded from: classes8.dex */
class C10976o0<U extends AbstractC11036w> implements AbstractC8049d0<U>, Comparator<AbstractC8071l0.C8072a<? extends AbstractC8086w>> {

    /* renamed from: k */
    private final boolean f24381k;

    private C10976o0(boolean z) {
        this.f24381k = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Comparator<AbstractC8071l0.C8072a<? extends AbstractC8086w>> m11404b() {
        return new C10976o0(false);
    }

    /* renamed from: c */
    static int m11403c(AbstractC8086w wVar, AbstractC8086w wVar2) {
        int compare = Double.compare(wVar2.getLength(), wVar.getLength());
        if (compare != 0 || wVar.equals(wVar2)) {
            return compare;
        }
        throw new IllegalArgumentException("Mixing different units of same length not allowed.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C10976o0<EnumC10882f> m11401g() {
        return new C10976o0<>(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C10976o0<EnumC10899g> m11400h() {
        return new C10976o0<>(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C10976o0<AbstractC11036w> m11399k() {
        return new C10976o0<>(true);
    }

    /* renamed from: d */
    public int compare(AbstractC8071l0.C8072a<? extends AbstractC8086w> aVar, AbstractC8071l0.C8072a<? extends AbstractC8086w> aVar2) {
        return m11403c((AbstractC8086w) aVar.m20674b(), (AbstractC8086w) aVar2.m20674b());
    }
}
