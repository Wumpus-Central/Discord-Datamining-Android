package p313r4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p163j$.util.Spliterator;
import p333s4.AbstractC12784b;

/* renamed from: r4.a */
/* loaded from: classes7.dex */
public class C12386a extends Drawable implements AbstractC12784b {

    /* renamed from: A */
    private int f39225A;

    /* renamed from: B */
    private int f39226B;

    /* renamed from: C */
    private int f39227C;

    /* renamed from: D */
    private int f39228D;

    /* renamed from: E */
    private long f39229E;

    /* renamed from: F */
    private String f39230F;

    /* renamed from: k */
    private String f27823k;

    /* renamed from: l */
    private String f27824l;

    /* renamed from: m */
    private int f27825m;

    /* renamed from: n */
    private int f27826n;

    /* renamed from: o */
    private int f27827o;

    /* renamed from: p */
    private String f27828p;

    /* renamed from: q */
    private ScalingUtils.ScaleType f27829q;

    /* renamed from: s */
    private int f27831s;

    /* renamed from: t */
    private int f27832t;

    /* renamed from: z */
    private int f27838z;

    /* renamed from: r */
    private HashMap<String, String> f27830r = new HashMap<>();

    /* renamed from: u */
    private int f27833u = 80;

    /* renamed from: v */
    private final Paint f27834v = new Paint(1);

    /* renamed from: w */
    private final Matrix f27835w = new Matrix();

    /* renamed from: x */
    private final Rect f27836x = new Rect();

    /* renamed from: y */
    private final RectF f27837y = new RectF();

    /* renamed from: G */
    private int f39231G = -1;

    /* renamed from: H */
    private int f39232H = 0;

    public C12386a() {
        m6980h();
    }

    /* renamed from: b */
    private void m6986b(Canvas canvas, String str, Object obj) {
        m6984d(canvas, str, String.valueOf(obj), -1);
    }

    /* renamed from: c */
    private void m6985c(Canvas canvas, String str, String str2) {
        m6984d(canvas, str, str2, -1);
    }

    /* renamed from: d */
    private void m6984d(Canvas canvas, String str, String str2, int i) {
        String str3 = str + ": ";
        float measureText = this.f27834v.measureText(str3);
        float measureText2 = this.f27834v.measureText(str2);
        this.f27834v.setColor(1711276032);
        int i2 = this.f39227C;
        int i3 = this.f39228D;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + measureText + measureText2 + 4.0f, i3 + this.f39226B + 8, this.f27834v);
        this.f27834v.setColor(-1);
        canvas.drawText(str3, this.f39227C, this.f39228D, this.f27834v);
        this.f27834v.setColor(i);
        canvas.drawText(str2, this.f39227C + measureText, this.f39228D, this.f27834v);
        this.f39228D += this.f39226B;
    }

    /* renamed from: f */
    private static String m6982f(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    /* renamed from: g */
    private void m6981g(Rect rect, int i, int i2) {
        int i3;
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f27834v.setTextSize(min);
        int i4 = min + 8;
        this.f39226B = i4;
        int i5 = this.f27833u;
        if (i5 == 80) {
            this.f39226B = i4 * (-1);
        }
        this.f27838z = rect.left + 10;
        if (i5 == 80) {
            i3 = rect.bottom - 10;
        } else {
            i3 = rect.top + 10 + 10;
        }
        this.f39225A = i3;
    }

    @Override // p333s4.AbstractC12784b
    /* renamed from: a */
    public void mo5481a(long j) {
        this.f39229E = j;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f27834v.setStyle(Paint.Style.STROKE);
        this.f27834v.setStrokeWidth(2.0f);
        this.f27834v.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f27834v);
        this.f27834v.setStyle(Paint.Style.FILL);
        this.f27834v.setColor(this.f39232H);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f27834v);
        this.f27834v.setStyle(Paint.Style.FILL);
        this.f27834v.setStrokeWidth(0.0f);
        this.f27834v.setColor(-1);
        this.f39227C = this.f27838z;
        this.f39228D = this.f39225A;
        String str = this.f27824l;
        if (str != null) {
            m6985c(canvas, "IDs", m6982f("%s, %s", this.f27823k, str));
        } else {
            m6985c(canvas, "ID", this.f27823k);
        }
        m6985c(canvas, "D", m6982f("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        m6984d(canvas, "I", m6982f("%dx%d", Integer.valueOf(this.f27825m), Integer.valueOf(this.f27826n)), m6983e(this.f27825m, this.f27826n, this.f27829q));
        m6985c(canvas, "I", m6982f("%d KiB", Integer.valueOf(this.f27827o / Spliterator.IMMUTABLE)));
        String str2 = this.f27828p;
        if (str2 != null) {
            m6985c(canvas, "i format", str2);
        }
        int i = this.f27831s;
        if (i > 0) {
            m6985c(canvas, "anim", m6982f("f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.f27832t)));
        }
        ScalingUtils.ScaleType scaleType = this.f27829q;
        if (scaleType != null) {
            m6986b(canvas, "scale", scaleType);
        }
        long j = this.f39229E;
        if (j >= 0) {
            m6985c(canvas, "t", m6982f("%d ms", Long.valueOf(j)));
        }
        String str3 = this.f39230F;
        if (str3 != null) {
            m6984d(canvas, "origin", str3, this.f39231G);
        }
        for (Map.Entry<String, String> entry : this.f27830r.entrySet()) {
            m6985c(canvas, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: e */
    int m6983e(int i, int i2, ScalingUtils.ScaleType scaleType) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (scaleType != null) {
                Rect rect = this.f27836x;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f27835w.reset();
                scaleType.getTransform(this.f27835w, this.f27836x, i, i2, 0.0f, 0.0f);
                RectF rectF = this.f27837y;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                this.f27835w.mapRect(rectF);
                width = Math.min(width, (int) this.f27837y.width());
                height = Math.min(height, (int) this.f27837y.height());
            }
            float f = width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = abs;
            if (f7 < f2 && abs2 < f5) {
                return -16711936;
            }
            if (f7 < f3 && abs2 < f6) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m6980h() {
        this.f27825m = -1;
        this.f27826n = -1;
        this.f27827o = -1;
        this.f27830r = new HashMap<>();
        this.f27831s = -1;
        this.f27832t = -1;
        this.f27828p = null;
        m6979i(null);
        this.f39229E = -1L;
        this.f39230F = null;
        this.f39231G = -1;
        invalidateSelf();
    }

    /* renamed from: i */
    public void m6979i(String str) {
        if (str == null) {
            str = ViewProps.NONE;
        }
        this.f27823k = str;
        invalidateSelf();
    }

    /* renamed from: j */
    public void m6978j(int i, int i2) {
        this.f27825m = i;
        this.f27826n = i2;
        invalidateSelf();
    }

    /* renamed from: k */
    public void m6977k(int i) {
        this.f27827o = i;
    }

    /* renamed from: l */
    public void m6976l(String str, int i) {
        this.f39230F = str;
        this.f39231G = i;
        invalidateSelf();
    }

    /* renamed from: m */
    public void m6975m(ScalingUtils.ScaleType scaleType) {
        this.f27829q = scaleType;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m6981g(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
