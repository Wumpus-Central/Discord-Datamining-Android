package p437y5;

import android.graphics.Bitmap;
import p455z3.AbstractC14531c;

/* renamed from: y5.q */
/* loaded from: classes7.dex */
public class C14246q implements AbstractC14235h {

    /* renamed from: a */
    protected final AbstractC14252w<Bitmap> f32169a = new C14236i();

    /* renamed from: b */
    private final int f32170b;

    /* renamed from: c */
    private int f32171c;

    /* renamed from: d */
    private final AbstractC14227a0 f32172d;

    /* renamed from: e */
    private int f32173e;

    public C14246q(int i, int i2, AbstractC14227a0 a0Var, AbstractC14531c cVar) {
        this.f32170b = i;
        this.f32171c = i2;
        this.f32172d = a0Var;
        if (cVar != null) {
            cVar.mo271a(this);
        }
    }

    /* renamed from: g */
    private Bitmap m1289g(int i) {
        this.f32172d.mo1267d(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    /* renamed from: j */
    private synchronized void m1286j(int i) {
        Bitmap pop;
        while (this.f32173e > i && (pop = this.f32169a.pop()) != null) {
            int a = this.f32169a.mo1262a(pop);
            this.f32173e -= a;
            this.f32172d.mo1269b(a);
        }
    }

    /* renamed from: h */
    public synchronized Bitmap get(int i) {
        int i2 = this.f32173e;
        int i3 = this.f32170b;
        if (i2 > i3) {
            m1286j(i3);
        }
        Bitmap bitmap = this.f32169a.get(i);
        if (bitmap != null) {
            int a = this.f32169a.mo1262a(bitmap);
            this.f32173e -= a;
            this.f32172d.mo1266e(a);
            return bitmap;
        }
        return m1289g(i);
    }

    /* renamed from: i */
    public void release(Bitmap bitmap) {
        int a = this.f32169a.mo1262a(bitmap);
        if (a <= this.f32171c) {
            this.f32172d.mo1268c(a);
            this.f32169a.put(bitmap);
            synchronized (this) {
                this.f32173e += a;
            }
        }
    }
}
