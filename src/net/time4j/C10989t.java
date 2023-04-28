package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8083t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.t */
/* loaded from: classes8.dex */
public final class C10989t extends AbstractC10808b<Integer> implements AbstractC10966k0<Integer, C10906g0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: n */
    private final transient int f24423n;

    /* renamed from: o */
    private final transient Integer f24424o;

    /* renamed from: p */
    private final transient Integer f24425p;

    /* renamed from: q */
    private final transient char f24426q;

    /* renamed from: r */
    private final transient AbstractC8083t<AbstractC8080q<?>, BigDecimal> f24427r;

    private C10989t(String str, int i, Integer num, Integer num2, char c) {
        super(str);
        boolean z;
        this.f24423n = i;
        this.f24424o = num;
        this.f24425p = num2;
        this.f24426q = c;
        if (i == 5 || i == 7 || i == 9 || i == 13) {
            z = true;
        } else {
            z = false;
        }
        this.f24427r = new C10968l0(this, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static C10989t m11348D(String str, boolean z) {
        int i;
        int i2;
        char c;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        if (z) {
            i2 = 24;
        } else {
            i2 = 12;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (z) {
            c = 'k';
        } else {
            c = 'h';
        }
        return new C10989t(str, i, 1, valueOf, c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static C10989t m11347E(String str, int i, int i2, int i3, char c) {
        return new C10989t(str, i, Integer.valueOf(i2), Integer.valueOf(i3), c);
    }

    private Object readResolve() {
        Object G0 = C10906g0.m11778G0(name());
        if (G0 != null) {
            return G0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.AbstractC10966k0
    /* renamed from: B */
    public /* bridge */ /* synthetic */ AbstractC10975o<C10906g0> mo11163B(Integer num) {
        return super.m12223A(num);
    }

    /* renamed from: F */
    public Integer mo11059f() {
        return this.f24425p;
    }

    /* renamed from: G */
    public Integer mo11062T() {
        return this.f24424o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public int m11344H() {
        return this.f24423n;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return true;
    }

    @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return this.f24426q;
    }

    @Override // p143hj.AbstractC8079p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
