package com.google.firebase.installations;

import p136hc.C7994j;

/* renamed from: com.google.firebase.installations.d */
/* loaded from: classes3.dex */
public class C5797d extends C7994j {

    /* renamed from: k */
    private final EnumC5798a f11487k;

    /* renamed from: com.google.firebase.installations.d$a */
    /* loaded from: classes3.dex */
    public enum EnumC5798a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C5797d(EnumC5798a aVar) {
        this.f11487k = aVar;
    }

    public C5797d(String str, EnumC5798a aVar) {
        super(str);
        this.f11487k = aVar;
    }
}
