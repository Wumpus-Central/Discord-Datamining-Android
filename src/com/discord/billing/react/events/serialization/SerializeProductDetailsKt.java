package com.discord.billing.react.events.serialization;

import com.android.billingclient.api.ProductDetails;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, m15073d2 = {"serializeProductDetails", "Lcom/facebook/react/bridge/ReadableNativeArray;", "", "Lcom/android/billingclient/api/ProductDetails;", "billing_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class SerializeProductDetailsKt {
    public static final ReadableNativeArray serializeProductDetails(List<ProductDetails> list) {
        int t;
        Object obj;
        long j;
        String str;
        boolean z;
        C9971q.m14633g(list, "<this>");
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (ProductDetails productDetails : list) {
            ArrayList arrayList2 = new ArrayList();
            if (C9971q.m14638b(productDetails.m32791d(), "inapp")) {
                ProductDetails.C4105a b = productDetails.m32793b();
                if (b != null) {
                    C9971q.m14634f(b, "productDetails.oneTimePu…oductDetails.productId}\")");
                    j = b.m32784b();
                    obj = b.m32785a();
                    str = b.m32783c();
                } else {
                    throw new AssertionError("Could not find oneTimePurchaseOfferDetails for product: " + productDetails.m32792c());
                }
            } else {
                obj = null;
                if (C9971q.m14638b(productDetails.m32791d(), "subs")) {
                    List<ProductDetails.C4108d> e = productDetails.m32790e();
                    if (e != null) {
                        Iterator<T> it = e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((ProductDetails.C4108d) next).m32777a() == null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                obj = next;
                                break;
                            }
                        }
                        ProductDetails.C4108d dVar = (ProductDetails.C4108d) obj;
                        if (dVar != null) {
                            ProductDetails.C4106b bVar = dVar.m32775c().m32778a().get(0);
                            if (bVar != null) {
                                long b2 = bVar.m32780b();
                                Object a = bVar.m32781a();
                                String c = bVar.m32779c();
                                for (ProductDetails.C4108d dVar2 : e) {
                                    String a2 = dVar2.m32777a();
                                    if (a2 != null) {
                                        arrayList2.add(a2);
                                    }
                                }
                                str = c;
                                j = b2;
                                obj = a;
                            } else {
                                throw new AssertionError("Could not find pricingPhase for product: " + productDetails.m32792c());
                            }
                        }
                    }
                    throw new AssertionError("Could not find subscriptionOfferDetails for product: " + productDetails.m32792c());
                }
                j = 0;
                str = null;
            }
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("identifier", productDetails.m32792c()), C11098x.m10921a("title", productDetails.m32789f()), C11098x.m10921a("description", productDetails.m32794a()), C11098x.m10921a("priceString", obj), C11098x.m10921a("currencyCode", str), C11098x.m10921a("price", Integer.valueOf((int) (j / 10000))), C11098x.m10921a("type", productDetails.m32791d()), C11098x.m10921a("offerIds", NativeArrayExtensionsKt.toNativeArray(arrayList2))));
        }
        return NativeArrayExtensionsKt.toNativeArray(arrayList);
    }
}
