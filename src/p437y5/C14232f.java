package p437y5;

import android.graphics.Bitmap;
import com.facebook.imageutils.C5064a;
import p005a4.AbstractC1262c;
import p394w3.C13740j;

/* renamed from: y5.f */
/* loaded from: classes7.dex */
public class C14232f {

    /* renamed from: a */
    private int f32150a;

    /* renamed from: b */
    private long f32151b;

    /* renamed from: c */
    private final int f32152c;

    /* renamed from: d */
    private final int f32153d;

    /* renamed from: e */
    private final AbstractC1262c<Bitmap> f32154e;

    /* renamed from: y5.f$a */
    /* loaded from: classes7.dex */
    class C14233a implements AbstractC1262c<Bitmap> {
        C14233a() {
        }

        /* renamed from: a */
        public void release(Bitmap bitmap) {
            try {
                C14232f.this.m1321a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C14232f(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        C13740j.m2839b(Boolean.valueOf(i2 <= 0 ? false : z2));
        this.f32152c = i;
        this.f32153d = i2;
        this.f32154e = new C14233a();
    }

    /* renamed from: a */
    public synchronized void m1321a(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int e = C5064a.m30859e(bitmap);
        if (this.f32150a > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2838c(z, "No bitmaps registered.");
        long j = e;
        if (j <= this.f32151b) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2837d(z2, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(e), Long.valueOf(this.f32151b));
        this.f32151b -= j;
        this.f32150a--;
    }

    /* renamed from: b */
    public synchronized int m1320b() {
        return this.f32150a;
    }

    /* renamed from: c */
    public synchronized int m1319c() {
        return this.f32152c;
    }

    /* renamed from: d */
    public synchronized int m1318d() {
        return this.f32153d;
    }

    /* renamed from: e */
    public AbstractC1262c<Bitmap> m1317e() {
        return this.f32154e;
    }

    /* renamed from: f */
    public synchronized long m1316f() {
        return this.f32151b;
    }

    /* renamed from: g */
    public synchronized boolean m1315g(Bitmap bitmap) {
        int e = C5064a.m30859e(bitmap);
        int i = this.f32150a;
        if (i < this.f32152c) {
            long j = this.f32151b;
            long j2 = e;
            if (j + j2 <= this.f32153d) {
                this.f32150a = i + 1;
                this.f32151b = j + j2;
                return true;
            }
        }
        return false;
    }
}
