package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p187k1.C9716a;

/* renamed from: androidx.emoji2.text.f */
/* loaded from: classes.dex */
public class C2873f {

    /* renamed from: d */
    private static final ThreadLocal<C9716a> f3865d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f3866a;

    /* renamed from: b */
    private final C2887l f3867b;

    /* renamed from: c */
    private volatile int f3868c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2873f(C2887l lVar, int i) {
        this.f3867b = lVar;
        this.f3866a = i;
    }

    /* renamed from: g */
    private C9716a m36428g() {
        ThreadLocal<C9716a> threadLocal = f3865d;
        C9716a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C9716a();
            threadLocal.set(aVar);
        }
        this.f3867b.m36380d().m15520j(aVar, this.f3866a);
        return aVar;
    }

    /* renamed from: a */
    public void m36434a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.f3867b.m36377g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        canvas.drawText(this.f3867b.m36381c(), this.f3866a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m36433b(int i) {
        return m36428g().m15531h(i);
    }

    /* renamed from: c */
    public int m36432c() {
        return m36428g().m15530i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int m36431d() {
        return this.f3868c;
    }

    /* renamed from: e */
    public short m36430e() {
        return m36428g().m15528k();
    }

    /* renamed from: f */
    public int m36429f() {
        return m36428g().m15527l();
    }

    /* renamed from: h */
    public short m36427h() {
        return m36428g().m15526m();
    }

    /* renamed from: i */
    public short m36426i() {
        return m36428g().m15525n();
    }

    /* renamed from: j */
    public boolean m36425j() {
        return m36428g().m15529j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void m36424k(boolean z) {
        this.f3868c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(m36429f()));
        sb2.append(", codepoints:");
        int c = m36432c();
        for (int i = 0; i < c; i++) {
            sb2.append(Integer.toHexString(m36433b(i)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
