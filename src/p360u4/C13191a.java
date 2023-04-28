package p360u4;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: u4.a */
/* loaded from: classes7.dex */
public class C13191a {

    /* renamed from: a */
    AbstractC0427a f29582a;

    /* renamed from: b */
    final float f29583b;

    /* renamed from: c */
    boolean f29584c;

    /* renamed from: d */
    boolean f29585d;

    /* renamed from: e */
    long f29586e;

    /* renamed from: f */
    float f29587f;

    /* renamed from: g */
    float f29588g;

    /* renamed from: u4.a$a */
    /* loaded from: classes7.dex */
    public interface AbstractC0427a {
        /* renamed from: c */
        boolean mo4369c();
    }

    public C13191a(Context context) {
        this.f29583b = ViewConfiguration.get(context).getScaledTouchSlop();
        m4375a();
    }

    /* renamed from: c */
    public static C13191a m4373c(Context context) {
        return new C13191a(context);
    }

    /* renamed from: a */
    public void m4375a() {
        this.f29582a = null;
        m4371e();
    }

    /* renamed from: b */
    public boolean m4374b() {
        return this.f29584c;
    }

    /* renamed from: d */
    public boolean m4372d(MotionEvent motionEvent) {
        AbstractC0427a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f29584c = true;
            this.f29585d = true;
            this.f29586e = motionEvent.getEventTime();
            this.f29587f = motionEvent.getX();
            this.f29588g = motionEvent.getY();
        } else if (action == 1) {
            this.f29584c = false;
            if (Math.abs(motionEvent.getX() - this.f29587f) > this.f29583b || Math.abs(motionEvent.getY() - this.f29588g) > this.f29583b) {
                this.f29585d = false;
            }
            if (this.f29585d && motionEvent.getEventTime() - this.f29586e <= ViewConfiguration.getLongPressTimeout() && (aVar = this.f29582a) != null) {
                aVar.mo4369c();
            }
            this.f29585d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f29584c = false;
                this.f29585d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f29587f) > this.f29583b || Math.abs(motionEvent.getY() - this.f29588g) > this.f29583b) {
            this.f29585d = false;
        }
        return true;
    }

    /* renamed from: e */
    public void m4371e() {
        this.f29584c = false;
        this.f29585d = false;
    }

    /* renamed from: f */
    public void m4370f(AbstractC0427a aVar) {
        this.f29582a = aVar;
    }
}
