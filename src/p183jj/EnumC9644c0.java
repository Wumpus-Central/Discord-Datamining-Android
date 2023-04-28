package p183jj;

import java.util.List;
import java.util.Set;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.C11028p;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.c0 */
/* loaded from: classes8.dex */
public enum EnumC9644c0 implements AbstractC9657h<AbstractC11001k> {
    INSTANCE;

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<AbstractC11001k> mo15599b() {
        return EnumC9636b0.TIMEZONE_ID;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        int i;
        if (oVar.mo11376f()) {
            if (appendable instanceof CharSequence) {
                i = ((CharSequence) appendable).length();
            } else {
                i = -1;
            }
            String a = oVar.mo11372q().mo11196a();
            appendable.append(a);
            int length = a.length();
            if (!(i == -1 || length <= 0 || set == null)) {
                set.add(new C9653g(EnumC9636b0.TIMEZONE_ID, i, i + length));
            }
            return length;
        }
        throw new IllegalArgumentException("Cannot extract timezone id from: " + oVar);
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<AbstractC11001k> mo15597d(AbstractC8079p<AbstractC11001k> pVar) {
        return INSTANCE;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        char charAt;
        char charAt2;
        int length = charSequence.length();
        int f = sVar.m15664f();
        if (f >= length) {
            sVar.m15659k(f, "Missing timezone name.");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i = f;
        while (i < length && (((charAt2 = charSequence.charAt(i)) >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '-' || charAt2 == '_' || charAt2 == '/'))) {
            sb2.append(charAt2);
            i++;
        }
        if (!Character.isLetter(sb2.charAt(sb2.length() - 1))) {
            sb2.deleteCharAt(sb2.length() - 1);
            i--;
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            sVar.m15659k(f, "Missing valid timezone id.");
        } else if (sb3.startsWith("Etc/GMT")) {
            sVar.m15659k(f, "Inverse Etc/GMT-Offsets are not supported, use UTC-Offsets instead.");
        } else if (sb3.equals("Z")) {
            tVar.mo15648I(EnumC9636b0.TIMEZONE_OFFSET, C11028p.f24516u);
            sVar.m15658l(i);
        } else if (!sb3.equals("UTC") && !sb3.equals("GMT") && !sb3.equals("UT")) {
            List<AbstractC11001k> u = AbstractC11002l.m11291u("INCLUDE_ALIAS");
            int size = u.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                AbstractC11001k kVar = u.get(i3);
                int compareTo = kVar.mo11196a().compareTo(sb3);
                if (compareTo < 0) {
                    i2 = i3 + 1;
                } else if (compareTo > 0) {
                    size = i3 - 1;
                } else {
                    tVar.mo15648I(EnumC9636b0.TIMEZONE_ID, kVar);
                    sVar.m15658l(i);
                    return;
                }
            }
            sVar.m15659k(f, "Cannot parse to timezone id: " + sb3);
        } else if (length <= i || !((charAt = charSequence.charAt(i)) == '+' || charAt == '-')) {
            tVar.mo15648I(EnumC9636b0.TIMEZONE_OFFSET, C11028p.f24516u);
            sVar.m15658l(i);
        } else {
            sVar.m15658l(i);
            C9649e0.f21389p.mo15596e(charSequence, sVar, dVar, tVar, z);
        }
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<AbstractC11001k> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        return INSTANCE;
    }
}
