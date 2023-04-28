package p119g9;

import android.util.SparseBooleanArray;

/* renamed from: g9.v */
/* loaded from: classes5.dex */
public class C7565v {

    /* renamed from: a */
    private final SparseBooleanArray f16394a = new SparseBooleanArray();

    /* renamed from: a */
    public void m22067a(int i) {
        this.f16394a.append(i, true);
    }

    /* renamed from: b */
    public boolean mo22066b(int i) {
        return this.f16394a.get(i);
    }

    /* renamed from: c */
    public boolean mo22065c(int... iArr) {
        for (int i : iArr) {
            if (mo22066b(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo22064d(int i) {
        boolean z;
        if (i < 0 || i >= m22063e()) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        return this.f16394a.keyAt(i);
    }

    /* renamed from: e */
    public int m22063e() {
        return this.f16394a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7565v)) {
            return false;
        }
        return this.f16394a.equals(((C7565v) obj).f16394a);
    }

    public int hashCode() {
        return this.f16394a.hashCode();
    }
}
