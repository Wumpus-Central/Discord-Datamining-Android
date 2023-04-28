package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.widget.C2787d;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C1680i {

    /* renamed from: a */
    private final CompoundButton f1382a;

    /* renamed from: b */
    private ColorStateList f1383b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1384c = null;

    /* renamed from: d */
    private boolean f1385d = false;

    /* renamed from: e */
    private boolean f1386e = false;

    /* renamed from: f */
    private boolean f1387f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1680i(CompoundButton compoundButton) {
        this.f1382a = compoundButton;
    }

    /* renamed from: a */
    void m40178a() {
        Drawable a = C2787d.m36729a(this.f1382a);
        if (a == null) {
            return;
        }
        if (this.f1385d || this.f1386e) {
            Drawable mutate = C2400a.m37825r(a).mutate();
            if (this.f1385d) {
                C2400a.m37828o(mutate, this.f1383b);
            }
            if (this.f1386e) {
                C2400a.m37827p(mutate, this.f1384c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1382a.getDrawableState());
            }
            this.f1382a.setButtonDrawable(mutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m40177b(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m40176c() {
        return this.f1383b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m40175d() {
        return this.f1384c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40174e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1382a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p052d.C6388j.f37884U0
            r8 = 0
            androidx.appcompat.widget.n1 r0 = androidx.appcompat.widget.C1698n1.m40105v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1382a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m40109r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C2733w0.m36994o0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p052d.C6388j.f37892W0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x003a
            int r10 = r0.m40113n(r10, r8)     // Catch: all -> 0x0084
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1382a     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            android.content.Context r1 = r11.getContext()     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            android.graphics.drawable.Drawable r10 = p071e.C6525a.m25364b(r1, r10)     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            r11.setButtonDrawable(r10)     // Catch: NotFoundException -> 0x003a, all -> 0x0084
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p052d.C6388j.f37888V0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x0058
            int r10 = r0.m40113n(r10, r8)     // Catch: all -> 0x0084
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1382a     // Catch: all -> 0x0084
            android.content.Context r1 = r11.getContext()     // Catch: all -> 0x0084
            android.graphics.drawable.Drawable r10 = p071e.C6525a.m25364b(r1, r10)     // Catch: all -> 0x0084
            r11.setButtonDrawable(r10)     // Catch: all -> 0x0084
        L_0x0058:
            int r10 = p052d.C6388j.f37896X0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1382a     // Catch: all -> 0x0084
            android.content.res.ColorStateList r10 = r0.m40124c(r10)     // Catch: all -> 0x0084
            androidx.core.widget.C2787d.m36727c(r11, r10)     // Catch: all -> 0x0084
        L_0x0069:
            int r10 = p052d.C6388j.f37900Y0     // Catch: all -> 0x0084
            boolean r11 = r0.m40108s(r10)     // Catch: all -> 0x0084
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1382a     // Catch: all -> 0x0084
            r1 = -1
            int r10 = r0.m40116k(r10, r1)     // Catch: all -> 0x0084
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C1709q0.m40054e(r10, r1)     // Catch: all -> 0x0084
            androidx.core.widget.C2787d.m36726d(r11, r10)     // Catch: all -> 0x0084
        L_0x0080:
            r0.m40104w()
            return
        L_0x0084:
            r10 = move-exception
            r0.m40104w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1680i.m40174e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40173f() {
        if (this.f1387f) {
            this.f1387f = false;
            return;
        }
        this.f1387f = true;
        m40178a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40172g(ColorStateList colorStateList) {
        this.f1383b = colorStateList;
        this.f1385d = true;
        m40178a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40171h(PorterDuff.Mode mode) {
        this.f1384c = mode;
        this.f1386e = true;
        m40178a();
    }
}
