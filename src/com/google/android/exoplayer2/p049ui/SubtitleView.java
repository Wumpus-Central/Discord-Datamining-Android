package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p119g9.C7557q0;
import p317r8.AbstractC12465l;
import p317r8.C12452a;
import p317r8.C12453b;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
/* loaded from: classes5.dex */
public final class SubtitleView extends FrameLayout implements AbstractC12465l {

    /* renamed from: k */
    private List<C12453b> f9633k;

    /* renamed from: l */
    private C12452a f9634l;

    /* renamed from: m */
    private int f9635m;

    /* renamed from: n */
    private float f9636n;

    /* renamed from: o */
    private float f9637o;

    /* renamed from: p */
    private boolean f9638p;

    /* renamed from: q */
    private boolean f9639q;

    /* renamed from: r */
    private int f9640r;

    /* renamed from: s */
    private AbstractC5267a f9641s;

    /* renamed from: t */
    private View f9642t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    /* loaded from: classes5.dex */
    public interface AbstractC5267a {
        /* renamed from: a */
        void mo29651a(List<C12453b> list, C12452a aVar, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private C12453b m29700a(C12453b bVar) {
        CharSequence charSequence = bVar.f28079a;
        if (!this.f9638p) {
            C12453b.C0400b b = bVar.m6696a().m6680p(-3.4028235E38f, Integer.MIN_VALUE).m6694b();
            if (charSequence != null) {
                b.m6682n(charSequence.toString());
            }
            return b.m6695a();
        } else if (this.f9639q) {
            return bVar;
        } else {
            if (charSequence == null) {
                return bVar;
            }
            C12453b.C0400b p = bVar.m6696a().m6680p(-3.4028235E38f, Integer.MIN_VALUE);
            if (charSequence instanceof Spanned) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                    valueOf.removeSpan(absoluteSizeSpan);
                }
                for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                    valueOf.removeSpan(relativeSizeSpan);
                }
                p.m6682n(valueOf);
            }
            return p.m6695a();
        }
    }

    /* renamed from: c */
    private void m29698c(int i, float f) {
        this.f9635m = i;
        this.f9636n = f;
        m29695f();
    }

    /* renamed from: f */
    private void m29695f() {
        this.f9641s.mo29651a(getCuesWithStylingPreferencesApplied(), this.f9634l, this.f9636n, this.f9635m, this.f9637o);
    }

    private List<C12453b> getCuesWithStylingPreferencesApplied() {
        if (this.f9638p && this.f9639q) {
            return this.f9633k;
        }
        ArrayList arrayList = new ArrayList(this.f9633k.size());
        for (int i = 0; i < this.f9633k.size(); i++) {
            arrayList.add(m29700a(this.f9633k.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C7557q0.f16368a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C12452a getUserCaptionStyle() {
        if (C7557q0.f16368a < 19 || isInEditMode()) {
            return C12452a.f28071g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return C12452a.f28071g;
        }
        return C12452a.m6699a(captioningManager.getUserStyle());
    }

    private <T extends View & AbstractC5267a> void setView(T t) {
        removeView(this.f9642t);
        View view = this.f9642t;
        if (view instanceof C5283i) {
            ((C5283i) view).m29645g();
        }
        this.f9642t = t;
        this.f9641s = t;
        addView(t);
    }

    /* renamed from: b */
    public void m29699b(float f, boolean z) {
        m29698c(z ? 1 : 0, f);
    }

    /* renamed from: d */
    public void m29697d() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: e */
    public void m29696e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    @Override // p317r8.AbstractC12465l
    /* renamed from: n */
    public void mo6665n(List<C12453b> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f9639q = z;
        m29695f();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f9638p = z;
        m29695f();
    }

    public void setBottomPaddingFraction(float f) {
        this.f9637o = f;
        m29695f();
    }

    public void setCues(List<C12453b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f9633k = list;
        m29695f();
    }

    public void setFractionalTextSize(float f) {
        m29699b(f, false);
    }

    public void setStyle(C12452a aVar) {
        this.f9634l = aVar;
        m29695f();
    }

    public void setViewType(int i) {
        if (this.f9640r != i) {
            if (i == 1) {
                setView(new C5271a(getContext()));
            } else if (i == 2) {
                setView(new C5283i(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f9640r = i;
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9633k = Collections.emptyList();
        this.f9634l = C12452a.f28071g;
        this.f9635m = 0;
        this.f9636n = 0.0533f;
        this.f9637o = 0.08f;
        this.f9638p = true;
        this.f9639q = true;
        C5271a aVar = new C5271a(context, attributeSet);
        this.f9641s = aVar;
        this.f9642t = aVar;
        addView(aVar);
        this.f9640r = 1;
    }
}
