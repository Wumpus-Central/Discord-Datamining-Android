package net.time4j;

import java.io.InvalidObjectException;
import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8080q;
import p161ij.AbstractC8657l;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.C8668s;
import p161ij.EnumC8637g;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p201kj.AbstractC9890e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.p */
/* loaded from: classes8.dex */
public final class C10977p<V extends Enum<V>> extends AbstractC10778a<V> implements AbstractC10820c0<V>, AbstractC8657l<V>, AbstractC9890e<V> {
    private static final long serialVersionUID = 2055272540517425102L;

    /* renamed from: n */
    private final transient Class<V> f24382n;

    /* renamed from: o */
    private final transient V f24383o;

    /* renamed from: p */
    private final transient V f24384p;

    /* renamed from: q */
    private final transient int f24385q;

    /* renamed from: r */
    private final transient char f24386r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10977p(String str, Class<V> cls, V v, V v2, int i, char c) {
        super(str);
        this.f24382n = cls;
        this.f24383o = v;
        this.f24384p = v2;
        this.f24385q = i;
        this.f24386r = c;
    }

    /* renamed from: D */
    private C8668s m11398D(Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        switch (this.f24385q) {
            case 101:
                return C8629b.m18468d(locale).m18460l(vVar, mVar);
            case 102:
                return C8629b.m18468d(locale).m18456p(vVar, mVar);
            case 103:
                return C8629b.m18468d(locale).m18461k(vVar, mVar);
            default:
                throw new UnsupportedOperationException(name());
        }
    }

    private Object readResolve() {
        Object J0 = C10892f0.m11877J0(name());
        if (J0 != null) {
            return J0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // p161ij.AbstractC8657l
    /* renamed from: C */
    public boolean mo11072C(AbstractC8080q<?> qVar, int i) {
        V[] enumConstants;
        for (V v : getType().getEnumConstants()) {
            if (m11394H(v) == i) {
                qVar.mo15654D(this, v);
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public V mo11059f() {
        return this.f24384p;
    }

    /* renamed from: F */
    public V mo11062T() {
        return this.f24383o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public int m11395G() {
        return this.f24385q;
    }

    /* renamed from: H */
    public int m11394H(V v) {
        return v.ordinal() + 1;
    }

    /* renamed from: I */
    public V mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
        int index = parsePosition.getIndex();
        Locale locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
        EnumC8671v vVar = (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE);
        AbstractC8046c<EnumC8658m> cVar = C8627a.f19059h;
        EnumC8658m mVar = EnumC8658m.FORMAT;
        EnumC8658m mVar2 = (EnumC8658m) dVar.mo15674c(cVar, mVar);
        V v = (V) m11398D(locale, vVar, mVar2).m18412c(charSequence, parsePosition, getType(), dVar);
        if (v != null || !((Boolean) dVar.mo15674c(C8627a.f19062k, Boolean.TRUE)).booleanValue()) {
            return v;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = EnumC8658m.STANDALONE;
        }
        return (V) m11398D(locale, vVar, mVar).m18412c(charSequence, parsePosition, getType(), dVar);
    }

    /* renamed from: J */
    public V mo11390e(CharSequence charSequence, ParsePosition parsePosition, Locale locale, EnumC8671v vVar, EnumC8658m mVar, EnumC8637g gVar) {
        int index = parsePosition.getIndex();
        V v = (V) m11398D(locale, vVar, mVar).m18411d(charSequence, parsePosition, getType(), gVar);
        if (v != null || gVar.m18441c()) {
            return v;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        EnumC8658m mVar2 = EnumC8658m.FORMAT;
        if (mVar == mVar2) {
            mVar2 = EnumC8658m.STANDALONE;
        }
        return (V) m11398D(locale, vVar, mVar2).m18411d(charSequence, parsePosition, getType(), gVar);
    }

    /* renamed from: K */
    public int mo11056r(V v, AbstractC8077o oVar, AbstractC8048d dVar) {
        return v.ordinal() + 1;
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
        return this.f24386r;
    }

    @Override // p143hj.AbstractC8079p
    public Class<V> getType() {
        return this.f24382n;
    }

    @Override // p201kj.AbstractC9890e
    /* renamed from: t */
    public void mo11389t(AbstractC8077o oVar, Appendable appendable, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        appendable.append(m11398D(locale, vVar, mVar).m18409f((Enum) oVar.mo11371r(this)));
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        appendable.append(m11398D((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT), (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE), (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT)).m18409f((Enum) oVar.mo11371r(this)));
    }
}
