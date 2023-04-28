package p183jj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.time4j.base.AbstractC10817f;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.C11028p;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.C8627a;
import p161ij.EnumC8635e;
import p161ij.EnumC8637g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.e0 */
/* loaded from: classes8.dex */
public final class C9649e0 implements AbstractC9657h<AbstractC11001k> {

    /* renamed from: p */
    static final C9649e0 f21389p = new C9649e0();

    /* renamed from: k */
    private final EnumC8635e f21390k;

    /* renamed from: l */
    private final boolean f21391l;

    /* renamed from: m */
    private final List<String> f21392m;

    /* renamed from: n */
    private final boolean f21393n;

    /* renamed from: o */
    private final EnumC8637g f21394o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9649e0(EnumC8635e eVar, boolean z, List<String> list) {
        if (eVar == null) {
            throw new NullPointerException("Missing display mode.");
        } else if (!list.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList(list);
            for (String str : arrayList) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("Zero offset must not be white-space-only.");
                }
            }
            this.f21390k = eVar;
            this.f21391l = z;
            this.f21392m = Collections.unmodifiableList(arrayList);
            this.f21393n = true;
            this.f21394o = EnumC8637g.SMART;
        } else {
            throw new IllegalArgumentException("Missing zero offsets.");
        }
    }

    /* renamed from: a */
    private static C11028p m15780a(AbstractC8077o oVar, AbstractC8048d dVar) {
        AbstractC8046c<AbstractC11001k> cVar = C8627a.f19055d;
        if (dVar.mo15676a(cVar)) {
            AbstractC11001k kVar = (AbstractC11001k) dVar.mo15675b(cVar);
            if (kVar instanceof C11028p) {
                return (C11028p) kVar;
            }
            if (kVar != null) {
                throw new IllegalArgumentException("Use a timezone offset instead of [" + kVar.mo11196a() + "] when formatting [" + oVar + "].");
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    /* renamed from: h */
    private static int m15779h(CharSequence charSequence, int i, EnumC8637g gVar) {
        char c;
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 >= charSequence.length()) {
                c = 0;
            } else {
                c = charSequence.charAt(i4);
            }
            if (c >= '0' && c <= '9') {
                i2 = (i2 * 10) + (c - '0');
            } else if (i3 == 0 || gVar.m18441c()) {
                return -1000;
            } else {
                return ~i2;
            }
        }
        return i2;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<AbstractC11001k> mo15599b() {
        return EnumC9636b0.TIMEZONE_OFFSET;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        int i;
        AbstractC11001k kVar;
        C11028p pVar;
        int i2;
        boolean z2;
        char c;
        if (appendable instanceof CharSequence) {
            i = ((CharSequence) appendable).length();
        } else {
            i = -1;
        }
        if (oVar.mo11376f()) {
            kVar = oVar.mo11372q();
        } else {
            kVar = null;
        }
        if (kVar == null) {
            pVar = m15780a(oVar, dVar);
        } else if (kVar instanceof C11028p) {
            pVar = (C11028p) kVar;
        } else if (oVar instanceof AbstractC10817f) {
            pVar = AbstractC11002l.m11310N(kVar).mo11322B((AbstractC10817f) oVar);
        } else {
            throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
        }
        int j = pVar.m11187j();
        int i3 = pVar.m11188i();
        if ((j | i3) == 0) {
            String str = this.f21392m.get(0);
            appendable.append(str);
            i2 = str.length();
        } else {
            int i4 = 1;
            if (j < 0 || i3 < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c = '-';
            } else {
                c = '+';
            }
            appendable.append(c);
            int abs = Math.abs(j);
            int i5 = abs / 3600;
            int i6 = (abs / 60) % 60;
            int i7 = abs % 60;
            if (i5 < 10) {
                appendable.append('0');
                i4 = 2;
            }
            String valueOf = String.valueOf(i5);
            appendable.append(valueOf);
            int length = i4 + valueOf.length();
            EnumC8635e eVar = this.f21390k;
            EnumC8635e eVar2 = EnumC8635e.SHORT;
            if (!(eVar == eVar2 && i6 == 0)) {
                if (this.f21391l) {
                    appendable.append(':');
                    length++;
                }
                if (i6 < 10) {
                    appendable.append('0');
                    length++;
                }
                String valueOf2 = String.valueOf(i6);
                appendable.append(valueOf2);
                length += valueOf2.length();
                EnumC8635e eVar3 = this.f21390k;
                if (!(eVar3 == eVar2 || eVar3 == EnumC8635e.MEDIUM || (eVar3 != EnumC8635e.FULL && (i7 | i3) == 0))) {
                    if (this.f21391l) {
                        appendable.append(':');
                        length++;
                    }
                    if (i7 < 10) {
                        appendable.append('0');
                        length++;
                    }
                    String valueOf3 = String.valueOf(i7);
                    appendable.append(valueOf3);
                    int length2 = valueOf3.length() + length;
                    if (i3 != 0) {
                        appendable.append('.');
                        int i8 = length2 + 1;
                        String valueOf4 = String.valueOf(Math.abs(i3));
                        int length3 = 9 - valueOf4.length();
                        for (int i9 = 0; i9 < length3; i9++) {
                            appendable.append('0');
                            i8++;
                        }
                        appendable.append(valueOf4);
                        i2 = valueOf4.length() + i8;
                    } else {
                        i2 = length2;
                    }
                }
            }
            i2 = length;
        }
        if (!(i == -1 || i2 <= 0 || set == null)) {
            set.add(new C9653g(EnumC9636b0.TIMEZONE_ID, i, i + i2));
        }
        return i2;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<AbstractC11001k> mo15597d(AbstractC8079p<AbstractC11001k> pVar) {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15596e(java.lang.CharSequence r17, p183jj.C9675s r18, p143hj.AbstractC8048d r19, p183jj.AbstractC9676t<?> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9649e0.mo15596e(java.lang.CharSequence, jj.s, hj.d, jj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9649e0)) {
            return false;
        }
        C9649e0 e0Var = (C9649e0) obj;
        if (this.f21390k == e0Var.f21390k && this.f21391l == e0Var.f21391l && this.f21392m.equals(e0Var.f21392m)) {
            return true;
        }
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<AbstractC11001k> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        return new C9649e0(this.f21390k, this.f21391l, this.f21392m, ((Boolean) dVar.mo15674c(C8627a.f19060i, Boolean.TRUE)).booleanValue(), (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART));
    }

    public int hashCode() {
        return (this.f21390k.hashCode() * 7) + (this.f21392m.hashCode() * 31) + (this.f21391l ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9649e0.class.getName());
        sb2.append("[precision=");
        sb2.append(this.f21390k);
        sb2.append(", extended=");
        sb2.append(this.f21391l);
        sb2.append(", zero-offsets=");
        sb2.append(this.f21392m);
        sb2.append(']');
        return sb2.toString();
    }

    private C9649e0() {
        this.f21390k = EnumC8635e.LONG;
        this.f21391l = true;
        this.f21392m = Collections.emptyList();
        this.f21393n = true;
        this.f21394o = EnumC8637g.SMART;
    }

    private C9649e0(EnumC8635e eVar, boolean z, List<String> list, boolean z2, EnumC8637g gVar) {
        this.f21390k = eVar;
        this.f21391l = z;
        this.f21392m = list;
        this.f21393n = z2;
        this.f21394o = gVar;
    }
}
