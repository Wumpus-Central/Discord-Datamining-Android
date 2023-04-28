package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C2144c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p356u0.C13176a;
import p375v0.C13387a;

/* loaded from: classes.dex */
public class ConstraintSet {

    /* renamed from: d */
    private static final int[] f2697d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f2698e;

    /* renamed from: a */
    private HashMap<String, C2141a> f2699a = new HashMap<>();

    /* renamed from: b */
    private boolean f2700b = true;

    /* renamed from: c */
    private HashMap<Integer, C2136a> f2701c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$a */
    /* loaded from: classes.dex */
    public static class C2136a {

        /* renamed from: a */
        int f2702a;

        /* renamed from: b */
        public final C2139d f2703b = new C2139d();

        /* renamed from: c */
        public final C2138c f2704c = new C2138c();

        /* renamed from: d */
        public final C2137b f2705d = new C2137b();

        /* renamed from: e */
        public final C2140e f2706e = new C2140e();

        /* renamed from: f */
        public HashMap<String, C2141a> f2707f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m38779f(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2702a = i;
            C2137b bVar = this.f2705d;
            bVar.f2723h = layoutParams.f2635d;
            bVar.f2725i = layoutParams.f2637e;
            bVar.f2727j = layoutParams.f2639f;
            bVar.f2729k = layoutParams.f2641g;
            bVar.f2730l = layoutParams.f2643h;
            bVar.f2731m = layoutParams.f2645i;
            bVar.f2732n = layoutParams.f2647j;
            bVar.f2733o = layoutParams.f2649k;
            bVar.f2734p = layoutParams.f2651l;
            bVar.f2735q = layoutParams.f2659p;
            bVar.f2736r = layoutParams.f2660q;
            bVar.f2737s = layoutParams.f2661r;
            bVar.f2738t = layoutParams.f2662s;
            bVar.f2739u = layoutParams.f2669z;
            bVar.f2740v = layoutParams.f35399A;
            bVar.f2741w = layoutParams.f35400B;
            bVar.f2742x = layoutParams.f2653m;
            bVar.f2743y = layoutParams.f2655n;
            bVar.f2744z = layoutParams.f2657o;
            bVar.f35425A = layoutParams.f35415Q;
            bVar.f35426B = layoutParams.f35416R;
            bVar.f35427C = layoutParams.f35417S;
            bVar.f2721g = layoutParams.f2633c;
            bVar.f2717e = layoutParams.f2629a;
            bVar.f2719f = layoutParams.f2631b;
            bVar.f2713c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.f2715d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.f35428D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.f35429E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.f35430F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.f35431G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.f35440P = layoutParams.f35404F;
            bVar.f35441Q = layoutParams.f35403E;
            bVar.f35443S = layoutParams.f35406H;
            bVar.f35442R = layoutParams.f35405G;
            bVar.f2724h0 = layoutParams.f35418T;
            bVar.f2726i0 = layoutParams.f35419U;
            bVar.f35444T = layoutParams.f35407I;
            bVar.f35445U = layoutParams.f35408J;
            bVar.f35446V = layoutParams.f35411M;
            bVar.f35447W = layoutParams.f35412N;
            bVar.f35448X = layoutParams.f35409K;
            bVar.f35449Y = layoutParams.f35410L;
            bVar.f35450Z = layoutParams.f35413O;
            bVar.f2710a0 = layoutParams.f35414P;
            bVar.f2722g0 = layoutParams.f35420V;
            bVar.f35435K = layoutParams.f2664u;
            bVar.f35437M = layoutParams.f2666w;
            bVar.f35434J = layoutParams.f2663t;
            bVar.f35436L = layoutParams.f2665v;
            bVar.f35439O = layoutParams.f2667x;
            bVar.f35438N = layoutParams.f2668y;
            bVar.f35432H = layoutParams.getMarginEnd();
            this.f2705d.f35433I = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m38778g(int i, C2144c.C2145a aVar) {
            m38779f(i, aVar);
            this.f2703b.f2756d = aVar.f2797p0;
            C2140e eVar = this.f2706e;
            eVar.f2760b = aVar.f2800s0;
            eVar.f2761c = aVar.f2801t0;
            eVar.f2762d = aVar.f2802u0;
            eVar.f2763e = aVar.f2803v0;
            eVar.f2764f = aVar.f2804w0;
            eVar.f2765g = aVar.f2805x0;
            eVar.f2766h = aVar.f2806y0;
            eVar.f2767i = aVar.f2807z0;
            eVar.f2768j = aVar.f35451A0;
            eVar.f2769k = aVar.f35452B0;
            eVar.f2771m = aVar.f2799r0;
            eVar.f2770l = aVar.f2798q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m38777h(AbstractC2143b bVar, int i, C2144c.C2145a aVar) {
            m38778g(i, aVar);
            if (bVar instanceof Barrier) {
                C2137b bVar2 = this.f2705d;
                bVar2.f2716d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f2712b0 = barrier.getType();
                this.f2705d.f2718e0 = barrier.getReferencedIds();
                this.f2705d.f2714c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m38781d(ConstraintLayout.LayoutParams layoutParams) {
            C2137b bVar = this.f2705d;
            layoutParams.f2635d = bVar.f2723h;
            layoutParams.f2637e = bVar.f2725i;
            layoutParams.f2639f = bVar.f2727j;
            layoutParams.f2641g = bVar.f2729k;
            layoutParams.f2643h = bVar.f2730l;
            layoutParams.f2645i = bVar.f2731m;
            layoutParams.f2647j = bVar.f2732n;
            layoutParams.f2649k = bVar.f2733o;
            layoutParams.f2651l = bVar.f2734p;
            layoutParams.f2659p = bVar.f2735q;
            layoutParams.f2660q = bVar.f2736r;
            layoutParams.f2661r = bVar.f2737s;
            layoutParams.f2662s = bVar.f2738t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.f35428D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.f35429E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f35430F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.f35431G;
            layoutParams.f2667x = bVar.f35439O;
            layoutParams.f2668y = bVar.f35438N;
            layoutParams.f2664u = bVar.f35435K;
            layoutParams.f2666w = bVar.f35437M;
            layoutParams.f2669z = bVar.f2739u;
            layoutParams.f35399A = bVar.f2740v;
            layoutParams.f2653m = bVar.f2742x;
            layoutParams.f2655n = bVar.f2743y;
            layoutParams.f2657o = bVar.f2744z;
            layoutParams.f35400B = bVar.f2741w;
            layoutParams.f35415Q = bVar.f35425A;
            layoutParams.f35416R = bVar.f35426B;
            layoutParams.f35404F = bVar.f35440P;
            layoutParams.f35403E = bVar.f35441Q;
            layoutParams.f35406H = bVar.f35443S;
            layoutParams.f35405G = bVar.f35442R;
            layoutParams.f35418T = bVar.f2724h0;
            layoutParams.f35419U = bVar.f2726i0;
            layoutParams.f35407I = bVar.f35444T;
            layoutParams.f35408J = bVar.f35445U;
            layoutParams.f35411M = bVar.f35446V;
            layoutParams.f35412N = bVar.f35447W;
            layoutParams.f35409K = bVar.f35448X;
            layoutParams.f35410L = bVar.f35449Y;
            layoutParams.f35413O = bVar.f35450Z;
            layoutParams.f35414P = bVar.f2710a0;
            layoutParams.f35417S = bVar.f35427C;
            layoutParams.f2633c = bVar.f2721g;
            layoutParams.f2629a = bVar.f2717e;
            layoutParams.f2631b = bVar.f2719f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f2713c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.f2715d;
            String str = bVar.f2722g0;
            if (str != null) {
                layoutParams.f35420V = str;
            }
            layoutParams.setMarginStart(bVar.f35433I);
            layoutParams.setMarginEnd(this.f2705d.f35432H);
            layoutParams.m38809a();
        }

        /* renamed from: e */
        public C2136a clone() {
            C2136a aVar = new C2136a();
            aVar.f2705d.m38776a(this.f2705d);
            aVar.f2704c.m38774a(this.f2704c);
            aVar.f2703b.m38772a(this.f2703b);
            aVar.f2706e.m38770a(this.f2706e);
            aVar.f2702a = this.f2702a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$b */
    /* loaded from: classes.dex */
    public static class C2137b {

        /* renamed from: k0 */
        private static SparseIntArray f2708k0;

        /* renamed from: c */
        public int f2713c;

        /* renamed from: d */
        public int f2715d;

        /* renamed from: e0 */
        public int[] f2718e0;

        /* renamed from: f0 */
        public String f2720f0;

        /* renamed from: g0 */
        public String f2722g0;

        /* renamed from: a */
        public boolean f2709a = false;

        /* renamed from: b */
        public boolean f2711b = false;

        /* renamed from: e */
        public int f2717e = -1;

        /* renamed from: f */
        public int f2719f = -1;

        /* renamed from: g */
        public float f2721g = -1.0f;

        /* renamed from: h */
        public int f2723h = -1;

        /* renamed from: i */
        public int f2725i = -1;

        /* renamed from: j */
        public int f2727j = -1;

        /* renamed from: k */
        public int f2729k = -1;

        /* renamed from: l */
        public int f2730l = -1;

        /* renamed from: m */
        public int f2731m = -1;

        /* renamed from: n */
        public int f2732n = -1;

        /* renamed from: o */
        public int f2733o = -1;

        /* renamed from: p */
        public int f2734p = -1;

        /* renamed from: q */
        public int f2735q = -1;

        /* renamed from: r */
        public int f2736r = -1;

        /* renamed from: s */
        public int f2737s = -1;

        /* renamed from: t */
        public int f2738t = -1;

        /* renamed from: u */
        public float f2739u = 0.5f;

        /* renamed from: v */
        public float f2740v = 0.5f;

        /* renamed from: w */
        public String f2741w = null;

        /* renamed from: x */
        public int f2742x = -1;

        /* renamed from: y */
        public int f2743y = 0;

        /* renamed from: z */
        public float f2744z = 0.0f;

        /* renamed from: A */
        public int f35425A = -1;

        /* renamed from: B */
        public int f35426B = -1;

        /* renamed from: C */
        public int f35427C = -1;

        /* renamed from: D */
        public int f35428D = -1;

        /* renamed from: E */
        public int f35429E = -1;

        /* renamed from: F */
        public int f35430F = -1;

        /* renamed from: G */
        public int f35431G = -1;

        /* renamed from: H */
        public int f35432H = -1;

        /* renamed from: I */
        public int f35433I = -1;

        /* renamed from: J */
        public int f35434J = -1;

        /* renamed from: K */
        public int f35435K = -1;

        /* renamed from: L */
        public int f35436L = -1;

        /* renamed from: M */
        public int f35437M = -1;

        /* renamed from: N */
        public int f35438N = -1;

        /* renamed from: O */
        public int f35439O = -1;

        /* renamed from: P */
        public float f35440P = -1.0f;

        /* renamed from: Q */
        public float f35441Q = -1.0f;

        /* renamed from: R */
        public int f35442R = 0;

        /* renamed from: S */
        public int f35443S = 0;

        /* renamed from: T */
        public int f35444T = 0;

        /* renamed from: U */
        public int f35445U = 0;

        /* renamed from: V */
        public int f35446V = -1;

        /* renamed from: W */
        public int f35447W = -1;

        /* renamed from: X */
        public int f35448X = -1;

        /* renamed from: Y */
        public int f35449Y = -1;

        /* renamed from: Z */
        public float f35450Z = 1.0f;

        /* renamed from: a0 */
        public float f2710a0 = 1.0f;

        /* renamed from: b0 */
        public int f2712b0 = -1;

        /* renamed from: c0 */
        public int f2714c0 = 0;

        /* renamed from: d0 */
        public int f2716d0 = -1;

        /* renamed from: h0 */
        public boolean f2724h0 = false;

        /* renamed from: i0 */
        public boolean f2726i0 = false;

        /* renamed from: j0 */
        public boolean f2728j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2708k0 = sparseIntArray;
            sparseIntArray.append(C2148f.f35481E3, 24);
            f2708k0.append(C2148f.f35487F3, 25);
            f2708k0.append(C2148f.f35499H3, 28);
            f2708k0.append(C2148f.f35505I3, 29);
            f2708k0.append(C2148f.f35535N3, 35);
            f2708k0.append(C2148f.f35529M3, 34);
            f2708k0.append(C2148f.f2914p3, 4);
            f2708k0.append(C2148f.f2908o3, 3);
            f2708k0.append(C2148f.f2896m3, 1);
            f2708k0.append(C2148f.f35565S3, 6);
            f2708k0.append(C2148f.f35571T3, 7);
            f2708k0.append(C2148f.f2956w3, 17);
            f2708k0.append(C2148f.f2962x3, 18);
            f2708k0.append(C2148f.f2968y3, 19);
            f2708k0.append(C2148f.f35594X2, 26);
            f2708k0.append(C2148f.f35511J3, 31);
            f2708k0.append(C2148f.f35517K3, 32);
            f2708k0.append(C2148f.f2950v3, 10);
            f2708k0.append(C2148f.f2944u3, 9);
            f2708k0.append(C2148f.f35589W3, 13);
            f2708k0.append(C2148f.f35607Z3, 16);
            f2708k0.append(C2148f.f35595X3, 14);
            f2708k0.append(C2148f.f35577U3, 11);
            f2708k0.append(C2148f.f35601Y3, 15);
            f2708k0.append(C2148f.f35583V3, 12);
            f2708k0.append(C2148f.f35553Q3, 38);
            f2708k0.append(C2148f.f35469C3, 37);
            f2708k0.append(C2148f.f35463B3, 39);
            f2708k0.append(C2148f.f35547P3, 40);
            f2708k0.append(C2148f.f35457A3, 20);
            f2708k0.append(C2148f.f35541O3, 36);
            f2708k0.append(C2148f.f2938t3, 5);
            f2708k0.append(C2148f.f35475D3, 76);
            f2708k0.append(C2148f.f35523L3, 76);
            f2708k0.append(C2148f.f35493G3, 76);
            f2708k0.append(C2148f.f2902n3, 76);
            f2708k0.append(C2148f.f2890l3, 76);
            f2708k0.append(C2148f.f2815a3, 23);
            f2708k0.append(C2148f.f2829c3, 27);
            f2708k0.append(C2148f.f2843e3, 30);
            f2708k0.append(C2148f.f2850f3, 8);
            f2708k0.append(C2148f.f2822b3, 33);
            f2708k0.append(C2148f.f2836d3, 2);
            f2708k0.append(C2148f.f35600Y2, 22);
            f2708k0.append(C2148f.f35606Z2, 21);
            f2708k0.append(C2148f.f2920q3, 61);
            f2708k0.append(C2148f.f2932s3, 62);
            f2708k0.append(C2148f.f2926r3, 63);
            f2708k0.append(C2148f.f35559R3, 69);
            f2708k0.append(C2148f.f2974z3, 70);
            f2708k0.append(C2148f.f2878j3, 71);
            f2708k0.append(C2148f.f2864h3, 72);
            f2708k0.append(C2148f.f2871i3, 73);
            f2708k0.append(C2148f.f2884k3, 74);
            f2708k0.append(C2148f.f2857g3, 75);
        }

        /* renamed from: a */
        public void m38776a(C2137b bVar) {
            this.f2709a = bVar.f2709a;
            this.f2713c = bVar.f2713c;
            this.f2711b = bVar.f2711b;
            this.f2715d = bVar.f2715d;
            this.f2717e = bVar.f2717e;
            this.f2719f = bVar.f2719f;
            this.f2721g = bVar.f2721g;
            this.f2723h = bVar.f2723h;
            this.f2725i = bVar.f2725i;
            this.f2727j = bVar.f2727j;
            this.f2729k = bVar.f2729k;
            this.f2730l = bVar.f2730l;
            this.f2731m = bVar.f2731m;
            this.f2732n = bVar.f2732n;
            this.f2733o = bVar.f2733o;
            this.f2734p = bVar.f2734p;
            this.f2735q = bVar.f2735q;
            this.f2736r = bVar.f2736r;
            this.f2737s = bVar.f2737s;
            this.f2738t = bVar.f2738t;
            this.f2739u = bVar.f2739u;
            this.f2740v = bVar.f2740v;
            this.f2741w = bVar.f2741w;
            this.f2742x = bVar.f2742x;
            this.f2743y = bVar.f2743y;
            this.f2744z = bVar.f2744z;
            this.f35425A = bVar.f35425A;
            this.f35426B = bVar.f35426B;
            this.f35427C = bVar.f35427C;
            this.f35428D = bVar.f35428D;
            this.f35429E = bVar.f35429E;
            this.f35430F = bVar.f35430F;
            this.f35431G = bVar.f35431G;
            this.f35432H = bVar.f35432H;
            this.f35433I = bVar.f35433I;
            this.f35434J = bVar.f35434J;
            this.f35435K = bVar.f35435K;
            this.f35436L = bVar.f35436L;
            this.f35437M = bVar.f35437M;
            this.f35438N = bVar.f35438N;
            this.f35439O = bVar.f35439O;
            this.f35440P = bVar.f35440P;
            this.f35441Q = bVar.f35441Q;
            this.f35442R = bVar.f35442R;
            this.f35443S = bVar.f35443S;
            this.f35444T = bVar.f35444T;
            this.f35445U = bVar.f35445U;
            this.f35446V = bVar.f35446V;
            this.f35447W = bVar.f35447W;
            this.f35448X = bVar.f35448X;
            this.f35449Y = bVar.f35449Y;
            this.f35450Z = bVar.f35450Z;
            this.f2710a0 = bVar.f2710a0;
            this.f2712b0 = bVar.f2712b0;
            this.f2714c0 = bVar.f2714c0;
            this.f2716d0 = bVar.f2716d0;
            this.f2722g0 = bVar.f2722g0;
            int[] iArr = bVar.f2718e0;
            if (iArr != null) {
                this.f2718e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2718e0 = null;
            }
            this.f2720f0 = bVar.f2720f0;
            this.f2724h0 = bVar.f2724h0;
            this.f2726i0 = bVar.f2726i0;
            this.f2728j0 = bVar.f2728j0;
        }

        /* renamed from: b */
        void m38775b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2148f.f35588W2);
            this.f2711b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2708k0.get(index);
                if (i2 == 80) {
                    this.f2724h0 = obtainStyledAttributes.getBoolean(index, this.f2724h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f2734p = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2734p);
                            continue;
                        case 2:
                            this.f35431G = obtainStyledAttributes.getDimensionPixelSize(index, this.f35431G);
                            continue;
                        case 3:
                            this.f2733o = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2733o);
                            continue;
                        case 4:
                            this.f2732n = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2732n);
                            continue;
                        case 5:
                            this.f2741w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.f35425A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f35425A);
                            continue;
                        case 7:
                            this.f35426B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f35426B);
                            continue;
                        case 8:
                            this.f35432H = obtainStyledAttributes.getDimensionPixelSize(index, this.f35432H);
                            continue;
                        case 9:
                            this.f2738t = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2738t);
                            continue;
                        case 10:
                            this.f2737s = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2737s);
                            continue;
                        case 11:
                            this.f35437M = obtainStyledAttributes.getDimensionPixelSize(index, this.f35437M);
                            continue;
                        case 12:
                            this.f35438N = obtainStyledAttributes.getDimensionPixelSize(index, this.f35438N);
                            continue;
                        case 13:
                            this.f35434J = obtainStyledAttributes.getDimensionPixelSize(index, this.f35434J);
                            continue;
                        case 14:
                            this.f35436L = obtainStyledAttributes.getDimensionPixelSize(index, this.f35436L);
                            continue;
                        case 15:
                            this.f35439O = obtainStyledAttributes.getDimensionPixelSize(index, this.f35439O);
                            continue;
                        case 16:
                            this.f35435K = obtainStyledAttributes.getDimensionPixelSize(index, this.f35435K);
                            continue;
                        case 17:
                            this.f2717e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2717e);
                            continue;
                        case 18:
                            this.f2719f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2719f);
                            continue;
                        case 19:
                            this.f2721g = obtainStyledAttributes.getFloat(index, this.f2721g);
                            continue;
                        case 20:
                            this.f2739u = obtainStyledAttributes.getFloat(index, this.f2739u);
                            continue;
                        case 21:
                            this.f2715d = obtainStyledAttributes.getLayoutDimension(index, this.f2715d);
                            continue;
                        case 22:
                            this.f2713c = obtainStyledAttributes.getLayoutDimension(index, this.f2713c);
                            continue;
                        case 23:
                            this.f35428D = obtainStyledAttributes.getDimensionPixelSize(index, this.f35428D);
                            continue;
                        case 24:
                            this.f2723h = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2723h);
                            continue;
                        case 25:
                            this.f2725i = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2725i);
                            continue;
                        case 26:
                            this.f35427C = obtainStyledAttributes.getInt(index, this.f35427C);
                            continue;
                        case 27:
                            this.f35429E = obtainStyledAttributes.getDimensionPixelSize(index, this.f35429E);
                            continue;
                        case 28:
                            this.f2727j = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2727j);
                            continue;
                        case 29:
                            this.f2729k = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2729k);
                            continue;
                        case 30:
                            this.f35433I = obtainStyledAttributes.getDimensionPixelSize(index, this.f35433I);
                            continue;
                        case 31:
                            this.f2735q = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2735q);
                            continue;
                        case 32:
                            this.f2736r = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2736r);
                            continue;
                        case 33:
                            this.f35430F = obtainStyledAttributes.getDimensionPixelSize(index, this.f35430F);
                            continue;
                        case 34:
                            this.f2731m = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2731m);
                            continue;
                        case 35:
                            this.f2730l = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2730l);
                            continue;
                        case 36:
                            this.f2740v = obtainStyledAttributes.getFloat(index, this.f2740v);
                            continue;
                        case 37:
                            this.f35441Q = obtainStyledAttributes.getFloat(index, this.f35441Q);
                            continue;
                        case 38:
                            this.f35440P = obtainStyledAttributes.getFloat(index, this.f35440P);
                            continue;
                        case 39:
                            this.f35442R = obtainStyledAttributes.getInt(index, this.f35442R);
                            continue;
                        case 40:
                            this.f35443S = obtainStyledAttributes.getInt(index, this.f35443S);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f35444T = obtainStyledAttributes.getInt(index, this.f35444T);
                                    continue;
                                case 55:
                                    this.f35445U = obtainStyledAttributes.getInt(index, this.f35445U);
                                    continue;
                                case 56:
                                    this.f35446V = obtainStyledAttributes.getDimensionPixelSize(index, this.f35446V);
                                    continue;
                                case 57:
                                    this.f35447W = obtainStyledAttributes.getDimensionPixelSize(index, this.f35447W);
                                    continue;
                                case 58:
                                    this.f35448X = obtainStyledAttributes.getDimensionPixelSize(index, this.f35448X);
                                    continue;
                                case 59:
                                    this.f35449Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f35449Y);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f2742x = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2742x);
                                            continue;
                                        case 62:
                                            this.f2743y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2743y);
                                            continue;
                                        case 63:
                                            this.f2744z = obtainStyledAttributes.getFloat(index, this.f2744z);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f35450Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2710a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f2712b0 = obtainStyledAttributes.getInt(index, this.f2712b0);
                                                    continue;
                                                case 73:
                                                    this.f2714c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2714c0);
                                                    continue;
                                                case 74:
                                                    this.f2720f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2728j0 = obtainStyledAttributes.getBoolean(index, this.f2728j0);
                                                    continue;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2708k0.get(index));
                                                    continue;
                                                case 77:
                                                    this.f2722g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2708k0.get(index));
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2726i0 = obtainStyledAttributes.getBoolean(index, this.f2726i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$c */
    /* loaded from: classes.dex */
    public static class C2138c {

        /* renamed from: h */
        private static SparseIntArray f2745h;

        /* renamed from: a */
        public boolean f2746a = false;

        /* renamed from: b */
        public int f2747b = -1;

        /* renamed from: c */
        public String f2748c = null;

        /* renamed from: d */
        public int f2749d = -1;

        /* renamed from: e */
        public int f2750e = 0;

        /* renamed from: f */
        public float f2751f = Float.NaN;

        /* renamed from: g */
        public float f2752g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2745h = sparseIntArray;
            sparseIntArray.append(C2148f.f2885k4, 1);
            f2745h.append(C2148f.f2897m4, 2);
            f2745h.append(C2148f.f2903n4, 3);
            f2745h.append(C2148f.f2879j4, 4);
            f2745h.append(C2148f.f2872i4, 5);
            f2745h.append(C2148f.f2891l4, 6);
        }

        /* renamed from: a */
        public void m38774a(C2138c cVar) {
            this.f2746a = cVar.f2746a;
            this.f2747b = cVar.f2747b;
            this.f2748c = cVar.f2748c;
            this.f2749d = cVar.f2749d;
            this.f2750e = cVar.f2750e;
            this.f2752g = cVar.f2752g;
            this.f2751f = cVar.f2751f;
        }

        /* renamed from: b */
        void m38773b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2148f.f2865h4);
            this.f2746a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2745h.get(index)) {
                    case 1:
                        this.f2752g = obtainStyledAttributes.getFloat(index, this.f2752g);
                        break;
                    case 2:
                        this.f2749d = obtainStyledAttributes.getInt(index, this.f2749d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2748c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2748c = C13176a.f29530c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2750e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2747b = ConstraintSet.m38786o(obtainStyledAttributes, index, this.f2747b);
                        break;
                    case 6:
                        this.f2751f = obtainStyledAttributes.getFloat(index, this.f2751f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$d */
    /* loaded from: classes.dex */
    public static class C2139d {

        /* renamed from: a */
        public boolean f2753a = false;

        /* renamed from: b */
        public int f2754b = 0;

        /* renamed from: c */
        public int f2755c = 0;

        /* renamed from: d */
        public float f2756d = 1.0f;

        /* renamed from: e */
        public float f2757e = Float.NaN;

        /* renamed from: a */
        public void m38772a(C2139d dVar) {
            this.f2753a = dVar.f2753a;
            this.f2754b = dVar.f2754b;
            this.f2756d = dVar.f2756d;
            this.f2757e = dVar.f2757e;
            this.f2755c = dVar.f2755c;
        }

        /* renamed from: b */
        void m38771b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2148f.f2957w4);
            this.f2753a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2148f.f2969y4) {
                    this.f2756d = obtainStyledAttributes.getFloat(index, this.f2756d);
                } else if (index == C2148f.f2963x4) {
                    this.f2754b = obtainStyledAttributes.getInt(index, this.f2754b);
                    this.f2754b = ConstraintSet.f2697d[this.f2754b];
                } else if (index == C2148f.f35458A4) {
                    this.f2755c = obtainStyledAttributes.getInt(index, this.f2755c);
                } else if (index == C2148f.f2975z4) {
                    this.f2757e = obtainStyledAttributes.getFloat(index, this.f2757e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$e */
    /* loaded from: classes.dex */
    public static class C2140e {

        /* renamed from: n */
        private static SparseIntArray f2758n;

        /* renamed from: a */
        public boolean f2759a = false;

        /* renamed from: b */
        public float f2760b = 0.0f;

        /* renamed from: c */
        public float f2761c = 0.0f;

        /* renamed from: d */
        public float f2762d = 0.0f;

        /* renamed from: e */
        public float f2763e = 1.0f;

        /* renamed from: f */
        public float f2764f = 1.0f;

        /* renamed from: g */
        public float f2765g = Float.NaN;

        /* renamed from: h */
        public float f2766h = Float.NaN;

        /* renamed from: i */
        public float f2767i = 0.0f;

        /* renamed from: j */
        public float f2768j = 0.0f;

        /* renamed from: k */
        public float f2769k = 0.0f;

        /* renamed from: l */
        public boolean f2770l = false;

        /* renamed from: m */
        public float f2771m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2758n = sparseIntArray;
            sparseIntArray.append(C2148f.f35578U4, 1);
            f2758n.append(C2148f.f35584V4, 2);
            f2758n.append(C2148f.f35590W4, 3);
            f2758n.append(C2148f.f35566S4, 4);
            f2758n.append(C2148f.f35572T4, 5);
            f2758n.append(C2148f.f35542O4, 6);
            f2758n.append(C2148f.f35548P4, 7);
            f2758n.append(C2148f.f35554Q4, 8);
            f2758n.append(C2148f.f35560R4, 9);
            f2758n.append(C2148f.f35596X4, 10);
            f2758n.append(C2148f.f35602Y4, 11);
        }

        /* renamed from: a */
        public void m38770a(C2140e eVar) {
            this.f2759a = eVar.f2759a;
            this.f2760b = eVar.f2760b;
            this.f2761c = eVar.f2761c;
            this.f2762d = eVar.f2762d;
            this.f2763e = eVar.f2763e;
            this.f2764f = eVar.f2764f;
            this.f2765g = eVar.f2765g;
            this.f2766h = eVar.f2766h;
            this.f2767i = eVar.f2767i;
            this.f2768j = eVar.f2768j;
            this.f2769k = eVar.f2769k;
            this.f2770l = eVar.f2770l;
            this.f2771m = eVar.f2771m;
        }

        /* renamed from: b */
        void m38769b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2148f.f35536N4);
            this.f2759a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2758n.get(index)) {
                    case 1:
                        this.f2760b = obtainStyledAttributes.getFloat(index, this.f2760b);
                        break;
                    case 2:
                        this.f2761c = obtainStyledAttributes.getFloat(index, this.f2761c);
                        break;
                    case 3:
                        this.f2762d = obtainStyledAttributes.getFloat(index, this.f2762d);
                        break;
                    case 4:
                        this.f2763e = obtainStyledAttributes.getFloat(index, this.f2763e);
                        break;
                    case 5:
                        this.f2764f = obtainStyledAttributes.getFloat(index, this.f2764f);
                        break;
                    case 6:
                        this.f2765g = obtainStyledAttributes.getDimension(index, this.f2765g);
                        break;
                    case 7:
                        this.f2766h = obtainStyledAttributes.getDimension(index, this.f2766h);
                        break;
                    case 8:
                        this.f2767i = obtainStyledAttributes.getDimension(index, this.f2767i);
                        break;
                    case 9:
                        this.f2768j = obtainStyledAttributes.getDimension(index, this.f2768j);
                        break;
                    case 10:
                        this.f2769k = obtainStyledAttributes.getDimension(index, this.f2769k);
                        break;
                    case 11:
                        this.f2770l = true;
                        this.f2771m = obtainStyledAttributes.getDimension(index, this.f2771m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2698e = sparseIntArray;
        sparseIntArray.append(C2148f.f2941u0, 25);
        f2698e.append(C2148f.f2947v0, 26);
        f2698e.append(C2148f.f2959x0, 29);
        f2698e.append(C2148f.f2965y0, 30);
        f2698e.append(C2148f.f35478E0, 36);
        f2698e.append(C2148f.f35472D0, 35);
        f2698e.append(C2148f.f2826c0, 4);
        f2698e.append(C2148f.f2819b0, 3);
        f2698e.append(C2148f.f35603Z, 1);
        f2698e.append(C2148f.f35526M0, 6);
        f2698e.append(C2148f.f35532N0, 7);
        f2698e.append(C2148f.f2875j0, 17);
        f2698e.append(C2148f.f2881k0, 18);
        f2698e.append(C2148f.f2887l0, 19);
        f2698e.append(C2148f.f2928s, 27);
        f2698e.append(C2148f.f2971z0, 32);
        f2698e.append(C2148f.f35454A0, 33);
        f2698e.append(C2148f.f2868i0, 10);
        f2698e.append(C2148f.f2861h0, 9);
        f2698e.append(C2148f.f35550Q0, 13);
        f2698e.append(C2148f.f35568T0, 16);
        f2698e.append(C2148f.f35556R0, 14);
        f2698e.append(C2148f.f35538O0, 11);
        f2698e.append(C2148f.f35562S0, 15);
        f2698e.append(C2148f.f35544P0, 12);
        f2698e.append(C2148f.f35496H0, 40);
        f2698e.append(C2148f.f2929s0, 39);
        f2698e.append(C2148f.f2923r0, 41);
        f2698e.append(C2148f.f35490G0, 42);
        f2698e.append(C2148f.f2917q0, 20);
        f2698e.append(C2148f.f35484F0, 37);
        f2698e.append(C2148f.f2854g0, 5);
        f2698e.append(C2148f.f2935t0, 82);
        f2698e.append(C2148f.f35466C0, 82);
        f2698e.append(C2148f.f2953w0, 82);
        f2698e.append(C2148f.f2812a0, 82);
        f2698e.append(C2148f.f35597Y, 82);
        f2698e.append(C2148f.f2958x, 24);
        f2698e.append(C2148f.f2970z, 28);
        f2698e.append(C2148f.f35519L, 31);
        f2698e.append(C2148f.f35525M, 8);
        f2698e.append(C2148f.f2964y, 34);
        f2698e.append(C2148f.f35453A, 2);
        f2698e.append(C2148f.f2946v, 23);
        f2698e.append(C2148f.f2952w, 21);
        f2698e.append(C2148f.f2940u, 22);
        f2698e.append(C2148f.f35459B, 43);
        f2698e.append(C2148f.f35537O, 44);
        f2698e.append(C2148f.f35507J, 45);
        f2698e.append(C2148f.f35513K, 46);
        f2698e.append(C2148f.f35501I, 60);
        f2698e.append(C2148f.f35489G, 47);
        f2698e.append(C2148f.f35495H, 48);
        f2698e.append(C2148f.f35465C, 49);
        f2698e.append(C2148f.f35471D, 50);
        f2698e.append(C2148f.f35477E, 51);
        f2698e.append(C2148f.f35483F, 52);
        f2698e.append(C2148f.f35531N, 53);
        f2698e.append(C2148f.f35502I0, 54);
        f2698e.append(C2148f.f2893m0, 55);
        f2698e.append(C2148f.f35508J0, 56);
        f2698e.append(C2148f.f2899n0, 57);
        f2698e.append(C2148f.f35514K0, 58);
        f2698e.append(C2148f.f2905o0, 59);
        f2698e.append(C2148f.f2833d0, 61);
        f2698e.append(C2148f.f2847f0, 62);
        f2698e.append(C2148f.f2840e0, 63);
        f2698e.append(C2148f.f35543P, 64);
        f2698e.append(C2148f.f35592X0, 65);
        f2698e.append(C2148f.f35579V, 66);
        f2698e.append(C2148f.f35598Y0, 67);
        f2698e.append(C2148f.f35580V0, 79);
        f2698e.append(C2148f.f2934t, 38);
        f2698e.append(C2148f.f35574U0, 68);
        f2698e.append(C2148f.f35520L0, 69);
        f2698e.append(C2148f.f2911p0, 70);
        f2698e.append(C2148f.f35567T, 71);
        f2698e.append(C2148f.f35555R, 72);
        f2698e.append(C2148f.f35561S, 73);
        f2698e.append(C2148f.f35573U, 74);
        f2698e.append(C2148f.f35549Q, 75);
        f2698e.append(C2148f.f35586W0, 76);
        f2698e.append(C2148f.f35460B0, 77);
        f2698e.append(C2148f.f35604Z0, 78);
        f2698e.append(C2148f.f35591X, 80);
        f2698e.append(C2148f.f35585W, 81);
    }

    /* renamed from: j */
    private int[] m38791j(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C2147e.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: k */
    private C2136a m38790k(Context context, AttributeSet attributeSet) {
        C2136a aVar = new C2136a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2148f.f2922r);
        m38785p(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: l */
    private C2136a m38789l(int i) {
        if (!this.f2701c.containsKey(Integer.valueOf(i))) {
            this.f2701c.put(Integer.valueOf(i), new C2136a());
        }
        return this.f2701c.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static int m38786o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: p */
    private void m38785p(Context context, C2136a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C2148f.f2934t || C2148f.f35519L == index || C2148f.f35525M == index)) {
                aVar.f2704c.f2746a = true;
                aVar.f2705d.f2711b = true;
                aVar.f2703b.f2753a = true;
                aVar.f2706e.f2759a = true;
            }
            switch (f2698e.get(index)) {
                case 1:
                    C2137b bVar = aVar.f2705d;
                    bVar.f2734p = m38786o(typedArray, index, bVar.f2734p);
                    break;
                case 2:
                    C2137b bVar2 = aVar.f2705d;
                    bVar2.f35431G = typedArray.getDimensionPixelSize(index, bVar2.f35431G);
                    break;
                case 3:
                    C2137b bVar3 = aVar.f2705d;
                    bVar3.f2733o = m38786o(typedArray, index, bVar3.f2733o);
                    break;
                case 4:
                    C2137b bVar4 = aVar.f2705d;
                    bVar4.f2732n = m38786o(typedArray, index, bVar4.f2732n);
                    break;
                case 5:
                    aVar.f2705d.f2741w = typedArray.getString(index);
                    break;
                case 6:
                    C2137b bVar5 = aVar.f2705d;
                    bVar5.f35425A = typedArray.getDimensionPixelOffset(index, bVar5.f35425A);
                    break;
                case 7:
                    C2137b bVar6 = aVar.f2705d;
                    bVar6.f35426B = typedArray.getDimensionPixelOffset(index, bVar6.f35426B);
                    break;
                case 8:
                    C2137b bVar7 = aVar.f2705d;
                    bVar7.f35432H = typedArray.getDimensionPixelSize(index, bVar7.f35432H);
                    break;
                case 9:
                    C2137b bVar8 = aVar.f2705d;
                    bVar8.f2738t = m38786o(typedArray, index, bVar8.f2738t);
                    break;
                case 10:
                    C2137b bVar9 = aVar.f2705d;
                    bVar9.f2737s = m38786o(typedArray, index, bVar9.f2737s);
                    break;
                case 11:
                    C2137b bVar10 = aVar.f2705d;
                    bVar10.f35437M = typedArray.getDimensionPixelSize(index, bVar10.f35437M);
                    break;
                case 12:
                    C2137b bVar11 = aVar.f2705d;
                    bVar11.f35438N = typedArray.getDimensionPixelSize(index, bVar11.f35438N);
                    break;
                case 13:
                    C2137b bVar12 = aVar.f2705d;
                    bVar12.f35434J = typedArray.getDimensionPixelSize(index, bVar12.f35434J);
                    break;
                case 14:
                    C2137b bVar13 = aVar.f2705d;
                    bVar13.f35436L = typedArray.getDimensionPixelSize(index, bVar13.f35436L);
                    break;
                case 15:
                    C2137b bVar14 = aVar.f2705d;
                    bVar14.f35439O = typedArray.getDimensionPixelSize(index, bVar14.f35439O);
                    break;
                case 16:
                    C2137b bVar15 = aVar.f2705d;
                    bVar15.f35435K = typedArray.getDimensionPixelSize(index, bVar15.f35435K);
                    break;
                case 17:
                    C2137b bVar16 = aVar.f2705d;
                    bVar16.f2717e = typedArray.getDimensionPixelOffset(index, bVar16.f2717e);
                    break;
                case 18:
                    C2137b bVar17 = aVar.f2705d;
                    bVar17.f2719f = typedArray.getDimensionPixelOffset(index, bVar17.f2719f);
                    break;
                case 19:
                    C2137b bVar18 = aVar.f2705d;
                    bVar18.f2721g = typedArray.getFloat(index, bVar18.f2721g);
                    break;
                case 20:
                    C2137b bVar19 = aVar.f2705d;
                    bVar19.f2739u = typedArray.getFloat(index, bVar19.f2739u);
                    break;
                case 21:
                    C2137b bVar20 = aVar.f2705d;
                    bVar20.f2715d = typedArray.getLayoutDimension(index, bVar20.f2715d);
                    break;
                case 22:
                    C2139d dVar = aVar.f2703b;
                    dVar.f2754b = typedArray.getInt(index, dVar.f2754b);
                    C2139d dVar2 = aVar.f2703b;
                    dVar2.f2754b = f2697d[dVar2.f2754b];
                    break;
                case 23:
                    C2137b bVar21 = aVar.f2705d;
                    bVar21.f2713c = typedArray.getLayoutDimension(index, bVar21.f2713c);
                    break;
                case 24:
                    C2137b bVar22 = aVar.f2705d;
                    bVar22.f35428D = typedArray.getDimensionPixelSize(index, bVar22.f35428D);
                    break;
                case 25:
                    C2137b bVar23 = aVar.f2705d;
                    bVar23.f2723h = m38786o(typedArray, index, bVar23.f2723h);
                    break;
                case 26:
                    C2137b bVar24 = aVar.f2705d;
                    bVar24.f2725i = m38786o(typedArray, index, bVar24.f2725i);
                    break;
                case 27:
                    C2137b bVar25 = aVar.f2705d;
                    bVar25.f35427C = typedArray.getInt(index, bVar25.f35427C);
                    break;
                case 28:
                    C2137b bVar26 = aVar.f2705d;
                    bVar26.f35429E = typedArray.getDimensionPixelSize(index, bVar26.f35429E);
                    break;
                case 29:
                    C2137b bVar27 = aVar.f2705d;
                    bVar27.f2727j = m38786o(typedArray, index, bVar27.f2727j);
                    break;
                case 30:
                    C2137b bVar28 = aVar.f2705d;
                    bVar28.f2729k = m38786o(typedArray, index, bVar28.f2729k);
                    break;
                case 31:
                    C2137b bVar29 = aVar.f2705d;
                    bVar29.f35433I = typedArray.getDimensionPixelSize(index, bVar29.f35433I);
                    break;
                case 32:
                    C2137b bVar30 = aVar.f2705d;
                    bVar30.f2735q = m38786o(typedArray, index, bVar30.f2735q);
                    break;
                case 33:
                    C2137b bVar31 = aVar.f2705d;
                    bVar31.f2736r = m38786o(typedArray, index, bVar31.f2736r);
                    break;
                case 34:
                    C2137b bVar32 = aVar.f2705d;
                    bVar32.f35430F = typedArray.getDimensionPixelSize(index, bVar32.f35430F);
                    break;
                case 35:
                    C2137b bVar33 = aVar.f2705d;
                    bVar33.f2731m = m38786o(typedArray, index, bVar33.f2731m);
                    break;
                case 36:
                    C2137b bVar34 = aVar.f2705d;
                    bVar34.f2730l = m38786o(typedArray, index, bVar34.f2730l);
                    break;
                case 37:
                    C2137b bVar35 = aVar.f2705d;
                    bVar35.f2740v = typedArray.getFloat(index, bVar35.f2740v);
                    break;
                case 38:
                    aVar.f2702a = typedArray.getResourceId(index, aVar.f2702a);
                    break;
                case 39:
                    C2137b bVar36 = aVar.f2705d;
                    bVar36.f35441Q = typedArray.getFloat(index, bVar36.f35441Q);
                    break;
                case 40:
                    C2137b bVar37 = aVar.f2705d;
                    bVar37.f35440P = typedArray.getFloat(index, bVar37.f35440P);
                    break;
                case 41:
                    C2137b bVar38 = aVar.f2705d;
                    bVar38.f35442R = typedArray.getInt(index, bVar38.f35442R);
                    break;
                case 42:
                    C2137b bVar39 = aVar.f2705d;
                    bVar39.f35443S = typedArray.getInt(index, bVar39.f35443S);
                    break;
                case 43:
                    C2139d dVar3 = aVar.f2703b;
                    dVar3.f2756d = typedArray.getFloat(index, dVar3.f2756d);
                    break;
                case 44:
                    C2140e eVar = aVar.f2706e;
                    eVar.f2770l = true;
                    eVar.f2771m = typedArray.getDimension(index, eVar.f2771m);
                    break;
                case 45:
                    C2140e eVar2 = aVar.f2706e;
                    eVar2.f2761c = typedArray.getFloat(index, eVar2.f2761c);
                    break;
                case 46:
                    C2140e eVar3 = aVar.f2706e;
                    eVar3.f2762d = typedArray.getFloat(index, eVar3.f2762d);
                    break;
                case 47:
                    C2140e eVar4 = aVar.f2706e;
                    eVar4.f2763e = typedArray.getFloat(index, eVar4.f2763e);
                    break;
                case 48:
                    C2140e eVar5 = aVar.f2706e;
                    eVar5.f2764f = typedArray.getFloat(index, eVar5.f2764f);
                    break;
                case 49:
                    C2140e eVar6 = aVar.f2706e;
                    eVar6.f2765g = typedArray.getDimension(index, eVar6.f2765g);
                    break;
                case 50:
                    C2140e eVar7 = aVar.f2706e;
                    eVar7.f2766h = typedArray.getDimension(index, eVar7.f2766h);
                    break;
                case 51:
                    C2140e eVar8 = aVar.f2706e;
                    eVar8.f2767i = typedArray.getDimension(index, eVar8.f2767i);
                    break;
                case 52:
                    C2140e eVar9 = aVar.f2706e;
                    eVar9.f2768j = typedArray.getDimension(index, eVar9.f2768j);
                    break;
                case 53:
                    C2140e eVar10 = aVar.f2706e;
                    eVar10.f2769k = typedArray.getDimension(index, eVar10.f2769k);
                    break;
                case 54:
                    C2137b bVar40 = aVar.f2705d;
                    bVar40.f35444T = typedArray.getInt(index, bVar40.f35444T);
                    break;
                case 55:
                    C2137b bVar41 = aVar.f2705d;
                    bVar41.f35445U = typedArray.getInt(index, bVar41.f35445U);
                    break;
                case 56:
                    C2137b bVar42 = aVar.f2705d;
                    bVar42.f35446V = typedArray.getDimensionPixelSize(index, bVar42.f35446V);
                    break;
                case 57:
                    C2137b bVar43 = aVar.f2705d;
                    bVar43.f35447W = typedArray.getDimensionPixelSize(index, bVar43.f35447W);
                    break;
                case 58:
                    C2137b bVar44 = aVar.f2705d;
                    bVar44.f35448X = typedArray.getDimensionPixelSize(index, bVar44.f35448X);
                    break;
                case 59:
                    C2137b bVar45 = aVar.f2705d;
                    bVar45.f35449Y = typedArray.getDimensionPixelSize(index, bVar45.f35449Y);
                    break;
                case 60:
                    C2140e eVar11 = aVar.f2706e;
                    eVar11.f2760b = typedArray.getFloat(index, eVar11.f2760b);
                    break;
                case 61:
                    C2137b bVar46 = aVar.f2705d;
                    bVar46.f2742x = m38786o(typedArray, index, bVar46.f2742x);
                    break;
                case 62:
                    C2137b bVar47 = aVar.f2705d;
                    bVar47.f2743y = typedArray.getDimensionPixelSize(index, bVar47.f2743y);
                    break;
                case 63:
                    C2137b bVar48 = aVar.f2705d;
                    bVar48.f2744z = typedArray.getFloat(index, bVar48.f2744z);
                    break;
                case 64:
                    C2138c cVar = aVar.f2704c;
                    cVar.f2747b = m38786o(typedArray, index, cVar.f2747b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2704c.f2748c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2704c.f2748c = C13176a.f29530c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f2704c.f2750e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C2138c cVar2 = aVar.f2704c;
                    cVar2.f2752g = typedArray.getFloat(index, cVar2.f2752g);
                    break;
                case 68:
                    C2139d dVar4 = aVar.f2703b;
                    dVar4.f2757e = typedArray.getFloat(index, dVar4.f2757e);
                    break;
                case 69:
                    aVar.f2705d.f35450Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2705d.f2710a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C2137b bVar49 = aVar.f2705d;
                    bVar49.f2712b0 = typedArray.getInt(index, bVar49.f2712b0);
                    break;
                case 73:
                    C2137b bVar50 = aVar.f2705d;
                    bVar50.f2714c0 = typedArray.getDimensionPixelSize(index, bVar50.f2714c0);
                    break;
                case 74:
                    aVar.f2705d.f2720f0 = typedArray.getString(index);
                    break;
                case 75:
                    C2137b bVar51 = aVar.f2705d;
                    bVar51.f2728j0 = typedArray.getBoolean(index, bVar51.f2728j0);
                    break;
                case 76:
                    C2138c cVar3 = aVar.f2704c;
                    cVar3.f2749d = typedArray.getInt(index, cVar3.f2749d);
                    break;
                case 77:
                    aVar.f2705d.f2722g0 = typedArray.getString(index);
                    break;
                case 78:
                    C2139d dVar5 = aVar.f2703b;
                    dVar5.f2755c = typedArray.getInt(index, dVar5.f2755c);
                    break;
                case 79:
                    C2138c cVar4 = aVar.f2704c;
                    cVar4.f2751f = typedArray.getFloat(index, cVar4.f2751f);
                    break;
                case 80:
                    C2137b bVar52 = aVar.f2705d;
                    bVar52.f2724h0 = typedArray.getBoolean(index, bVar52.f2724h0);
                    break;
                case 81:
                    C2137b bVar53 = aVar.f2705d;
                    bVar53.f2726i0 = typedArray.getBoolean(index, bVar53.f2726i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2698e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2698e.get(index));
                    break;
            }
        }
    }

    /* renamed from: c */
    public void m38798c(ConstraintLayout constraintLayout) {
        m38797d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m38797d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2701c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.f2701c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C13387a.m3776a(childAt));
            } else if (this.f2700b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f2701c.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    C2136a aVar = this.f2701c.get(Integer.valueOf(id2));
                    if (childAt instanceof Barrier) {
                        aVar.f2705d.f2716d0 = 1;
                    }
                    int i2 = aVar.f2705d.f2716d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id2);
                        barrier.setType(aVar.f2705d.f2712b0);
                        barrier.setMargin(aVar.f2705d.f2714c0);
                        barrier.setAllowsGoneWidget(aVar.f2705d.f2728j0);
                        C2137b bVar = aVar.f2705d;
                        int[] iArr = bVar.f2718e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f2720f0;
                            if (str != null) {
                                bVar.f2718e0 = m38791j(barrier, str);
                                barrier.setReferencedIds(aVar.f2705d.f2718e0);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.m38809a();
                    aVar.m38781d(layoutParams);
                    if (z) {
                        C2141a.m38764c(childAt, aVar.f2707f);
                    }
                    childAt.setLayoutParams(layoutParams);
                    C2139d dVar = aVar.f2703b;
                    if (dVar.f2755c == 0) {
                        childAt.setVisibility(dVar.f2754b);
                    }
                    childAt.setAlpha(aVar.f2703b.f2756d);
                    childAt.setRotation(aVar.f2706e.f2760b);
                    childAt.setRotationX(aVar.f2706e.f2761c);
                    childAt.setRotationY(aVar.f2706e.f2762d);
                    childAt.setScaleX(aVar.f2706e.f2763e);
                    childAt.setScaleY(aVar.f2706e.f2764f);
                    if (!Float.isNaN(aVar.f2706e.f2765g)) {
                        childAt.setPivotX(aVar.f2706e.f2765g);
                    }
                    if (!Float.isNaN(aVar.f2706e.f2766h)) {
                        childAt.setPivotY(aVar.f2706e.f2766h);
                    }
                    childAt.setTranslationX(aVar.f2706e.f2767i);
                    childAt.setTranslationY(aVar.f2706e.f2768j);
                    childAt.setTranslationZ(aVar.f2706e.f2769k);
                    C2140e eVar = aVar.f2706e;
                    if (eVar.f2770l) {
                        childAt.setElevation(eVar.f2771m);
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C2136a aVar2 = this.f2701c.get(num);
            int i3 = aVar2.f2705d.f2716d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C2137b bVar2 = aVar2.f2705d;
                int[] iArr2 = bVar2.f2718e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2720f0;
                    if (str2 != null) {
                        bVar2.f2718e0 = m38791j(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f2705d.f2718e0);
                    }
                }
                barrier2.setType(aVar2.f2705d.f2712b0);
                barrier2.setMargin(aVar2.f2705d.f2714c0);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m38751m();
                aVar2.m38781d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f2705d.f2709a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.m38781d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: e */
    public void m38796e(int i, int i2) {
        if (this.f2701c.containsKey(Integer.valueOf(i))) {
            C2136a aVar = this.f2701c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C2137b bVar = aVar.f2705d;
                    bVar.f2725i = -1;
                    bVar.f2723h = -1;
                    bVar.f35428D = -1;
                    bVar.f35434J = -1;
                    return;
                case 2:
                    C2137b bVar2 = aVar.f2705d;
                    bVar2.f2729k = -1;
                    bVar2.f2727j = -1;
                    bVar2.f35429E = -1;
                    bVar2.f35436L = -1;
                    return;
                case 3:
                    C2137b bVar3 = aVar.f2705d;
                    bVar3.f2731m = -1;
                    bVar3.f2730l = -1;
                    bVar3.f35430F = -1;
                    bVar3.f35435K = -1;
                    return;
                case 4:
                    C2137b bVar4 = aVar.f2705d;
                    bVar4.f2732n = -1;
                    bVar4.f2733o = -1;
                    bVar4.f35431G = -1;
                    bVar4.f35437M = -1;
                    return;
                case 5:
                    aVar.f2705d.f2734p = -1;
                    return;
                case 6:
                    C2137b bVar5 = aVar.f2705d;
                    bVar5.f2735q = -1;
                    bVar5.f2736r = -1;
                    bVar5.f35433I = -1;
                    bVar5.f35439O = -1;
                    return;
                case 7:
                    C2137b bVar6 = aVar.f2705d;
                    bVar6.f2737s = -1;
                    bVar6.f2738t = -1;
                    bVar6.f35432H = -1;
                    bVar6.f35438N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void m38795f(Context context, int i) {
        m38794g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: g */
    public void m38794g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2701c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f2700b || id2 != -1) {
                if (!this.f2701c.containsKey(Integer.valueOf(id2))) {
                    this.f2701c.put(Integer.valueOf(id2), new C2136a());
                }
                C2136a aVar = this.f2701c.get(Integer.valueOf(id2));
                aVar.f2707f = C2141a.m38766a(this.f2699a, childAt);
                aVar.m38779f(id2, layoutParams);
                aVar.f2703b.f2754b = childAt.getVisibility();
                aVar.f2703b.f2756d = childAt.getAlpha();
                aVar.f2706e.f2760b = childAt.getRotation();
                aVar.f2706e.f2761c = childAt.getRotationX();
                aVar.f2706e.f2762d = childAt.getRotationY();
                aVar.f2706e.f2763e = childAt.getScaleX();
                aVar.f2706e.f2764f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(pivotX == 0.0d && pivotY == 0.0d)) {
                    C2140e eVar = aVar.f2706e;
                    eVar.f2765g = pivotX;
                    eVar.f2766h = pivotY;
                }
                aVar.f2706e.f2767i = childAt.getTranslationX();
                aVar.f2706e.f2768j = childAt.getTranslationY();
                aVar.f2706e.f2769k = childAt.getTranslationZ();
                C2140e eVar2 = aVar.f2706e;
                if (eVar2.f2770l) {
                    eVar2.f2771m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2705d.f2728j0 = barrier.m38811n();
                    aVar.f2705d.f2718e0 = barrier.getReferencedIds();
                    aVar.f2705d.f2712b0 = barrier.getType();
                    aVar.f2705d.f2714c0 = barrier.getMargin();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: h */
    public void m38793h(C2144c cVar) {
        int childCount = cVar.getChildCount();
        this.f2701c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = cVar.getChildAt(i);
            C2144c.C2145a aVar = (C2144c.C2145a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f2700b || id2 != -1) {
                if (!this.f2701c.containsKey(Integer.valueOf(id2))) {
                    this.f2701c.put(Integer.valueOf(id2), new C2136a());
                }
                C2136a aVar2 = this.f2701c.get(Integer.valueOf(id2));
                if (childAt instanceof AbstractC2143b) {
                    aVar2.m38777h((AbstractC2143b) childAt, id2, aVar);
                }
                aVar2.m38778g(id2, aVar);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: i */
    public void m38792i(int i, int i2, int i3, float f) {
        C2137b bVar = m38789l(i).f2705d;
        bVar.f2742x = i2;
        bVar.f2743y = i3;
        bVar.f2744z = f;
    }

    /* renamed from: m */
    public void m38788m(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C2136a k = m38790k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        k.f2705d.f2709a = true;
                    }
                    this.f2701c.put(Integer.valueOf(k.f2702a), k);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0178, code lost:
        continue;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m38787n(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.m38787n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
