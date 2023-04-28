package net.time4j.android.spi;

import android.content.Context;
import android.text.format.DateFormat;
import fj.AbstractC7352b;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import net.time4j.base.AbstractC10814d;
import net.time4j.calendar.service.C10872b;
import net.time4j.calendar.service.C10873c;
import net.time4j.p248tz.AbstractC11030r;
import net.time4j.p248tz.AbstractC11031s;
import p143hj.AbstractC8082s;
import p161ij.AbstractC8636f;
import p161ij.AbstractC8639i;
import p161ij.AbstractC8660o;
import p161ij.AbstractC8670u;
import p161ij.AbstractC8683x;
import p161ij.AbstractC8684y;
import p161ij.EnumC8635e;
import p201kj.AbstractC9888c;
import p250nj.C11149a;
import p250nj.C11152b;
import p250nj.C11153c;
import p250nj.C11158f;
import p250nj.C11160h;
import p250nj.C11162i;
import p271oj.AbstractC11409c;
import p271oj.AbstractC11412e;
import p287pj.C11781a;
import p287pj.C11782b;

/* loaded from: classes8.dex */
public class AndroidResourceLoader extends AbstractC10814d {

    /* renamed from: f */
    private static final Map<Class<?>, Iterable<?>> f23962f;

    /* renamed from: g */
    private static final Set<String> f23963g;

    /* renamed from: d */
    private Context f23964d = null;

    /* renamed from: e */
    private List<AbstractC8636f> f23965e = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10794a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23966a;

        static {
            int[] iArr = new int[EnumC8635e.values().length];
            f23966a = iArr;
            try {
                iArr[EnumC8635e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23966a[EnumC8635e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23966a[EnumC8635e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$b */
    /* loaded from: classes8.dex */
    public class C10795b implements AbstractC9888c {
        private C10795b() {
        }

        /* renamed from: a */
        private AbstractC9888c m12234a() {
            return C10796c.f23968a;
        }

        /* renamed from: b */
        private String m12233b(String str) {
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb2.append(charAt);
                    while (true) {
                        i++;
                        if (i >= length) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if (charAt2 == '\'') {
                            sb2.append(charAt2);
                            int i2 = i + 1;
                            if (i2 < length && str.charAt(i2) == '\'') {
                                i = i2;
                            }
                        }
                        sb2.append(charAt2);
                    }
                } else if (charAt == 'h') {
                    sb2.append('H');
                } else if (charAt != 'a') {
                    sb2.append(charAt);
                }
                i++;
            }
            return sb2.toString();
        }

        @Override // p161ij.AbstractC8636f
        /* renamed from: c */
        public String mo10708c(EnumC8635e eVar, Locale locale) {
            return mo10707d(eVar, locale, false);
        }

        @Override // p201kj.AbstractC9888c
        /* renamed from: d */
        public String mo10707d(EnumC8635e eVar, Locale locale, boolean z) {
            String str;
            boolean z2;
            String str2;
            String d = m12234a().mo10707d(eVar, locale, z);
            if (Locale.getDefault().equals(locale)) {
                EnumC8635e eVar2 = EnumC8635e.SHORT;
                if (eVar != eVar2) {
                    str = m12234a().mo10708c(eVar2, locale);
                } else {
                    str = d;
                }
                if (str.indexOf(97) == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean is24HourFormat = DateFormat.is24HourFormat(AndroidResourceLoader.this.f23964d);
                if (is24HourFormat != z2) {
                    if (is24HourFormat) {
                        return m12233b(d).replace("  ", " ").trim();
                    }
                    if (locale.getLanguage().equals("en")) {
                        str2 = "b";
                    } else {
                        str2 = "B";
                    }
                    int i = C10794a.f23966a[eVar.ordinal()];
                    if (i == 1) {
                        return "h:mm:ss " + str2 + " zzzz";
                    } else if (i == 2) {
                        return "h:mm:ss " + str2 + " z";
                    } else if (i != 3) {
                        return "h:mm " + str2;
                    } else {
                        return "h:mm:ss " + str2;
                    }
                }
            }
            return d;
        }

        @Override // p161ij.AbstractC8636f
        /* renamed from: f */
        public String mo10705f(EnumC8635e eVar, EnumC8635e eVar2, Locale locale) {
            return m12234a().mo10705f(eVar, eVar2, locale);
        }

        @Override // p161ij.AbstractC8636f
        /* renamed from: i */
        public String mo10702i(EnumC8635e eVar, Locale locale) {
            return m12234a().mo10702i(eVar, locale);
        }

        /* synthetic */ C10795b(AndroidResourceLoader androidResourceLoader, C10794a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$c */
    /* loaded from: classes8.dex */
    public static final class C10796c {

        /* renamed from: a */
        private static final C11153c f23968a;

        /* renamed from: b */
        private static final Iterable<AbstractC8639i> f23969b = Collections.singleton(C11158f.f24835d);

        /* renamed from: c */
        private static final Iterable<AbstractC8684y> f23970c = Collections.singletonList(new C11162i());

        /* renamed from: d */
        private static final Iterable<AbstractC8670u> f23971d;

        static {
            C11153c cVar = new C11153c();
            f23968a = cVar;
            f23971d = Collections.unmodifiableList(Arrays.asList(cVar, new C10872b()));
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$d */
    /* loaded from: classes8.dex */
    private static final class C10797d implements Iterable<AbstractC8082s> {
        private C10797d() {
        }

        /* synthetic */ C10797d(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC8082s> iterator() {
            return C10805l.f23973b.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$e */
    /* loaded from: classes8.dex */
    private static final class C10798e implements Iterable<AbstractC11409c> {
        private C10798e() {
        }

        /* synthetic */ C10798e(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC11409c> iterator() {
            return C10806m.f23976c.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$f */
    /* loaded from: classes8.dex */
    private static final class C10799f implements Iterable<AbstractC8639i> {
        private C10799f() {
        }

        /* synthetic */ C10799f(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC8639i> iterator() {
            return C10796c.f23969b.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$g */
    /* loaded from: classes8.dex */
    private static final class C10800g implements Iterable<AbstractC8660o> {
        private C10800g() {
        }

        /* synthetic */ C10800g(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC8660o> iterator() {
            return C10805l.f23972a.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$h */
    /* loaded from: classes8.dex */
    private static final class C10801h implements Iterable<AbstractC8670u> {
        private C10801h() {
        }

        /* synthetic */ C10801h(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC8670u> iterator() {
            return C10796c.f23971d.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$i */
    /* loaded from: classes8.dex */
    private static final class C10802i implements Iterable<AbstractC8684y> {
        private C10802i() {
        }

        /* synthetic */ C10802i(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC8684y> iterator() {
            return C10796c.f23970c.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$j */
    /* loaded from: classes8.dex */
    private static final class C10803j implements Iterable<AbstractC11031s> {
        private C10803j() {
        }

        /* synthetic */ C10803j(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC11031s> iterator() {
            return C10806m.f23975b.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$k */
    /* loaded from: classes8.dex */
    private static final class C10804k implements Iterable<AbstractC11030r> {
        private C10804k() {
        }

        /* synthetic */ C10804k(C10794a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<AbstractC11030r> iterator() {
            return C10806m.f23974a.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$l */
    /* loaded from: classes8.dex */
    private static final class C10805l {

        /* renamed from: a */
        private static final Iterable<AbstractC8660o> f23972a = Collections.singleton(new C11149a());

        /* renamed from: b */
        private static final Iterable<AbstractC8082s> f23973b = Arrays.asList(new C11152b(), new C10873c());
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$m */
    /* loaded from: classes8.dex */
    private static final class C10806m {

        /* renamed from: a */
        private static final Iterable<AbstractC11030r> f23974a;

        /* renamed from: b */
        private static final Iterable<AbstractC11031s> f23975b = Collections.singleton(new C11782b());

        /* renamed from: c */
        private static final Iterable<AbstractC11409c> f23976c;

        static {
            AbstractC11409c cVar;
            Set singleton = Collections.singleton(new C11781a());
            f23974a = singleton;
            Iterator it = singleton.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                AbstractC11030r rVar = (AbstractC11030r) it.next();
                if (rVar instanceof AbstractC11409c) {
                    cVar = (AbstractC11409c) AbstractC11409c.class.cast(rVar);
                    break;
                }
            }
            if (cVar == null) {
                f23976c = Collections.emptyList();
            } else {
                f23976c = Collections.singleton(cVar);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC8670u.class, new C10801h(null));
        hashMap.put(AbstractC11030r.class, new C10804k(null));
        hashMap.put(AbstractC11031s.class, new C10803j(null));
        hashMap.put(AbstractC11409c.class, new C10798e(null));
        hashMap.put(AbstractC8082s.class, new C10797d(null));
        hashMap.put(AbstractC8639i.class, new C10799f(null));
        hashMap.put(AbstractC8660o.class, new C10800g(null));
        hashMap.put(AbstractC8683x.class, Collections.singleton(new C11160h()));
        hashMap.put(AbstractC8684y.class, new C10802i(null));
        hashMap.put(AbstractC11412e.class, Collections.singleton(new C10807a()));
        f23962f = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add("i18n");
        hashSet.add("calendar");
        hashSet.add("olson");
        hashSet.add("tzdata");
        f23963g = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private static <T> T m12236i(Object obj) {
        return obj;
    }

    @Override // net.time4j.base.AbstractC10814d
    /* renamed from: e */
    public InputStream mo12185e(URI uri, boolean z) {
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isAbsolute()) {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setUseCaches(false);
                return openConnection.getInputStream();
            }
            Context context = this.f23964d;
            if (context != null) {
                return context.getAssets().open(uri.toString());
            }
            throw new IllegalStateException("'ApplicationStarter.initialize(context)' must be called first at app start.");
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.AbstractC10814d
    /* renamed from: f */
    public URI mo12184f(String str, Class<?> cls, String str2) {
        try {
            if (f23963g.contains(str)) {
                return new URI("net/time4j/" + str + '/' + str2);
            }
            URL resource = cls.getClassLoader().getResource(str2);
            if (resource != null) {
                return resource.toURI();
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.AbstractC10814d
    /* renamed from: g */
    public <S> Iterable<S> mo12183g(Class<S> cls) {
        Iterable<?> iterable = f23962f.get(cls);
        if (iterable == null) {
            if (cls != AbstractC8636f.class) {
                return ServiceLoader.load(cls, cls.getClassLoader());
            }
            iterable = this.f23965e;
        }
        return (Iterable) m12236i(iterable);
    }

    /* renamed from: j */
    public void m12235j(Context context, AbstractC7352b bVar) {
        if (context != null) {
            this.f23964d = context;
            this.f23965e = Collections.singletonList(new C10795b(this, null));
            return;
        }
        throw new NullPointerException("Missing Android-context.");
    }
}
