package p163j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.q */
/* loaded from: classes2.dex */
public class C9268q {

    /* renamed from: a */
    C9264m[] f20344a;

    /* renamed from: b */
    C9264m f20345b = null;

    /* renamed from: c */
    C9267p f20346c;

    /* renamed from: d */
    C9267p f20347d;

    /* renamed from: e */
    int f20348e;

    /* renamed from: f */
    int f20349f;

    /* renamed from: g */
    int f20350g;

    /* renamed from: h */
    final int f20351h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9268q(C9264m[] mVarArr, int i, int i2, int i3) {
        this.f20344a = mVarArr;
        this.f20351h = i;
        this.f20348e = i2;
        this.f20349f = i2;
        this.f20350g = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C9264m m16570c() {
        C9264m[] mVarArr;
        int length;
        int i;
        C9267p pVar;
        C9264m mVar = this.f20345b;
        if (mVar != null) {
            mVar = mVar.f20339d;
        }
        while (mVar == null) {
            if (this.f20349f >= this.f20350g || (mVarArr = this.f20344a) == null || (length = mVarArr.length) <= (i = this.f20348e) || i < 0) {
                this.f20345b = null;
                return null;
            }
            C9264m tabAt = ConcurrentHashMap.tabAt(mVarArr, i);
            if (tabAt == null || tabAt.f20336a >= 0) {
                mVar = tabAt;
            } else if (tabAt instanceof C9259h) {
                this.f20344a = ((C9259h) tabAt).f20329e;
                C9267p pVar2 = this.f20347d;
                if (pVar2 != null) {
                    this.f20347d = pVar2.f20343d;
                } else {
                    pVar2 = new C9267p();
                }
                pVar2.f20342c = mVarArr;
                pVar2.f20340a = length;
                pVar2.f20341b = i;
                pVar2.f20343d = this.f20346c;
                this.f20346c = pVar2;
                mVar = null;
            } else {
                mVar = tabAt instanceof C9269r ? ((C9269r) tabAt).f20355f : null;
            }
            if (this.f20346c != null) {
                while (true) {
                    pVar = this.f20346c;
                    if (pVar == null) {
                        break;
                    }
                    int i2 = this.f20348e;
                    int i3 = pVar.f20340a;
                    int i4 = i2 + i3;
                    this.f20348e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.f20348e = pVar.f20341b;
                    this.f20344a = pVar.f20342c;
                    pVar.f20342c = null;
                    C9267p pVar3 = pVar.f20343d;
                    pVar.f20343d = this.f20347d;
                    this.f20346c = pVar3;
                    this.f20347d = pVar;
                    length = i3;
                }
                if (pVar == null) {
                    int i5 = this.f20348e + this.f20351h;
                    this.f20348e = i5;
                    if (i5 >= length) {
                        int i6 = this.f20349f + 1;
                        this.f20349f = i6;
                        this.f20348e = i6;
                    }
                }
            } else {
                int i7 = i + this.f20351h;
                this.f20348e = i7;
                if (i7 >= length) {
                    int i8 = this.f20349f + 1;
                    this.f20349f = i8;
                    this.f20348e = i8;
                }
            }
        }
        this.f20345b = mVar;
        return mVar;
    }
}
