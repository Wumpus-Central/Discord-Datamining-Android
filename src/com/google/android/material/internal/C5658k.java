package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p366ub.AbstractC13247f;
import p366ub.C13243d;

/* renamed from: com.google.android.material.internal.k */
/* loaded from: classes3.dex */
public class C5658k {

    /* renamed from: c */
    private float f11058c;

    /* renamed from: f */
    private C13243d f11061f;

    /* renamed from: a */
    private final TextPaint f11056a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC13247f f11057b = new C5659a();

    /* renamed from: d */
    private boolean f11059d = true;

    /* renamed from: e */
    private WeakReference<AbstractC5660b> f11060e = new WeakReference<>(null);

    /* renamed from: com.google.android.material.internal.k$a */
    /* loaded from: classes3.dex */
    class C5659a extends AbstractC13247f {
        C5659a() {
        }

        @Override // p366ub.AbstractC13247f
        /* renamed from: a */
        public void mo4214a(int i) {
            C5658k.this.f11059d = true;
            AbstractC5660b bVar = (AbstractC5660b) C5658k.this.f11060e.get();
            if (bVar != null) {
                bVar.mo27846a();
            }
        }

        @Override // p366ub.AbstractC13247f
        /* renamed from: b */
        public void mo4213b(Typeface typeface, boolean z) {
            if (!z) {
                C5658k.this.f11059d = true;
                AbstractC5660b bVar = (AbstractC5660b) C5658k.this.f11060e.get();
                if (bVar != null) {
                    bVar.mo27846a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.k$b */
    /* loaded from: classes3.dex */
    public interface AbstractC5660b {
        /* renamed from: a */
        void mo27846a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C5658k(AbstractC5660b bVar) {
        m27850g(bVar);
    }

    /* renamed from: c */
    private float m27854c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f11056a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C13243d m27853d() {
        return this.f11061f;
    }

    /* renamed from: e */
    public TextPaint m27852e() {
        return this.f11056a;
    }

    /* renamed from: f */
    public float m27851f(String str) {
        if (!this.f11059d) {
            return this.f11058c;
        }
        float c = m27854c(str);
        this.f11058c = c;
        this.f11059d = false;
        return c;
    }

    /* renamed from: g */
    public void m27850g(AbstractC5660b bVar) {
        this.f11060e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void m27849h(C13243d dVar, Context context) {
        if (this.f11061f != dVar) {
            this.f11061f = dVar;
            if (dVar != null) {
                dVar.m4219o(context, this.f11056a, this.f11057b);
                AbstractC5660b bVar = this.f11060e.get();
                if (bVar != null) {
                    this.f11056a.drawableState = bVar.getState();
                }
                dVar.m4220n(context, this.f11056a, this.f11057b);
                this.f11059d = true;
            }
            AbstractC5660b bVar2 = this.f11060e.get();
            if (bVar2 != null) {
                bVar2.mo27846a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m27848i(boolean z) {
        this.f11059d = z;
    }

    /* renamed from: j */
    public void m27847j(Context context) {
        this.f11061f.m4220n(context, this.f11056a, this.f11057b);
    }
}
