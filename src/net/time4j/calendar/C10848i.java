package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.calendar.AbstractC10840f;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8091z;
import p161ij.AbstractC8669t;
import p161ij.C8627a;

/* renamed from: net.time4j.calendar.i */
/* loaded from: classes8.dex */
class C10848i<D extends AbstractC10840f<?, D>> implements AbstractC8669t<EnumC10863p>, AbstractC8091z<D, EnumC10863p>, Serializable {

    /* renamed from: k */
    private static final C10848i f24056k = new C10848i();
    private static final long serialVersionUID = 4572549754637955194L;

    C10848i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static <D extends AbstractC10840f<?, D>> C10848i<D> m12019x() {
        return f24056k;
    }

    /* renamed from: A */
    public EnumC10863p mo11078k(D d) {
        AbstractC10838d Y = d.mo12083Y();
        return EnumC10863p.m11957h(Y.m12097n(Y.m12094q(d.m12082Z(), d.m12071j0().getNumber()) + 1));
    }

    /* renamed from: D */
    public EnumC10863p mo11076n(D d) {
        return EnumC10863p.m11957h(d.mo12083Y().m12097n(d.mo12079c() + 1));
    }

    /* renamed from: E */
    public boolean mo11081h(D d, EnumC10863p pVar) {
        return pVar != null;
    }

    /* renamed from: F */
    public EnumC10863p mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
        Locale locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
        int length = charSequence.length();
        if (parsePosition.getIndex() < length) {
            return EnumC10863p.m11955j(charSequence, locale, parsePosition);
        }
        parsePosition.setErrorIndex(length);
        return null;
    }

    /* renamed from: G */
    public D mo11077m(D d, EnumC10863p pVar, boolean z) {
        if (pVar != null) {
            return (D) ((AbstractC10840f) d.m20660E(pVar.m11954k()));
        }
        throw new IllegalArgumentException("Missing solar term.");
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

    @Override // p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return (char) 0;
    }

    @Override // p143hj.AbstractC8079p
    public Class<EnumC10863p> getType() {
        return EnumC10863p.class;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    public String name() {
        return "SOLAR_TERM";
    }

    /* renamed from: o */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        return ((EnumC10863p) oVar.mo11371r(this)).compareTo((EnumC10863p) oVar2.mo11371r(this));
    }

    /* renamed from: q */
    public AbstractC8079p<?> mo11086b(D d) {
        throw new AbstractMethodError();
    }

    protected Object readResolve() {
        return f24056k;
    }

    /* renamed from: s */
    public AbstractC8079p<?> mo11085c(D d) {
        throw new AbstractMethodError();
    }

    /* renamed from: v */
    public EnumC10863p mo11059f() {
        return EnumC10863p.MAJOR_12_DAHAN_300;
    }

    /* renamed from: w */
    public EnumC10863p mo11062T() {
        return EnumC10863p.MINOR_01_LICHUN_315;
    }

    /* renamed from: y */
    public EnumC10863p mo11084d(D d) {
        AbstractC10838d Y = d.mo12083Y();
        return EnumC10863p.m11957h(Y.m12097n(Y.m12094q(d.m12082Z(), d.m12071j0().getNumber()) + d.lengthOfYear()));
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        appendable.append(((EnumC10863p) oVar.mo11371r(this)).m11962c((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT)));
    }
}
