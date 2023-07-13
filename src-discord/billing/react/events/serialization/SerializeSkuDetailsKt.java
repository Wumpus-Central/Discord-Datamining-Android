package com.discord.billing.react.events.serialization;

import com.android.billingclient.api.SkuDetails;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import ff.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"serializeSkuDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/SkuDetails;", "billing_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class SerializeSkuDetailsKt {
    public static final ReadableNativeArray serializeSkuDetails(List<? extends SkuDetails> list) {
        int s10;
        q.g(list, "<this>");
        s10 = k.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (SkuDetails skuDetails : list) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(x.a("identifier", skuDetails.e()), x.a("title", skuDetails.f()), x.a("description", skuDetails.a()), x.a("priceString", skuDetails.b()), x.a("currencyCode", skuDetails.d()), x.a("price", Integer.valueOf((int) (skuDetails.c() / 10000))), x.a("type", skuDetails.g())));
        }
        return NativeArrayExtensionsKt.toNativeArray(arrayList);
    }
}
