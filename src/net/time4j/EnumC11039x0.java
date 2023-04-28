package net.time4j;

import net.time4j.base.AbstractC10811a;
import net.time4j.base.C10812b;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8085v;

/* renamed from: net.time4j.x0 */
/* loaded from: classes8.dex */
public enum EnumC11039x0 implements AbstractC8075n<AbstractC10811a>, AbstractC8085v<C10892f0> {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: r */
    private static final EnumC11039x0[] f24532r = values();

    /* renamed from: f */
    public static EnumC11039x0 m11154f(int i) {
        if (i >= 1 && i <= 7) {
            return f24532r[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    /* renamed from: a */
    public C10892f0 apply(C10892f0 f0Var) {
        return (C10892f0) f0Var.mo15654D(C10892f0.f38901F, this);
    }

    /* renamed from: b */
    public int m11158b() {
        return ordinal() + 1;
    }

    /* renamed from: c */
    public int m11157c(C11045z0 z0Var) {
        return (((ordinal() + 7) - z0Var.m11133f().ordinal()) % 7) + 1;
    }

    /* renamed from: d */
    public EnumC11039x0 m11156d(int i) {
        return m11154f(((ordinal() + ((i % 7) + 7)) % 7) + 1);
    }

    /* renamed from: e */
    public boolean test(AbstractC10811a aVar) {
        if (C10812b.m12213c(aVar.mo11643m(), aVar.mo11642n(), aVar.mo11641o()) == m11158b()) {
            return true;
        }
        return false;
    }
}
