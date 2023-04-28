package com.android.billingclient.api;

import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.l */
/* loaded from: classes.dex */
public final class C4124l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4124l(JSONObject jSONObject) {
        jSONObject.getInt("commitmentPaymentsCount");
        jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
