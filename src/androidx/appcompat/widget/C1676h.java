package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.widget.C2784c;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
class C1676h {

    /* renamed from: a */
    private final CheckedTextView f1366a;

    /* renamed from: b */
    private ColorStateList f1367b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1368c = null;

    /* renamed from: d */
    private boolean f1369d = false;

    /* renamed from: e */
    private boolean f1370e = false;

    /* renamed from: f */
    private boolean f1371f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1676h(CheckedTextView checkedTextView) {
        this.f1366a = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m40204a() {
        Drawable a = C2784c.m36735a(this.f1366a);
        if (a == null) {
            return;
        }
        if (this.f1369d || this.f1370e) {
            Drawable mutate = C2400a.m37825r(a).mutate();
            if (this.f1369d) {
                C2400a.m37828o(mutate, this.f1367b);
            }
            if (this.f1370e) {
                C2400a.m37827p(mutate, this.f1368c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1366a.getDrawableState());
            }
            this.f1366a.setCheckMarkDrawable(mutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m40203b() {
        return this.f1367b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m40202c() {
        return this.f1368c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40201d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1366a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p052d.C6388j.f37861P0
            r8 = 0
            androidx.appcompat.widget.n1 r0 = androidx.appcompat.widget.C1698n1.m40105v(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1366a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m40109r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C2733w0.m36994o0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p052d.C6388j.f37871R0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x003a
            int r10 = r0.m40113n(r10, r8)     // Catch: all -> 0x0084
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f1366a     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            android.content.Context r1 = r11.getContext()     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            android.graphics.drawable.Drawable r10 = p071e.C6525a.m25364b(r1, r10)     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            r11.setCheckMarkDrawable(r10)     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p052d.C6388j.f37866Q0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x0058
            int r10 = r0.m40113n(r10, r8)     // Catch: all -> 0x0084
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f1366a     // Catch: all -> 0x0084
            android.content.Context r1 = r11.getContext()     // Catch: all -> 0x0084
            android.graphics.drawable.Drawable r10 = p071e.C6525a.m25364b(r1, r10)     // Catch: all -> 0x0084
            r11.setCheckMarkDrawable(r10)     // Catch: all -> 0x0084
        L_0x0058:
            int r10 = p052d.C6388j.f37876S0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f1366a     // Catch: all -> 0x0084
            android.content.res.ColorStateList r10 = r0.m40124c(r10)     // Catch: all -> 0x0084
            androidx.core.widget.C2784c.m36734b(r11, r10)     // Catch: all -> 0x0084
        L_0x0069:
            int r10 = p052d.C6388j.f37880T0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f1366a     // Catch: all -> 0x0084
            r1 = -1
            int r10 = r0.m40116k(r10, r1)     // Catch: all -> 0x0084
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C1709q0.m40054e(r10, r1)     // Catch: all -> 0x0084
            androidx.core.widget.C2784c.m36733c(r11, r10)     // Catch: all -> 0x0084
        L_0x0080:
            r0.m40104w()
            return
        L_0x0084:
            r10 = move-exception
            r0.m40104w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1676h.m40201d(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40200e() {
        if (this.f1371f) {
            this.f1371f = false;
            return;
        }
        this.f1371f = true;
        m40204a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40199f(ColorStateList colorStateList) {
        this.f1367b = colorStateList;
        this.f1369d = true;
        m40204a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40198g(PorterDuff.Mode mode) {
        this.f1368c = mode;
        this.f1370e = true;
        m40204a();
    }
}
