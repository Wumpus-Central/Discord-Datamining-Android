package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes.dex */
public class C2091a implements CardViewImpl {
    /* renamed from: p */
    private C2092b m39072p(CardViewDelegate cardViewDelegate) {
        return (C2092b) cardViewDelegate.mo39090d();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: a */
    public void mo39087a(CardViewDelegate cardViewDelegate, float f) {
        m39072p(cardViewDelegate).m39064h(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: b */
    public float mo39086b(CardViewDelegate cardViewDelegate) {
        return m39072p(cardViewDelegate).m39068d();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: c */
    public void mo39085c(CardViewDelegate cardViewDelegate, float f) {
        cardViewDelegate.mo39088f().setElevation(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: d */
    public float mo39084d(CardViewDelegate cardViewDelegate) {
        return m39072p(cardViewDelegate).m39069c();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: e */
    public ColorStateList mo39083e(CardViewDelegate cardViewDelegate) {
        return m39072p(cardViewDelegate).m39070b();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: f */
    public float mo39082f(CardViewDelegate cardViewDelegate) {
        return mo39086b(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: g */
    public void mo39081g(CardViewDelegate cardViewDelegate) {
        mo39073o(cardViewDelegate, mo39084d(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: h */
    public void mo39080h(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        cardViewDelegate.mo39092b(new C2092b(colorStateList, f));
        View f4 = cardViewDelegate.mo39088f();
        f4.setClipToOutline(true);
        f4.setElevation(f2);
        mo39073o(cardViewDelegate, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: i */
    public float mo39079i(CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.mo39088f().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: j */
    public void mo39078j(CardViewDelegate cardViewDelegate) {
        mo39073o(cardViewDelegate, mo39084d(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: k */
    public void mo39077k(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.mo39091c()) {
            cardViewDelegate.mo39093a(0, 0, 0, 0);
            return;
        }
        float d = mo39084d(cardViewDelegate);
        float b = mo39086b(cardViewDelegate);
        int ceil = (int) Math.ceil(C2093c.m39062a(d, b, cardViewDelegate.mo39089e()));
        int ceil2 = (int) Math.ceil(C2093c.m39061b(d, b, cardViewDelegate.mo39089e()));
        cardViewDelegate.mo39093a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: l */
    public void mo39076l() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: m */
    public float mo39075m(CardViewDelegate cardViewDelegate) {
        return mo39086b(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: n */
    public void mo39074n(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        m39072p(cardViewDelegate).m39066f(colorStateList);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: o */
    public void mo39073o(CardViewDelegate cardViewDelegate, float f) {
        m39072p(cardViewDelegate).m39065g(f, cardViewDelegate.mo39091c(), cardViewDelegate.mo39089e());
        mo39077k(cardViewDelegate);
    }
}
