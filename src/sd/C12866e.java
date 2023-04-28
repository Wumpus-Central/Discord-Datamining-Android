package sd;

import p066dd.C6441j;
import p137hd.C7996a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.e */
/* loaded from: classes3.dex */
public final class C12866e extends AbstractC12870i {

    /* renamed from: c */
    private final String f28931c;

    /* renamed from: d */
    private final String f28932d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12866e(C7996a aVar, String str, String str2) {
        super(aVar);
        this.f28931c = str2;
        this.f28932d = str;
    }

    /* renamed from: k */
    private void m5245k(StringBuilder sb2, int i) {
        int f = m5237b().m5206f(i, 16);
        if (f != 38400) {
            sb2.append('(');
            sb2.append(this.f28931c);
            sb2.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i5);
            if (i4 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i4);
            if (i2 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i2);
        }
    }

    @Override // sd.AbstractC12871j
    /* renamed from: d */
    public String mo5235d() {
        if (m5236c().m20932j() == 84) {
            StringBuilder sb2 = new StringBuilder();
            m5243f(sb2, 8);
            m5239j(sb2, 48, 20);
            m5245k(sb2, 68);
            return sb2.toString();
        }
        throw C6441j.m25551a();
    }

    @Override // sd.AbstractC12870i
    /* renamed from: h */
    protected void mo5241h(StringBuilder sb2, int i) {
        sb2.append('(');
        sb2.append(this.f28932d);
        sb2.append(i / 100000);
        sb2.append(')');
    }

    @Override // sd.AbstractC12870i
    /* renamed from: i */
    protected int mo5240i(int i) {
        return i % 100000;
    }
}
