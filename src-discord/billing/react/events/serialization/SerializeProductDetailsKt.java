package com.discord.billing.react.events.serialization;

import com.android.billingclient.api.ProductDetails;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.x;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"serializeProductDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/ProductDetails;", "billing_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class SerializeProductDetailsKt {
    public static final ReadableNativeArray serializeProductDetails(List<ProductDetails> list) {
        int s10;
        Object obj;
        long j10;
        String str;
        boolean z10;
        q.h(list, "<this>");
        s10 = k.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (ProductDetails productDetails : list) {
            ArrayList arrayList2 = new ArrayList();
            if (q.c(productDetails.e(), "inapp")) {
                ProductDetails.a c10 = productDetails.c();
                if (c10 != null) {
                    q.g(c10, "productDetails.oneTimePu…oductDetails.productId}\")");
                    j10 = c10.b();
                    obj = c10.a();
                    str = c10.c();
                } else {
                    throw new AssertionError("Could not find oneTimePurchaseOfferDetails for product: " + productDetails.d());
                }
            } else {
                obj = null;
                if (q.c(productDetails.e(), "subs")) {
                    List<ProductDetails.d> f10 = productDetails.f();
                    if (f10 != null) {
                        Iterator<T> it = f10.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((ProductDetails.d) next).a() == null) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (z10) {
                                obj = next;
                                break;
                            }
                        }
                        ProductDetails.d dVar = (ProductDetails.d) obj;
                        if (dVar != null) {
                            ProductDetails.b bVar = dVar.d().a().get(0);
                            if (bVar != null) {
                                long d10 = bVar.d();
                                Object c11 = bVar.c();
                                String e10 = bVar.e();
                                for (ProductDetails.d dVar2 : f10) {
                                    String a10 = dVar2.a();
                                    if (a10 != null) {
                                        arrayList2.add(a10);
                                    }
                                }
                                str = e10;
                                j10 = d10;
                                obj = c11;
                            } else {
                                throw new AssertionError("Could not find pricingPhase for product: " + productDetails.d());
                            }
                        }
                    }
                    throw new AssertionError("Could not find subscriptionOfferDetails for product: " + productDetails.d());
                }
                j10 = 0;
                str = null;
            }
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(x.a("identifier", productDetails.d()), x.a("title", productDetails.g()), x.a("description", productDetails.a()), x.a("priceString", obj), x.a("currencyCode", str), x.a("price", Integer.valueOf((int) (j10 / 10000))), x.a("type", productDetails.e()), x.a("offerIds", NativeArrayExtensionsKt.toNativeArray(arrayList2))));
        }
        return NativeArrayExtensionsKt.toNativeArray(arrayList);
    }
}
