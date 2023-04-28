package net.time4j;

import net.time4j.base.AbstractC10811a;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8085v;

/* renamed from: net.time4j.m0 */
/* loaded from: classes8.dex */
public enum EnumC10970m0 implements AbstractC8075n<AbstractC10811a>, AbstractC8085v<C10892f0> {
    Q1,
    Q2,
    Q3,
    Q4;
    

    /* renamed from: o */
    private static final EnumC10970m0[] f24358o = values();

    /* renamed from: d */
    public static EnumC10970m0 m11419d(int i) {
        if (i >= 1 && i <= 4) {
            return f24358o[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    /* renamed from: a */
    public C10892f0 apply(C10892f0 f0Var) {
        return (C10892f0) f0Var.mo15654D(C10892f0.f38897B, this);
    }

    /* renamed from: b */
    public int m11421b() {
        return ordinal() + 1;
    }

    /* renamed from: c */
    public boolean test(AbstractC10811a aVar) {
        if (m11421b() == ((aVar.mo11642n() - 1) / 3) + 1) {
            return true;
        }
        return false;
    }
}
