package p081e9;

import java.util.Arrays;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: e9.n */
/* loaded from: classes5.dex */
public final class C6780n implements AbstractC6765b {

    /* renamed from: a */
    private final boolean f14453a;

    /* renamed from: b */
    private final int f14454b;

    /* renamed from: c */
    private final byte[] f14455c;

    /* renamed from: d */
    private final C6764a[] f14456d;

    /* renamed from: e */
    private int f14457e;

    /* renamed from: f */
    private int f14458f;

    /* renamed from: g */
    private int f14459g;

    /* renamed from: h */
    private C6764a[] f14460h;

    public C6780n(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // p081e9.AbstractC6765b
    /* renamed from: a */
    public synchronized void mo24351a(C6764a aVar) {
        C6764a[] aVarArr = this.f14456d;
        aVarArr[0] = aVar;
        mo24349c(aVarArr);
    }

    @Override // p081e9.AbstractC6765b
    /* renamed from: b */
    public synchronized C6764a mo24350b() {
        C6764a aVar;
        this.f14458f++;
        int i = this.f14459g;
        if (i > 0) {
            C6764a[] aVarArr = this.f14460h;
            int i2 = i - 1;
            this.f14459g = i2;
            aVar = (C6764a) C7510a.m22367e(aVarArr[i2]);
            this.f14460h[this.f14459g] = null;
        } else {
            aVar = new C6764a(new byte[this.f14454b], 0);
        }
        return aVar;
    }

    @Override // p081e9.AbstractC6765b
    /* renamed from: c */
    public synchronized void mo24349c(C6764a[] aVarArr) {
        int i = this.f14459g;
        int length = aVarArr.length + i;
        C6764a[] aVarArr2 = this.f14460h;
        if (length >= aVarArr2.length) {
            this.f14460h = (C6764a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C6764a aVar : aVarArr) {
            C6764a[] aVarArr3 = this.f14460h;
            int i2 = this.f14459g;
            this.f14459g = i2 + 1;
            aVarArr3[i2] = aVar;
        }
        this.f14458f -= aVarArr.length;
        notifyAll();
    }

    @Override // p081e9.AbstractC6765b
    /* renamed from: d */
    public synchronized void mo24348d() {
        int i = 0;
        int max = Math.max(0, C7557q0.m22141l(this.f14457e, this.f14454b) - this.f14458f);
        int i2 = this.f14459g;
        if (max < i2) {
            if (this.f14455c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C6764a aVar = (C6764a) C7510a.m22367e(this.f14460h[i]);
                    if (aVar.f14417a == this.f14455c) {
                        i++;
                    } else {
                        C6764a aVar2 = (C6764a) C7510a.m22367e(this.f14460h[i3]);
                        if (aVar2.f14417a != this.f14455c) {
                            i3--;
                        } else {
                            C6764a[] aVarArr = this.f14460h;
                            aVarArr[i] = aVar2;
                            aVarArr[i3] = aVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f14459g) {
                    return;
                }
            }
            Arrays.fill(this.f14460h, max, this.f14459g, (Object) null);
            this.f14459g = max;
        }
    }

    @Override // p081e9.AbstractC6765b
    /* renamed from: e */
    public int mo24347e() {
        return this.f14454b;
    }

    /* renamed from: f */
    public synchronized int m24346f() {
        return this.f14458f * this.f14454b;
    }

    /* renamed from: g */
    public synchronized void m24345g() {
        if (this.f14453a) {
            m24344h(0);
        }
    }

    /* renamed from: h */
    public synchronized void m24344h(int i) {
        boolean z;
        if (i < this.f14457e) {
            z = true;
        } else {
            z = false;
        }
        this.f14457e = i;
        if (z) {
            mo24348d();
        }
    }

    public C6780n(boolean z, int i, int i2) {
        C7510a.m22371a(i > 0);
        C7510a.m22371a(i2 >= 0);
        this.f14453a = z;
        this.f14454b = i;
        this.f14459g = i2;
        this.f14460h = new C6764a[i2 + 100];
        if (i2 > 0) {
            this.f14455c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f14460h[i3] = new C6764a(this.f14455c, i3 * i);
            }
        } else {
            this.f14455c = null;
        }
        this.f14456d = new C6764a[1];
    }
}
