package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes3.dex */
public final class C5653i {

    /* renamed from: a */
    private final ArrayList<C5655b> f11035a = new ArrayList<>();

    /* renamed from: b */
    private C5655b f11036b = null;

    /* renamed from: c */
    ValueAnimator f11037c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f11038d = new C5654a();

    /* renamed from: com.google.android.material.internal.i$a */
    /* loaded from: classes3.dex */
    class C5654a extends AnimatorListenerAdapter {
        C5654a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5653i iVar = C5653i.this;
            if (iVar.f11037c == animator) {
                iVar.f11037c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.i$b */
    /* loaded from: classes3.dex */
    static class C5655b {

        /* renamed from: a */
        final int[] f11040a;

        /* renamed from: b */
        final ValueAnimator f11041b;

        C5655b(int[] iArr, ValueAnimator valueAnimator) {
            this.f11040a = iArr;
            this.f11041b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m27866a(int[] iArr, ValueAnimator valueAnimator) {
        C5655b bVar = new C5655b(iArr, valueAnimator);
        valueAnimator.addListener(this.f11038d);
        this.f11035a.add(bVar);
    }
}
