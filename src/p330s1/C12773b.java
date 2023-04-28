package p330s1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.collection.C2094a;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.util.C2510a;
import com.facebook.react.uimanager.events.TouchesHelper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: s1.b */
/* loaded from: classes.dex */
class C12773b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.b$a */
    /* loaded from: classes.dex */
    public static class C12774a {

        /* renamed from: a */
        final String f28674a;

        /* renamed from: b */
        final String f28675b;

        /* renamed from: c */
        final ShortcutInfoCompat f28676c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C12774a(ShortcutInfoCompat shortcutInfoCompat, String str, String str2) {
            this.f28676c = shortcutInfoCompat;
            this.f28674a = str;
            this.f28675b = str2;
        }
    }

    /* renamed from: a */
    private static String m5527a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Map<String, C12774a> m5526b(File file, Context context) {
        FileInputStream fileInputStream;
        C12774a e;
        ShortcutInfoCompat shortcutInfoCompat;
        C2094a aVar = new C2094a();
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception e2) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e2);
        }
        if (!file.exists()) {
            fileInputStream.close();
            return aVar;
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(fileInputStream, "UTF_8");
        while (true) {
            int next = newPullParser.next();
            if (next == 1) {
                break;
            } else if (next == 2 && newPullParser.getName().equals(TouchesHelper.TARGET_KEY) && (e = m5523e(newPullParser, context)) != null && (shortcutInfoCompat = e.f28676c) != null) {
                aVar.put(shortcutInfoCompat.m38092f(), e);
            }
        }
        fileInputStream.close();
        return aVar;
    }

    /* renamed from: c */
    private static ComponentName m5525c(XmlPullParser xmlPullParser) {
        String a = m5527a(xmlPullParser, "component");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return ComponentName.unflattenFromString(a);
    }

    /* renamed from: d */
    private static Intent m5524d(XmlPullParser xmlPullParser) {
        String a = m5527a(xmlPullParser, "action");
        String a2 = m5527a(xmlPullParser, "targetPackage");
        String a3 = m5527a(xmlPullParser, "targetClass");
        if (a == null) {
            return null;
        }
        Intent intent = new Intent(a);
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
            intent.setClassName(a2, a3);
        }
        return intent;
    }

    /* renamed from: e */
    private static C12774a m5523e(XmlPullParser xmlPullParser, Context context) {
        if (!xmlPullParser.getName().equals(TouchesHelper.TARGET_KEY)) {
            return null;
        }
        String a = m5527a(xmlPullParser, "id");
        String a2 = m5527a(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
            return null;
        }
        int parseInt = Integer.parseInt(m5527a(xmlPullParser, "rank"));
        String a3 = m5527a(xmlPullParser, "long_label");
        String a4 = m5527a(xmlPullParser, "disabled_message");
        ComponentName c = m5525c(xmlPullParser);
        String a5 = m5527a(xmlPullParser, "icon_resource_name");
        String a6 = m5527a(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlPullParser.getName().equals(TouchesHelper.TARGET_KEY)) {
                        break;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    if (name.equals("intent")) {
                        Intent d = m5524d(xmlPullParser);
                        if (d != null) {
                            arrayList.add(d);
                        }
                    } else if (name.equals("categories")) {
                        String a7 = m5527a(xmlPullParser, "name");
                        if (!TextUtils.isEmpty(a7)) {
                            hashSet.add(a7);
                        }
                    }
                }
            } else {
                break;
            }
        }
        ShortcutInfoCompat.C2351a l = new ShortcutInfoCompat.C2351a(context, a).m38073m(a2).m38074l(parseInt);
        if (!TextUtils.isEmpty(a3)) {
            l.m38077i(a3);
        }
        if (!TextUtils.isEmpty(a4)) {
            l.m38082d(a4);
        }
        if (c != null) {
            l.m38084b(c);
        }
        if (!arrayList.isEmpty()) {
            l.m38079g((Intent[]) arrayList.toArray(new Intent[0]));
        }
        if (!hashSet.isEmpty()) {
            l.m38083c(hashSet);
        }
        return new C12774a(l.m38085a(), a5, a6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m5522f(List<C12774a> list, File file) {
        Exception e;
        FileOutputStream e2;
        C2510a aVar = new C2510a(file);
        FileOutputStream fileOutputStream = null;
        try {
            e2 = aVar.m37604e();
        } catch (Exception e3) {
            e = e3;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(e2);
            XmlSerializer newSerializer = Xml.newSerializer();
            newSerializer.setOutput(bufferedOutputStream, "UTF_8");
            newSerializer.startDocument(null, Boolean.TRUE);
            newSerializer.startTag(null, "share_targets");
            for (C12774a aVar2 : list) {
                m5518j(newSerializer, aVar2);
            }
            newSerializer.endTag(null, "share_targets");
            newSerializer.endDocument();
            bufferedOutputStream.flush();
            e2.flush();
            aVar.m37607b(e2);
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = e2;
            Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + aVar.m37606c(), e);
            aVar.m37608a(fileOutputStream);
            throw new RuntimeException("Failed to write to file " + aVar.m37606c(), e);
        }
    }

    /* renamed from: g */
    private static void m5521g(XmlSerializer xmlSerializer, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            xmlSerializer.attribute(null, str, str2);
        }
    }

    /* renamed from: h */
    private static void m5520h(XmlSerializer xmlSerializer, String str) {
        if (!TextUtils.isEmpty(str)) {
            xmlSerializer.startTag(null, "categories");
            m5521g(xmlSerializer, "name", str);
            xmlSerializer.endTag(null, "categories");
        }
    }

    /* renamed from: i */
    private static void m5519i(XmlSerializer xmlSerializer, Intent intent) {
        xmlSerializer.startTag(null, "intent");
        m5521g(xmlSerializer, "action", intent.getAction());
        if (intent.getComponent() != null) {
            m5521g(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
            m5521g(xmlSerializer, "targetClass", intent.getComponent().getClassName());
        }
        xmlSerializer.endTag(null, "intent");
    }

    /* renamed from: j */
    private static void m5518j(XmlSerializer xmlSerializer, C12774a aVar) {
        xmlSerializer.startTag(null, TouchesHelper.TARGET_KEY);
        ShortcutInfoCompat shortcutInfoCompat = aVar.f28676c;
        m5521g(xmlSerializer, "id", shortcutInfoCompat.m38092f());
        m5521g(xmlSerializer, "short_label", shortcutInfoCompat.m38088j().toString());
        m5521g(xmlSerializer, "rank", Integer.toString(shortcutInfoCompat.m38089i()));
        if (!TextUtils.isEmpty(shortcutInfoCompat.m38090h())) {
            m5521g(xmlSerializer, "long_label", shortcutInfoCompat.m38090h().toString());
        }
        if (!TextUtils.isEmpty(shortcutInfoCompat.m38094d())) {
            m5521g(xmlSerializer, "disabled_message", shortcutInfoCompat.m38094d().toString());
        }
        if (shortcutInfoCompat.m38096b() != null) {
            m5521g(xmlSerializer, "component", shortcutInfoCompat.m38096b().flattenToString());
        }
        if (!TextUtils.isEmpty(aVar.f28674a)) {
            m5521g(xmlSerializer, "icon_resource_name", aVar.f28674a);
        }
        if (!TextUtils.isEmpty(aVar.f28675b)) {
            m5521g(xmlSerializer, "icon_bitmap_path", aVar.f28675b);
        }
        for (Intent intent : shortcutInfoCompat.m38091g()) {
            m5519i(xmlSerializer, intent);
        }
        for (String str : shortcutInfoCompat.m38095c()) {
            m5520h(xmlSerializer, str);
        }
        xmlSerializer.endTag(null, TouchesHelper.TARGET_KEY);
    }
}
