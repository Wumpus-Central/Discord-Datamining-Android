package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import p385vb.C13488b;
import p402wb.AbstractC13858b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes3.dex */
public class C5636b extends C5623a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5636b(FloatingActionButton floatingActionButton, AbstractC13858b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: f0 */
    private Animator m27982f0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f10933v, ViewProps.ELEVATION, f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f10933v, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C5623a.f37506C);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: A */
    public void mo27989A() {
        m28018c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: C */
    public void mo27988C(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: D */
    void mo27987D(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C5623a.f37507D, m27982f0(f, f3));
        stateListAnimator.addState(C5623a.f37508E, m27982f0(f, f2));
        stateListAnimator.addState(C5623a.f37509F, m27982f0(f, f2));
        stateListAnimator.addState(C5623a.f37510G, m27982f0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f10933v, ViewProps.ELEVATION, f).setDuration(0L));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.f10933v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f10933v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C5623a.f37506C);
        stateListAnimator.addState(C5623a.f37511H, animatorSet);
        stateListAnimator.addState(C5623a.f37512I, m27982f0(0.0f, 0.0f));
        this.f10933v.setStateListAnimator(stateListAnimator);
        if (mo27984W()) {
            m28018c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: I */
    boolean mo27986I() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: S */
    public void mo27985S(ColorStateList colorStateList) {
        Drawable drawable = this.f10914c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C13488b.m3601a(colorStateList));
        } else {
            super.mo27985S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: W */
    boolean mo27984W() {
        return this.f10934w.mo2526c() || !m28024Y();
    }

    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: a0 */
    void mo27983a0() {
    }

    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: m */
    public float mo27981m() {
        return this.f10933v.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: r */
    public void mo27980r(Rect rect) {
        if (this.f10934w.mo2526c()) {
            super.mo27980r(rect);
        } else if (!m28024Y()) {
            int sizeDimension = (this.f10921j - this.f10933v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C5623a
    /* renamed from: y */
    public void mo27979y() {
    }
}
