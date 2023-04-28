package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.C2733w0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: k */
    private TypedValue f1173k;

    /* renamed from: l */
    private TypedValue f1174l;

    /* renamed from: m */
    private TypedValue f1175m;

    /* renamed from: n */
    private TypedValue f1176n;

    /* renamed from: o */
    private TypedValue f1177o;

    /* renamed from: p */
    private TypedValue f1178p;

    /* renamed from: q */
    private final Rect f1179q;

    /* renamed from: r */
    private AbstractC1605a f1180r;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface AbstractC1605a {
        /* renamed from: a */
        void mo40436a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m40437a(int i, int i2, int i3, int i4) {
        this.f1179q.set(i, i2, i3, i4);
        if (C2733w0.m37029U(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1177o == null) {
            this.f1177o = new TypedValue();
        }
        return this.f1177o;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1178p == null) {
            this.f1178p = new TypedValue();
        }
        return this.f1178p;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1175m == null) {
            this.f1175m = new TypedValue();
        }
        return this.f1175m;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1176n == null) {
            this.f1176n = new TypedValue();
        }
        return this.f1176n;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1173k == null) {
            this.f1173k = new TypedValue();
        }
        return this.f1173k;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1174l == null) {
            this.f1174l = new TypedValue();
        }
        return this.f1174l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1605a aVar = this.f1180r;
        if (aVar != null) {
            aVar.mo40436a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1605a aVar = this.f1180r;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(AbstractC1605a aVar) {
        this.f1180r = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1179q = new Rect();
    }
}
