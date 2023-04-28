package p200kf;

import android.view.MotionEvent;

/* renamed from: kf.h */
/* loaded from: classes8.dex */
public class C9864h {

    /* renamed from: a */
    private float f21980a;

    /* renamed from: b */
    private float f21981b;

    /* renamed from: c */
    private float f21982c;

    /* renamed from: d */
    private float f21983d;

    /* renamed from: e */
    private int f21984e = -1;

    /* renamed from: f */
    private int f21985f = -1;

    /* renamed from: g */
    private float f21986g;

    /* renamed from: h */
    private boolean f21987h;

    /* renamed from: i */
    private AbstractC9865a f21988i;

    /* renamed from: kf.h$a */
    /* loaded from: classes8.dex */
    public interface AbstractC9865a {
        /* renamed from: a */
        boolean mo15160a(C9864h hVar);
    }

    /* renamed from: kf.h$b */
    /* loaded from: classes8.dex */
    public static class C9866b implements AbstractC9865a {
    }

    public C9864h(AbstractC9865a aVar) {
        this.f21988i = aVar;
    }

    /* renamed from: a */
    private float m15164a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m15163b((float) Math.toDegrees((float) Math.atan2(f2 - f4, f - f3)), (float) Math.toDegrees((float) Math.atan2(f6 - f8, f5 - f7)));
    }

    /* renamed from: b */
    private float m15163b(float f, float f2) {
        float f3 = (f2 % 360.0f) - (f % 360.0f);
        this.f21986g = f3;
        if (f3 < -180.0f) {
            this.f21986g = f3 + 360.0f;
        } else if (f3 > 180.0f) {
            this.f21986g = f3 - 360.0f;
        }
        return this.f21986g;
    }

    /* renamed from: c */
    public float m15162c() {
        return this.f21986g;
    }

    /* renamed from: d */
    public boolean m15161d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21982c = motionEvent.getX();
            this.f21983d = motionEvent.getY();
            this.f21984e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.f21986g = 0.0f;
            this.f21987h = true;
        } else if (actionMasked == 1) {
            this.f21984e = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f21980a = motionEvent.getX();
                this.f21981b = motionEvent.getY();
                this.f21985f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.f21986g = 0.0f;
                this.f21987h = true;
            } else if (actionMasked == 6) {
                this.f21985f = -1;
            }
        } else if (!(this.f21984e == -1 || this.f21985f == -1 || motionEvent.getPointerCount() <= this.f21985f)) {
            float x = motionEvent.getX(this.f21984e);
            float y = motionEvent.getY(this.f21984e);
            float x2 = motionEvent.getX(this.f21985f);
            float y2 = motionEvent.getY(this.f21985f);
            if (this.f21987h) {
                this.f21986g = 0.0f;
                this.f21987h = false;
            } else {
                m15164a(this.f21980a, this.f21981b, this.f21982c, this.f21983d, x2, y2, x, y);
            }
            AbstractC9865a aVar = this.f21988i;
            if (aVar != null) {
                aVar.mo15160a(this);
            }
            this.f21980a = x2;
            this.f21981b = y2;
            this.f21982c = x;
            this.f21983d = y;
        }
        return true;
    }
}
