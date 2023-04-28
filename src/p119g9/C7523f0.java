package p119g9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p119g9.C7523f0;

/* renamed from: g9.f0 */
/* loaded from: classes5.dex */
public class C7523f0 {

    /* renamed from: h */
    private static final Comparator<C7525b> f16303h = new Comparator() { // from class: g9.d0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g;
            g = C7523f0.m22328g((C7523f0.C7525b) obj, (C7523f0.C7525b) obj2);
            return g;
        }
    };

    /* renamed from: i */
    private static final Comparator<C7525b> f16304i = new Comparator() { // from class: g9.e0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h;
            h = C7523f0.m22327h((C7523f0.C7525b) obj, (C7523f0.C7525b) obj2);
            return h;
        }
    };

    /* renamed from: a */
    private final int f16305a;

    /* renamed from: e */
    private int f16309e;

    /* renamed from: f */
    private int f16310f;

    /* renamed from: g */
    private int f16311g;

    /* renamed from: c */
    private final C7525b[] f16307c = new C7525b[5];

    /* renamed from: b */
    private final ArrayList<C7525b> f16306b = new ArrayList<>();

    /* renamed from: d */
    private int f16308d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g9.f0$b */
    /* loaded from: classes5.dex */
    public static class C7525b {

        /* renamed from: a */
        public int f16312a;

        /* renamed from: b */
        public int f16313b;

        /* renamed from: c */
        public float f16314c;

        private C7525b() {
        }
    }

    public C7523f0(int i) {
        this.f16305a = i;
    }

    /* renamed from: d */
    private void m22331d() {
        if (this.f16308d != 1) {
            Collections.sort(this.f16306b, f16303h);
            this.f16308d = 1;
        }
    }

    /* renamed from: e */
    private void m22330e() {
        if (this.f16308d != 0) {
            Collections.sort(this.f16306b, f16304i);
            this.f16308d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m22328g(C7525b bVar, C7525b bVar2) {
        return bVar.f16312a - bVar2.f16312a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ int m22327h(C7525b bVar, C7525b bVar2) {
        return Float.compare(bVar.f16314c, bVar2.f16314c);
    }

    /* renamed from: c */
    public void m22332c(int i, float f) {
        C7525b bVar;
        m22331d();
        int i2 = this.f16311g;
        if (i2 > 0) {
            C7525b[] bVarArr = this.f16307c;
            int i3 = i2 - 1;
            this.f16311g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C7525b();
        }
        int i4 = this.f16309e;
        this.f16309e = i4 + 1;
        bVar.f16312a = i4;
        bVar.f16313b = i;
        bVar.f16314c = f;
        this.f16306b.add(bVar);
        this.f16310f += i;
        while (true) {
            int i5 = this.f16310f;
            int i6 = this.f16305a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C7525b bVar2 = this.f16306b.get(0);
                int i8 = bVar2.f16313b;
                if (i8 <= i7) {
                    this.f16310f -= i8;
                    this.f16306b.remove(0);
                    int i9 = this.f16311g;
                    if (i9 < 5) {
                        C7525b[] bVarArr2 = this.f16307c;
                        this.f16311g = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f16313b = i8 - i7;
                    this.f16310f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public float m22329f(float f) {
        ArrayList<C7525b> arrayList;
        m22330e();
        float f2 = f * this.f16310f;
        int i = 0;
        for (int i2 = 0; i2 < this.f16306b.size(); i2++) {
            C7525b bVar = this.f16306b.get(i2);
            i += bVar.f16313b;
            if (i >= f2) {
                return bVar.f16314c;
            }
        }
        if (this.f16306b.isEmpty()) {
            return Float.NaN;
        }
        return this.f16306b.get(arrayList.size() - 1).f16314c;
    }

    /* renamed from: i */
    public void m22326i() {
        this.f16306b.clear();
        this.f16308d = -1;
        this.f16309e = 0;
        this.f16310f = 0;
    }
}
