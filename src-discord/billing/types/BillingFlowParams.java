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
import ri.d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\tJD\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¨\u0006\u001c"}, d2 = {"Lcom/discord/billing/types/BillingFlowParams;", "", "()V", "create", "Lcom/android/billingclient/api/BillingFlowParams;", "skuDetails", "", "Lcom/android/billingclient/api/SkuDetails;", "skuId", "", "skuIdOld", "purchaseToken", "userId", "createWithProductDetails", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "productId", "productIdOld", "offerId", "getObfuscatedUserId", "getPriceAmountMicros", "", "getProrationMode", "", "oldProductDetails", "newProductDetails", "oldSkuDetails", "newSkuDetails", "billing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BillingFlowParams {
    public static final BillingFlowParams INSTANCE = new BillingFlowParams();

    private BillingFlowParams() {
    }

    private final String getObfuscatedUserId(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(d.f28529b);
        q.f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = instance.digest(bytes);
        q.f(digest, "getInstance(\"SHA-256\")\n …est(userId.toByteArray())");
        int length = digest.length;
        String str2 = "";
        for (int i10 = 0; i10 < length; i10++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i10])}, 1));
            q.f(format, "format(this, *args)");
            str2 = str2 + format;
        }
        return str2;
    }

    private final long getPriceAmountMicros(ProductDetails productDetails) {
        ProductDetails.d dVar;
        ProductDetails.c c10;
        List<ProductDetails.b> a10;
        Object obj;
        boolean z10;
        if (q.b(productDetails.d(), "inapp")) {
            ProductDetails.a b10 = productDetails.b();
            if (b10 != null) {
                return b10.b();
            }
            return 0L;
        } else if (!q.b(productDetails.d(), "subs")) {
            return 0L;
        } else {
            List<ProductDetails.d> e10 = productDetails.e();
            ProductDetails.b bVar = null;
            if (e10 != null) {
                Iterator<T> it = e10.iterator();
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
            if (!(dVar == null || (c10 = dVar.c()) == null || (a10 = c10.a()) == null)) {
                bVar = a10.get(0);
            }
            if (bVar != null) {
                return bVar.b();
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
        q.g(skuId, "skuId");
        q.g(userId, "userId");
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (q.b(((SkuDetails) obj2).e(), skuId)) {
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
                if (q.b(((SkuDetails) obj).e(), str)) {
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
        BillingFlowParams.a c10 = com.android.billingclient.api.BillingFlowParams.a().e(skuDetails).c(getObfuscatedUserId(userId));
        if (!(skuDetails2 == null || str2 == null)) {
            c10.f(BillingFlowParams.c.a().c(str2).e(INSTANCE.getProrationMode(skuDetails2, skuDetails)).a());
        }
        return c10.a();
    }

    public final com.android.billingclient.api.BillingFlowParams createWithProductDetails(List<ProductDetails> productDetails, String productId, String str, String str2, String userId, String str3) {
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z10;
        Object obj5;
        q.g(productDetails, "productDetails");
        q.g(productId, "productId");
        q.g(userId, "userId");
        Iterator<T> it = productDetails.iterator();
        while (true) {
            str4 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (q.b(((ProductDetails) obj).c(), productId)) {
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
            if (q.b(((ProductDetails) obj2).c(), str)) {
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
            if (q.b(((ProductDetails) obj3).c(), productId)) {
                break;
            }
        }
        ProductDetails productDetails4 = (ProductDetails) obj3;
        if (productDetails4 != null) {
            BillingFlowParams.b.a c10 = BillingFlowParams.b.a().c(productDetails4);
            q.f(c10, "newBuilder()\n           …uctDetails(productDetail)");
            if (q.b(productDetails4.d(), "subs")) {
                if (str3 != null) {
                    List<ProductDetails.d> e10 = productDetails4.e();
                    if (e10 != null) {
                        Iterator<T> it4 = e10.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj5 = null;
                                break;
                            }
                            obj5 = it4.next();
                            if (q.b(((ProductDetails.d) obj5).a(), str3)) {
                                break;
                            }
                        }
                        ProductDetails.d dVar = (ProductDetails.d) obj5;
                        if (dVar != null) {
                            str4 = dVar.b();
                        }
                    }
                } else {
                    List<ProductDetails.d> e11 = productDetails4.e();
                    if (e11 != null) {
                        Iterator<T> it5 = e11.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it5.next();
                            if (((ProductDetails.d) obj4).a() == null) {
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
                        ProductDetails.d dVar2 = (ProductDetails.d) obj4;
                        if (dVar2 != null) {
                            str4 = dVar2.b();
                        }
                    }
                }
                if (str4 != null) {
                    c10.b(str4);
                } else {
                    throw new AssertionError("Could not find offer token for productId: " + productDetails4.c() + " offerId: " + str3);
                }
            }
            BillingFlowParams.b a10 = c10.a();
            q.f(a10, "params.build()");
            arrayList.add(a10);
            BillingFlowParams.a b10 = com.android.billingclient.api.BillingFlowParams.a().d(arrayList).c(getObfuscatedUserId(userId)).b(false);
            if (!(productDetails3 == null || str2 == null)) {
                b10.f(BillingFlowParams.c.a().b(str2).d(INSTANCE.getProrationMode(productDetails3, productDetails2)).a());
            }
            return b10.a();
        }
        throw new AssertionError("Could not find product detail for new product");
    }

    private final int getProrationMode(SkuDetails skuDetails, SkuDetails skuDetails2) {
        return skuDetails2.c() < skuDetails.c() ? 4 : 2;
    }
}
