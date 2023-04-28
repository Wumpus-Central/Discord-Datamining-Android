package androidx.sharetarget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import androidx.sharetarget.C3159a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.sharetarget.b */
/* loaded from: classes.dex */
class C3160b {

    /* renamed from: a */
    private static volatile ArrayList<C3159a> f4909a;

    /* renamed from: b */
    private static final Object f4910b = new Object();

    /* renamed from: a */
    private static String m35043a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ArrayList<C3159a> m35042b(Context context) {
        if (f4909a == null) {
            synchronized (f4910b) {
                if (f4909a == null) {
                    f4909a = m35039e(context);
                }
            }
        }
        return f4909a;
    }

    /* renamed from: c */
    private static XmlResourceParser m35041c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    /* renamed from: d */
    private static C3159a m35040d(XmlResourceParser xmlResourceParser) {
        String a = m35043a(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                        break;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    name.hashCode();
                    if (name.equals("data")) {
                        arrayList.add(m35037g(xmlResourceParser));
                    } else if (name.equals("category")) {
                        arrayList2.add(m35043a(xmlResourceParser, "name"));
                    }
                }
            } else {
                break;
            }
        }
        if (arrayList.isEmpty() || a == null || arrayList2.isEmpty()) {
            return null;
        }
        return new C3159a((C3159a.C0065a[]) arrayList.toArray(new C3159a.C0065a[arrayList.size()]), a, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
    }

    /* renamed from: e */
    private static ArrayList<C3159a> m35039e(Context context) {
        ArrayList<C3159a> arrayList = new ArrayList<>();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities == null) {
            return arrayList;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            Bundle bundle = activityInfo.metaData;
            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                arrayList.addAll(m35038f(context, activityInfo));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static ArrayList<C3159a> m35038f(Context context, ActivityInfo activityInfo) {
        C3159a d;
        ArrayList<C3159a> arrayList = new ArrayList<>();
        XmlResourceParser c = m35041c(context, activityInfo);
        while (true) {
            try {
                int next = c.next();
                if (next == 1) {
                    break;
                } else if (next == 2 && c.getName().equals("share-target") && (d = m35040d(c)) != null) {
                    arrayList.add(d);
                }
            } catch (Exception e) {
                Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
            }
        }
        c.close();
        return arrayList;
    }

    /* renamed from: g */
    private static C3159a.C0065a m35037g(XmlResourceParser xmlResourceParser) {
        return new C3159a.C0065a(m35043a(xmlResourceParser, "scheme"), m35043a(xmlResourceParser, "host"), m35043a(xmlResourceParser, "port"), m35043a(xmlResourceParser, "path"), m35043a(xmlResourceParser, "pathPattern"), m35043a(xmlResourceParser, "pathPrefix"), m35043a(xmlResourceParser, "mimeType"));
    }
}
