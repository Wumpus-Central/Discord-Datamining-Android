package p275p2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.C2098d;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p126h2.C7762i;
import p167j2.C9466d;
import p188k2.AbstractC9721a;
import p188k2.C9741o;
import p188k2.C9744q;
import p223m2.C10470b;
import p223m2.C10472c;
import p223m2.C10473d;
import p238n2.C10693a;
import p238n2.C10694b;
import p238n2.C10703k;
import p254o2.C11186p;
import p343t2.C12949j;
import p358u2.C13180c;

/* renamed from: p2.i */
/* loaded from: classes.dex */
public class C11522i extends AbstractC11511b {

    /* renamed from: D */
    private final StringBuilder f39059D = new StringBuilder(2);

    /* renamed from: E */
    private final RectF f39060E = new RectF();

    /* renamed from: F */
    private final Matrix f39061F = new Matrix();

    /* renamed from: G */
    private final Paint f39062G = new C11523a(1);

    /* renamed from: H */
    private final Paint f39063H = new C11524b(1);

    /* renamed from: I */
    private final Map<C10473d, List<C9466d>> f39064I = new HashMap();

    /* renamed from: J */
    private final C2098d<String> f39065J = new C2098d<>();

    /* renamed from: K */
    private final C9741o f39066K;

    /* renamed from: L */
    private final C7748e0 f39067L;

    /* renamed from: M */
    private final C7762i f39068M;

    /* renamed from: N */
    private AbstractC9721a<Integer, Integer> f39069N;

    /* renamed from: O */
    private AbstractC9721a<Integer, Integer> f39070O;

    /* renamed from: P */
    private AbstractC9721a<Integer, Integer> f39071P;

    /* renamed from: Q */
    private AbstractC9721a<Integer, Integer> f39072Q;

    /* renamed from: R */
    private AbstractC9721a<Float, Float> f39073R;

    /* renamed from: S */
    private AbstractC9721a<Float, Float> f39074S;

    /* renamed from: T */
    private AbstractC9721a<Float, Float> f39075T;

    /* renamed from: U */
    private AbstractC9721a<Float, Float> f39076U;

    /* renamed from: V */
    private AbstractC9721a<Float, Float> f39077V;

    /* renamed from: W */
    private AbstractC9721a<Typeface, Typeface> f39078W;

    /* renamed from: p2.i$a */
    /* loaded from: classes.dex */
    class C11523a extends Paint {
        C11523a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: p2.i$b */
    /* loaded from: classes.dex */
    class C11524b extends Paint {
        C11524b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2.i$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11525c {

        /* renamed from: a */
        static final /* synthetic */ int[] f25716a;

        static {
            int[] iArr = new int[C10470b.EnumC10471a.values().length];
            f25716a = iArr;
            try {
                iArr[C10470b.EnumC10471a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25716a[C10470b.EnumC10471a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25716a[C10470b.EnumC10471a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11522i(C7748e0 e0Var, C11516e eVar) {
        super(e0Var, eVar);
        C10694b bVar;
        C10694b bVar2;
        C10693a aVar;
        C10693a aVar2;
        this.f39067L = e0Var;
        this.f39068M = eVar.m9500b();
        C9741o c = eVar.m9483s().mo12624a();
        this.f39066K = c;
        c.m15511a(this);
        m9519j(c);
        C10703k t = eVar.m9482t();
        if (!(t == null || (aVar2 = t.f23663a) == null)) {
            AbstractC9721a<Integer, Integer> a = aVar2.mo12624a();
            this.f39069N = a;
            a.m15511a(this);
            m9519j(this.f39069N);
        }
        if (!(t == null || (aVar = t.f23664b) == null)) {
            AbstractC9721a<Integer, Integer> a2 = aVar.mo12624a();
            this.f39071P = a2;
            a2.m15511a(this);
            m9519j(this.f39071P);
        }
        if (!(t == null || (bVar2 = t.f23665c) == null)) {
            AbstractC9721a<Float, Float> a3 = bVar2.mo12624a();
            this.f39073R = a3;
            a3.m15511a(this);
            m9519j(this.f39073R);
        }
        if (t != null && (bVar = t.f23666d) != null) {
            AbstractC9721a<Float, Float> a4 = bVar.mo12624a();
            this.f39075T = a4;
            a4.m15511a(this);
            m9519j(this.f39075T);
        }
    }

    /* renamed from: P */
    private void m9473P(C10470b.EnumC10471a aVar, Canvas canvas, float f) {
        int i = C11525c.f25716a[aVar.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: Q */
    private String m9472Q(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m9458d0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.f39065J.m39017e(j)) {
            return this.f39065J.m39015h(j);
        }
        this.f39059D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f39059D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = this.f39059D.toString();
        this.f39065J.m39011m(j, sb2);
        return sb2;
    }

    /* renamed from: R */
    private void m9471R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: S */
    private void m9470S(C10473d dVar, Matrix matrix, float f, C10470b bVar, Canvas canvas) {
        List<C9466d> Z = m9463Z(dVar);
        for (int i = 0; i < Z.size(); i++) {
            Path d = Z.get(i).mo16163d();
            d.computeBounds(this.f39060E, false);
            this.f39061F.set(matrix);
            this.f39061F.preTranslate(0.0f, (-bVar.f23112g) * C12949j.m4967e());
            this.f39061F.preScale(f, f);
            d.transform(this.f39061F);
            if (bVar.f23116k) {
                m9467V(d, this.f39062G, canvas);
                m9467V(d, this.f39063H, canvas);
            } else {
                m9467V(d, this.f39063H, canvas);
                m9467V(d, this.f39062G, canvas);
            }
        }
    }

    /* renamed from: T */
    private void m9469T(String str, C10470b bVar, Canvas canvas) {
        if (bVar.f23116k) {
            m9471R(str, this.f39062G, canvas);
            m9471R(str, this.f39063H, canvas);
            return;
        }
        m9471R(str, this.f39063H, canvas);
        m9471R(str, this.f39062G, canvas);
    }

    /* renamed from: U */
    private void m9468U(String str, C10470b bVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String Q = m9472Q(str, i);
            i += Q.length();
            m9469T(Q, bVar, canvas);
            canvas.translate(this.f39062G.measureText(Q) + f, 0.0f);
        }
    }

    /* renamed from: V */
    private void m9467V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: W */
    private void m9466W(String str, C10470b bVar, Matrix matrix, C10472c cVar, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            C10473d f3 = this.f39068M.m21401c().m39043f(C10473d.m13097c(str.charAt(i), cVar.m13103a(), cVar.m13101c()));
            if (f3 != null) {
                m9470S(f3, matrix, f2, bVar, canvas);
                float b = ((float) f3.m13098b()) * f2 * C12949j.m4967e() * f;
                float f4 = bVar.f23110e / 10.0f;
                AbstractC9721a<Float, Float> aVar = this.f39076U;
                if (aVar != null) {
                    floatValue = aVar.mo15449h().floatValue();
                } else {
                    AbstractC9721a<Float, Float> aVar2 = this.f39075T;
                    if (aVar2 != null) {
                        floatValue = aVar2.mo15449h().floatValue();
                    }
                    canvas.translate(b + (f4 * f), 0.0f);
                }
                f4 += floatValue;
                canvas.translate(b + (f4 * f), 0.0f);
            }
        }
    }

    /* renamed from: X */
    private void m9465X(C10470b bVar, Matrix matrix, C10472c cVar, Canvas canvas) {
        float f;
        AbstractC9721a<Float, Float> aVar = this.f39077V;
        if (aVar != null) {
            f = aVar.mo15449h().floatValue();
        } else {
            f = bVar.f23108c;
        }
        float f2 = f / 100.0f;
        float g = C12949j.m4965g(matrix);
        String str = bVar.f23106a;
        float e = bVar.f23111f * C12949j.m4967e();
        List<String> b0 = m9461b0(str);
        int size = b0.size();
        for (int i = 0; i < size; i++) {
            String str2 = b0.get(i);
            float a0 = m9462a0(str2, cVar, f2, g);
            canvas.save();
            m9473P(bVar.f23109d, canvas, a0);
            canvas.translate(0.0f, (i * e) - (((size - 1) * e) / 2.0f));
            m9466W(str2, bVar, matrix, cVar, canvas, g, f2);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[LOOP:0: B:20:0x008d->B:21:0x008f, LOOP_END] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9464Y(p223m2.C10470b r8, p223m2.C10472c r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.m9459c0(r9)
            if (r9 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r8.f23106a
            h2.e0 r1 = r7.f39067L
            h2.s0 r1 = r1.m21495W()
            if (r1 == 0) goto L_0x0019
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.m21324c(r2, r0)
        L_0x0019:
            android.graphics.Paint r1 = r7.f39062G
            r1.setTypeface(r9)
            k2.a<java.lang.Float, java.lang.Float> r9 = r7.f39077V
            if (r9 == 0) goto L_0x002d
            java.lang.Object r9 = r9.mo15449h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L_0x002f
        L_0x002d:
            float r9 = r8.f23108c
        L_0x002f:
            android.graphics.Paint r1 = r7.f39062G
            float r2 = p343t2.C12949j.m4967e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.f39063H
            android.graphics.Paint r2 = r7.f39062G
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.f39063H
            android.graphics.Paint r2 = r7.f39062G
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f23111f
            float r2 = p343t2.C12949j.m4967e()
            float r1 = r1 * r2
            int r2 = r8.f23110e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            k2.a<java.lang.Float, java.lang.Float> r3 = r7.f39076U
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r3.mo15449h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L_0x006a:
            float r2 = r2 + r3
            goto L_0x007b
        L_0x006c:
            k2.a<java.lang.Float, java.lang.Float> r3 = r7.f39075T
            if (r3 == 0) goto L_0x007b
            java.lang.Object r3 = r3.mo15449h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x006a
        L_0x007b:
            float r3 = p343t2.C12949j.m4967e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.m9461b0(r0)
            int r0 = r9.size()
            r3 = 0
        L_0x008d:
            if (r3 >= r0) goto L_0x00c3
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.f39063H
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            m2.b$a r6 = r8.f23109d
            r7.m9473P(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.m9468U(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L_0x008d
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p275p2.C11522i.m9464Y(m2.b, m2.c, android.graphics.Canvas):void");
    }

    /* renamed from: Z */
    private List<C9466d> m9463Z(C10473d dVar) {
        if (this.f39064I.containsKey(dVar)) {
            return this.f39064I.get(dVar);
        }
        List<C11186p> a = dVar.m13099a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C9466d(this.f39067L, this, a.get(i)));
        }
        this.f39064I.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: a0 */
    private float m9462a0(String str, C10472c cVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C10473d f4 = this.f39068M.m21401c().m39043f(C10473d.m13097c(str.charAt(i), cVar.m13103a(), cVar.m13101c()));
            if (f4 != null) {
                f3 = (float) (f3 + (f4.m13098b() * f * C12949j.m4967e() * f2));
            }
        }
        return f3;
    }

    /* renamed from: b0 */
    private List<String> m9461b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r").split("\r"));
    }

    /* renamed from: c0 */
    private Typeface m9459c0(C10472c cVar) {
        Typeface h;
        AbstractC9721a<Typeface, Typeface> aVar = this.f39078W;
        if (aVar != null && (h = aVar.mo15449h()) != null) {
            return h;
        }
        Typeface X = this.f39067L.m21493X(cVar.m13103a(), cVar.m13101c());
        if (X != null) {
            return X;
        }
        return cVar.m13100d();
    }

    /* renamed from: d0 */
    private boolean m9458d0(int i) {
        if (Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19) {
            return true;
        }
        return false;
    }

    @Override // p275p2.AbstractC11511b, p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        super.mo9460c(t, cVar);
        if (t == AbstractC7765j0.f16876a) {
            AbstractC9721a<Integer, Integer> aVar = this.f39070O;
            if (aVar != null) {
                m9529H(aVar);
            }
            if (cVar == null) {
                this.f39070O = null;
                return;
            }
            C9744q qVar = new C9744q(cVar);
            this.f39070O = qVar;
            qVar.m15511a(this);
            m9519j(this.f39070O);
        } else if (t == AbstractC7765j0.f16877b) {
            AbstractC9721a<Integer, Integer> aVar2 = this.f39072Q;
            if (aVar2 != null) {
                m9529H(aVar2);
            }
            if (cVar == null) {
                this.f39072Q = null;
                return;
            }
            C9744q qVar2 = new C9744q(cVar);
            this.f39072Q = qVar2;
            qVar2.m15511a(this);
            m9519j(this.f39072Q);
        } else if (t == AbstractC7765j0.f16894s) {
            AbstractC9721a<Float, Float> aVar3 = this.f39074S;
            if (aVar3 != null) {
                m9529H(aVar3);
            }
            if (cVar == null) {
                this.f39074S = null;
                return;
            }
            C9744q qVar3 = new C9744q(cVar);
            this.f39074S = qVar3;
            qVar3.m15511a(this);
            m9519j(this.f39074S);
        } else if (t == AbstractC7765j0.f16895t) {
            AbstractC9721a<Float, Float> aVar4 = this.f39076U;
            if (aVar4 != null) {
                m9529H(aVar4);
            }
            if (cVar == null) {
                this.f39076U = null;
                return;
            }
            C9744q qVar4 = new C9744q(cVar);
            this.f39076U = qVar4;
            qVar4.m15511a(this);
            m9519j(this.f39076U);
        } else if (t == AbstractC7765j0.f38425F) {
            AbstractC9721a<Float, Float> aVar5 = this.f39077V;
            if (aVar5 != null) {
                m9529H(aVar5);
            }
            if (cVar == null) {
                this.f39077V = null;
                return;
            }
            C9744q qVar5 = new C9744q(cVar);
            this.f39077V = qVar5;
            qVar5.m15511a(this);
            m9519j(this.f39077V);
        } else if (t == AbstractC7765j0.f38432M) {
            AbstractC9721a<Typeface, Typeface> aVar6 = this.f39078W;
            if (aVar6 != null) {
                m9529H(aVar6);
            }
            if (cVar == null) {
                this.f39078W = null;
                return;
            }
            C9744q qVar6 = new C9744q(cVar);
            this.f39078W = qVar6;
            qVar6.m15511a(this);
            m9519j(this.f39078W);
        } else if (t == AbstractC7765j0.f38434O) {
            this.f39066K.m15462q(cVar);
        }
    }

    @Override // p275p2.AbstractC11511b, p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        super.mo9457f(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f39068M.m21402b().width(), this.f39068M.m21402b().height());
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: u */
    void mo9456u(Canvas canvas, Matrix matrix, int i) {
        int i2;
        canvas.save();
        if (!this.f39067L.m21492X0()) {
            canvas.concat(matrix);
        }
        C10470b h = this.f39066K.mo15449h();
        C10472c cVar = this.f39068M.m21397g().get(h.f23107b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        AbstractC9721a<Integer, Integer> aVar = this.f39070O;
        if (aVar != null) {
            this.f39062G.setColor(aVar.mo15449h().intValue());
        } else {
            AbstractC9721a<Integer, Integer> aVar2 = this.f39069N;
            if (aVar2 != null) {
                this.f39062G.setColor(aVar2.mo15449h().intValue());
            } else {
                this.f39062G.setColor(h.f23113h);
            }
        }
        AbstractC9721a<Integer, Integer> aVar3 = this.f39072Q;
        if (aVar3 != null) {
            this.f39063H.setColor(aVar3.mo15449h().intValue());
        } else {
            AbstractC9721a<Integer, Integer> aVar4 = this.f39071P;
            if (aVar4 != null) {
                this.f39063H.setColor(aVar4.mo15449h().intValue());
            } else {
                this.f39063H.setColor(h.f23114i);
            }
        }
        if (this.f25669x.m15453h() == null) {
            i2 = 100;
        } else {
            i2 = this.f25669x.m15453h().mo15449h().intValue();
        }
        int i3 = (i2 * 255) / 100;
        this.f39062G.setAlpha(i3);
        this.f39063H.setAlpha(i3);
        AbstractC9721a<Float, Float> aVar5 = this.f39074S;
        if (aVar5 != null) {
            this.f39063H.setStrokeWidth(aVar5.mo15449h().floatValue());
        } else {
            AbstractC9721a<Float, Float> aVar6 = this.f39073R;
            if (aVar6 != null) {
                this.f39063H.setStrokeWidth(aVar6.mo15449h().floatValue());
            } else {
                this.f39063H.setStrokeWidth(h.f23115j * C12949j.m4967e() * C12949j.m4965g(matrix));
            }
        }
        if (this.f39067L.m21492X0()) {
            m9465X(h, matrix, cVar, canvas);
        } else {
            m9464Y(h, cVar, canvas);
        }
        canvas.restore();
    }
}
