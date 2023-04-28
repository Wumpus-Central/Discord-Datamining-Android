package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.C2731w;
import androidx.core.widget.C2787d;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.flexbox.d */
/* loaded from: classes5.dex */
public class C5349d {

    /* renamed from: a */
    private final AbstractC5346a f9991a;

    /* renamed from: b */
    private boolean[] f9992b;

    /* renamed from: c */
    int[] f9993c;

    /* renamed from: d */
    long[] f9994d;

    /* renamed from: e */
    private long[] f9995e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.flexbox.d$b */
    /* loaded from: classes5.dex */
    public static class C5351b {

        /* renamed from: a */
        List<C5348c> f9996a;

        /* renamed from: b */
        int f9997b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m29206a() {
            this.f9996a = null;
            this.f9997b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.d$c */
    /* loaded from: classes5.dex */
    public static class C5352c implements Comparable<C5352c> {

        /* renamed from: k */
        int f9998k;

        /* renamed from: l */
        int f9999l;

        private C5352c() {
        }

        /* renamed from: a */
        public int compareTo(C5352c cVar) {
            int i = this.f9999l;
            int i2 = cVar.f9999l;
            if (i != i2) {
                return i - i2;
            }
            return this.f9998k - cVar.f9998k;
        }

        public String toString() {
            return "Order{order=" + this.f9999l + ", index=" + this.f9998k + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5349d(AbstractC5346a aVar) {
        this.f9991a = aVar;
    }

    /* renamed from: A */
    private int m29258A(int i, AbstractC5347b bVar, int i2) {
        AbstractC5346a aVar = this.f9991a;
        int c = aVar.mo29286c(i, aVar.getPaddingLeft() + this.f9991a.getPaddingRight() + bVar.mo29275F() + bVar.mo29274K() + i2, bVar.getWidth());
        int size = View.MeasureSpec.getSize(c);
        if (size > bVar.mo29263v()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.mo29263v(), View.MeasureSpec.getMode(c));
        }
        if (size < bVar.mo29269h()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.mo29269h(), View.MeasureSpec.getMode(c));
        }
        return c;
    }

    /* renamed from: B */
    private int m29257B(AbstractC5347b bVar, boolean z) {
        if (z) {
            return bVar.mo29276E();
        }
        return bVar.mo29274K();
    }

    /* renamed from: C */
    private int m29256C(AbstractC5347b bVar, boolean z) {
        if (z) {
            return bVar.mo29274K();
        }
        return bVar.mo29276E();
    }

    /* renamed from: D */
    private int m29255D(AbstractC5347b bVar, boolean z) {
        if (z) {
            return bVar.mo29268k();
        }
        return bVar.mo29275F();
    }

    /* renamed from: E */
    private int m29254E(AbstractC5347b bVar, boolean z) {
        if (z) {
            return bVar.mo29275F();
        }
        return bVar.mo29268k();
    }

    /* renamed from: F */
    private int m29253F(AbstractC5347b bVar, boolean z) {
        if (z) {
            return bVar.getHeight();
        }
        return bVar.getWidth();
    }

    /* renamed from: G */
    private int m29252G(AbstractC5347b bVar, boolean z) {
        if (z) {
            return bVar.getWidth();
        }
        return bVar.getHeight();
    }

    /* renamed from: H */
    private int m29251H(boolean z) {
        if (z) {
            return this.f9991a.getPaddingBottom();
        }
        return this.f9991a.getPaddingEnd();
    }

    /* renamed from: I */
    private int m29250I(boolean z) {
        if (z) {
            return this.f9991a.getPaddingEnd();
        }
        return this.f9991a.getPaddingBottom();
    }

    /* renamed from: J */
    private int m29249J(boolean z) {
        if (z) {
            return this.f9991a.getPaddingTop();
        }
        return this.f9991a.getPaddingStart();
    }

    /* renamed from: K */
    private int m29248K(boolean z) {
        if (z) {
            return this.f9991a.getPaddingStart();
        }
        return this.f9991a.getPaddingTop();
    }

    /* renamed from: L */
    private int m29247L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: M */
    private int m29246M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: N */
    private boolean m29245N(int i, int i2, C5348c cVar) {
        return i == i2 - 1 && cVar.m29260c() != 0;
    }

    /* renamed from: P */
    private boolean m29243P(View view, int i, int i2, int i3, int i4, AbstractC5347b bVar, int i5, int i6, int i7) {
        if (this.f9991a.getFlexWrap() == 0) {
            return false;
        }
        if (bVar.mo29264s()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f9991a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int k = this.f9991a.mo29279k(view, i5, i6);
        if (k > 0) {
            i4 += k;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private void m29239T(int i, int i2, C5348c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = cVar.f9977e;
        float f = cVar.f9983k;
        float f2 = 0.0f;
        if (f > 0.0f && i3 <= i8) {
            float f3 = (i8 - i3) / f;
            cVar.f9977e = i4 + cVar.f9978f;
            if (!z) {
                cVar.f9979g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < cVar.f9980h) {
                int i11 = cVar.f9987o + i9;
                View i12 = this.f9991a.mo29281i(i11);
                if (i12 == null || i12.getVisibility() == 8) {
                    i6 = i8;
                    i5 = i9;
                } else {
                    AbstractC5347b bVar = (AbstractC5347b) i12.getLayoutParams();
                    int flexDirection = this.f9991a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i8;
                        int measuredWidth = i12.getMeasuredWidth();
                        long[] jArr = this.f9995e;
                        if (jArr != null) {
                            measuredWidth = m29208y(jArr[i11]);
                        }
                        int measuredHeight = i12.getMeasuredHeight();
                        long[] jArr2 = this.f9995e;
                        if (jArr2 != null) {
                            measuredHeight = m29209x(jArr2[i11]);
                        }
                        if (this.f9992b[i11] || bVar.mo29270d() <= 0.0f) {
                            i5 = i9;
                        } else {
                            float d = measuredWidth - (bVar.mo29270d() * f3);
                            i5 = i9;
                            if (i5 == cVar.f9980h - 1) {
                                d += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(d);
                            if (round < bVar.mo29269h()) {
                                round = bVar.mo29269h();
                                this.f9992b[i11] = true;
                                cVar.f9983k -= bVar.mo29270d();
                                z2 = true;
                            } else {
                                f4 += d - round;
                                double d2 = f4;
                                if (d2 > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int z3 = m29207z(i2, bVar, cVar.f9985m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i12.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = i12.getMeasuredWidth();
                            int measuredHeight2 = i12.getMeasuredHeight();
                            m29233Z(i11, makeMeasureSpec, z3, i12);
                            this.f9991a.mo29280j(i11, i12);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + bVar.mo29268k() + bVar.mo29276E() + this.f9991a.mo29283g(i12));
                        cVar.f9977e += measuredWidth + bVar.mo29275F() + bVar.mo29274K();
                        i7 = max;
                    } else {
                        int measuredHeight3 = i12.getMeasuredHeight();
                        long[] jArr3 = this.f9995e;
                        if (jArr3 != null) {
                            measuredHeight3 = m29209x(jArr3[i11]);
                        }
                        int measuredWidth3 = i12.getMeasuredWidth();
                        long[] jArr4 = this.f9995e;
                        if (jArr4 != null) {
                            measuredWidth3 = m29208y(jArr4[i11]);
                        }
                        if (this.f9992b[i11] || bVar.mo29270d() <= f2) {
                            i6 = i8;
                            i5 = i9;
                        } else {
                            float d3 = measuredHeight3 - (bVar.mo29270d() * f3);
                            if (i9 == cVar.f9980h - 1) {
                                d3 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(d3);
                            if (round2 < bVar.mo29273L()) {
                                round2 = bVar.mo29273L();
                                this.f9992b[i11] = true;
                                cVar.f9983k -= bVar.mo29270d();
                                i6 = i8;
                                i5 = i9;
                                z2 = true;
                            } else {
                                f4 += d3 - round2;
                                i6 = i8;
                                i5 = i9;
                                double d4 = f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int A = m29258A(i, bVar, cVar.f9985m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i12.measure(A, makeMeasureSpec2);
                            measuredWidth3 = i12.getMeasuredWidth();
                            int measuredHeight4 = i12.getMeasuredHeight();
                            m29233Z(i11, A, makeMeasureSpec2, i12);
                            this.f9991a.mo29280j(i11, i12);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i10, measuredWidth3 + bVar.mo29275F() + bVar.mo29274K() + this.f9991a.mo29283g(i12));
                        cVar.f9977e += measuredHeight3 + bVar.mo29268k() + bVar.mo29276E();
                    }
                    cVar.f9979g = Math.max(cVar.f9979g, i7);
                    i10 = i7;
                }
                i9 = i5 + 1;
                i8 = i6;
                f2 = 0.0f;
            }
            if (z2 && i8 != cVar.f9977e) {
                m29239T(i, i2, cVar, i3, i4, true);
            }
        }
    }

    /* renamed from: U */
    private int[] m29238U(int i, List<C5352c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C5352c cVar : list) {
            int i3 = cVar.f9998k;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cVar.f9999l);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    private void m29237V(View view, int i, int i2) {
        int i3;
        AbstractC5347b bVar = (AbstractC5347b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.mo29275F()) - bVar.mo29274K()) - this.f9991a.mo29283g(view), bVar.mo29269h()), bVar.mo29263v());
        long[] jArr = this.f9995e;
        if (jArr != null) {
            i3 = m29209x(jArr[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m29233Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f9991a.mo29280j(i2, view);
    }

    /* renamed from: W */
    private void m29236W(View view, int i, int i2) {
        int i3;
        AbstractC5347b bVar = (AbstractC5347b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.mo29268k()) - bVar.mo29276E()) - this.f9991a.mo29283g(view), bVar.mo29273L()), bVar.mo29272N());
        long[] jArr = this.f9995e;
        if (jArr != null) {
            i3 = m29208y(jArr[i2]);
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m29233Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f9991a.mo29280j(i2, view);
    }

    /* renamed from: Z */
    private void m29233Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f9994d;
        if (jArr != null) {
            jArr[i] = m29240S(i2, i3);
        }
        long[] jArr2 = this.f9995e;
        if (jArr2 != null) {
            jArr2[i] = m29240S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private void m29232a(List<C5348c> list, C5348c cVar, int i, int i2) {
        cVar.f9985m = i2;
        this.f9991a.mo29282h(cVar);
        cVar.f9988p = i;
        list.add(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29224i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.AbstractC5347b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo29269h()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo29269h()
        L_0x0019:
            r3 = r4
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo29263v()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo29263v()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo29273L()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo29273L()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo29272N()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo29272N()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m29233Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f9991a
            r0.mo29280j(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C5349d.m29224i(android.view.View, int):void");
    }

    /* renamed from: k */
    private List<C5348c> m29222k(List<C5348c> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C5348c cVar = new C5348c();
        cVar.f9979g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private List<C5352c> m29221l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C5352c cVar = new C5352c();
            cVar.f9999l = ((AbstractC5347b) this.f9991a.mo29285e(i2).getLayoutParams()).getOrder();
            cVar.f9998k = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: r */
    private void m29215r(int i) {
        boolean[] zArr = this.f9992b;
        if (zArr == null) {
            this.f9992b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f9992b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: v */
    private void m29211v(CompoundButton compoundButton) {
        int i;
        AbstractC5347b bVar = (AbstractC5347b) compoundButton.getLayoutParams();
        int h = bVar.mo29269h();
        int L = bVar.mo29273L();
        Drawable a = C2787d.m36729a(compoundButton);
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.getMinimumWidth();
        }
        if (a != null) {
            i2 = a.getMinimumHeight();
        }
        if (h == -1) {
            h = i;
        }
        bVar.mo29277D(h);
        if (L == -1) {
            L = i2;
        }
        bVar.mo29267l(L);
    }

    /* renamed from: w */
    private void m29210w(int i, int i2, C5348c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = cVar.f9982j;
        float f2 = 0.0f;
        if (f > 0.0f && i3 >= (i5 = cVar.f9977e)) {
            float f3 = (i3 - i5) / f;
            cVar.f9977e = i4 + cVar.f9978f;
            if (!z) {
                cVar.f9979g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < cVar.f9980h) {
                int i11 = cVar.f9987o + i9;
                View i12 = this.f9991a.mo29281i(i11);
                if (i12 == null || i12.getVisibility() == 8) {
                    i6 = i5;
                } else {
                    AbstractC5347b bVar = (AbstractC5347b) i12.getLayoutParams();
                    int flexDirection = this.f9991a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int measuredWidth = i12.getMeasuredWidth();
                        long[] jArr = this.f9995e;
                        if (jArr != null) {
                            measuredWidth = m29208y(jArr[i11]);
                        }
                        int measuredHeight = i12.getMeasuredHeight();
                        long[] jArr2 = this.f9995e;
                        i6 = i5;
                        if (jArr2 != null) {
                            measuredHeight = m29209x(jArr2[i11]);
                        }
                        if (!this.f9992b[i11] && bVar.mo29266m() > 0.0f) {
                            float m = measuredWidth + (bVar.mo29266m() * f3);
                            if (i9 == cVar.f9980h - 1) {
                                m += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(m);
                            if (round > bVar.mo29263v()) {
                                round = bVar.mo29263v();
                                this.f9992b[i11] = true;
                                cVar.f9982j -= bVar.mo29266m();
                                z2 = true;
                            } else {
                                f4 += m - round;
                                double d3 = f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int z3 = m29207z(i2, bVar, cVar.f9985m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i12.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = i12.getMeasuredWidth();
                            int measuredHeight2 = i12.getMeasuredHeight();
                            m29233Z(i11, makeMeasureSpec, z3, i12);
                            this.f9991a.mo29280j(i11, i12);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + bVar.mo29268k() + bVar.mo29276E() + this.f9991a.mo29283g(i12));
                        cVar.f9977e += measuredWidth + bVar.mo29275F() + bVar.mo29274K();
                        i7 = max;
                    } else {
                        int measuredHeight3 = i12.getMeasuredHeight();
                        long[] jArr3 = this.f9995e;
                        if (jArr3 != null) {
                            measuredHeight3 = m29209x(jArr3[i11]);
                        }
                        int measuredWidth3 = i12.getMeasuredWidth();
                        long[] jArr4 = this.f9995e;
                        if (jArr4 != null) {
                            measuredWidth3 = m29208y(jArr4[i11]);
                        }
                        if (this.f9992b[i11] || bVar.mo29266m() <= f2) {
                            i8 = i5;
                        } else {
                            float m2 = measuredHeight3 + (bVar.mo29266m() * f3);
                            if (i9 == cVar.f9980h - 1) {
                                m2 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(m2);
                            if (round2 > bVar.mo29272N()) {
                                round2 = bVar.mo29272N();
                                this.f9992b[i11] = true;
                                cVar.f9982j -= bVar.mo29266m();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += m2 - round2;
                                i8 = i5;
                                double d4 = f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int A = m29258A(i, bVar, cVar.f9985m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i12.measure(A, makeMeasureSpec2);
                            measuredWidth3 = i12.getMeasuredWidth();
                            int measuredHeight4 = i12.getMeasuredHeight();
                            m29233Z(i11, A, makeMeasureSpec2, i12);
                            this.f9991a.mo29280j(i11, i12);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i10, measuredWidth3 + bVar.mo29275F() + bVar.mo29274K() + this.f9991a.mo29283g(i12));
                        cVar.f9977e += measuredHeight3 + bVar.mo29268k() + bVar.mo29276E();
                        i6 = i8;
                    }
                    cVar.f9979g = Math.max(cVar.f9979g, i7);
                    i10 = i7;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            if (z2 && i5 != cVar.f9977e) {
                m29210w(i, i2, cVar, i3, i4, true);
            }
        }
    }

    /* renamed from: z */
    private int m29207z(int i, AbstractC5347b bVar, int i2) {
        AbstractC5346a aVar = this.f9991a;
        int f = aVar.mo29284f(i, aVar.getPaddingTop() + this.f9991a.getPaddingBottom() + bVar.mo29268k() + bVar.mo29276E() + i2, bVar.getHeight());
        int size = View.MeasureSpec.getSize(f);
        if (size > bVar.mo29272N()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.mo29272N(), View.MeasureSpec.getMode(f));
        }
        if (size < bVar.mo29273L()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.mo29273L(), View.MeasureSpec.getMode(f));
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean m29244O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f9991a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View e = this.f9991a.mo29285e(i);
            if (!(e == null || ((AbstractC5347b) e.getLayoutParams()).getOrder() == sparseIntArray.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m29242Q(View view, C5348c cVar, int i, int i2, int i3, int i4) {
        AbstractC5347b bVar = (AbstractC5347b) view.getLayoutParams();
        int alignItems = this.f9991a.getAlignItems();
        if (bVar.mo29271c() != -1) {
            alignItems = bVar.mo29271c();
        }
        int i5 = cVar.f9979g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + bVar.mo29268k()) - bVar.mo29276E()) / 2;
                    if (this.f9991a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f9991a.getFlexWrap() != 2) {
                    int max = Math.max(cVar.f9984l - view.getBaseline(), bVar.mo29268k());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((cVar.f9984l - view.getMeasuredHeight()) + view.getBaseline(), bVar.mo29276E());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f9991a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - bVar.mo29276E(), i3, i8 - bVar.mo29276E());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + bVar.mo29268k(), i3, (i4 - i5) + view.getMeasuredHeight() + bVar.mo29268k());
                return;
            }
        }
        if (this.f9991a.getFlexWrap() != 2) {
            view.layout(i, i2 + bVar.mo29268k(), i3, i4 + bVar.mo29268k());
        } else {
            view.layout(i, i2 - bVar.mo29276E(), i3, i4 - bVar.mo29276E());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m29241R(View view, C5348c cVar, boolean z, int i, int i2, int i3, int i4) {
        AbstractC5347b bVar = (AbstractC5347b) view.getLayoutParams();
        int alignItems = this.f9991a.getAlignItems();
        if (bVar.mo29271c() != -1) {
            alignItems = bVar.mo29271c();
        }
        int i5 = cVar.f9979g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C2731w.m37076b(marginLayoutParams)) - C2731w.m37077a(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - bVar.mo29274K(), i2, ((i3 + i5) - view.getMeasuredWidth()) - bVar.mo29274K(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + bVar.mo29275F(), i2, (i3 - i5) + view.getMeasuredWidth() + bVar.mo29275F(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + bVar.mo29275F(), i2, i3 + bVar.mo29275F(), i4);
        } else {
            view.layout(i - bVar.mo29274K(), i2, i3 - bVar.mo29274K(), i4);
        }
    }

    /* renamed from: S */
    long m29240S(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m29235X() {
        m29234Y(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m29234Y(int i) {
        int i2;
        View i3;
        if (i < this.f9991a.getFlexItemCount()) {
            int flexDirection = this.f9991a.getFlexDirection();
            if (this.f9991a.getAlignItems() == 4) {
                int[] iArr = this.f9993c;
                if (iArr != null) {
                    i2 = iArr[i];
                } else {
                    i2 = 0;
                }
                List<C5348c> flexLinesInternal = this.f9991a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i2 < size) {
                    C5348c cVar = flexLinesInternal.get(i2);
                    int i4 = cVar.f9980h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = cVar.f9987o + i5;
                        if (!(i5 >= this.f9991a.getFlexItemCount() || (i3 = this.f9991a.mo29281i(i6)) == null || i3.getVisibility() == 8)) {
                            AbstractC5347b bVar = (AbstractC5347b) i3.getLayoutParams();
                            if (bVar.mo29271c() == -1 || bVar.mo29271c() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    m29236W(i3, cVar.f9979g, i6);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    m29237V(i3, cVar.f9979g, i6);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (C5348c cVar2 : this.f9991a.getFlexLinesInternal()) {
                for (Integer num : cVar2.f9986n) {
                    View i7 = this.f9991a.mo29281i(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        m29236W(i7, cVar2.f9979g, num.intValue());
                    } else if (flexDirection == 2 || flexDirection == 3) {
                        m29237V(i7, cVar2.f9979g, num.intValue());
                    } else {
                        throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m29231b(C5351b bVar, int i, int i2, int i3, int i4, int i5, List<C5348c> list) {
        int i6;
        C5351b bVar2;
        int i7;
        int i8;
        int i9;
        View view;
        int i10;
        int i11;
        int i12 = i;
        int i13 = i2;
        int i14 = i5;
        boolean l = this.f9991a.mo29278l();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        bVar.f9996a = arrayList;
        int i15 = i14 == -1 ? 1 : 0;
        int K = m29248K(l);
        int I = m29250I(l);
        int J = m29249J(l);
        int H = m29251H(l);
        C5348c cVar = new C5348c();
        int i16 = i4;
        cVar.f9987o = i16;
        int i17 = I + K;
        cVar.f9977e = i17;
        int flexItemCount = this.f9991a.getFlexItemCount();
        int i18 = Integer.MIN_VALUE;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i16 >= flexItemCount) {
                i6 = i20;
                bVar2 = bVar;
                break;
            }
            View i22 = this.f9991a.mo29281i(i16);
            if (i22 != null) {
                if (i22.getVisibility() != 8) {
                    if (i22 instanceof CompoundButton) {
                        m29211v((CompoundButton) i22);
                    }
                    AbstractC5347b bVar3 = (AbstractC5347b) i22.getLayoutParams();
                    if (bVar3.mo29271c() == 4) {
                        cVar.f9986n.add(Integer.valueOf(i16));
                    }
                    int G = m29252G(bVar3, l);
                    if (bVar3.mo29265q() != -1.0f && mode == 1073741824) {
                        G = Math.round(size * bVar3.mo29265q());
                    }
                    if (l) {
                        int c = this.f9991a.mo29286c(i12, i17 + m29254E(bVar3, true) + m29256C(bVar3, true), G);
                        size = size;
                        mode = mode;
                        int f = this.f9991a.mo29284f(i13, J + H + m29255D(bVar3, true) + m29257B(bVar3, true) + i19, m29253F(bVar3, true));
                        i22.measure(c, f);
                        m29233Z(i16, c, f, i22);
                        i7 = c;
                    } else {
                        size = size;
                        mode = mode;
                        int c2 = this.f9991a.mo29286c(i13, J + H + m29255D(bVar3, false) + m29257B(bVar3, false) + i19, m29253F(bVar3, false));
                        int f2 = this.f9991a.mo29284f(i12, m29254E(bVar3, false) + i17 + m29256C(bVar3, false), G);
                        i22.measure(c2, f2);
                        m29233Z(i16, c2, f2, i22);
                        i7 = f2;
                    }
                    this.f9991a.mo29280j(i16, i22);
                    m29224i(i22, i16);
                    i20 = View.combineMeasuredStates(i20, i22.getMeasuredState());
                    arrayList = arrayList;
                    if (m29243P(i22, mode, size, cVar.f9977e, m29256C(bVar3, l) + m29246M(i22, l) + m29254E(bVar3, l), bVar3, i16, i21, arrayList.size())) {
                        if (cVar.m29260c() > 0) {
                            m29232a(arrayList, cVar, i16 > 0 ? i16 - 1 : 0, i19);
                            i19 = cVar.f9979g + i19;
                        } else {
                            i19 = i19;
                        }
                        if (!l) {
                            i13 = i2;
                            view = i22;
                            i16 = i16;
                            if (bVar3.getWidth() == -1) {
                                AbstractC5346a aVar = this.f9991a;
                                view.measure(aVar.mo29286c(i13, aVar.getPaddingLeft() + this.f9991a.getPaddingRight() + bVar3.mo29275F() + bVar3.mo29274K() + i19, bVar3.getWidth()), i7);
                                m29224i(view, i16);
                            }
                        } else if (bVar3.getHeight() == -1) {
                            AbstractC5346a aVar2 = this.f9991a;
                            i13 = i2;
                            i16 = i16;
                            view = i22;
                            view.measure(i7, aVar2.mo29284f(i13, aVar2.getPaddingTop() + this.f9991a.getPaddingBottom() + bVar3.mo29268k() + bVar3.mo29276E() + i19, bVar3.getHeight()));
                            m29224i(view, i16);
                        } else {
                            i13 = i2;
                            view = i22;
                            i16 = i16;
                        }
                        cVar = new C5348c();
                        i10 = 1;
                        cVar.f9980h = 1;
                        i17 = i17;
                        cVar.f9977e = i17;
                        cVar.f9987o = i16;
                        i8 = Integer.MIN_VALUE;
                        i9 = 0;
                    } else {
                        i13 = i2;
                        view = i22;
                        i16 = i16;
                        cVar = cVar;
                        i17 = i17;
                        i10 = 1;
                        cVar.f9980h++;
                        i9 = i21 + 1;
                        i19 = i19;
                        i8 = i18;
                    }
                    cVar.f9989q = (cVar.f9989q ? 1 : 0) | (bVar3.mo29266m() != 0.0f ? i10 : 0);
                    cVar.f9990r = (cVar.f9990r ? 1 : 0) | (bVar3.mo29270d() != 0.0f ? i10 : 0);
                    int[] iArr = this.f9993c;
                    if (iArr != null) {
                        iArr[i16] = arrayList.size();
                    }
                    cVar.f9977e += m29246M(view, l) + m29254E(bVar3, l) + m29256C(bVar3, l);
                    cVar.f9982j += bVar3.mo29266m();
                    cVar.f9983k += bVar3.mo29270d();
                    this.f9991a.mo29287b(view, i16, i9, cVar);
                    int max = Math.max(i8, m29247L(view, l) + m29255D(bVar3, l) + m29257B(bVar3, l) + this.f9991a.mo29283g(view));
                    cVar.f9979g = Math.max(cVar.f9979g, max);
                    if (l) {
                        if (this.f9991a.getFlexWrap() != 2) {
                            cVar.f9984l = Math.max(cVar.f9984l, view.getBaseline() + bVar3.mo29268k());
                        } else {
                            cVar.f9984l = Math.max(cVar.f9984l, (view.getMeasuredHeight() - view.getBaseline()) + bVar3.mo29276E());
                        }
                    }
                    flexItemCount = flexItemCount;
                    if (m29245N(i16, flexItemCount, cVar)) {
                        m29232a(arrayList, cVar, i16, i19);
                        i19 += cVar.f9979g;
                    }
                    i14 = i5;
                    if (i14 == -1 || arrayList.size() <= 0 || arrayList.get(arrayList.size() - i10).f9988p < i14 || i16 < i14 || i15 != 0) {
                        i11 = i3;
                    } else {
                        i19 = -cVar.m29262a();
                        i11 = i3;
                        i15 = i10;
                    }
                    if (i19 > i11 && i15 != 0) {
                        bVar2 = bVar;
                        i6 = i20;
                        break;
                    }
                    i21 = i9;
                    i18 = max;
                    i16++;
                    i12 = i;
                } else {
                    cVar.f9981i++;
                    cVar.f9980h++;
                    if (m29245N(i16, flexItemCount, cVar)) {
                        m29232a(arrayList, cVar, i16, i19);
                    }
                }
            } else if (m29245N(i16, flexItemCount, cVar)) {
                m29232a(arrayList, cVar, i16, i19);
            }
            size = size;
            mode = mode;
            i13 = i13;
            arrayList = arrayList;
            i17 = i17;
            flexItemCount = flexItemCount;
            i16++;
            i12 = i;
        }
        bVar2.f9997b = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m29230c(C5351b bVar, int i, int i2) {
        m29231b(bVar, i, i2, ViewDefaults.NUMBER_OF_LINES, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m29229d(C5351b bVar, int i, int i2, int i3, int i4, List<C5348c> list) {
        m29231b(bVar, i, i2, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m29228e(C5351b bVar, int i, int i2, int i3, int i4, List<C5348c> list) {
        m29231b(bVar, i, i2, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m29227f(C5351b bVar, int i, int i2) {
        m29231b(bVar, i2, i, ViewDefaults.NUMBER_OF_LINES, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m29226g(C5351b bVar, int i, int i2, int i3, int i4, List<C5348c> list) {
        m29231b(bVar, i2, i, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m29225h(C5351b bVar, int i, int i2, int i3, int i4, List<C5348c> list) {
        m29231b(bVar, i2, i, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m29223j(List<C5348c> list, int i) {
        int i2 = this.f9993c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f9993c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f9994d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] m29220m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f9991a.getFlexItemCount();
        return m29238U(flexItemCount, m29221l(flexItemCount), sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int[] m29219n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f9991a.getFlexItemCount();
        List<C5352c> l = m29221l(flexItemCount);
        C5352c cVar = new C5352c();
        if (view == null || !(layoutParams instanceof AbstractC5347b)) {
            cVar.f9999l = 1;
        } else {
            cVar.f9999l = ((AbstractC5347b) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            cVar.f9998k = flexItemCount;
        } else if (i < this.f9991a.getFlexItemCount()) {
            cVar.f9998k = i;
            while (i < flexItemCount) {
                l.get(i).f9998k++;
                i++;
            }
        } else {
            cVar.f9998k = flexItemCount;
        }
        l.add(cVar);
        return m29238U(flexItemCount + 1, l, sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m29218o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f9991a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C5348c> flexLinesInternal = this.f9991a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f9991a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f9979g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f9991a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C5348c cVar = new C5348c();
                    cVar.f9979g = i7;
                    flexLinesInternal.add(0, cVar);
                } else if (alignContent == 2) {
                    this.f9991a.setFlexLines(m29222k(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i6 < size3) {
                                C5348c cVar2 = flexLinesInternal.get(i6);
                                float f2 = cVar2.f9979g + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - round;
                                if (f > 1.0f) {
                                    round++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                cVar2.f9979g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.f9991a.setFlexLines(m29222k(flexLinesInternal, i5, sumOfCrossSize));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C5348c cVar3 = new C5348c();
                        cVar3.f9979g = size4;
                        for (C5348c cVar4 : flexLinesInternal) {
                            arrayList.add(cVar3);
                            arrayList.add(cVar4);
                            arrayList.add(cVar3);
                        }
                        this.f9991a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        arrayList2.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C5348c cVar5 = new C5348c();
                            if (i6 == flexLinesInternal.size() - 2) {
                                cVar5.f9979g = Math.round(f3 + size5);
                                f3 = 0.0f;
                            } else {
                                cVar5.f9979g = Math.round(size5);
                            }
                            int i8 = cVar5.f9979g;
                            f3 += size5 - i8;
                            if (f3 > 1.0f) {
                                cVar5.f9979g = i8 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                cVar5.f9979g = i8 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(cVar5);
                        }
                        i6++;
                    }
                    this.f9991a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m29217p(int i, int i2) {
        m29216q(i, i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m29216q(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        m29215r(this.f9991a.getFlexItemCount());
        if (i3 < this.f9991a.getFlexItemCount()) {
            int flexDirection = this.f9991a.getFlexDirection();
            int flexDirection2 = this.f9991a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                i5 = View.MeasureSpec.getSize(i);
                int largestMainSize = this.f9991a.getLargestMainSize();
                if (mode != 1073741824) {
                    i5 = Math.min(largestMainSize, i5);
                }
                i6 = this.f9991a.getPaddingLeft();
                i4 = this.f9991a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f9991a.getLargestMainSize();
                }
                i6 = this.f9991a.getPaddingTop();
                i4 = this.f9991a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i8 = i6 + i4;
            int[] iArr = this.f9993c;
            if (iArr != null) {
                i7 = iArr[i3];
            } else {
                i7 = 0;
            }
            List<C5348c> flexLinesInternal = this.f9991a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i7 < size) {
                C5348c cVar = flexLinesInternal.get(i7);
                int i9 = cVar.f9977e;
                if (i9 < i5 && cVar.f9989q) {
                    m29210w(i, i2, cVar, i5, i8, false);
                } else if (i9 > i5 && cVar.f9990r) {
                    m29239T(i, i2, cVar, i5, i8, false);
                }
                i7++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m29214s(int i) {
        int[] iArr = this.f9993c;
        if (iArr == null) {
            this.f9993c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f9993c = Arrays.copyOf(this.f9993c, Math.max(iArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m29213t(int i) {
        long[] jArr = this.f9994d;
        if (jArr == null) {
            this.f9994d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f9994d = Arrays.copyOf(this.f9994d, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m29212u(int i) {
        long[] jArr = this.f9995e;
        if (jArr == null) {
            this.f9995e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f9995e = Arrays.copyOf(this.f9995e, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m29209x(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public int m29208y(long j) {
        return (int) j;
    }
}
