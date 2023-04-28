package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes3.dex */
abstract class AbstractC5746f {

    /* renamed from: a */
    TextInputLayout f11310a;

    /* renamed from: b */
    Context f11311b;

    /* renamed from: c */
    CheckableImageButton f11312c;

    /* renamed from: d */
    final int f11313d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5746f(TextInputLayout textInputLayout, int i) {
        this.f11310a = textInputLayout;
        this.f11311b = textInputLayout.getContext();
        this.f11312c = textInputLayout.getEndIconView();
        this.f11313d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo27462a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo27519b(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27518c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo27517d() {
        return false;
    }
}
