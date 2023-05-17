package com.discord.chrome_custom_tabs;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u000bJ\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabsPackages;", "", "()V", "CHROME_BETA_PACKAGE", "", "CHROME_DEV_PACKAGE", "CHROME_LOCAL_PACKAGE", "CHROME_PROD_PACKAGE", "getDefaultViewIntentHandler", "Landroid/content/Intent;", "getCustomTabsDefaultPackage", "Landroid/content/Context;", "getCustomTabsPackages", "", "chrome_custom_tabs_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomTabsPackages {
    private static final String CHROME_BETA_PACKAGE = "com.chrome.beta";
    private static final String CHROME_DEV_PACKAGE = "com.chrome.dev";
    private static final String CHROME_LOCAL_PACKAGE = "com.google.android.apps.chrome";
    private static final String CHROME_PROD_PACKAGE = "com.android.chrome";
    public static final CustomTabsPackages INSTANCE = new CustomTabsPackages();

    private CustomTabsPackages() {
    }

    private final List<String> getCustomTabsPackages(Context context) {
        String str;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(getDefaultViewIntentHandler(), 0);
        q.f(queryIntentActivities, "packageManager.queryInte…ltViewIntentHandler(), 0)");
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(resolveInfo.activityInfo.packageName);
            q.f(intent, "Intent()\n               …activityInfo.packageName)");
            if (context.getPackageManager().resolveService(intent, 0) != null) {
                str = resolveInfo.activityInfo.packageName;
            } else {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private final Intent getDefaultViewIntentHandler() {
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        q.f(data, "Intent()\n            .se…mParts(\"http\", \"\", null))");
        return data;
    }

    public final String getCustomTabsDefaultPackage(Context context) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object W;
        q.g(context, "<this>");
        List<String> customTabsPackages = getCustomTabsPackages(context);
        Iterator<T> it = customTabsPackages.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (q.b((String) obj2, CHROME_PROD_PACKAGE)) {
                break;
            }
        }
        String str = (String) obj2;
        if (str != null) {
            return str;
        }
        Iterator<T> it2 = customTabsPackages.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (q.b((String) obj3, CHROME_BETA_PACKAGE)) {
                break;
            }
        }
        String str2 = (String) obj3;
        if (str2 != null) {
            return str2;
        }
        Iterator<T> it3 = customTabsPackages.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it3.next();
            if (q.b((String) obj4, CHROME_DEV_PACKAGE)) {
                break;
            }
        }
        String str3 = (String) obj4;
        if (str3 != null) {
            return str3;
        }
        Iterator<T> it4 = customTabsPackages.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next = it4.next();
            if (q.b((String) next, CHROME_LOCAL_PACKAGE)) {
                obj = next;
                break;
            }
        }
        String str4 = (String) obj;
        if (str4 != null) {
            return str4;
        }
        W = r.W(customTabsPackages);
        return (String) W;
    }
}
