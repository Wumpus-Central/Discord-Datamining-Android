package net.time4j.history;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p219lj.EnumC10455a;

/* renamed from: net.time4j.history.h */
/* loaded from: classes8.dex */
public final class C10934h implements Comparable<C10934h> {

    /* renamed from: k */
    private final EnumC10937j f24284k;

    /* renamed from: l */
    private final int f24285l;

    /* renamed from: m */
    private final int f24286m;

    /* renamed from: n */
    private final int f24287n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10934h(EnumC10937j jVar, int i, int i2, int i3) {
        this.f24284k = jVar;
        this.f24285l = i;
        this.f24286m = i2;
        this.f24287n = i3;
    }

    /* renamed from: g */
    public static C10934h m11540g(EnumC10937j jVar, int i, int i2, int i3) {
        return m11539h(jVar, i, i2, i3, EnumC10455a.DUAL_DATING, C10954o.f24311d);
    }

    /* renamed from: h */
    public static C10934h m11539h(EnumC10937j jVar, int i, int i2, int i3, EnumC10455a aVar, C10954o oVar) {
        if (jVar != null) {
            boolean z = true;
            if (i3 < 1 || i3 > 31) {
                throw new IllegalArgumentException("Day of month out of range: " + m11538i(jVar, i, i2, i3));
            } else if (i2 < 1 || i2 > 12) {
                throw new IllegalArgumentException("Month out of range: " + m11538i(jVar, i, i2, i3));
            } else {
                if (jVar == EnumC10937j.BYZANTINE) {
                    if (i < 0 || (i == 0 && i2 < 9)) {
                        throw new IllegalArgumentException("Before creation of the world: " + m11538i(jVar, i, i2, i3));
                    }
                } else if (i < 1) {
                    throw new IllegalArgumentException("Year of era must be positive: " + m11538i(jVar, i, i2, i3));
                }
                if (!aVar.equals(EnumC10455a.DUAL_DATING)) {
                    EnumC10944n f = oVar.m11478f(jVar, i);
                    if (aVar != EnumC10455a.AFTER_NEW_YEAR) {
                        z = false;
                    }
                    i = f.mo11485c(z, oVar, jVar, i, i2, i3);
                }
                return new C10934h(jVar, i, i2, i3);
            }
        } else {
            throw new NullPointerException("Missing historic era.");
        }
    }

    /* renamed from: i */
    private static String m11538i(EnumC10937j jVar, int i, int i2, int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar);
        sb2.append('-');
        String valueOf = String.valueOf(i);
        for (int length = 4 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        sb2.append('-');
        if (i2 < 10) {
            sb2.append('0');
        }
        sb2.append(i2);
        sb2.append('-');
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        return sb2.toString();
    }

    /* renamed from: a */
    public int compareTo(C10934h hVar) {
        int a = this.f24284k.m11528a(this.f24285l);
        int a2 = hVar.f24284k.m11528a(hVar.f24285l);
        if (a < a2) {
            return -1;
        }
        if (a > a2) {
            return 1;
        }
        int d = m11543d() - hVar.m11543d();
        if (d == 0) {
            d = m11545b() - hVar.m11545b();
        }
        if (d < 0) {
            return -1;
        }
        if (d > 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public int m11545b() {
        return this.f24287n;
    }

    /* renamed from: c */
    public EnumC10937j m11544c() {
        return this.f24284k;
    }

    /* renamed from: d */
    public int m11543d() {
        return this.f24286m;
    }

    /* renamed from: e */
    public int m11542e() {
        return this.f24285l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10934h)) {
            return false;
        }
        C10934h hVar = (C10934h) obj;
        if (this.f24284k == hVar.f24284k && this.f24285l == hVar.f24285l && this.f24286m == hVar.f24286m && this.f24287n == hVar.f24287n) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m11541f(C10954o oVar) {
        return oVar.m11481c(this);
    }

    public int hashCode() {
        int i = (this.f24285l * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + (this.f24286m * 32) + this.f24287n;
        if (this.f24284k == EnumC10937j.AD) {
            return i;
        }
        return -i;
    }

    public String toString() {
        return m11538i(this.f24284k, this.f24285l, this.f24286m, this.f24287n);
    }
}
