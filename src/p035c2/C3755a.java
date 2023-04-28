package p035c2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ReactImageView;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: c2.a */
/* loaded from: classes.dex */
public class C3755a extends View {

    /* renamed from: E0 */
    private int f35836E0;

    /* renamed from: F0 */
    private int f35838F0;

    /* renamed from: G0 */
    private int f35840G0;

    /* renamed from: H0 */
    private float f35842H0;

    /* renamed from: I0 */
    private float f35844I0;

    /* renamed from: J0 */
    private float f35846J0;

    /* renamed from: O */
    private String f35855O;

    /* renamed from: P */
    private String f35857P;

    /* renamed from: Q */
    private String f35858Q;

    /* renamed from: R */
    private String f35859R;

    /* renamed from: h0 */
    private Scroller f6101h0;

    /* renamed from: i0 */
    private VelocityTracker f6102i0;

    /* renamed from: m0 */
    private String[] f6109m0;

    /* renamed from: n0 */
    private CharSequence[] f6111n0;

    /* renamed from: o0 */
    private CharSequence[] f6113o0;

    /* renamed from: p0 */
    private HandlerThread f6115p0;

    /* renamed from: q0 */
    private Handler f6117q0;

    /* renamed from: r0 */
    private Handler f6119r0;

    /* renamed from: t0 */
    private AbstractC3758d f6123t0;

    /* renamed from: u0 */
    private AbstractC3759e f6125u0;

    /* renamed from: w0 */
    private int f6129w0;

    /* renamed from: x0 */
    private int f6131x0;

    /* renamed from: y0 */
    private int f6133y0;

    /* renamed from: z0 */
    private int f6135z0;

    /* renamed from: k */
    private int f6104k = -13421773;

    /* renamed from: l */
    private int f6106l = -695533;

    /* renamed from: m */
    private int f6108m = -695533;

    /* renamed from: n */
    private int f6110n = 0;

    /* renamed from: o */
    private int f6112o = 0;

    /* renamed from: p */
    private int f6114p = 0;

    /* renamed from: q */
    private int f6116q = 0;

    /* renamed from: r */
    private int f6118r = 0;

    /* renamed from: s */
    private int f6120s = 0;

    /* renamed from: t */
    private int f6122t = 0;

    /* renamed from: u */
    private int f6124u = 0;

    /* renamed from: v */
    private int f6126v = 0;

    /* renamed from: w */
    private int f6128w = -695533;

    /* renamed from: x */
    private int f6130x = 2;

    /* renamed from: y */
    private int f6132y = 0;

    /* renamed from: z */
    private int f6134z = 0;

    /* renamed from: A */
    private int f35827A = 3;

    /* renamed from: B */
    private int f35829B = 0;

    /* renamed from: C */
    private int f35831C = 0;

    /* renamed from: D */
    private int f35833D = -1;

    /* renamed from: E */
    private int f35835E = -1;

    /* renamed from: F */
    private int f35837F = 0;

    /* renamed from: G */
    private int f35839G = 0;

    /* renamed from: H */
    private int f35841H = 0;

    /* renamed from: I */
    private int f35843I = 0;

    /* renamed from: J */
    private int f35845J = 0;

    /* renamed from: K */
    private int f35847K = 0;

    /* renamed from: L */
    private int f35849L = 0;

    /* renamed from: M */
    private int f35851M = 150;

    /* renamed from: N */
    private int f35853N = 8;

    /* renamed from: S */
    private float f35860S = 1.0f;

    /* renamed from: T */
    private float f35861T = 0.0f;

    /* renamed from: U */
    private float f35862U = 0.0f;

    /* renamed from: V */
    private float f35863V = 0.0f;

    /* renamed from: W */
    private boolean f35864W = true;

    /* renamed from: a0 */
    private boolean f6094a0 = true;

    /* renamed from: b0 */
    private boolean f6095b0 = false;

    /* renamed from: c0 */
    private boolean f6096c0 = false;

    /* renamed from: d0 */
    private boolean f6097d0 = true;

    /* renamed from: e0 */
    private boolean f6098e0 = false;

    /* renamed from: f0 */
    private boolean f6099f0 = false;

    /* renamed from: g0 */
    private boolean f6100g0 = true;

    /* renamed from: j0 */
    private Paint f6103j0 = new Paint();

    /* renamed from: k0 */
    private TextPaint f6105k0 = new TextPaint();

    /* renamed from: l0 */
    private Paint f6107l0 = new Paint();

    /* renamed from: s0 */
    private Map<String, Integer> f6121s0 = new ConcurrentHashMap();

    /* renamed from: v0 */
    private int f6127v0 = 0;

    /* renamed from: A0 */
    private float f35828A0 = 0.0f;

    /* renamed from: B0 */
    private float f35830B0 = 0.0f;

    /* renamed from: C0 */
    private float f35832C0 = 0.0f;

    /* renamed from: D0 */
    private boolean f35834D0 = false;

    /* renamed from: K0 */
    private int f35848K0 = 0;

    /* renamed from: L0 */
    private int f35850L0 = 0;

    /* renamed from: M0 */
    private int f35852M0 = 0;

    /* renamed from: N0 */
    private int f35854N0 = 0;

    /* renamed from: O0 */
    private int f35856O0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c2.a$a */
    /* loaded from: classes.dex */
    public class HandlerC0095a extends Handler {
        HandlerC0095a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i;
            int i2;
            int i3 = message.what;
            if (i3 == 1) {
                int i4 = 0;
                if (!C3755a.this.f6101h0.isFinished()) {
                    if (C3755a.this.f6127v0 == 0) {
                        C3755a.this.m33671T(1);
                    }
                    C3755a.this.f6117q0.sendMessageDelayed(C3755a.this.m33686E(1, 0, 0, message.obj), 32L);
                    return;
                }
                if (C3755a.this.f35850L0 != 0) {
                    if (C3755a.this.f6127v0 == 0) {
                        C3755a.this.m33671T(1);
                    }
                    if (C3755a.this.f35850L0 < (-C3755a.this.f35840G0) / 2) {
                        i2 = (int) (((C3755a.this.f35840G0 + C3755a.this.f35850L0) * 300.0f) / C3755a.this.f35840G0);
                        C3755a.this.f6101h0.startScroll(0, C3755a.this.f35852M0, 0, C3755a.this.f35850L0 + C3755a.this.f35840G0, i2 * 3);
                        C3755a aVar = C3755a.this;
                        i = aVar.m33683H(aVar.f35852M0 + C3755a.this.f35840G0 + C3755a.this.f35850L0);
                    } else {
                        i2 = (int) (((-C3755a.this.f35850L0) * 300.0f) / C3755a.this.f35840G0);
                        C3755a.this.f6101h0.startScroll(0, C3755a.this.f35852M0, 0, C3755a.this.f35850L0, i2 * 3);
                        C3755a aVar2 = C3755a.this;
                        i = aVar2.m33683H(aVar2.f35852M0 + C3755a.this.f35850L0);
                    }
                    i4 = i2;
                    C3755a.this.postInvalidate();
                } else {
                    C3755a.this.m33671T(0);
                    C3755a aVar3 = C3755a.this;
                    i = aVar3.m33683H(aVar3.f35852M0);
                }
                C3755a aVar4 = C3755a.this;
                Message E = aVar4.m33686E(2, aVar4.f35849L, i, message.obj);
                if (C3755a.this.f6100g0) {
                    C3755a.this.f6119r0.sendMessageDelayed(E, i4 * 2);
                } else {
                    C3755a.this.f6117q0.sendMessageDelayed(E, i4 * 2);
                }
            } else if (i3 == 2) {
                C3755a.this.m33668W(message.arg1, message.arg2, message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c2.a$b */
    /* loaded from: classes.dex */
    public class HandlerC3756b extends Handler {
        HandlerC3756b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 2) {
                C3755a.this.m33668W(message.arg1, message.arg2, message.obj);
            } else if (i == 3) {
                C3755a.this.requestLayout();
            }
        }
    }

    /* renamed from: c2.a$c */
    /* loaded from: classes.dex */
    public interface AbstractC3757c {
    }

    /* renamed from: c2.a$d */
    /* loaded from: classes.dex */
    public interface AbstractC3758d {
        /* renamed from: a */
        void mo26896a(C3755a aVar, int i, int i2);
    }

    /* renamed from: c2.a$e */
    /* loaded from: classes.dex */
    public interface AbstractC3759e {
        /* renamed from: a */
        void mo26897a(C3755a aVar, int i, int i2);
    }

    /* renamed from: c2.a$f */
    /* loaded from: classes.dex */
    public interface AbstractC3760f {
    }

    public C3755a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33680K(context, attributeSet);
        m33681J(context);
    }

    /* renamed from: A */
    private float m33690A(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    /* renamed from: B */
    private int m33689B(int i, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (!z) {
            return i;
        }
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    /* renamed from: C */
    private int m33688C(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                i = Math.max(m33684G(charSequence, paint), i);
            }
        }
        return i;
    }

    /* renamed from: D */
    private Message m33687D(int i) {
        return m33686E(i, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public Message m33686E(int i, int i2, int i3, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: F */
    private float m33685F(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* renamed from: G */
    private int m33684G(CharSequence charSequence, Paint paint) {
        Integer num;
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String charSequence2 = charSequence.toString();
        if (this.f6121s0.containsKey(charSequence2) && (num = this.f6121s0.get(charSequence2)) != null) {
            return num.intValue();
        }
        int measureText = (int) (paint.measureText(charSequence2) + 0.5f);
        this.f6121s0.put(charSequence2, Integer.valueOf(measureText));
        return measureText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public int m33683H(int i) {
        int i2 = this.f35840G0;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i / i2) + (this.f35827A / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.f6094a0 && this.f6097d0) {
            z = true;
        }
        int B = m33689B(i3, oneRecycleSize, z);
        if (B < 0 || B >= getOneRecycleSize()) {
            return getOneRecycleSize() - 1;
        }
        return B + this.f35833D;
    }

    /* renamed from: I */
    private void m33682I() {
        if (this.f6109m0 == null) {
            this.f6109m0 = r0;
            String[] strArr = {""};
        }
    }

    /* renamed from: J */
    private void m33681J(Context context) {
        this.f6101h0 = new Scroller(context);
        this.f35851M = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.f35853N = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f6110n == 0) {
            this.f6110n = m33658d0(context, 14.0f);
        }
        if (this.f6112o == 0) {
            this.f6112o = m33658d0(context, 16.0f);
        }
        if (this.f6114p == 0) {
            this.f6114p = m33658d0(context, 14.0f);
        }
        if (this.f6120s == 0) {
            this.f6120s = m33629v(context, 8.0f);
        }
        if (this.f6122t == 0) {
            this.f6122t = m33629v(context, 8.0f);
        }
        this.f6103j0.setColor(this.f6128w);
        this.f6103j0.setAntiAlias(true);
        this.f6103j0.setStyle(Paint.Style.STROKE);
        this.f6103j0.setStrokeWidth(this.f6130x);
        this.f6105k0.setColor(this.f6104k);
        this.f6105k0.setAntiAlias(true);
        this.f6105k0.setTextAlign(Paint.Align.RIGHT);
        this.f6107l0.setColor(this.f6108m);
        this.f6107l0.setAntiAlias(true);
        this.f6107l0.setTextAlign(Paint.Align.CENTER);
        this.f6107l0.setTextSize(this.f6114p);
        int i = this.f35827A;
        if (i % 2 == 0) {
            this.f35827A = i + 1;
        }
        if (this.f35833D == -1 || this.f35835E == -1) {
            m33638n0();
        }
        m33679L();
    }

    /* renamed from: K */
    private void m33680K(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3761b.f6138a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C3761b.f6157t) {
                    this.f35827A = obtainStyledAttributes.getInt(index, 3);
                } else if (index == C3761b.f6142e) {
                    this.f6128w = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == C3761b.f6143f) {
                    this.f6130x = obtainStyledAttributes.getDimensionPixelSize(index, 2);
                } else if (index == C3761b.f6144g) {
                    this.f6132y = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C3761b.f6145h) {
                    this.f6134z = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C3761b.f6158u) {
                    this.f6109m0 = m33631t(obtainStyledAttributes.getTextArray(index));
                } else if (index == C3761b.f6160w) {
                    this.f6104k = obtainStyledAttributes.getColor(index, -13421773);
                } else if (index == C3761b.f6161x) {
                    this.f6106l = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == C3761b.f6159v) {
                    this.f6108m = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == C3761b.f35865A) {
                    this.f6110n = obtainStyledAttributes.getDimensionPixelSize(index, m33658d0(context, 14.0f));
                } else if (index == C3761b.f35866B) {
                    this.f6112o = obtainStyledAttributes.getDimensionPixelSize(index, m33658d0(context, 16.0f));
                } else if (index == C3761b.f6163z) {
                    this.f6114p = obtainStyledAttributes.getDimensionPixelSize(index, m33658d0(context, 14.0f));
                } else if (index == C3761b.f6153p) {
                    this.f35833D = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == C3761b.f6152o) {
                    this.f35835E = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == C3761b.f35867C) {
                    this.f6094a0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == C3761b.f6156s) {
                    this.f35864W = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == C3761b.f6147j) {
                    this.f35855O = obtainStyledAttributes.getString(index);
                } else if (index == C3761b.f6139b) {
                    this.f35859R = obtainStyledAttributes.getString(index);
                } else if (index == C3761b.f6146i) {
                    this.f35858Q = obtainStyledAttributes.getString(index);
                } else if (index == C3761b.f6151n) {
                    this.f6120s = obtainStyledAttributes.getDimensionPixelSize(index, m33629v(context, 8.0f));
                } else if (index == C3761b.f6150m) {
                    this.f6122t = obtainStyledAttributes.getDimensionPixelSize(index, m33629v(context, 8.0f));
                } else if (index == C3761b.f6149l) {
                    this.f6124u = obtainStyledAttributes.getDimensionPixelSize(index, m33629v(context, 2.0f));
                } else if (index == C3761b.f6148k) {
                    this.f6126v = obtainStyledAttributes.getDimensionPixelSize(index, m33629v(context, 5.0f));
                } else if (index == C3761b.f6140c) {
                    this.f6111n0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == C3761b.f6141d) {
                    this.f6113o0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == C3761b.f6155r) {
                    this.f6099f0 = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == C3761b.f6154q) {
                    this.f6100g0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == C3761b.f6162y) {
                    this.f35857P = obtainStyledAttributes.getString(index);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: L */
    private void m33679L() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.f6115p0 = handlerThread;
        handlerThread.start();
        this.f6117q0 = new HandlerC0095a(this.f6115p0.getLooper());
        this.f6119r0 = new HandlerC3756b();
    }

    /* renamed from: M */
    private void m33678M() {
        if (!this.f6115p0.isAlive()) {
            m33679L();
        }
    }

    /* renamed from: N */
    private void m33677N() {
        m33630u(getPickedIndexRelativeToRaw() - this.f35833D, false);
        this.f6094a0 = false;
        postInvalidate();
    }

    /* renamed from: P */
    private boolean m33675P(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: Q */
    private int m33674Q(int i) {
        if (this.f6094a0 && this.f6097d0) {
            return i;
        }
        int i2 = this.f6135z0;
        if (i >= i2 && i <= (i2 = this.f6133y0)) {
            return i;
        }
        return i2;
    }

    /* renamed from: R */
    private int m33673R(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f35856O0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f35827A * (this.f35843I + (this.f6124u * 2)));
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingTop, size);
        }
        return paddingTop;
    }

    /* renamed from: S */
    private int m33672S(int i) {
        int i2;
        int mode = View.MeasureSpec.getMode(i);
        this.f35854N0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i3 = 0;
        if (Math.max(this.f6116q, this.f6118r) == 0) {
            i2 = 0;
        } else {
            i2 = this.f6122t;
        }
        if (Math.max(this.f6116q, this.f6118r) != 0) {
            i3 = this.f6120s;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f35845J, Math.max(this.f35841H, this.f35847K) + ((i3 + Math.max(this.f6116q, this.f6118r) + i2 + (this.f6126v * 2)) * 2));
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingLeft, size);
        }
        return paddingLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m33671T(int i) {
        if (this.f6127v0 != i) {
            this.f6127v0 = i;
        }
    }

    /* renamed from: U */
    private int m33670U(int i, int i2, int i3, boolean z) {
        if (z) {
            if (i > i3) {
                return (((i - i3) % getOneRecycleSize()) + i2) - 1;
            }
            if (i < i2) {
                return ((i - i2) % getOneRecycleSize()) + i3 + 1;
            }
            return i;
        } else if (i > i3) {
            return i3;
        } else {
            if (i < i2) {
                return i2;
            }
            return i;
        }
    }

    /* renamed from: V */
    private void m33669V() {
        VelocityTracker velocityTracker = this.f6102i0;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f6102i0.recycle();
            this.f6102i0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m33668W(int i, int i2, Object obj) {
        AbstractC3758d dVar;
        m33671T(0);
        if (i != i2) {
            if ((obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (dVar = this.f6123t0) != null) {
                int i3 = this.f35837F;
                dVar.mo26896a(this, i + i3, i3 + i2);
            }
            this.f35849L = i2;
        }
        if (this.f6098e0) {
            this.f6098e0 = false;
            m33677N();
        }
    }

    /* renamed from: X */
    private void m33667X(int i, int i2) {
        this.f6125u0.mo26897a(this, i, i2);
    }

    /* renamed from: Y */
    private void m33666Y(int i) {
        m33665Z(i, true);
    }

    /* renamed from: Z */
    private void m33665Z(int i, boolean z) {
        int i2;
        int i3;
        int pickedIndexRelativeToRaw;
        int pickedIndexRelativeToRaw2;
        int i4;
        m33678M();
        if ((!this.f6094a0 || !this.f6097d0) && ((pickedIndexRelativeToRaw2 = (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw()) + i) > (i4 = this.f35835E) || pickedIndexRelativeToRaw2 < (i4 = this.f35833D))) {
            i = i4 - pickedIndexRelativeToRaw;
        }
        int i5 = this.f35850L0;
        int i6 = this.f35840G0;
        if (i5 < (-i6) / 2) {
            int i7 = i6 + i5;
            int i8 = (int) (((i5 + i6) * 300.0f) / i6);
            if (i < 0) {
                i3 = (-i8) - (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            } else {
                i3 = i8 + (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            }
            i2 = i3;
            i5 = i7;
        } else {
            int i9 = (int) (((-i5) * 300.0f) / i6);
            if (i < 0) {
                i2 = i9 - (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            } else {
                i2 = i9 + (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            }
        }
        int i10 = i5 + (i * i6);
        if (i2 < 300) {
            i2 = 300;
        }
        if (i2 > 600) {
            i2 = 600;
        }
        this.f6101h0.startScroll(0, this.f35852M0, 0, i10, i2);
        if (z) {
            this.f6117q0.sendMessageDelayed(m33687D(1), i2 / 4);
        } else {
            this.f6117q0.sendMessageDelayed(m33686E(1, 0, 0, new Boolean(z)), i2 / 4);
        }
        postInvalidate();
    }

    /* renamed from: d0 */
    private int m33658d0(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: e0 */
    private void m33656e0() {
        Handler handler = this.f6117q0;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    /* renamed from: g0 */
    private void m33652g0(String[] strArr) {
        this.f6109m0 = strArr;
        m33636o0();
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.f35857P;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1074341483:
                if (str.equals("middle")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TextUtils.TruncateAt.MIDDLE;
            case 1:
                return TextUtils.TruncateAt.END;
            case 2:
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    /* renamed from: h0 */
    private void m33650h0() {
        int i;
        int i2;
        int i3;
        int i4 = this.f35827A / 2;
        this.f35829B = i4;
        this.f35831C = i4 + 1;
        int i5 = this.f35838F0;
        this.f35842H0 = (i4 * i5) / i;
        this.f35844I0 = (i2 * i5) / i;
        if (this.f6132y < 0) {
            this.f6132y = 0;
        }
        if (this.f6134z < 0) {
            this.f6134z = 0;
        }
        if (this.f6132y + this.f6134z != 0 && getPaddingLeft() + this.f6132y >= (this.f35836E0 - getPaddingRight()) - this.f6134z) {
            int paddingLeft = getPaddingLeft() + this.f6132y + getPaddingRight();
            int i6 = this.f6134z;
            int i7 = (paddingLeft + i6) - this.f35836E0;
            int i8 = this.f6132y;
            float f = i7;
            this.f6132y = (int) (i8 - ((i8 * f) / (i8 + i6)));
            this.f6134z = (int) (i6 - ((f * i6) / (i3 + i6)));
        }
    }

    /* renamed from: i0 */
    private void m33648i0() {
        int i = this.f6110n;
        int i2 = this.f35840G0;
        if (i > i2) {
            this.f6110n = i2;
        }
        if (this.f6112o > i2) {
            this.f6112o = i2;
        }
        Paint paint = this.f6107l0;
        if (paint != null) {
            paint.setTextSize(this.f6114p);
            this.f35863V = m33685F(this.f6107l0.getFontMetrics());
            this.f6116q = m33684G(this.f35855O, this.f6107l0);
            TextPaint textPaint = this.f6105k0;
            if (textPaint != null) {
                textPaint.setTextSize(this.f6112o);
                this.f35862U = m33685F(this.f6105k0.getFontMetrics());
                this.f6105k0.setTextSize(this.f6110n);
                this.f35861T = m33685F(this.f6105k0.getFontMetrics());
                return;
            }
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        throw new IllegalArgumentException("mPaintHint should not be null.");
    }

    /* renamed from: j0 */
    private void m33646j0() {
        float textSize = this.f6105k0.getTextSize();
        this.f6105k0.setTextSize(this.f6112o);
        this.f35843I = (int) ((this.f6105k0.getFontMetrics().bottom - this.f6105k0.getFontMetrics().top) + 0.5d);
        this.f6105k0.setTextSize(textSize);
    }

    /* renamed from: k0 */
    private void m33644k0(boolean z) {
        m33642l0();
        m33646j0();
        if (!z) {
            return;
        }
        if (this.f35854N0 == Integer.MIN_VALUE || this.f35856O0 == Integer.MIN_VALUE) {
            this.f6119r0.sendEmptyMessage(3);
        }
    }

    /* renamed from: l0 */
    private void m33642l0() {
        float textSize = this.f6105k0.getTextSize();
        this.f6105k0.setTextSize(this.f6112o);
        this.f35841H = m33688C(this.f6109m0, this.f6105k0);
        this.f35845J = m33688C(this.f6111n0, this.f6105k0);
        this.f35847K = m33688C(this.f6113o0, this.f6105k0);
        this.f6105k0.setTextSize(this.f6114p);
        this.f6118r = m33684G(this.f35859R, this.f6105k0);
        this.f6105k0.setTextSize(textSize);
    }

    /* renamed from: m0 */
    private void m33640m0() {
        this.f6133y0 = 0;
        this.f6135z0 = (-this.f35827A) * this.f35840G0;
        if (this.f6109m0 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i = this.f35827A;
            int i2 = this.f35840G0;
            this.f6133y0 = ((oneRecycleSize - (i / 2)) - 1) * i2;
            this.f6135z0 = (-(i / 2)) * i2;
        }
    }

    /* renamed from: n0 */
    private void m33638n0() {
        m33682I();
        m33636o0();
        if (this.f35833D == -1) {
            this.f35833D = 0;
        }
        if (this.f35835E == -1) {
            this.f35835E = this.f6109m0.length - 1;
        }
        m33661b0(this.f35833D, this.f35835E, false);
    }

    /* renamed from: o0 */
    private void m33636o0() {
        this.f6097d0 = this.f6109m0.length > this.f35827A;
    }

    /* renamed from: q */
    private void m33634q() {
        int floor = (int) Math.floor(this.f35852M0 / this.f35840G0);
        this.f35848K0 = floor;
        int i = this.f35852M0;
        int i2 = this.f35840G0;
        int i3 = -(i - (floor * i2));
        this.f35850L0 = i3;
        if (this.f6125u0 != null) {
            if ((-i3) > i2 / 2) {
                this.f6131x0 = floor + 1 + (this.f35827A / 2);
            } else {
                this.f6131x0 = floor + (this.f35827A / 2);
            }
            int oneRecycleSize = this.f6131x0 % getOneRecycleSize();
            this.f6131x0 = oneRecycleSize;
            if (oneRecycleSize < 0) {
                this.f6131x0 = oneRecycleSize + getOneRecycleSize();
            }
            int i4 = this.f6129w0;
            int i5 = this.f6131x0;
            if (i4 != i5) {
                int i6 = this.f35837F;
                m33667X(i4 + i6, i5 + i6);
            }
            this.f6129w0 = this.f6131x0;
        }
    }

    /* renamed from: r */
    private void m33633r(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        for (int i = 0; i < this.f35827A; i++) {
            int i2 = this.f35840G0;
            if (i2 * i <= y && y < i2 * (i + 1)) {
                m33632s(i);
                return;
            }
        }
    }

    /* renamed from: s */
    private void m33632s(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f35827A)) {
            m33666Y(i - (i2 / 2));
        }
    }

    /* renamed from: t */
    private String[] m33631t(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            strArr[i] = charSequenceArr[i].toString();
        }
        return strArr;
    }

    /* renamed from: u */
    private void m33630u(int i, boolean z) {
        int i2 = i - ((this.f35827A - 1) / 2);
        this.f35848K0 = i2;
        int B = m33689B(i2, getOneRecycleSize(), z);
        this.f35848K0 = B;
        int i3 = this.f35840G0;
        if (i3 == 0) {
            this.f6095b0 = true;
            return;
        }
        this.f35852M0 = i3 * B;
        int i4 = B + (this.f35827A / 2);
        this.f6129w0 = i4;
        int oneRecycleSize = i4 % getOneRecycleSize();
        this.f6129w0 = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.f6129w0 = oneRecycleSize + getOneRecycleSize();
        }
        this.f6131x0 = this.f6129w0;
        m33634q();
    }

    /* renamed from: v */
    private int m33629v(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: w */
    private void m33628w(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int i3;
        float f4 = 0.0f;
        int i4 = 0;
        while (i4 < this.f35827A + 1) {
            float f5 = this.f35850L0 + (this.f35840G0 * i4);
            int i5 = this.f35848K0 + i4;
            int oneRecycleSize = getOneRecycleSize();
            if (!this.f6094a0 || !this.f6097d0) {
                z = false;
            } else {
                z = true;
            }
            int B = m33689B(i5, oneRecycleSize, z);
            int i6 = this.f35827A;
            if (i4 == i6 / 2) {
                f3 = (this.f35850L0 + i3) / this.f35840G0;
                i = m33625z(f3, this.f6104k, this.f6106l);
                f2 = m33690A(f3, this.f6110n, this.f6112o);
                f = m33690A(f3, this.f35861T, this.f35862U);
            } else if (i4 == (i6 / 2) + 1) {
                float f6 = 1.0f - f4;
                int z2 = m33625z(f6, this.f6104k, this.f6106l);
                float A = m33690A(f6, this.f6110n, this.f6112o);
                float A2 = m33690A(f6, this.f35861T, this.f35862U);
                f3 = f4;
                i = z2;
                f2 = A;
                f = A2;
            } else {
                int i7 = this.f6104k;
                f2 = this.f6110n;
                f = this.f35861T;
                f3 = f4;
                i = i7;
            }
            this.f6105k0.setColor(i);
            this.f6105k0.setTextSize(f2);
            if (B >= 0 && B < getOneRecycleSize()) {
                CharSequence charSequence = this.f6109m0[B + this.f35833D];
                if (this.f35857P != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f6105k0, getWidth() - (this.f6126v * 2), getEllipsizeType());
                }
                if (this.f6105k0.getTextAlign() == Paint.Align.RIGHT) {
                    i2 = this.f35836E0 - (this.f6126v * 2);
                } else {
                    i2 = this.f6126v * 2;
                }
                canvas.drawText(charSequence.toString(), i2, f5 + (this.f35840G0 / 2) + f, this.f6105k0);
            } else if (!TextUtils.isEmpty(this.f35858Q)) {
                canvas.drawText(this.f35858Q, this.f35846J0, f5 + (this.f35840G0 / 2) + f, this.f6105k0);
            }
            i4++;
            f4 = f3;
        }
    }

    /* renamed from: x */
    private void m33627x(Canvas canvas) {
        if (!TextUtils.isEmpty(this.f35855O)) {
            canvas.drawText(this.f35855O, this.f35846J0 + ((this.f35841H + this.f6116q) / 2) + this.f6120s, ((this.f35842H0 + this.f35844I0) / 2.0f) + this.f35863V, this.f6107l0);
        }
    }

    /* renamed from: y */
    private void m33626y(Canvas canvas) {
        if (this.f35864W) {
            canvas.drawLine(getPaddingLeft() + this.f6132y, this.f35842H0, (this.f35836E0 - getPaddingRight()) - this.f6134z, this.f35842H0, this.f6103j0);
            canvas.drawLine(getPaddingLeft() + this.f6132y, this.f35844I0, (this.f35836E0 - getPaddingRight()) - this.f6134z, this.f35844I0, this.f6103j0);
        }
    }

    /* renamed from: z */
    private int m33625z(float f, int i, int i2) {
        int i3 = (i & (-16777216)) >>> 24;
        int i4 = (i & 16711680) >>> 16;
        int i5 = (i & 65280) >>> 8;
        int i6 = (i & 255) >>> 0;
        return ((int) (i6 + ((((i2 & 255) >>> 0) - i6) * f))) | (((int) (i3 + (((((-16777216) & i2) >>> 24) - i3) * f))) << 24) | (((int) (i4 + ((((16711680 & i2) >>> 16) - i4) * f))) << 16) | (((int) (i5 + ((((65280 & i2) >>> 8) - i5) * f))) << 8);
    }

    /* renamed from: O */
    public boolean m33676O() {
        return this.f6127v0 == 2;
    }

    /* renamed from: a */
    public void m33664a(int i, boolean z) {
        m33660c0(getValue(), i, z);
    }

    /* renamed from: a0 */
    public void m33663a0(int i, int i2) {
        m33661b0(i, i2, true);
    }

    /* renamed from: b */
    public void m33662b(int i) {
        m33660c0(getValue(), i, true);
    }

    /* renamed from: b0 */
    public void m33661b0(int i, int i2, boolean z) {
        if (i <= i2) {
            String[] strArr = this.f6109m0;
            if (strArr == null) {
                throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
            } else if (i >= 0) {
                boolean z2 = true;
                if (i > strArr.length - 1) {
                    throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f6109m0.length - 1) + " minShowIndex is " + i);
                } else if (i2 < 0) {
                    throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i2);
                } else if (i2 <= strArr.length - 1) {
                    this.f35833D = i;
                    this.f35835E = i2;
                    if (z) {
                        this.f35849L = i + 0;
                        if (!this.f6094a0 || !this.f6097d0) {
                            z2 = false;
                        }
                        m33630u(0, z2);
                        postInvalidate();
                    }
                } else {
                    throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f6109m0.length - 1) + " maxShowIndex is " + i2);
                }
            } else {
                throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i);
            }
        } else {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
        }
    }

    /* renamed from: c0 */
    public void m33660c0(int i, int i2, boolean z) {
        boolean z2;
        int i3;
        int i4 = this.f35837F;
        int i5 = this.f35839G;
        boolean z3 = true;
        if (!this.f6094a0 || !this.f6097d0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int U = m33670U(i, i4, i5, z2);
        int i6 = this.f35837F;
        int i7 = this.f35839G;
        if (!this.f6094a0 || !this.f6097d0) {
            z3 = false;
        }
        int U2 = m33670U(i2, i6, i7, z3);
        if (!this.f6094a0 || !this.f6097d0) {
            i3 = U2 - U;
        } else {
            i3 = U2 - U;
            int oneRecycleSize = getOneRecycleSize() / 2;
            if (i3 < (-oneRecycleSize) || oneRecycleSize < i3) {
                int oneRecycleSize2 = getOneRecycleSize();
                if (i3 > 0) {
                    i3 -= oneRecycleSize2;
                } else {
                    i3 += oneRecycleSize2;
                }
            }
        }
        setValue(U);
        if (U != U2) {
            m33665Z(i3, z);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f35840G0 != 0 && this.f6101h0.computeScrollOffset()) {
            this.f35852M0 = this.f6101h0.getCurrY();
            m33634q();
            postInvalidate();
        }
    }

    /* renamed from: f0 */
    public void m33654f0() {
        Scroller scroller = this.f6101h0;
        if (scroller != null && !scroller.isFinished()) {
            Scroller scroller2 = this.f6101h0;
            scroller2.startScroll(0, scroller2.getCurrY(), 0, 0, 1);
            this.f6101h0.abortAnimation();
            postInvalidate();
        }
    }

    public String getContentByCurrValue() {
        return this.f6109m0[getValue() - this.f35837F];
    }

    public String[] getDisplayedValues() {
        return this.f6109m0;
    }

    public int getMaxValue() {
        return this.f35839G;
    }

    public int getMinValue() {
        return this.f35837F;
    }

    public int getOneRecycleSize() {
        return (this.f35835E - this.f35833D) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.f35850L0;
        if (i == 0) {
            return m33683H(this.f35852M0);
        }
        int i2 = this.f35840G0;
        if (i < (-i2) / 2) {
            return m33683H(this.f35852M0 + i2 + i);
        }
        return m33683H(this.f35852M0 + i);
    }

    public int getRawContentSize() {
        String[] strArr = this.f6109m0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f35837F;
    }

    public boolean getWrapSelectorWheel() {
        return this.f6094a0;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.f6094a0 && this.f6097d0;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.f6115p0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            m33679L();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6115p0.quit();
        if (this.f35840G0 != 0) {
            if (!this.f6101h0.isFinished()) {
                this.f6101h0.abortAnimation();
                this.f35852M0 = this.f6101h0.getCurrY();
                m33634q();
                int i = this.f35850L0;
                if (i != 0) {
                    int i2 = this.f35840G0;
                    if (i < (-i2) / 2) {
                        this.f35852M0 = this.f35852M0 + i2 + i;
                    } else {
                        this.f35852M0 += i;
                    }
                    m33634q();
                }
                m33671T(0);
            }
            int H = m33683H(this.f35852M0);
            int i3 = this.f35849L;
            if (H != i3 && this.f6099f0) {
                try {
                    AbstractC3758d dVar = this.f6123t0;
                    if (dVar != null) {
                        int i4 = this.f35837F;
                        dVar.mo26896a(this, i3 + i4, i4 + H);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f35849L = H;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m33628w(canvas);
        m33626y(canvas);
        m33627x(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m33644k0(false);
        setMeasuredDimension(m33672S(i), m33673R(i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        this.f35836E0 = i;
        this.f35838F0 = i2;
        this.f35840G0 = i2 / this.f35827A;
        this.f35846J0 = ((i + getPaddingLeft()) - getPaddingRight()) / 2.0f;
        boolean z = false;
        if (getOneRecycleSize() > 1) {
            if (this.f6096c0) {
                i5 = getValue() - this.f35837F;
            } else if (this.f6095b0) {
                i5 = this.f35848K0 + ((this.f35827A - 1) / 2);
            }
            if (this.f6094a0 && this.f6097d0) {
                z = true;
            }
            m33630u(i5, z);
            m33648i0();
            m33640m0();
            m33650h0();
            this.f6096c0 = true;
        }
        i5 = 0;
        if (this.f6094a0) {
            z = true;
        }
        m33630u(i5, z);
        m33648i0();
        m33640m0();
        m33650h0();
        this.f6096c0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r1 < r3) goto L_0x0071;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c2.C3755a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f6105k0.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr) {
        m33656e0();
        m33654f0();
        if (strArr != null) {
            boolean z = true;
            if ((this.f35839G - this.f35837F) + 1 <= strArr.length) {
                m33652g0(strArr);
                m33644k0(true);
                this.f35849L = this.f35833D + 0;
                if (!this.f6094a0 || !this.f6097d0) {
                    z = false;
                }
                m33630u(0, z);
                postInvalidate();
                this.f6119r0.sendEmptyMessage(3);
                return;
            }
            throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.f35839G - this.f35837F) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
        throw new IllegalArgumentException("newDisplayedValues should not be null.");
    }

    public void setDividerColor(int i) {
        if (this.f6128w != i) {
            this.f6128w = i;
            this.f6103j0.setColor(i);
            postInvalidate();
        }
    }

    public void setDividerHeight(int i) {
        if (this.f6130x != i) {
            this.f6130x = i;
            this.f6103j0.setStrokeWidth(i);
            postInvalidate();
        }
    }

    public void setFriction(float f) {
        if (f > 0.0f) {
            ViewConfiguration.get(getContext());
            this.f35860S = ViewConfiguration.getScrollFriction() / f;
            return;
        }
        throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f);
    }

    public void setHintText(String str) {
        if (!m33675P(this.f35855O, str)) {
            this.f35855O = str;
            this.f35863V = m33685F(this.f6107l0.getFontMetrics());
            this.f6116q = m33684G(this.f35855O, this.f6107l0);
            this.f6119r0.sendEmptyMessage(3);
        }
    }

    public void setHintTextColor(int i) {
        if (this.f6108m != i) {
            this.f6108m = i;
            this.f6107l0.setColor(i);
            postInvalidate();
        }
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f6107l0.setTypeface(typeface);
    }

    public void setItemPaddingHorizontal(int i) {
        this.f6126v = i;
        postInvalidate();
    }

    public void setMaxValue(int i) {
        String[] strArr = this.f6109m0;
        if (strArr != null) {
            int i2 = this.f35837F;
            if ((i - i2) + 1 <= strArr.length) {
                this.f35839G = i;
                int i3 = this.f35833D;
                int i4 = (i - i2) + i3;
                this.f35835E = i4;
                m33663a0(i3, i4);
                m33640m0();
                return;
            }
            throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i - this.f35837F) + 1) + " and mDisplayedValues.length is " + this.f6109m0.length);
        }
        throw new NullPointerException("mDisplayedValues should not be null");
    }

    public void setMinValue(int i) {
        this.f35837F = i;
        this.f35833D = 0;
        m33640m0();
    }

    public void setNormalTextColor(int i) {
        if (this.f6104k != i) {
            this.f6104k = i;
            postInvalidate();
        }
    }

    public void setOnScrollListener(AbstractC3757c cVar) {
    }

    public void setOnValueChangeListenerInScrolling(AbstractC3759e eVar) {
        this.f6125u0 = eVar;
    }

    public void setOnValueChangedListener(AbstractC3758d dVar) {
        this.f6123t0 = dVar;
    }

    public void setOnValueChangedListenerRelativeToRaw(AbstractC3760f fVar) {
    }

    public void setPickedIndexRelativeToMin(int i) {
        boolean z;
        if (i >= 0 && i < getOneRecycleSize()) {
            this.f35849L = this.f35833D + i;
            if (!this.f6094a0 || !this.f6097d0) {
                z = false;
            } else {
                z = true;
            }
            m33630u(i, z);
            postInvalidate();
        }
    }

    public void setPickedIndexRelativeToRaw(int i) {
        boolean z;
        int i2 = this.f35833D;
        if (i2 > -1 && i2 <= i && i <= this.f35835E) {
            this.f35849L = i;
            int i3 = i - i2;
            if (!this.f6094a0 || !this.f6097d0) {
                z = false;
            } else {
                z = true;
            }
            m33630u(i3, z);
            postInvalidate();
        }
    }

    public void setSelectedTextColor(int i) {
        if (this.f6106l != i) {
            this.f6106l = i;
            postInvalidate();
        }
    }

    public void setShownCount(int i) {
        this.f35827A = i;
    }

    public void setTextAlign(Paint.Align align) {
        this.f6105k0.setTextAlign(align);
    }

    public void setValue(int i) {
        int i2 = this.f35837F;
        if (i < i2) {
            throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i);
        } else if (i <= this.f35839G) {
            setPickedIndexRelativeToRaw(i - i2);
        } else {
            throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i);
        }
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.f6094a0 == z) {
            return;
        }
        if (z) {
            this.f6094a0 = z;
            m33636o0();
            postInvalidate();
        } else if (this.f6127v0 == 0) {
            m33677N();
        } else {
            this.f6098e0 = true;
        }
    }
}
