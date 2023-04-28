package p260o8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p079e7.C6722k;
import p132h8.C7937c;
import p193k7.C9798l;

/* renamed from: o8.f */
/* loaded from: classes7.dex */
public final class C11217f extends AbstractC11227h {

    /* renamed from: n */
    public static final C11217f f25041n = new C11217f("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f25042d;

    /* renamed from: e */
    public final List<C11219b> f25043e;

    /* renamed from: f */
    public final List<C11218a> f25044f;

    /* renamed from: g */
    public final List<C11218a> f25045g;

    /* renamed from: h */
    public final List<C11218a> f25046h;

    /* renamed from: i */
    public final List<C11218a> f25047i;

    /* renamed from: j */
    public final C6722k f25048j;

    /* renamed from: k */
    public final List<C6722k> f25049k;

    /* renamed from: l */
    public final Map<String, String> f25050l;

    /* renamed from: m */
    public final List<C9798l> f25051m;

    /* renamed from: o8.f$a */
    /* loaded from: classes7.dex */
    public static final class C11218a {

        /* renamed from: a */
        public final Uri f25052a;

        /* renamed from: b */
        public final C6722k f25053b;

        /* renamed from: c */
        public final String f25054c;

        /* renamed from: d */
        public final String f25055d;

        public C11218a(Uri uri, C6722k kVar, String str, String str2) {
            this.f25052a = uri;
            this.f25053b = kVar;
            this.f25054c = str;
            this.f25055d = str2;
        }
    }

    /* renamed from: o8.f$b */
    /* loaded from: classes7.dex */
    public static final class C11219b {

        /* renamed from: a */
        public final Uri f25056a;

        /* renamed from: b */
        public final C6722k f25057b;

        /* renamed from: c */
        public final String f25058c;

        /* renamed from: d */
        public final String f25059d;

        /* renamed from: e */
        public final String f25060e;

        /* renamed from: f */
        public final String f25061f;

        public C11219b(Uri uri, C6722k kVar, String str, String str2, String str3, String str4) {
            this.f25056a = uri;
            this.f25057b = kVar;
            this.f25058c = str;
            this.f25059d = str2;
            this.f25060e = str3;
            this.f25061f = str4;
        }

        /* renamed from: b */
        public static C11219b m10426b(Uri uri) {
            return new C11219b(uri, new C6722k.C6724b().m24505S("0").m24513K("application/x-mpegURL").m24519E(), null, null, null, null);
        }

        /* renamed from: a */
        public C11219b m10427a(C6722k kVar) {
            return new C11219b(this.f25056a, kVar, this.f25058c, this.f25059d, this.f25060e, this.f25061f);
        }
    }

    public C11217f(String str, List<String> list, List<C11219b> list2, List<C11218a> list3, List<C11218a> list4, List<C11218a> list5, List<C11218a> list6, C6722k kVar, List<C6722k> list7, boolean z, Map<String, String> map, List<C9798l> list8) {
        super(str, list, z);
        List<C6722k> list9;
        this.f25042d = Collections.unmodifiableList(m10428f(list2, list3, list4, list5, list6));
        this.f25043e = Collections.unmodifiableList(list2);
        this.f25044f = Collections.unmodifiableList(list3);
        this.f25045g = Collections.unmodifiableList(list4);
        this.f25046h = Collections.unmodifiableList(list5);
        this.f25047i = Collections.unmodifiableList(list6);
        this.f25048j = kVar;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f25049k = list9;
        this.f25050l = Collections.unmodifiableMap(map);
        this.f25051m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    private static void m10432b(List<C11218a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f25052a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    private static <T> List<T> m10430d(List<T> list, int i, List<C7937c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    C7937c cVar = list2.get(i3);
                    if (cVar.f17035l == i && cVar.f17036m == i2) {
                        arrayList.add(t);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C11217f m10429e(String str) {
        return new C11217f("", Collections.emptyList(), Collections.singletonList(C11219b.m10426b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: f */
    private static List<Uri> m10428f(List<C11219b> list, List<C11218a> list2, List<C11218a> list3, List<C11218a> list4, List<C11218a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f25056a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m10432b(list2, arrayList);
        m10432b(list3, arrayList);
        m10432b(list4, arrayList);
        m10432b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public C11217f mo7928a(List<C7937c> list) {
        return new C11217f(this.f25102a, this.f25103b, m10430d(this.f25043e, 0, list), Collections.emptyList(), m10430d(this.f25045g, 1, list), m10430d(this.f25046h, 2, list), Collections.emptyList(), this.f25048j, this.f25049k, this.f25104c, this.f25050l, this.f25051m);
    }
}
