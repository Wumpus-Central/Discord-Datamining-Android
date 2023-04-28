package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2733w0;
import com.google.android.flexbox.C5349d;
import java.util.ArrayList;
import java.util.List;
import p163j$.util.Spliterator;
import p195k9.C9842a;

/* loaded from: classes5.dex */
public class FlexboxLayout extends ViewGroup implements AbstractC5346a {

    /* renamed from: A */
    private C5349d.C5351b f37362A;

    /* renamed from: k */
    private int f9915k;

    /* renamed from: l */
    private int f9916l;

    /* renamed from: m */
    private int f9917m;

    /* renamed from: n */
    private int f9918n;

    /* renamed from: o */
    private int f9919o;

    /* renamed from: p */
    private int f9920p;

    /* renamed from: q */
    private Drawable f9921q;

    /* renamed from: r */
    private Drawable f9922r;

    /* renamed from: s */
    private int f9923s;

    /* renamed from: t */
    private int f9924t;

    /* renamed from: u */
    private int f9925u;

    /* renamed from: v */
    private int f9926v;

    /* renamed from: w */
    private int[] f9927w;

    /* renamed from: x */
    private SparseIntArray f9928x;

    /* renamed from: y */
    private C5349d f9929y;

    /* renamed from: z */
    private List<C5348c> f9930z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private void m29452A() {
        if (this.f9921q == null && this.f9922r == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    private boolean m29451a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9930z.get(i2).m29260c() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m29450d(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View r = m29444r(i - i3);
            if (!(r == null || r.getVisibility() == 8)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private void m29449m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f9930z.size();
        for (int i5 = 0; i5 < size; i5++) {
            C5348c cVar = this.f9930z.get(i5);
            for (int i6 = 0; i6 < cVar.f9980h; i6++) {
                int i7 = cVar.f9987o + i6;
                View r = m29444r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    C5338a aVar = (C5338a) r.getLayoutParams();
                    if (m29443s(i7, i6)) {
                        if (z) {
                            i4 = r.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            i4 = (r.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f9926v;
                        }
                        m29446p(canvas, i4, cVar.f9974b, cVar.f9979g);
                    }
                    if (i6 == cVar.f9980h - 1 && (this.f9924t & 4) > 0) {
                        if (z) {
                            i3 = (r.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f9926v;
                        } else {
                            i3 = r.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        }
                        m29446p(canvas, i3, cVar.f9974b, cVar.f9979g);
                    }
                }
            }
            if (m29442t(i5)) {
                if (z2) {
                    i2 = cVar.f9976d;
                } else {
                    i2 = cVar.f9974b - this.f9925u;
                }
                m29447o(canvas, paddingLeft, i2, max);
            }
            if (m29441u(i5) && (this.f9923s & 4) > 0) {
                if (z2) {
                    i = cVar.f9974b - this.f9925u;
                } else {
                    i = cVar.f9976d;
                }
                m29447o(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: n */
    private void m29448n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f9930z.size();
        for (int i5 = 0; i5 < size; i5++) {
            C5348c cVar = this.f9930z.get(i5);
            for (int i6 = 0; i6 < cVar.f9980h; i6++) {
                int i7 = cVar.f9987o + i6;
                View r = m29444r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    C5338a aVar = (C5338a) r.getLayoutParams();
                    if (m29443s(i7, i6)) {
                        if (z2) {
                            i4 = r.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        } else {
                            i4 = (r.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f9925u;
                        }
                        m29447o(canvas, cVar.f9973a, i4, cVar.f9979g);
                    }
                    if (i6 == cVar.f9980h - 1 && (this.f9923s & 4) > 0) {
                        if (z2) {
                            i3 = (r.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f9925u;
                        } else {
                            i3 = r.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        m29447o(canvas, cVar.f9973a, i3, cVar.f9979g);
                    }
                }
            }
            if (m29442t(i5)) {
                if (z) {
                    i2 = cVar.f9975c;
                } else {
                    i2 = cVar.f9973a - this.f9926v;
                }
                m29446p(canvas, i2, paddingTop, max);
            }
            if (m29441u(i5) && (this.f9924t & 4) > 0) {
                if (z) {
                    i = cVar.f9973a - this.f9926v;
                } else {
                    i = cVar.f9975c;
                }
                m29446p(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: o */
    private void m29447o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f9921q;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f9925u + i2);
            this.f9921q.draw(canvas);
        }
    }

    /* renamed from: p */
    private void m29446p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f9922r;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f9926v + i, i3 + i2);
            this.f9922r.draw(canvas);
        }
    }

    /* renamed from: s */
    private boolean m29443s(int i, int i2) {
        if (m29450d(i, i2)) {
            if (mo29278l()) {
                if ((this.f9924t & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f9923s & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo29278l()) {
            if ((this.f9924t & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9923s & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m29442t(int i) {
        if (i < 0 || i >= this.f9930z.size()) {
            return false;
        }
        if (m29451a(i)) {
            if (mo29278l()) {
                if ((this.f9923s & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f9924t & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo29278l()) {
            if ((this.f9923s & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9924t & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: u */
    private boolean m29441u(int i) {
        if (i < 0 || i >= this.f9930z.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f9930z.size(); i2++) {
            if (this.f9930z.get(i2).m29260c() > 0) {
                return false;
            }
        }
        if (mo29278l()) {
            if ((this.f9923s & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9924t & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29440v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m29440v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29439w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m29439w(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: x */
    private void m29438x(int i, int i2) {
        this.f9930z.clear();
        this.f37362A.m29206a();
        this.f9929y.m29230c(this.f37362A, i, i2);
        this.f9930z = this.f37362A.f9996a;
        this.f9929y.m29217p(i, i2);
        if (this.f9918n == 3) {
            for (C5348c cVar : this.f9930z) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < cVar.f9980h; i4++) {
                    View r = m29444r(cVar.f9987o + i4);
                    if (!(r == null || r.getVisibility() == 8)) {
                        C5338a aVar = (C5338a) r.getLayoutParams();
                        if (this.f9916l != 2) {
                            i3 = Math.max(i3, r.getMeasuredHeight() + Math.max(cVar.f9984l - r.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).topMargin) + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
                        } else {
                            i3 = Math.max(i3, r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + Math.max((cVar.f9984l - r.getMeasuredHeight()) + r.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).bottomMargin));
                        }
                    }
                }
                cVar.f9979g = i3;
            }
        }
        this.f9929y.m29218o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f9929y.m29235X();
        m29436z(this.f9915k, i, i2, this.f37362A.f9997b);
    }

    /* renamed from: y */
    private void m29437y(int i, int i2) {
        this.f9930z.clear();
        this.f37362A.m29206a();
        this.f9929y.m29227f(this.f37362A, i, i2);
        this.f9930z = this.f37362A.f9996a;
        this.f9929y.m29217p(i, i2);
        this.f9929y.m29218o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f9929y.m29235X();
        m29436z(this.f9915k, i, i2, this.f37362A.f9997b);
    }

    /* renamed from: z */
    private void m29436z(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, Spliterator.NONNULL);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, Spliterator.NONNULL);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f9928x == null) {
            this.f9928x = new SparseIntArray(getChildCount());
        }
        this.f9927w = this.f9929y.m29219n(view, i, layoutParams, this.f9928x);
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: b */
    public void mo29287b(View view, int i, int i2, C5348c cVar) {
        if (!m29443s(i, i2)) {
            return;
        }
        if (mo29278l()) {
            int i3 = cVar.f9977e;
            int i4 = this.f9926v;
            cVar.f9977e = i3 + i4;
            cVar.f9978f += i4;
            return;
        }
        int i5 = cVar.f9977e;
        int i6 = this.f9925u;
        cVar.f9977e = i5 + i6;
        cVar.f9978f += i6;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: c */
    public int mo29286c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5338a;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: e */
    public View mo29285e(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: f */
    public int mo29284f(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: g */
    public int mo29283g(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getAlignContent() {
        return this.f9919o;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getAlignItems() {
        return this.f9918n;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f9921q;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f9922r;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getFlexDirection() {
        return this.f9915k;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C5348c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f9930z.size());
        for (C5348c cVar : this.f9930z) {
            if (cVar.m29260c() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public List<C5348c> getFlexLinesInternal() {
        return this.f9930z;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getFlexWrap() {
        return this.f9916l;
    }

    public int getJustifyContent() {
        return this.f9917m;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C5348c cVar : this.f9930z) {
            i = Math.max(i, cVar.f9977e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getMaxLine() {
        return this.f9920p;
    }

    public int getShowDividerHorizontal() {
        return this.f9923s;
    }

    public int getShowDividerVertical() {
        return this.f9924t;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f9930z.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C5348c cVar = this.f9930z.get(i4);
            if (m29442t(i4)) {
                if (mo29278l()) {
                    i2 = this.f9925u;
                } else {
                    i2 = this.f9926v;
                }
                i3 += i2;
            }
            if (m29441u(i4)) {
                if (mo29278l()) {
                    i = this.f9925u;
                } else {
                    i = this.f9926v;
                }
                i3 += i;
            }
            i3 += cVar.f9979g;
        }
        return i3;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: h */
    public void mo29282h(C5348c cVar) {
        if (mo29278l()) {
            if ((this.f9924t & 4) > 0) {
                int i = cVar.f9977e;
                int i2 = this.f9926v;
                cVar.f9977e = i + i2;
                cVar.f9978f += i2;
            }
        } else if ((this.f9923s & 4) > 0) {
            int i3 = cVar.f9977e;
            int i4 = this.f9925u;
            cVar.f9977e = i3 + i4;
            cVar.f9978f += i4;
        }
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: i */
    public View mo29281i(int i) {
        return m29444r(i);
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: j */
    public void mo29280j(int i, View view) {
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: k */
    public int mo29279k(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo29278l()) {
            if (m29443s(i, i2)) {
                i4 = 0 + this.f9926v;
            }
            if ((this.f9924t & 4) <= 0) {
                return i4;
            }
            i3 = this.f9926v;
        } else {
            if (m29443s(i, i2)) {
                i4 = 0 + this.f9925u;
            }
            if ((this.f9923s & 4) <= 0) {
                return i4;
            }
            i3 = this.f9925u;
        }
        return i4 + i3;
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    /* renamed from: l */
    public boolean mo29278l() {
        int i = this.f9915k;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f9922r != null || this.f9921q != null) {
            if (this.f9923s != 0 || this.f9924t != 0) {
                int B = C2733w0.m37063B(this);
                int i = this.f9915k;
                boolean z3 = false;
                boolean z4 = true;
                if (i == 0) {
                    if (B == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f9916l == 2) {
                        z3 = true;
                    }
                    m29449m(canvas, z, z3);
                } else if (i == 1) {
                    if (B != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f9916l == 2) {
                        z3 = true;
                    }
                    m29449m(canvas, z2, z3);
                } else if (i == 2) {
                    if (B != 1) {
                        z4 = false;
                    }
                    if (this.f9916l == 2) {
                        z4 = !z4;
                    }
                    m29448n(canvas, z4, false);
                } else if (i == 3) {
                    if (B == 1) {
                        z3 = true;
                    }
                    if (this.f9916l == 2) {
                        z3 = !z3;
                    }
                    m29448n(canvas, z3, true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int B = C2733w0.m37063B(this);
        int i5 = this.f9915k;
        boolean z6 = false;
        if (i5 == 0) {
            if (B == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            m29440v(z2, i, i2, i3, i4);
        } else if (i5 == 1) {
            if (B != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m29440v(z3, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (B == 1) {
                z6 = true;
            }
            if (this.f9916l == 2) {
                z4 = !z6;
            } else {
                z4 = z6;
            }
            m29439w(z4, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (B == 1) {
                z6 = true;
            }
            if (this.f9916l == 2) {
                z5 = !z6;
            } else {
                z5 = z6;
            }
            m29439w(z5, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f9915k);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f9928x == null) {
            this.f9928x = new SparseIntArray(getChildCount());
        }
        if (this.f9929y.m29244O(this.f9928x)) {
            this.f9927w = this.f9929y.m29220m(this.f9928x);
        }
        int i3 = this.f9915k;
        if (i3 == 0 || i3 == 1) {
            m29438x(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            m29437y(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f9915k);
        }
    }

    /* renamed from: q */
    public C5338a generateLayoutParams(AttributeSet attributeSet) {
        return new C5338a(getContext(), attributeSet);
    }

    /* renamed from: r */
    public View m29444r(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f9927w;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public void setAlignContent(int i) {
        if (this.f9919o != i) {
            this.f9919o = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f9918n != i) {
            this.f9918n = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f9921q) {
            this.f9921q = drawable;
            if (drawable != null) {
                this.f9925u = drawable.getIntrinsicHeight();
            } else {
                this.f9925u = 0;
            }
            m29452A();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f9922r) {
            this.f9922r = drawable;
            if (drawable != null) {
                this.f9926v = drawable.getIntrinsicWidth();
            } else {
                this.f9926v = 0;
            }
            m29452A();
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f9915k != i) {
            this.f9915k = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.AbstractC5346a
    public void setFlexLines(List<C5348c> list) {
        this.f9930z = list;
    }

    public void setFlexWrap(int i) {
        if (this.f9916l != i) {
            this.f9916l = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f9917m != i) {
            this.f9917m = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f9920p != i) {
            this.f9920p = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f9923s) {
            this.f9923s = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f9924t) {
            this.f9924t = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9920p = -1;
        this.f9929y = new C5349d(this);
        this.f9930z = new ArrayList();
        this.f37362A = new C5349d.C5351b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9842a.f21938b, i, 0);
        this.f9915k = obtainStyledAttributes.getInt(C9842a.f21944h, 0);
        this.f9916l = obtainStyledAttributes.getInt(C9842a.f21945i, 0);
        this.f9917m = obtainStyledAttributes.getInt(C9842a.f21946j, 0);
        this.f9918n = obtainStyledAttributes.getInt(C9842a.f21940d, 0);
        this.f9919o = obtainStyledAttributes.getInt(C9842a.f21939c, 0);
        this.f9920p = obtainStyledAttributes.getInt(C9842a.f21947k, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C9842a.f21941e);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C9842a.f21942f);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C9842a.f21943g);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C9842a.f21948l, 0);
        if (i2 != 0) {
            this.f9924t = i2;
            this.f9923s = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C9842a.f21950n, 0);
        if (i3 != 0) {
            this.f9924t = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C9842a.f21949m, 0);
        if (i4 != 0) {
            this.f9923s = i4;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C5338a) {
            return new C5338a((C5338a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C5338a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C5338a(layoutParams);
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayout$a */
    /* loaded from: classes5.dex */
    public static class C5338a extends ViewGroup.MarginLayoutParams implements AbstractC5347b {
        public static final Parcelable.Creator<C5338a> CREATOR = new C0148a();

        /* renamed from: k */
        private int f9931k;

        /* renamed from: l */
        private float f9932l;

        /* renamed from: m */
        private float f9933m;

        /* renamed from: n */
        private int f9934n;

        /* renamed from: o */
        private float f9935o;

        /* renamed from: p */
        private int f9936p;

        /* renamed from: q */
        private int f9937q;

        /* renamed from: r */
        private int f9938r;

        /* renamed from: s */
        private int f9939s;

        /* renamed from: t */
        private boolean f9940t;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a */
        /* loaded from: classes5.dex */
        class C0148a implements Parcelable.Creator<C5338a> {
            C0148a() {
            }

            /* renamed from: a */
            public C5338a createFromParcel(Parcel parcel) {
                return new C5338a(parcel);
            }

            /* renamed from: b */
            public C5338a[] newArray(int i) {
                return new C5338a[i];
            }
        }

        public C5338a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9931k = 1;
            this.f9932l = 0.0f;
            this.f9933m = 1.0f;
            this.f9934n = -1;
            this.f9935o = -1.0f;
            this.f9936p = -1;
            this.f9937q = -1;
            this.f9938r = 16777215;
            this.f9939s = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9842a.f21951o);
            this.f9931k = obtainStyledAttributes.getInt(C9842a.f21960x, 1);
            this.f9932l = obtainStyledAttributes.getFloat(C9842a.f21954r, 0.0f);
            this.f9933m = obtainStyledAttributes.getFloat(C9842a.f21955s, 1.0f);
            this.f9934n = obtainStyledAttributes.getInt(C9842a.f21952p, -1);
            this.f9935o = obtainStyledAttributes.getFraction(C9842a.f21953q, 1, 1, -1.0f);
            this.f9936p = obtainStyledAttributes.getDimensionPixelSize(C9842a.f21959w, -1);
            this.f9937q = obtainStyledAttributes.getDimensionPixelSize(C9842a.f21958v, -1);
            this.f9938r = obtainStyledAttributes.getDimensionPixelSize(C9842a.f21957u, 16777215);
            this.f9939s = obtainStyledAttributes.getDimensionPixelSize(C9842a.f21956t, 16777215);
            this.f9940t = obtainStyledAttributes.getBoolean(C9842a.f21961y, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: D */
        public void mo29277D(int i) {
            this.f9936p = i;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: E */
        public int mo29276E() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: F */
        public int mo29275F() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: K */
        public int mo29274K() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: L */
        public int mo29273L() {
            return this.f9937q;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: N */
        public int mo29272N() {
            return this.f9939s;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: c */
        public int mo29271c() {
            return this.f9934n;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: d */
        public float mo29270d() {
            return this.f9933m;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        public int getOrder() {
            return this.f9931k;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: h */
        public int mo29269h() {
            return this.f9936p;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: k */
        public int mo29268k() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: l */
        public void mo29267l(int i) {
            this.f9937q = i;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: m */
        public float mo29266m() {
            return this.f9932l;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: q */
        public float mo29265q() {
            return this.f9935o;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: s */
        public boolean mo29264s() {
            return this.f9940t;
        }

        @Override // com.google.android.flexbox.AbstractC5347b
        /* renamed from: v */
        public int mo29263v() {
            return this.f9938r;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9931k);
            parcel.writeFloat(this.f9932l);
            parcel.writeFloat(this.f9933m);
            parcel.writeInt(this.f9934n);
            parcel.writeFloat(this.f9935o);
            parcel.writeInt(this.f9936p);
            parcel.writeInt(this.f9937q);
            parcel.writeInt(this.f9938r);
            parcel.writeInt(this.f9939s);
            parcel.writeByte(this.f9940t ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public C5338a(C5338a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f9931k = 1;
            this.f9932l = 0.0f;
            this.f9933m = 1.0f;
            this.f9934n = -1;
            this.f9935o = -1.0f;
            this.f9936p = -1;
            this.f9937q = -1;
            this.f9938r = 16777215;
            this.f9939s = 16777215;
            this.f9931k = aVar.f9931k;
            this.f9932l = aVar.f9932l;
            this.f9933m = aVar.f9933m;
            this.f9934n = aVar.f9934n;
            this.f9935o = aVar.f9935o;
            this.f9936p = aVar.f9936p;
            this.f9937q = aVar.f9937q;
            this.f9938r = aVar.f9938r;
            this.f9939s = aVar.f9939s;
            this.f9940t = aVar.f9940t;
        }

        public C5338a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9931k = 1;
            this.f9932l = 0.0f;
            this.f9933m = 1.0f;
            this.f9934n = -1;
            this.f9935o = -1.0f;
            this.f9936p = -1;
            this.f9937q = -1;
            this.f9938r = 16777215;
            this.f9939s = 16777215;
        }

        public C5338a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9931k = 1;
            this.f9932l = 0.0f;
            this.f9933m = 1.0f;
            this.f9934n = -1;
            this.f9935o = -1.0f;
            this.f9936p = -1;
            this.f9937q = -1;
            this.f9938r = 16777215;
            this.f9939s = 16777215;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected C5338a(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f9931k = 1;
            this.f9932l = 0.0f;
            this.f9933m = 1.0f;
            this.f9934n = -1;
            this.f9935o = -1.0f;
            this.f9936p = -1;
            this.f9937q = -1;
            this.f9938r = 16777215;
            this.f9939s = 16777215;
            this.f9931k = parcel.readInt();
            this.f9932l = parcel.readFloat();
            this.f9933m = parcel.readFloat();
            this.f9934n = parcel.readInt();
            this.f9935o = parcel.readFloat();
            this.f9936p = parcel.readInt();
            this.f9937q = parcel.readInt();
            this.f9938r = parcel.readInt();
            this.f9939s = parcel.readInt();
            this.f9940t = parcel.readByte() != 0 ? true : z;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
