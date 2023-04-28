package p085ef;

import android.view.MotionEvent;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0018R$\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\r\u0010\u001cR$\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010&¨\u0006*"}, m15073d2 = {"Lef/s;", "", "Landroid/view/MotionEvent;", "event", "", "g", "a", "", "f", "Lef/s$a;", "Lef/s$a;", "gestureListener", "", "b", "J", "currentTime", "c", "previousTime", "", "d", "D", "previousAngle", "<set-?>", "e", "()D", ViewProps.ROTATION, "", "F", "()F", "anchorX", "anchorY", "h", "Z", "isInProgress", "", "i", "[I", "pointerIds", "()J", "timeDelta", "<init>", "(Lef/s$a;)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.s */
/* loaded from: classes8.dex */
public final class C6860s {

    /* renamed from: a */
    private final AbstractC6861a f14996a;

    /* renamed from: b */
    private long f14997b;

    /* renamed from: c */
    private long f14998c;

    /* renamed from: d */
    private double f14999d;

    /* renamed from: e */
    private double f15000e;

    /* renamed from: f */
    private float f15001f;

    /* renamed from: g */
    private float f15002g;

    /* renamed from: h */
    private boolean f15003h;

    /* renamed from: i */
    private final int[] f15004i = new int[2];

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, m15073d2 = {"Lef/s$a;", "", "Lef/s;", "detector", "", "a", "b", "", "c", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.s$a */
    /* loaded from: classes8.dex */
    public interface AbstractC6861a {
        /* renamed from: a */
        boolean mo24029a(C6860s sVar);

        /* renamed from: b */
        boolean mo24028b(C6860s sVar);

        /* renamed from: c */
        void mo24027c(C6860s sVar);
    }

    public C6860s(AbstractC6861a aVar) {
        this.f14996a = aVar;
    }

    /* renamed from: a */
    private final void m24043a() {
        if (this.f15003h) {
            this.f15003h = false;
            AbstractC6861a aVar = this.f14996a;
            if (aVar != null) {
                aVar.mo24027c(this);
            }
        }
    }

    /* renamed from: g */
    private final void m24037g(MotionEvent motionEvent) {
        double d;
        this.f14998c = this.f14997b;
        this.f14997b = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f15004i[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f15004i[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        float f = y2 - y;
        this.f15001f = (x + x2) * 0.5f;
        this.f15002g = (y + y2) * 0.5f;
        double d2 = -Math.atan2(f, x2 - x);
        if (Double.isNaN(this.f14999d)) {
            d = 0.0d;
        } else {
            d = this.f14999d - d2;
        }
        this.f15000e = d;
        this.f14999d = d2;
        if (d > 3.141592653589793d) {
            this.f15000e = d - 3.141592653589793d;
        } else if (d < -3.141592653589793d) {
            this.f15000e = d + 3.141592653589793d;
        }
        double d3 = this.f15000e;
        if (d3 > 1.5707963267948966d) {
            this.f15000e = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.f15000e = d3 + 3.141592653589793d;
        }
    }

    /* renamed from: b */
    public final float m24042b() {
        return this.f15001f;
    }

    /* renamed from: c */
    public final float m24041c() {
        return this.f15002g;
    }

    /* renamed from: d */
    public final double m24040d() {
        return this.f15000e;
    }

    /* renamed from: e */
    public final long m24039e() {
        return this.f14997b - this.f14998c;
    }

    /* renamed from: f */
    public final boolean m24038f(MotionEvent event) {
        C9971q.m14633g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f15003h = false;
            this.f15004i[0] = event.getPointerId(event.getActionIndex());
            this.f15004i[1] = -1;
        } else if (actionMasked == 1) {
            m24043a();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.f15003h) {
                    int pointerId = event.getPointerId(event.getActionIndex());
                    int[] iArr = this.f15004i;
                    if (pointerId == iArr[0] || pointerId == iArr[1]) {
                        m24043a();
                    }
                }
            } else if (!this.f15003h) {
                this.f15004i[1] = event.getPointerId(event.getActionIndex());
                this.f15003h = true;
                this.f14998c = event.getEventTime();
                this.f14999d = Double.NaN;
                m24037g(event);
                AbstractC6861a aVar = this.f14996a;
                if (aVar != null) {
                    aVar.mo24028b(this);
                }
            }
        } else if (this.f15003h) {
            m24037g(event);
            AbstractC6861a aVar2 = this.f14996a;
            if (aVar2 != null) {
                aVar2.mo24029a(this);
            }
        }
        return true;
    }
}
