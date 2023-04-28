package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import nf.C11067f;
import p326ri.C12718u;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J3\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m15073d2 = {"Lkotlinx/coroutines/internal/i;", "", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", "", "b", "", "name", "a", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "e", "Ljava/io/BufferedReader;", "r", "f", "Lkotlinx/coroutines/internal/t;", "c", "()Ljava/util/List;", "d", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.i */
/* loaded from: classes8.dex */
public final class C10099i {

    /* renamed from: a */
    public static final C10099i f22293a = new C10099i();

    private C10099i() {
    }

    /* renamed from: a */
    private final <S> S m14297a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m14296b(Class<S> cls, ClassLoader classLoader) {
        List<S> D0;
        try {
            return m14294d(cls, classLoader);
        } catch (Throwable unused) {
            D0 = C9914r.m14790D0(ServiceLoader.load(cls, classLoader));
            return D0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* renamed from: e */
    private final List<String> m14293e(URL url) {
        boolean H;
        String K0;
        String P0;
        String K02;
        String url2 = url.toString();
        th = 0;
        H = C12718u.m5736H(url2, "jar", false, 2, th);
        if (H) {
            K0 = C12719v.m5712K0(url2, "jar:file:", th, 2, th);
            P0 = C12719v.m5702P0(K0, '!', th, 2, th);
            K02 = C12719v.m5712K0(url2, "!/", th, 2, th);
            JarFile jarFile = new JarFile(P0, false);
            try {
                List<String> f = f22293a.m14292f(new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(K02)), "UTF-8")));
                jarFile.close();
                return f;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        C11067f.m10981a(th2, th4);
                        throw th2;
                    }
                }
            }
        } else {
            try {
                return f22293a.m14292f(new BufferedReader(new InputStreamReader(url.openStream())));
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: f */
    private final List<String> m14292f(BufferedReader bufferedReader) {
        List<String> D0;
        String Q0;
        CharSequence V0;
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                D0 = C9914r.m14790D0(linkedHashSet);
                return D0;
            }
            Q0 = C12719v.m5700Q0(readLine, "#", null, 2, null);
            V0 = C12719v.m5690V0(Q0);
            String obj = V0.toString();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (obj.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* renamed from: c */
    public final List<AbstractC10121t> m14295c() {
        AbstractC10121t tVar;
        if (!C10101j.m14278a()) {
            return m14296b(AbstractC10121t.class, AbstractC10121t.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            AbstractC10121t tVar2 = null;
            try {
                tVar = (AbstractC10121t) AbstractC10121t.class.cast(Class.forName("ti.a", true, AbstractC10121t.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                tVar = null;
            }
            if (tVar != null) {
                arrayList.add(tVar);
            }
            try {
                tVar2 = (AbstractC10121t) AbstractC10121t.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, AbstractC10121t.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (tVar2 == null) {
                return arrayList;
            }
            arrayList.add(tVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return m14296b(AbstractC10121t.class, AbstractC10121t.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> m14294d(Class<S> cls, ClassLoader classLoader) {
        Set<String> H0;
        int t;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C9971q.m14634f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C9911o.m14801y(arrayList, f22293a.m14293e(url));
        }
        H0 = C9914r.m14786H0(arrayList);
        if (!H0.isEmpty()) {
            t = C9907k.m14809t(H0, 10);
            ArrayList arrayList2 = new ArrayList(t);
            for (String str : H0) {
                arrayList2.add(f22293a.m14297a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
