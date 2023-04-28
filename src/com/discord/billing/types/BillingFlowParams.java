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
import kotlin.jvm.internal.C9677q;
import p327ri.C12563d;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\tJD\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/billing/types/BillingFlowParams;", "", "()V", "create", "Lcom/android/billingclient/api/BillingFlowParams;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "skuId", "", "skuIdOld", "purchaseToken", "userId", "createWithProductDetails", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "productId", "productIdOld", "offerId", "getObfuscatedUserId", "getPriceAmountMicros", "", "getProrationMode", "", "oldProductDetails", "newProductDetails", "oldSkuDetails", "newSkuDetails", "billing_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class BillingFlowParams {
    public static final BillingFlowParams INSTANCE = new BillingFlowParams();

    private BillingFlowParams() {
    }

    private final String getObfuscatedUserId(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(C12563d.f32852b);
        C9677q.m14634f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = instance.digest(bytes);
        C9677q.m14634f(digest, "getInstance(\"SHA-256\")\n …est(userId.toByteArray())");
        int length = digest.length;
        String str2 = "";
        for (int i = 0; i < length; i++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i])}, 1));
            C9677q.m14634f(format, "format(this, *args)");
            str2 = str2 + format;
        }
        return str2;
    }

    private final long getPriceAmountMicros(ProductDetails productDetails) {
        ProductDetails.C2996d dVar;
        ProductDetails.C2995c c;
        List<ProductDetails.C2994b> a;
        Object obj;
        boolean z;
        if (C9677q.m14638b(productDetails.m32791d(), "inapp")) {
            ProductDetails.C2993a b = productDetails.m32793b();
            if (b != null) {
                return b.m32784b();
            }
            return 0L;
        } else if (!C9677q.m14638b(productDetails.m32791d(), "subs")) {
            return 0L;
        } else {
            List<ProductDetails.C2996d> e = productDetails.m32790e();
            ProductDetails.C2994b bVar = null;
            if (e != null) {
                Iterator<T> it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ProductDetails.C2996d) obj).m32777a() == null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                dVar = (ProductDetails.C2996d) obj;
            } else {
                dVar = null;
            }
            if (!(dVar == null || (c = dVar.m32775c()) == null || (a = c.m32778a()) == null)) {
                bVar = a.get(0);
            }
            if (bVar != null) {
                return bVar.m32780b();
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
        C9677q.m14633g(skuId, "skuId");
        C9677q.m14633g(userId, "userId");
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C9677q.m14638b(((SkuDetails) obj2).m32746e(), skuId)) {
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
                if (C9677q.m14638b(((SkuDetails) obj).m32746e(), str)) {
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
        BillingFlowParams.C2987a c = com.android.billingclient.api.BillingFlowParams.m32843a().m32823e(skuDetails).m32825c(getObfuscatedUserId(userId));
        if (!(skuDetails2 == null || str2 == null)) {
            c.m32822f(BillingFlowParams.C2990c.m32813a().m32805c(str2).m32803e(INSTANCE.getProrationMode(skuDetails2, skuDetails)).m32807a());
        }
        return c.m32827a();
    }

    public final com.android.billingclient.api.BillingFlowParams createWithProductDetails(List<ProductDetails> productDetails, String productId, String str, String str2, String userId, String str3) {
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        Object obj5;
        C9677q.m14633g(productDetails, "productDetails");
        C9677q.m14633g(productId, "productId");
        C9677q.m14633g(userId, "userId");
        Iterator<T> it = productDetails.iterator();
        while (true) {
            str4 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C9677q.m14638b(((ProductDetails) obj).m32792c(), productId)) {
                break;
            }
        }
        ProductDetails productDetails2 = (ProductDetails) obj;
        Iterator<T> it2 = productDetails.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C9677q.m14638b(((ProductDetails) obj2).m32792c(), str)) {
                break;
            }
        }
        ProductDetails productDetails3 = (ProductDetails) obj2;
        ArrayList arrayList = new ArrayList();
        if (productDetails2 == null || (str != null && productDetails3 == null)) {
            return null;
        }
        Iterator<T> it3 = productDetails.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (C9677q.m14638b(((ProductDetails) obj3).m32792c(), productId)) {
                break;
            }
        }
        ProductDetails productDetails4 = (ProductDetails) obj3;
        if (productDetails4 != null) {
            BillingFlowParams.C2988b.C2989a c = BillingFlowParams.C2988b.m32821a().m32816c(productDetails4);
            C9677q.m14634f(c, "newBuilder()\n           …uctDetails(productDetail)");
            if (C9677q.m14638b(productDetails4.m32791d(), "subs")) {
                if (str3 != null) {
                    List<ProductDetails.C2996d> e = productDetails4.m32790e();
                    if (e != null) {
                        Iterator<T> it4 = e.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj5 = null;
                                break;
                            }
                            obj5 = it4.next();
                            if (C9677q.m14638b(((ProductDetails.C2996d) obj5).m32777a(), str3)) {
                                break;
                            }
                        }
                        ProductDetails.C2996d dVar = (ProductDetails.C2996d) obj5;
                        if (dVar != null) {
                            str4 = dVar.m32776b();
                        }
                    }
                } else {
                    List<ProductDetails.C2996d> e2 = productDetails4.m32790e();
                    if (e2 != null) {
                        Iterator<T> it5 = e2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it5.next();
                            if (((ProductDetails.C2996d) obj4).m32777a() == null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        ProductDetails.C2996d dVar2 = (ProductDetails.C2996d) obj4;
                        if (dVar2 != null) {
                            str4 = dVar2.m32776b();
                        }
                    }
                }
                if (str4 != null) {
                    c.m32817b(str4);
                } else {
                    throw new AssertionError("Could not find offer token for productId: " + productDetails4.m32792c() + " offerId: " + str3);
                }
            }
            BillingFlowParams.C2988b a = c.m32818a();
            C9677q.m14634f(a, "params.build()");
            arrayList.add(a);
            BillingFlowParams.C2987a b = com.android.billingclient.api.BillingFlowParams.m32843a().m32824d(arrayList).m32825c(getObfuscatedUserId(userId)).m32826b(false);
            if (!(productDetails3 == null || str2 == null)) {
                b.m32822f(BillingFlowParams.C2990c.m32813a().m32806b(str2).m32804d(INSTANCE.getProrationMode(productDetails3, productDetails2)).m32807a());
            }
            return b.m32827a();
        }
        throw new AssertionError("Could not find product detail for new product");
    }

    private final int getProrationMode(SkuDetails skuDetails, SkuDetails skuDetails2) {
        return skuDetails2.m32748c() < skuDetails.m32748c() ? 4 : 2;
    }
}
