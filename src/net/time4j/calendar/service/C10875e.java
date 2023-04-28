package net.time4j.calendar.service;

import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8085v;
import p161ij.AbstractC8633c;
import p161ij.AbstractC8657l;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.C8668s;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;

/* renamed from: net.time4j.calendar.service.e */
/* loaded from: classes8.dex */
public class C10875e<V extends Enum<V>, T extends AbstractC8080q<T>> extends AbstractC10874d<V, T> implements AbstractC8657l<V>, AbstractC8669t<V> {
    private static final long serialVersionUID = -2452569351302286113L;

    /* renamed from: n */
    private final transient Class<V> f24137n;

    /* renamed from: o */
    private final transient String f24138o;

    /* renamed from: p */
    private final transient AbstractC8085v<T> f24139p = null;

    /* renamed from: q */
    private final transient AbstractC8085v<T> f24140q = null;

    public C10875e(String str, Class<T> cls, Class<V> cls2, char c) {
        super(str, cls, c, m11911N(c));
        this.f24137n = cls2;
        this.f24138o = m11917E(cls);
    }

    /* renamed from: E */
    private static String m11917E(Class<?> cls) {
        AbstractC8633c cVar = (AbstractC8633c) cls.getAnnotation(AbstractC8633c.class);
        if (cVar == null) {
            return "iso8601";
        }
        return cVar.value();
    }

    /* renamed from: N */
    private static boolean m11911N(char c) {
        return c == 'E';
    }

    @Override // p161ij.AbstractC8657l
    /* renamed from: C */
    public boolean mo11072C(AbstractC8080q<?> qVar, int i) {
        V[] enumConstants;
        for (V v : getType().getEnumConstants()) {
            if (mo11904O(v) == i) {
                qVar.mo15654D(this, v);
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    protected C8668s m11918D(AbstractC8048d dVar, EnumC8658m mVar, boolean z) {
        EnumC8671v vVar = (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE);
        C8629b c = C8629b.m18469c(m11916F(dVar), (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT));
        if (m11913K()) {
            if (z) {
                return c.m18465g(vVar, mVar);
            }
            return c.m18460l(vVar, mVar);
        } else if (mo11912L()) {
            return c.m18456p(vVar, mVar);
        } else {
            if (m11914J()) {
                return c.m18470b(vVar);
            }
            return c.m18458n(name(), this.f24137n, new String[0]);
        }
    }

    /* renamed from: F */
    protected String m11916F(AbstractC8048d dVar) {
        if (m11913K() || m11914J()) {
            return (String) dVar.mo15674c(C8627a.f19053b, this.f24138o);
        }
        if (mo11912L()) {
            return "iso8601";
        }
        return this.f24138o;
    }

    /* renamed from: G */
    public V mo11059f() {
        V[] enumConstants = this.f24137n.getEnumConstants();
        return enumConstants[enumConstants.length - 1];
    }

    /* renamed from: H */
    public V mo11062T() {
        return this.f24137n.getEnumConstants()[0];
    }

    /* renamed from: I */
    protected boolean m11915I(AbstractC8077o oVar) {
        return false;
    }

    /* renamed from: J */
    protected boolean m11914J() {
        return mo11060a() == 'G';
    }

    /* renamed from: K */
    protected boolean m11913K() {
        return mo11060a() == 'M';
    }

    /* renamed from: L */
    protected boolean mo11912L() {
        return m11911N(mo11060a());
    }

    /* renamed from: O */
    public int mo11904O(V v) {
        return v.ordinal() + 1;
    }

    /* renamed from: P */
    public V mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
        int index = parsePosition.getIndex();
        AbstractC8046c<EnumC8658m> cVar = C8627a.f19059h;
        EnumC8658m mVar = EnumC8658m.FORMAT;
        EnumC8658m mVar2 = (EnumC8658m) dVar.mo15674c(cVar, mVar);
        V v = (V) m11918D(dVar, mVar2, false).m18412c(charSequence, parsePosition, getType(), dVar);
        if (v == null && m11913K()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            v = (V) m11918D(dVar, mVar2, true).m18412c(charSequence, parsePosition, getType(), dVar);
        }
        if (v != null || !((Boolean) dVar.mo15674c(C8627a.f19062k, Boolean.TRUE)).booleanValue()) {
            return v;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = EnumC8658m.STANDALONE;
        }
        V v2 = (V) m11918D(dVar, mVar, false).m18412c(charSequence, parsePosition, getType(), dVar);
        if (v2 != null || !m11913K()) {
            return v2;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        return (V) m11918D(dVar, mVar, true).m18412c(charSequence, parsePosition, getType(), dVar);
    }

    /* renamed from: Q */
    public int mo11056r(V v, AbstractC8077o oVar, AbstractC8048d dVar) {
        return mo11904O(v);
    }

    @Override // p143hj.AbstractC8079p
    public Class<V> getType() {
        return this.f24137n;
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        appendable.append(m11918D(dVar, (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT), m11915I(oVar)).m18409f((Enum) oVar.mo11371r(this)));
    }
}
