package com.discord.billing.react.events.serialization;

import com.android.billingclient.api.ProductDetails;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import gf.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"serializeProductDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/ProductDetails;", "billing_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SerializeProductDetailsKt {
    public static final ReadableNativeArray serializeProductDetails(List<ProductDetails> list) {
        int s10;
        Object obj;
        long j10;
        String str;
        boolean z10;
        q.g(list, "<this>");
        s10 = k.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (ProductDetails productDetails : list) {
            ArrayList arrayList2 = new ArrayList();
            if (q.b(productDetails.d(), "inapp")) {
                ProductDetails.a b10 = productDetails.b();
                if (b10 != null) {
                    q.f(b10, "productDetails.oneTimePu…oductDetails.productId}\")");
                    j10 = b10.b();
                    obj = b10.a();
                    str = b10.c();
                } else {
                    throw new AssertionError("Could not find oneTimePurchaseOfferDetails for product: " + productDetails.c());
                }
            } else {
                obj = null;
                if (q.b(productDetails.d(), "subs")) {
                    List<ProductDetails.d> e10 = productDetails.e();
                    if (e10 != null) {
                        Iterator<T> it = e10.iterator();
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
                            ProductDetails.b bVar = dVar.c().a().get(0);
                            if (bVar != null) {
                                long b11 = bVar.b();
                                Object a10 = bVar.a();
                                String c10 = bVar.c();
                                for (ProductDetails.d dVar2 : e10) {
                                    String a11 = dVar2.a();
                                    if (a11 != null) {
                                        arrayList2.add(a11);
                                    }
                                }
                                str = c10;
                                j10 = b11;
                                obj = a10;
                            } else {
                                throw new AssertionError("Could not find pricingPhase for product: " + productDetails.c());
                            }
                        }
                    }
                    throw new AssertionError("Could not find subscriptionOfferDetails for product: " + productDetails.c());
                }
                j10 = 0;
                str = null;
            }
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(x.a("identifier", productDetails.c()), x.a("title", productDetails.f()), x.a("description", productDetails.a()), x.a("priceString", obj), x.a("currencyCode", str), x.a("price", Integer.valueOf((int) (j10 / 10000))), x.a("type", productDetails.d()), x.a("offerIds", NativeArrayExtensionsKt.toNativeArray(arrayList2))));
        }
        return NativeArrayExtensionsKt.toNativeArray(arrayList);
    }
}
