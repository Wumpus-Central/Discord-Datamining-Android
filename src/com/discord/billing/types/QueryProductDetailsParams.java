package com.discord.billing.types;

import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m15073d2 = {"Lcom/discord/billing/types/QueryProductDetailsParams;", "", "()V", "create", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "productType", "Lcom/discord/billing/types/ProductType;", "productIds", "", "", "billing_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class QueryProductDetailsParams {
    public static final QueryProductDetailsParams INSTANCE = new QueryProductDetailsParams();

    private QueryProductDetailsParams() {
    }

    public final com.android.billingclient.api.QueryProductDetailsParams create(ProductType productType, List<String> productIds) {
        C9677q.m14633g(productType, "productType");
        C9677q.m14633g(productIds, "productIds");
        ArrayList arrayList = new ArrayList();
        for (String str : productIds) {
            QueryProductDetailsParams.C2998b a = QueryProductDetailsParams.C2998b.m32758a().m32754b(str).m32753c(productType.getRawProductType()).m32755a();
            C9677q.m14634f(a, "newBuilder()\n           …                 .build()");
            arrayList.add(a);
        }
        QueryProductDetailsParams.C2997a b = com.android.billingclient.api.QueryProductDetailsParams.m32764a().m32760b(arrayList);
        C9677q.m14634f(b, "newBuilder().setProductList(productList)");
        com.android.billingclient.api.QueryProductDetailsParams a2 = b.m32761a();
        C9677q.m14634f(a2, "params.build()");
        return a2;
    }
}
