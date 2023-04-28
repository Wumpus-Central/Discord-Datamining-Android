package com.android.billingclient.api;

import android.text.TextUtils;
import p377v2.C13421z;

/* renamed from: com.android.billingclient.api.o */
/* loaded from: classes.dex */
public final class C4127o {

    /* renamed from: a */
    private String f6908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4127o(C13421z zVar) {
    }

    /* renamed from: a */
    public final C4127o m32681a(String str) {
        this.f6908a = str;
        return this;
    }

    /* renamed from: b */
    public final C4128p m32680b() {
        if (!TextUtils.isEmpty(this.f6908a)) {
            return new C4128p(this.f6908a, null, null, 0, null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}
