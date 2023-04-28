package net.time4j.calendar;

import java.io.Serializable;
import java.util.Locale;
import net.time4j.EnumC10809b0;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.C8668s;
import p161ij.EnumC8641j;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p201kj.AbstractC9886a;

/* renamed from: net.time4j.calendar.g */
/* loaded from: classes8.dex */
class C10846g implements AbstractC8669t<C10847h>, Serializable {

    /* renamed from: k */
    static final C10846g f24052k = new C10846g();
    private static final long serialVersionUID = -5874268477318061153L;

    C10846g() {
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
        return 'M';
    }

    /* renamed from: b */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        return ((C10847h) oVar.mo11371r(this)).compareTo((C10847h) oVar2.mo11371r(this));
    }

    /* renamed from: c */
    public C10847h mo11059f() {
        return C10847h.m12031d(12);
    }

    /* renamed from: d */
    public C10847h mo11062T() {
        return C10847h.m12031d(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public net.time4j.calendar.C10847h mo11054u(java.lang.CharSequence r19, java.text.ParsePosition r20, p143hj.AbstractC8048d r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.C10846g.mo11054u(java.lang.CharSequence, java.text.ParsePosition, hj.d):net.time4j.calendar.h");
    }

    @Override // p143hj.AbstractC8079p
    public Class<C10847h> getType() {
        return C10847h.class;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    public String name() {
        return "MONTH_OF_YEAR";
    }

    protected Object readResolve() {
        return f24052k;
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        C8668s sVar;
        Locale locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
        C10847h hVar = (C10847h) oVar.mo11371r(this);
        if (dVar.mo15676a(AbstractC9886a.f22039c)) {
            appendable.append(hVar.m12033b(locale, (EnumC8641j) dVar.mo15674c(C8627a.f19063l, EnumC8641j.f19112k), dVar));
            return;
        }
        EnumC8671v vVar = (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE);
        EnumC8658m mVar = (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT);
        if (hVar.m12032c()) {
            sVar = C8629b.m18469c("chinese", locale).m18465g(vVar, mVar);
        } else {
            sVar = C8629b.m18469c("chinese", locale).m18460l(vVar, mVar);
        }
        appendable.append(sVar.m18409f(EnumC10809b0.m12219d(hVar.getNumber())));
    }
}
