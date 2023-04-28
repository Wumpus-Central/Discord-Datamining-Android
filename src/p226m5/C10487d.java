package p226m5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.common.references.CloseableReference;
import p191k5.AbstractC9748a;
import p191k5.C9749b;
import p191k5.C9753e;

/* renamed from: m5.d */
/* loaded from: classes7.dex */
public class C10487d {

    /* renamed from: a */
    private final AbstractC9748a f23165a;

    /* renamed from: b */
    private final AbstractC10489b f23166b;

    /* renamed from: c */
    private final Paint f23167c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m5.d$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C10488a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23168a;

        static {
            int[] iArr = new int[EnumC10490c.values().length];
            f23168a = iArr;
            try {
                iArr[EnumC10490c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23168a[EnumC10490c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23168a[EnumC10490c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23168a[EnumC10490c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: m5.d$b */
    /* loaded from: classes7.dex */
    public interface AbstractC10489b {
        /* renamed from: a */
        void mo13048a(int i, Bitmap bitmap);

        /* renamed from: b */
        CloseableReference<Bitmap> mo13047b(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m5.d$c */
    /* loaded from: classes7.dex */
    public enum EnumC10490c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public C10487d(AbstractC9748a aVar, AbstractC10489b bVar) {
        this.f23165a = aVar;
        this.f23166b = bVar;
        Paint paint = new Paint();
        this.f23167c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* renamed from: a */
    private void m13055a(Canvas canvas, C9749b bVar) {
        int i = bVar.f21697b;
        int i2 = bVar.f21698c;
        canvas.drawRect(i, i2, i + bVar.f21699d, i2 + bVar.f21700e, this.f23167c);
    }

    /* renamed from: b */
    private EnumC10490c m13054b(int i) {
        C9749b c = this.f23165a.mo13076c(i);
        C9749b.EnumC0297b bVar = c.f21702g;
        if (bVar == C9749b.EnumC0297b.DISPOSE_DO_NOT) {
            return EnumC10490c.REQUIRED;
        }
        if (bVar == C9749b.EnumC0297b.DISPOSE_TO_BACKGROUND) {
            if (m13053c(c)) {
                return EnumC10490c.NOT_REQUIRED;
            }
            return EnumC10490c.REQUIRED;
        } else if (bVar == C9749b.EnumC0297b.DISPOSE_TO_PREVIOUS) {
            return EnumC10490c.SKIP;
        } else {
            return EnumC10490c.ABORT;
        }
    }

    /* renamed from: c */
    private boolean m13053c(C9749b bVar) {
        if (bVar.f21697b == 0 && bVar.f21698c == 0 && bVar.f21699d == this.f23165a.mo13071h() && bVar.f21700e == this.f23165a.mo13072g()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m13052d(int i) {
        if (i == 0) {
            return true;
        }
        C9749b c = this.f23165a.mo13076c(i);
        C9749b c2 = this.f23165a.mo13076c(i - 1);
        if (c.f21701f == C9749b.EnumC9750a.NO_BLEND && m13053c(c)) {
            return true;
        }
        if (c2.f21702g != C9749b.EnumC0297b.DISPOSE_TO_BACKGROUND || !m13053c(c2)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m13051e(Bitmap bitmap) {
        C9753e i = this.f23165a.mo13070i();
        if (i != null) {
            i.m15432c();
        }
    }

    /* renamed from: f */
    private int m13050f(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = C10488a.f23168a[m13054b(i).ordinal()];
            if (i2 == 1) {
                C9749b c = this.f23165a.mo13076c(i);
                CloseableReference<Bitmap> b = this.f23166b.mo13047b(i);
                if (b != null) {
                    try {
                        canvas.drawBitmap(b.m32039C(), 0.0f, 0.0f, (Paint) null);
                        if (c.f21702g == C9749b.EnumC0297b.DISPOSE_TO_BACKGROUND) {
                            m13055a(canvas, c);
                        }
                        return i + 1;
                    } finally {
                        b.close();
                    }
                } else if (m13052d(i)) {
                    return i;
                }
            } else if (i2 == 2) {
                return i + 1;
            } else {
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    /* renamed from: g */
    public void m13049g(int i, Bitmap bitmap) {
        int i2;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!m13052d(i)) {
            i2 = m13050f(i - 1, canvas);
        } else {
            i2 = i;
        }
        while (i2 < i) {
            C9749b c = this.f23165a.mo13076c(i2);
            C9749b.EnumC0297b bVar = c.f21702g;
            if (bVar != C9749b.EnumC0297b.DISPOSE_TO_PREVIOUS) {
                if (c.f21701f == C9749b.EnumC9750a.NO_BLEND) {
                    m13055a(canvas, c);
                }
                this.f23165a.mo13075d(i2, canvas);
                this.f23166b.mo13048a(i2, bitmap);
                if (bVar == C9749b.EnumC0297b.DISPOSE_TO_BACKGROUND) {
                    m13055a(canvas, c);
                }
            }
            i2++;
        }
        C9749b c2 = this.f23165a.mo13076c(i);
        if (c2.f21701f == C9749b.EnumC9750a.NO_BLEND) {
            m13055a(canvas, c2);
        }
        this.f23165a.mo13075d(i, canvas);
        m13051e(bitmap);
    }
}
