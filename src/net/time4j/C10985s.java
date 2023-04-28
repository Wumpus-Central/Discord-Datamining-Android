package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8083t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.s */
/* loaded from: classes8.dex */
public final class C10985s extends AbstractC10778a<Integer> implements AbstractC10966k0<Integer, C10892f0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: n */
    private final transient int f24400n;

    /* renamed from: o */
    private final transient Integer f24401o;

    /* renamed from: p */
    private final transient Integer f24402p;

    /* renamed from: q */
    private final transient char f24403q;

    /* renamed from: r */
    private final transient AbstractC8083t<AbstractC8080q<?>, BigDecimal> f24404r = new C10968l0(this, false);

    private C10985s(String str, int i, Integer num, Integer num2, char c) {
        super(str);
        this.f24400n = i;
        this.f24401o = num;
        this.f24402p = num2;
        this.f24403q = c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static C10985s m11365D(String str, int i, int i2, int i3, char c) {
        return new C10985s(str, i, Integer.valueOf(i2), Integer.valueOf(i3), c);
    }

    private Object readResolve() {
        Object J0 = C10892f0.m11877J0(name());
        if (J0 != null) {
            return J0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.AbstractC10966k0
    /* renamed from: B */
    public /* bridge */ /* synthetic */ AbstractC10975o<C10892f0> mo11163B(Integer num) {
        return super.m12334A(num);
    }

    /* renamed from: E */
    public Integer mo11059f() {
        return this.f24402p;
    }

    /* renamed from: F */
    public Integer mo11062T() {
        return this.f24401o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public int m11362G() {
        return this.f24400n;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return this.f24403q;
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
