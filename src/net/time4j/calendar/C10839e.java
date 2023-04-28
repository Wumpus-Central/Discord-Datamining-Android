package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.EnumC8637g;

/* renamed from: net.time4j.calendar.e */
/* loaded from: classes8.dex */
class C10839e implements AbstractC8669t<C10836c>, Serializable {

    /* renamed from: k */
    static final C10839e f24039k = new C10839e();
    private static final long serialVersionUID = -4211396220263977858L;

    C10839e() {
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
        return 'U';
    }

    /* renamed from: b */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        return ((C10836c) oVar.mo11371r(this)).compareTo((C10860o) oVar2.mo11371r(this));
    }

    /* renamed from: c */
    public C10836c mo11059f() {
        return C10836c.m12108n(60);
    }

    /* renamed from: d */
    public C10836c mo11062T() {
        return C10836c.m12108n(1);
    }

    /* renamed from: g */
    public C10836c mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
        return C10836c.m12107o(charSequence, parsePosition, (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT), !((EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART)).m18441c());
    }

    @Override // p143hj.AbstractC8079p
    public Class<C10836c> getType() {
        return C10836c.class;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    public String name() {
        return "CYCLIC_YEAR";
    }

    protected Object readResolve() {
        return f24039k;
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        appendable.append(((C10836c) oVar.mo11371r(this)).m11972g((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT)));
    }
}
