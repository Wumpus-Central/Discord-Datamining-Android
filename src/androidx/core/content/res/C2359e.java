package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C2469e;
import com.facebook.react.views.text.TypefaceStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.C1243i;

/* renamed from: androidx.core.content.res.e */
/* loaded from: classes.dex */
public class C2359e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.e$a */
    /* loaded from: classes.dex */
    public static class C2360a {
        /* renamed from: a */
        static int m38008a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.e$b */
    /* loaded from: classes.dex */
    public interface AbstractC2361b {
    }

    /* renamed from: androidx.core.content.res.e$c */
    /* loaded from: classes.dex */
    public static final class C2362c implements AbstractC2361b {

        /* renamed from: a */
        private final C2363d[] f3286a;

        public C2362c(C2363d[] dVarArr) {
            this.f3286a = dVarArr;
        }

        /* renamed from: a */
        public C2363d[] m38007a() {
            return this.f3286a;
        }
    }

    /* renamed from: androidx.core.content.res.e$d */
    /* loaded from: classes.dex */
    public static final class C2363d {

        /* renamed from: a */
        private final String f3287a;

        /* renamed from: b */
        private final int f3288b;

        /* renamed from: c */
        private final boolean f3289c;

        /* renamed from: d */
        private final String f3290d;

        /* renamed from: e */
        private final int f3291e;

        /* renamed from: f */
        private final int f3292f;

        public C2363d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f3287a = str;
            this.f3288b = i;
            this.f3289c = z;
            this.f3290d = str2;
            this.f3291e = i2;
            this.f3292f = i3;
        }

        /* renamed from: a */
        public String m38006a() {
            return this.f3287a;
        }

        /* renamed from: b */
        public int m38005b() {
            return this.f3292f;
        }

        /* renamed from: c */
        public int m38004c() {
            return this.f3291e;
        }

        /* renamed from: d */
        public String m38003d() {
            return this.f3290d;
        }

        /* renamed from: e */
        public int m38002e() {
            return this.f3288b;
        }

        /* renamed from: f */
        public boolean m38001f() {
            return this.f3289c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    /* loaded from: classes.dex */
    public static final class C0037e implements AbstractC2361b {

        /* renamed from: a */
        private final C2469e f3293a;

        /* renamed from: b */
        private final int f3294b;

        /* renamed from: c */
        private final int f3295c;

        /* renamed from: d */
        private final String f3296d;

        public C0037e(C2469e eVar, int i, int i2, String str) {
            this.f3293a = eVar;
            this.f3295c = i;
            this.f3294b = i2;
            this.f3296d = str;
        }

        /* renamed from: a */
        public int m38000a() {
            return this.f3295c;
        }

        /* renamed from: b */
        public C2469e m37999b() {
            return this.f3293a;
        }

        /* renamed from: c */
        public String m37998c() {
            return this.f3296d;
        }

        /* renamed from: d */
        public int m37997d() {
            return this.f3294b;
        }
    }

    /* renamed from: a */
    private static int m38016a(TypedArray typedArray, int i) {
        return C2360a.m38008a(typedArray, i);
    }

    /* renamed from: b */
    public static AbstractC2361b m38015b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m38013d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m38014c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m38016a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m38009h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m38009h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static AbstractC2361b m38013d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m38012e(xmlPullParser, resources);
        }
        m38010g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static AbstractC2361b m38012e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1243i.f69h);
        String string = obtainAttributes.getString(C1243i.f70i);
        String string2 = obtainAttributes.getString(C1243i.f74m);
        String string3 = obtainAttributes.getString(C1243i.f75n);
        int resourceId = obtainAttributes.getResourceId(C1243i.f71j, 0);
        int integer = obtainAttributes.getInteger(C1243i.f72k, 1);
        int integer2 = obtainAttributes.getInteger(C1243i.f73l, 500);
        String string4 = obtainAttributes.getString(C1243i.f76o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m38011f(xmlPullParser, resources));
                    } else {
                        m38010g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C2362c((C2363d[]) arrayList.toArray(new C2363d[0]));
        }
        while (xmlPullParser.next() != 3) {
            m38010g(xmlPullParser);
        }
        return new C0037e(new C2469e(string, string2, string3, m38014c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C2363d m38011f(XmlPullParser xmlPullParser, Resources resources) {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1243i.f77p);
        int i = C1243i.f86y;
        if (!obtainAttributes.hasValue(i)) {
            i = C1243i.f79r;
        }
        int i2 = obtainAttributes.getInt(i, TypefaceStyle.NORMAL);
        int i3 = C1243i.f84w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C1243i.f80s;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = C1243i.f87z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C1243i.f81t;
        }
        int i5 = C1243i.f85x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C1243i.f82u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C1243i.f83v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C1243i.f78q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m38010g(xmlPullParser);
        }
        return new C2363d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m38010g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m38009h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
