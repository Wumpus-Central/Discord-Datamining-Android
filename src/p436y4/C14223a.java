package p436y4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import p006a5.AbstractC1265a;
import p006a5.AbstractC1266b;
import p414x3.C13925a;
import p415x4.AbstractC13928a;
import p415x4.AbstractC13933d;
import p415x4.C13930c;

/* renamed from: y4.a */
/* loaded from: classes7.dex */
public class C14223a implements AbstractC13928a, C13930c.AbstractC13932b {

    /* renamed from: l */
    private static final Class<?> f32138l = C14223a.class;

    /* renamed from: a */
    private final PlatformBitmapFactory f32139a;

    /* renamed from: b */
    private final AbstractC14224b f32140b;

    /* renamed from: c */
    private final AbstractC13933d f32141c;

    /* renamed from: d */
    private final AbstractC14225c f32142d;

    /* renamed from: e */
    private final AbstractC1265a f32143e;

    /* renamed from: f */
    private final AbstractC1266b f32144f;

    /* renamed from: h */
    private Rect f32146h;

    /* renamed from: i */
    private int f32147i;

    /* renamed from: j */
    private int f32148j;

    /* renamed from: k */
    private Bitmap.Config f32149k = Bitmap.Config.ARGB_8888;

    /* renamed from: g */
    private final Paint f32145g = new Paint(6);

    public C14223a(PlatformBitmapFactory platformBitmapFactory, AbstractC14224b bVar, AbstractC13933d dVar, AbstractC14225c cVar, AbstractC1265a aVar, AbstractC1266b bVar2) {
        this.f32139a = platformBitmapFactory;
        this.f32140b = bVar;
        this.f32141c = dVar;
        this.f32142d = cVar;
        this.f32143e = aVar;
        this.f32144f = bVar2;
        m1331n();
    }

    /* renamed from: k */
    private boolean m1334k(int i, CloseableReference<Bitmap> closeableReference, Canvas canvas, int i2) {
        if (!CloseableReference.m32036R(closeableReference)) {
            return false;
        }
        if (this.f32146h == null) {
            canvas.drawBitmap(closeableReference.m32039C(), 0.0f, 0.0f, this.f32145g);
        } else {
            canvas.drawBitmap(closeableReference.m32039C(), (Rect) null, this.f32146h, this.f32145g);
        }
        if (i2 == 3) {
            return true;
        }
        this.f32140b.mo248b(i, closeableReference, i2);
        return true;
    }

    /* renamed from: l */
    private boolean m1333l(Canvas canvas, int i, int i2) {
        boolean z;
        CloseableReference<Bitmap> e;
        boolean z2 = false;
        int i3 = 1;
        CloseableReference closeableReference = null;
        try {
            if (i2 == 0) {
                e = this.f32140b.mo245e(i);
                z = m1334k(i, e, canvas, 0);
            } else if (i2 == 1) {
                e = this.f32140b.mo246d(i, this.f32147i, this.f32148j);
                if (m1332m(i, e) && m1334k(i, e, canvas, 1)) {
                    z2 = true;
                }
                z = z2;
                i3 = 2;
            } else if (i2 == 2) {
                e = this.f32139a.m31510b(this.f32147i, this.f32148j, this.f32149k);
                if (m1332m(i, e) && m1334k(i, e, canvas, 2)) {
                    z2 = true;
                }
                z = z2;
                i3 = 3;
            } else if (i2 != 3) {
                return false;
            } else {
                e = this.f32140b.mo247c(i);
                z = m1334k(i, e, canvas, 3);
                i3 = -1;
            }
            if (z || i3 == -1) {
                return z;
            }
            return m1333l(canvas, i, i3);
        } catch (RuntimeException e2) {
            C13925a.m2307E(f32138l, "Failed to create frame bitmap", e2);
            return false;
        } finally {
            CloseableReference.m32025t(closeableReference);
        }
    }

    /* renamed from: m */
    private boolean m1332m(int i, CloseableReference<Bitmap> closeableReference) {
        if (!CloseableReference.m32036R(closeableReference)) {
            return false;
        }
        boolean a = this.f32142d.mo1330a(i, closeableReference.m32039C());
        if (!a) {
            CloseableReference.m32025t(closeableReference);
        }
        return a;
    }

    /* renamed from: n */
    private void m1331n() {
        int i;
        int e = this.f32142d.mo1327e();
        this.f32147i = e;
        int i2 = -1;
        if (e == -1) {
            Rect rect = this.f32146h;
            if (rect == null) {
                i = -1;
            } else {
                i = rect.width();
            }
            this.f32147i = i;
        }
        int c = this.f32142d.mo1329c();
        this.f32148j = c;
        if (c == -1) {
            Rect rect2 = this.f32146h;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.f32148j = i2;
        }
    }

    @Override // p415x4.AbstractC13933d
    /* renamed from: a */
    public int mo1344a() {
        return this.f32141c.mo1344a();
    }

    @Override // p415x4.AbstractC13933d
    /* renamed from: b */
    public int mo1343b() {
        return this.f32141c.mo1343b();
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: c */
    public int mo1342c() {
        return this.f32148j;
    }

    @Override // p415x4.AbstractC13928a
    public void clear() {
        this.f32140b.clear();
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: d */
    public void mo1341d(Rect rect) {
        this.f32146h = rect;
        this.f32142d.mo1328d(rect);
        m1331n();
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: e */
    public int mo1340e() {
        return this.f32147i;
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: f */
    public void mo1339f(ColorFilter colorFilter) {
        this.f32145g.setColorFilter(colorFilter);
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: g */
    public boolean mo1338g(Drawable drawable, Canvas canvas, int i) {
        AbstractC1266b bVar;
        boolean l = m1333l(canvas, i, 0);
        AbstractC1265a aVar = this.f32143e;
        if (!(aVar == null || (bVar = this.f32144f) == null)) {
            aVar.mo41495a(bVar, this.f32140b, this, i);
        }
        return l;
    }

    @Override // p415x4.C13930c.AbstractC13932b
    /* renamed from: h */
    public void mo1337h() {
        clear();
    }

    @Override // p415x4.AbstractC13933d
    /* renamed from: i */
    public int mo1336i(int i) {
        return this.f32141c.mo1336i(i);
    }

    @Override // p415x4.AbstractC13928a
    /* renamed from: j */
    public void mo1335j(int i) {
        this.f32145g.setAlpha(i);
    }
}
