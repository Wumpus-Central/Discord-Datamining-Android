package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
/* loaded from: classes.dex */
public final class C2571a extends ClickableSpan {

    /* renamed from: k */
    private final int f3589k;

    /* renamed from: l */
    private final AccessibilityNodeInfoCompat f3590l;

    /* renamed from: m */
    private final int f3591m;

    public C2571a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.f3589k = i;
        this.f3590l = accessibilityNodeInfoCompat;
        this.f3591m = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3589k);
        this.f3590l.m37400Q(this.f3591m, bundle);
    }
}
