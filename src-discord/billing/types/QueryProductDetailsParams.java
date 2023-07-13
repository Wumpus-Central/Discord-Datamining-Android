package com.discord.billing.types;

import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/discord/billing/types/QueryProductDetailsParams;", "", "()V", "create", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "productType", "Lcom/discord/billing/types/ProductType;", "productIds", "", "", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class QueryProductDetailsParams {
    public static final QueryProductDetailsParams INSTANCE = new QueryProductDetailsParams();

    private QueryProductDetailsParams() {
    }

    public final com.android.billingclient.api.QueryProductDetailsParams create(ProductType productType, List<String> productIds) {
        q.g(productType, "productType");
        q.g(productIds, "productIds");
        ArrayList arrayList = new ArrayList();
        for (String str : productIds) {
            QueryProductDetailsParams.b a10 = QueryProductDetailsParams.b.a().b(str).c(productType.getRawProductType()).a();
            q.f(a10, "newBuilder()\n           …                 .build()");
            arrayList.add(a10);
        }
        QueryProductDetailsParams.a b10 = com.android.billingclient.api.QueryProductDetailsParams.a().b(arrayList);
        q.f(b10, "newBuilder().setProductList(productList)");
        com.android.billingclient.api.QueryProductDetailsParams a11 = b10.a();
        q.f(a11, "params.build()");
        return a11;
    }
}
