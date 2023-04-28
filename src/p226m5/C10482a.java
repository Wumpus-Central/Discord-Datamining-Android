package p226m5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import p191k5.AbstractC9748a;
import p191k5.AbstractC9751c;
import p191k5.AbstractC9752d;
import p191k5.C9749b;
import p191k5.C9753e;
import p241n5.C10717a;

/* renamed from: m5.a */
/* loaded from: classes7.dex */
public class C10482a implements AbstractC9748a {

    /* renamed from: a */
    private final C10717a f23146a;

    /* renamed from: b */
    private final C9753e f23147b;

    /* renamed from: c */
    private final AbstractC9751c f23148c;

    /* renamed from: d */
    private final Rect f23149d;

    /* renamed from: e */
    private final int[] f23150e;

    /* renamed from: f */
    private final int[] f23151f;

    /* renamed from: g */
    private final int f23152g;

    /* renamed from: h */
    private final C9749b[] f23153h;

    /* renamed from: i */
    private final Rect f23154i = new Rect();

    /* renamed from: j */
    private final Rect f23155j = new Rect();

    /* renamed from: k */
    private final boolean f23156k;

    /* renamed from: l */
    private Bitmap f23157l;

    public C10482a(C10717a aVar, C9753e eVar, Rect rect, boolean z) {
        this.f23146a = aVar;
        this.f23147b = eVar;
        AbstractC9751c d = eVar.m15431d();
        this.f23148c = d;
        int[] j = d.mo15438j();
        this.f23150e = j;
        aVar.m12577a(j);
        this.f23152g = aVar.m12575c(j);
        this.f23151f = aVar.m12576b(j);
        this.f23149d = m13068k(d, rect);
        this.f23156k = z;
        this.f23153h = new C9749b[d.mo15445a()];
        for (int i = 0; i < this.f23148c.mo15445a(); i++) {
            this.f23153h[i] = this.f23148c.mo15443c(i);
        }
    }

    /* renamed from: j */
    private synchronized void m13069j() {
        Bitmap bitmap = this.f23157l;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23157l = null;
        }
    }

    /* renamed from: k */
    private static Rect m13068k(AbstractC9751c cVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, cVar.getWidth(), cVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    /* renamed from: l */
    private synchronized Bitmap m13067l(int i, int i2) {
        Bitmap bitmap = this.f23157l;
        if (bitmap != null && (bitmap.getWidth() < i || this.f23157l.getHeight() < i2)) {
            m13069j();
        }
        if (this.f23157l == null) {
            this.f23157l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        this.f23157l.eraseColor(0);
        return this.f23157l;
    }

    /* renamed from: m */
    private void m13066m(Canvas canvas, AbstractC9752d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f23156k) {
            float max = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            i3 = (int) (dVar.getWidth() / max);
            i2 = (int) (dVar.getHeight() / max);
            i = (int) (dVar.mo15436b() / max);
            i4 = (int) (dVar.mo15435c() / max);
        } else {
            i3 = dVar.getWidth();
            i2 = dVar.getHeight();
            i = dVar.mo15436b();
            i4 = dVar.mo15435c();
        }
        synchronized (this) {
            Bitmap l = m13067l(i3, i2);
            this.f23157l = l;
            dVar.mo15437a(i3, i2, l);
            canvas.save();
            canvas.translate(i, i4);
            canvas.drawBitmap(this.f23157l, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    /* renamed from: n */
    private void m13065n(Canvas canvas, AbstractC9752d dVar) {
        double width = this.f23149d.width() / this.f23148c.getWidth();
        double height = this.f23149d.height() / this.f23148c.getHeight();
        int round = (int) Math.round(dVar.getWidth() * width);
        int round2 = (int) Math.round(dVar.getHeight() * height);
        int b = (int) (dVar.mo15436b() * width);
        int c = (int) (dVar.mo15435c() * height);
        synchronized (this) {
            int width2 = this.f23149d.width();
            int height2 = this.f23149d.height();
            m13067l(width2, height2);
            Bitmap bitmap = this.f23157l;
            if (bitmap != null) {
                dVar.mo15437a(round, round2, bitmap);
            }
            this.f23154i.set(0, 0, width2, height2);
            this.f23155j.set(b, c, width2 + b, height2 + c);
            Bitmap bitmap2 = this.f23157l;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, this.f23154i, this.f23155j, (Paint) null);
            }
        }
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: a */
    public int mo13078a() {
        return this.f23148c.mo15445a();
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: b */
    public int mo13077b() {
        return this.f23148c.mo15444b();
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: c */
    public C9749b mo13076c(int i) {
        return this.f23153h[i];
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: d */
    public void mo13075d(int i, Canvas canvas) {
        AbstractC9752d i2 = this.f23148c.mo15439i(i);
        try {
            if (this.f23148c.mo15442e()) {
                m13065n(canvas, i2);
            } else {
                m13066m(canvas, i2);
            }
        } finally {
            i2.dispose();
        }
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: e */
    public AbstractC9748a mo13074e(Rect rect) {
        if (m13068k(this.f23148c, rect).equals(this.f23149d)) {
            return this;
        }
        return new C10482a(this.f23146a, this.f23147b, rect, this.f23156k);
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: f */
    public int mo13073f(int i) {
        return this.f23150e[i];
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: g */
    public int mo13072g() {
        return this.f23149d.height();
    }

    @Override // p191k5.AbstractC9748a
    public int getHeight() {
        return this.f23148c.getHeight();
    }

    @Override // p191k5.AbstractC9748a
    public int getWidth() {
        return this.f23148c.getWidth();
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: h */
    public int mo13071h() {
        return this.f23149d.width();
    }

    @Override // p191k5.AbstractC9748a
    /* renamed from: i */
    public C9753e mo13070i() {
        return this.f23147b;
    }
}
