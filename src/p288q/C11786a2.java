package p288q;

import p308r.C12267f0;

/* renamed from: q.a2 */
/* loaded from: classes.dex */
class C11786a2 {

    /* renamed from: a */
    private final Object f26297a = new Object();

    /* renamed from: b */
    private final C12267f0 f26298b;

    /* renamed from: c */
    private int f26299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11786a2(C12267f0 f0Var, int i) {
        this.f26298b = f0Var;
        this.f26299c = i;
    }

    /* renamed from: a */
    public int m8623a() {
        int i;
        synchronized (this.f26297a) {
            i = this.f26299c;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m8622b(int i) {
        synchronized (this.f26297a) {
            this.f26299c = i;
        }
    }
}
