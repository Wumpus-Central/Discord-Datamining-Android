package com.discord.billing.types;

import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import ti.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\tJD\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¨\u0006\u001c"}, d2 = {"Lcom/discord/billing/types/BillingFlowParams;", "", "()V", "create", "Lcom/android/billingclient/api/BillingFlowParams;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "skuId", "", "skuIdOld", "purchaseToken", "userId", "createWithProductDetails", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "productId", "productIdOld", "offerId", "getObfuscatedUserId", "getPriceAmountMicros", "", "getProrationMode", "", "oldProductDetails", "newProductDetails", "oldSkuDetails", "newSkuDetails", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BillingFlowParams {
    public static final BillingFlowParams INSTANCE = new BillingFlowParams();

    private BillingFlowParams() {
    }

    private final String getObfuscatedUserId(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(a.f28776b);
        q.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = instance.digest(bytes);
        q.g(digest, "getInstance(\"SHA-256\")\n …est(userId.toByteArray())");
        int length = digest.length;
        String str2 = "";
        for (int i10 = 0; i10 < length; i10++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i10])}, 1));
            q.g(format, "format(this, *args)");
            str2 = str2 + format;
        }
        return str2;
    }

    private final long getPriceAmountMicros(ProductDetails productDetails) {
        ProductDetails.d dVar;
        ProductDetails.c d10;
        List<ProductDetails.b> a10;
        Object obj;
        boolean z10;
        if (q.c(productDetails.e(), "inapp")) {
            ProductDetails.a c10 = productDetails.c();
            if (c10 != null) {
                return c10.b();
            }
            return 0L;
        } else if (!q.c(productDetails.e(), "subs")) {
            return 0L;
        } else {
            List<ProductDetails.d> f10 = productDetails.f();
            ProductDetails.b bVar = null;
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ProductDetails.d) obj).a() == null) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                }
                dVar = (ProductDetails.d) obj;
            } else {
                dVar = null;
            }
            if (!(dVar == null || (d10 = dVar.d()) == null || (a10 = d10.a()) == null)) {
                bVar = a10.get(0);
            }
            if (bVar != null) {
                return bVar.d();
            }
            return 0L;
        }
    }

    private final int getProrationMode(ProductDetails productDetails, ProductDetails productDetails2) {
        return getPriceAmountMicros(productDetails2) < getPriceAmountMicros(productDetails) ? 4 : 2;
    }

    public final com.android.billingclient.api.BillingFlowParams create(List<? extends SkuDetails> list, String skuId, String str, String str2, String userId) {
        SkuDetails skuDetails;
        SkuDetails skuDetails2;
        Object obj;
        Object obj2;
        q.h(skuId, "skuId");
        q.h(userId, "userId");
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (q.c(((SkuDetails) obj2).e(), skuId)) {
                    break;
                }
            }
            skuDetails = (SkuDetails) obj2;
        } else {
            skuDetails = null;
        }
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (q.c(((SkuDetails) obj).e(), str)) {
                    break;
                }
            }
            skuDetails2 = (SkuDetails) obj;
        } else {
            skuDetails2 = null;
        }
        if (skuDetails == null || (str != null && skuDetails2 == null)) {
            return null;
        }
        BillingFlowParams.a c10 = com.android.billingclient.api.BillingFlowParams.a().f(skuDetails).c(getObfuscatedUserId(userId));
        if (!(skuDetails2 == null || str2 == null)) {
            c10.g(BillingFlowParams.c.a().c(str2).e(INSTANCE.getProrationMode(skuDetails2, skuDetails)).a());
        }
        return c10.a();
    }

    public final com.android.billingclient.api.BillingFlowParams createWithProductDetails(List<ProductDetails> productDetails, String productId, String str, String str2, String userId, String str3) {
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z10;
        Object obj4;
        q.h(productDetails, "productDetails");
        q.h(productId, "productId");
        q.h(userId, "userId");
        Iterator<T> it = productDetails.iterator();
        while (true) {
            str4 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (q.c(((ProductDetails) obj).d(), productId)) {
                break;
            }
        }
        ProductDetails productDetails2 = (ProductDetails) obj;
        if (productDetails2 != null) {
            Iterator<T> it2 = productDetails.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (q.c(((ProductDetails) obj2).d(), str)) {
                    break;
                }
            }
            ProductDetails productDetails3 = (ProductDetails) obj2;
            if (str != null && productDetails3 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            BillingFlowParams.b.a c10 = BillingFlowParams.b.a().c(productDetails2);
            q.g(c10, "newBuilder()\n           …etails(newProductDetails)");
            if (q.c(productDetails2.e(), "subs")) {
                if (str3 != null) {
                    List<ProductDetails.d> f10 = productDetails2.f();
                    if (f10 != null) {
                        Iterator<T> it3 = f10.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it3.next();
                            if (q.c(((ProductDetails.d) obj4).a(), str3)) {
                                break;
                            }
                        }
                        ProductDetails.d dVar = (ProductDetails.d) obj4;
                        if (dVar != null) {
                            str4 = dVar.c();
                        }
                    }
                } else {
                    List<ProductDetails.d> f11 = productDetails2.f();
                    if (f11 != null) {
                        Iterator<T> it4 = f11.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it4.next();
                            if (((ProductDetails.d) obj3).a() == null) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (z10) {
                                break;
                            }
                        }
                        ProductDetails.d dVar2 = (ProductDetails.d) obj3;
                        if (dVar2 != null) {
                            str4 = dVar2.c();
                        }
                    }
                }
                if (str4 != null) {
                    c10.b(str4);
                } else {
                    throw new AssertionError("Could not find offer token for productId: " + productDetails2.d() + " offerId: " + str3);
                }
            }
            BillingFlowParams.b a10 = c10.a();
            q.g(a10, "params.build()");
            arrayList.add(a10);
            BillingFlowParams.a b10 = com.android.billingclient.api.BillingFlowParams.a().e(arrayList).c(getObfuscatedUserId(userId)).b(false);
            if (!(productDetails3 == null || str2 == null)) {
                b10.g(BillingFlowParams.c.a().b(str2).d(INSTANCE.getProrationMode(productDetails3, productDetails2)).a());
            }
            return b10.a();
        }
        throw new AssertionError("Could not find product detail for new product");
    }

    private final int getProrationMode(SkuDetails skuDetails, SkuDetails skuDetails2) {
        return skuDetails2.c() < skuDetails.c() ? 4 : 2;
    }
}
