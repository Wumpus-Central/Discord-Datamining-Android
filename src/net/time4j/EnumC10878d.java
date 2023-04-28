package net.time4j;

import java.text.ParsePosition;
import java.util.Locale;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.C8668s;
import p161ij.EnumC8637g;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p201kj.AbstractC9890e;

/* renamed from: net.time4j.d */
/* loaded from: classes8.dex */
enum EnumC10878d implements AbstractC10821c1<EnumC11044z>, AbstractC9890e<EnumC11044z> {
    AM_PM_OF_DAY;

    /* renamed from: b */
    private C8668s m11900b(AbstractC8048d dVar) {
        return C8629b.m18468d((Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT)).m18464h((EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE), (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT));
    }

    /* renamed from: c */
    private C8668s m11899c(Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return C8629b.m18468d(locale).m18464h(vVar, mVar);
    }

    /* renamed from: m */
    static EnumC11044z m11893m(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int i = index + 2;
        if (charSequence.length() < i) {
            return null;
        }
        char charAt = charSequence.charAt(index + 1);
        if (charAt != 'M' && charAt != 'm') {
            return null;
        }
        char charAt2 = charSequence.charAt(index);
        if (charAt2 == 'A' || charAt2 == 'a') {
            parsePosition.setIndex(i);
            return EnumC11044z.AM;
        } else if (charAt2 != 'P' && charAt2 != 'p') {
            return null;
        } else {
            parsePosition.setIndex(i);
            return EnumC11044z.PM;
        }
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

    @Override // p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return 'a';
    }

    /* renamed from: d */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        return ((EnumC11044z) oVar.mo11371r(this)).compareTo((EnumC11044z) oVar2.mo11371r(this));
    }

    /* renamed from: g */
    public EnumC11044z mo11059f() {
        return EnumC11044z.PM;
    }

    @Override // p143hj.AbstractC8079p
    public Class<EnumC11044z> getType() {
        return EnumC11044z.class;
    }

    /* renamed from: h */
    public EnumC11044z mo11062T() {
        return EnumC11044z.AM;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }

    /* renamed from: k */
    public EnumC11044z mo11054u(CharSequence charSequence, ParsePosition parsePosition, AbstractC8048d dVar) {
        EnumC11044z m = m11893m(charSequence, parsePosition);
        if (m == null) {
            return (EnumC11044z) m11900b(dVar).m18412c(charSequence, parsePosition, getType(), dVar);
        }
        return m;
    }

    /* renamed from: l */
    public EnumC11044z mo11390e(CharSequence charSequence, ParsePosition parsePosition, Locale locale, EnumC8671v vVar, EnumC8658m mVar, EnumC8637g gVar) {
        EnumC11044z m = m11893m(charSequence, parsePosition);
        if (m == null) {
            return (EnumC11044z) m11899c(locale, vVar, mVar).m18411d(charSequence, parsePosition, getType(), gVar);
        }
        return m;
    }

    @Override // p201kj.AbstractC9890e
    /* renamed from: t */
    public void mo11389t(AbstractC8077o oVar, Appendable appendable, Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        appendable.append(m11899c(locale, vVar, mVar).m18409f((Enum) oVar.mo11371r(this)));
    }

    @Override // p161ij.AbstractC8669t
    /* renamed from: z */
    public void mo11052z(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar) {
        appendable.append(m11900b(dVar).m18409f((Enum) oVar.mo11371r(this)));
    }
}
