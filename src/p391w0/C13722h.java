package p391w0;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: w0.h */
/* loaded from: classes.dex */
public class C13722h {

    /* renamed from: o */
    private static int f30667o = 1;

    /* renamed from: a */
    public boolean f30668a;

    /* renamed from: b */
    private String f30669b;

    /* renamed from: f */
    public float f30673f;

    /* renamed from: j */
    EnumC13723a f30677j;

    /* renamed from: c */
    public int f30670c = -1;

    /* renamed from: d */
    int f30671d = -1;

    /* renamed from: e */
    public int f30672e = 0;

    /* renamed from: g */
    public boolean f30674g = false;

    /* renamed from: h */
    float[] f30675h = new float[9];

    /* renamed from: i */
    float[] f30676i = new float[9];

    /* renamed from: k */
    C13711b[] f30678k = new C13711b[16];

    /* renamed from: l */
    int f30679l = 0;

    /* renamed from: m */
    public int f30680m = 0;

    /* renamed from: n */
    HashSet<C13711b> f30681n = null;

    /* renamed from: w0.h$a */
    /* loaded from: classes.dex */
    public enum EnumC13723a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C13722h(EnumC13723a aVar, String str) {
        this.f30677j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2885b() {
        f30667o++;
    }

    /* renamed from: a */
    public final void m2886a(C13711b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f30679l;
            if (i >= i2) {
                C13711b[] bVarArr = this.f30678k;
                if (i2 >= bVarArr.length) {
                    this.f30678k = (C13711b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C13711b[] bVarArr2 = this.f30678k;
                int i3 = this.f30679l;
                bVarArr2[i3] = bVar;
                this.f30679l = i3 + 1;
                return;
            } else if (this.f30678k[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L_0x0019;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r5 = r4.f30678k;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.f30679l--;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2884c(p391w0.C13711b r5) {
        /*
            r4 = this;
            int r0 = r4.f30679l
            r1 = 0
        L_0x0003:
            if (r1 >= r0) goto L_0x0023
            w0.b[] r2 = r4.f30678k
            r2 = r2[r1]
            if (r2 != r5) goto L_0x0020
        L_0x000b:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L_0x0019
            w0.b[] r5 = r4.f30678k
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto L_0x000b
        L_0x0019:
            int r5 = r4.f30679l
            int r5 = r5 + (-1)
            r4.f30679l = r5
            return
        L_0x0020:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p391w0.C13722h.m2884c(w0.b):void");
    }

    /* renamed from: d */
    public void m2883d() {
        this.f30669b = null;
        this.f30677j = EnumC13723a.UNKNOWN;
        this.f30672e = 0;
        this.f30670c = -1;
        this.f30671d = -1;
        this.f30673f = 0.0f;
        this.f30674g = false;
        int i = this.f30679l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30678k[i2] = null;
        }
        this.f30679l = 0;
        this.f30680m = 0;
        this.f30668a = false;
        Arrays.fill(this.f30676i, 0.0f);
    }

    /* renamed from: e */
    public void m2882e(C13714d dVar, float f) {
        this.f30673f = f;
        this.f30674g = true;
        int i = this.f30679l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30678k[i2].m2956B(dVar, this, false);
        }
        this.f30679l = 0;
    }

    /* renamed from: f */
    public void m2881f(EnumC13723a aVar, String str) {
        this.f30677j = aVar;
    }

    /* renamed from: g */
    public final void m2880g(C13711b bVar) {
        int i = this.f30679l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30678k[i2].mo2898C(bVar, false);
        }
        this.f30679l = 0;
    }

    public String toString() {
        if (this.f30669b != null) {
            return "" + this.f30669b;
        }
        return "" + this.f30670c;
    }
}
