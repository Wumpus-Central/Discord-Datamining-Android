package net.time4j;

import net.time4j.base.AbstractC10811a;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8085v;

/* renamed from: net.time4j.b0 */
/* loaded from: classes8.dex */
public enum EnumC10809b0 implements AbstractC8075n<AbstractC10811a>, AbstractC8085v<C10892f0> {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: w */
    private static final EnumC10809b0[] f23994w = values();

    /* renamed from: d */
    public static EnumC10809b0 m12219d(int i) {
        if (i >= 1 && i <= 12) {
            return f23994w[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    /* renamed from: a */
    public C10892f0 apply(C10892f0 f0Var) {
        return (C10892f0) f0Var.mo15654D(C10892f0.f38898C, this);
    }

    /* renamed from: b */
    public int m12221b() {
        return ordinal() + 1;
    }

    /* renamed from: c */
    public boolean test(AbstractC10811a aVar) {
        return aVar.mo11642n() == m12221b();
    }
}
