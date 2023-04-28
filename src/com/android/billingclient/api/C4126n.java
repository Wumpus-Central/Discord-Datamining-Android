package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import sa.C12844k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.n */
/* loaded from: classes.dex */
public final class C4126n {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static BillingResult m32682a(Bundle bundle, String str, String str2) {
        BillingResult billingResult = C4123k.f6891j;
        if (bundle == null) {
            C12844k.m5285m("BillingClient", String.format("%s got null owned items list", str2));
            return billingResult;
        }
        int b = C12844k.m5296b(bundle, "BillingClient");
        String i = C12844k.m5289i(bundle, "BillingClient");
        BillingResult.C4104a b2 = BillingResult.m32800b();
        b2.m32795c(b);
        b2.m32796b(i);
        BillingResult a = b2.m32797a();
        if (b != 0) {
            C12844k.m5285m("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(b)));
            return a;
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            C12844k.m5285m("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return billingResult;
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                C12844k.m5285m("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return billingResult;
            } else if (stringArrayList2 == null) {
                C12844k.m5285m("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return billingResult;
            } else if (stringArrayList3 != null) {
                return C4123k.f6893l;
            } else {
                C12844k.m5285m("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return billingResult;
            }
        }
    }
}
