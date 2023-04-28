package sa;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.C4128p;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import p377v2.C13393b;

/* renamed from: sa.k */
/* loaded from: classes3.dex */
public final class C12844k {

    /* renamed from: a */
    public static final int f28923a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m5297a(Intent intent, String str) {
        if (intent != null) {
            return m5283o(intent.getExtras(), "ProxyBillingActivity");
        }
        m5285m("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    /* renamed from: b */
    public static int m5296b(Bundle bundle, String str) {
        if (bundle == null) {
            m5285m(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m5286l(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            m5285m(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    /* renamed from: c */
    public static Bundle m5295c(C13393b bVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    /* renamed from: d */
    public static Bundle m5294d(int i, boolean z, String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < size; i2++) {
                C4128p pVar = (C4128p) arrayList.get(i2);
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z3 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public static Bundle m5293e(BillingFlowParams billingFlowParams, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (billingFlowParams.m32842b() != 0) {
            bundle.putInt("prorationMode", billingFlowParams.m32842b());
        }
        if (!TextUtils.isEmpty(billingFlowParams.m32841c())) {
            bundle.putString("accountId", billingFlowParams.m32841c());
        }
        if (!TextUtils.isEmpty(billingFlowParams.m32840d())) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.m32840d());
        }
        if (billingFlowParams.m32829o()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(billingFlowParams.m32839e())) {
            bundle.putString("oldSkuPurchaseToken", billingFlowParams.m32839e());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("originalExternalTransactionId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    /* renamed from: f */
    public static Bundle m5292f(String str, ArrayList arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            if (((QueryProductDetailsParams.C4110b) arrayList.get(i)).m32756c().equals("first_party")) {
                C12853t.m5263c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        return bundle;
    }

    /* renamed from: g */
    public static Bundle m5291g(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: h */
    public static BillingResult m5290h(Intent intent, String str) {
        if (intent == null) {
            m5285m("BillingHelper", "Got null intent!");
            BillingResult.C4104a b = BillingResult.m32800b();
            b.m32795c(6);
            b.m32796b("An internal error occurred.");
            return b.m32797a();
        }
        BillingResult.C4104a b2 = BillingResult.m32800b();
        b2.m32795c(m5296b(intent.getExtras(), str));
        b2.m32796b(m5289i(intent.getExtras(), str));
        return b2.m32797a();
    }

    /* renamed from: i */
    public static String m5289i(Bundle bundle, String str) {
        if (bundle == null) {
            m5285m(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m5286l(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            m5285m(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    /* renamed from: j */
    public static String m5288j(int i) {
        return EnumC12827a.m5318a(i).toString();
    }

    /* renamed from: k */
    public static List m5287k(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase p = m5282p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (p == null) {
                m5286l("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(p);
        } else {
            int size = stringArrayList.size();
            m5286l("BillingHelper", "Found purchase list of " + size + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase p2 = m5282p(stringArrayList.get(i), stringArrayList2.get(i));
                if (p2 != null) {
                    arrayList.add(p2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static void m5286l(String str, String str2) {
        if (!Log.isLoggable(str, 2)) {
            return;
        }
        if (!str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i -= min;
            }
            return;
        }
        Log.v(str, str2);
    }

    /* renamed from: m */
    public static void m5285m(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: n */
    public static void m5284n(String str, String str2, Throwable th2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th2);
        }
    }

    /* renamed from: o */
    private static int m5283o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m5285m(str, "Unexpected null bundle received!");
        return 0;
    }

    /* renamed from: p */
    private static Purchase m5282p(String str, String str2) {
        if (str == null || str2 == null) {
            m5286l("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            m5285m("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
