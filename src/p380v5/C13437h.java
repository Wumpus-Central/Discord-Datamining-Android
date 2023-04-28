package p380v5;

import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: v5.h */
/* loaded from: classes7.dex */
public class C13437h implements AbstractC13438i {

    /* renamed from: d */
    public static final AbstractC13438i f30004d = m3694d(ViewDefaults.NUMBER_OF_LINES, true, true);

    /* renamed from: a */
    int f30005a;

    /* renamed from: b */
    boolean f30006b;

    /* renamed from: c */
    boolean f30007c;

    private C13437h(int i, boolean z, boolean z2) {
        this.f30005a = i;
        this.f30006b = z;
        this.f30007c = z2;
    }

    /* renamed from: d */
    public static AbstractC13438i m3694d(int i, boolean z, boolean z2) {
        return new C13437h(i, z, z2);
    }

    @Override // p380v5.AbstractC13438i
    /* renamed from: a */
    public boolean mo3693a() {
        return this.f30007c;
    }

    @Override // p380v5.AbstractC13438i
    /* renamed from: b */
    public boolean mo3692b() {
        return this.f30006b;
    }

    @Override // p380v5.AbstractC13438i
    /* renamed from: c */
    public int mo3691c() {
        return this.f30005a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13437h)) {
            return false;
        }
        C13437h hVar = (C13437h) obj;
        if (this.f30005a == hVar.f30005a && this.f30006b == hVar.f30006b && this.f30007c == hVar.f30007c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.f30005a ^ (this.f30006b ? 4194304 : 0);
        if (this.f30007c) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}
