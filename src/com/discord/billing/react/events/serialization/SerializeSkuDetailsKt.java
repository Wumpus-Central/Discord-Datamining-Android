package com.discord.billing.react.events.serialization;

import com.android.billingclient.api.SkuDetails;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, m15073d2 = {"serializeSkuDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/SkuDetails;", "billing_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class SerializeSkuDetailsKt {
    public static final ReadableNativeArray serializeSkuDetails(List<? extends SkuDetails> list) {
        int t;
        C9971q.m14633g(list, "<this>");
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (SkuDetails skuDetails : list) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("identifier", skuDetails.m32746e()), C11098x.m10921a("title", skuDetails.m32745f()), C11098x.m10921a("description", skuDetails.m32750a()), C11098x.m10921a("priceString", skuDetails.m32749b()), C11098x.m10921a("currencyCode", skuDetails.m32747d()), C11098x.m10921a("price", Integer.valueOf((int) (skuDetails.m32748c() / 10000))), C11098x.m10921a("type", skuDetails.m32744g())));
        }
        return NativeArrayExtensionsKt.toNativeArray(arrayList);
    }
}
