package p126h2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fk.C7366m;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import p223m2.C10476g;
import p311r2.C12360w;
import p331s2.AbstractC12777c;
import p343t2.C12945f;
import p343t2.C12949j;

/* renamed from: h2.q */
/* loaded from: classes.dex */
public class C7781q {

    /* renamed from: a */
    private static final Map<String, C7771m0<C7762i>> f16967a = new HashMap();

    /* renamed from: b */
    private static final byte[] f16968b = {80, 75, 3, 4};

    /* renamed from: A */
    private static boolean m21363A(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: B */
    private static Boolean m21362B(BufferedSource bufferedSource) {
        try {
            BufferedSource peek = bufferedSource.peek();
            for (byte b : f16968b) {
                if (peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C12945f.m5010b("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static /* synthetic */ void m21361C(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        f16967a.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ C7767k0 m21360D(C7762i iVar) {
        return new C7767k0(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ void m21359E(String str, AtomicBoolean atomicBoolean, C7762i iVar) {
        f16967a.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ C7767k0 m21356H(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return m21332v(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ C7767k0 m21355I(Context context, String str, String str2) {
        C7767k0<C7762i> c = C7742c.m21540d(context).m8078c(str, str2);
        if (!(str2 == null || c.m21379b() == null)) {
            C10476g.m13086b().m13085c(str2, c.m21379b());
        }
        return c;
    }

    /* renamed from: J */
    private static String m21354J(Context context, int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(m21363A(context) ? "_night_" : "_day_");
        sb2.append(i);
        return sb2.toString();
    }

    /* renamed from: h */
    private static C7771m0<C7762i> m21346h(final String str, Callable<C7767k0<C7762i>> callable) {
        final C7762i iVar;
        if (str == null) {
            iVar = null;
        } else {
            iVar = C10476g.m13086b().m13087a(str);
        }
        if (iVar != null) {
            return new C7771m0<>(new Callable() { // from class: h2.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C7767k0 D;
                    D = C7781q.m21360D(C7762i.this);
                    return D;
                }
            });
        }
        if (str != null) {
            Map<String, C7771m0<C7762i>> map = f16967a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C7771m0<C7762i> m0Var = new C7771m0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            m0Var.m21375d(new AbstractC7755g0() { // from class: h2.m
                @Override // p126h2.AbstractC7755g0
                public final void onResult(Object obj) {
                    C7781q.m21359E(str, atomicBoolean, (C7762i) obj);
                }
            });
            m0Var.m21376c(new AbstractC7755g0() { // from class: h2.n
                @Override // p126h2.AbstractC7755g0
                public final void onResult(Object obj) {
                    C7781q.m21361C(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f16967a.put(str, m0Var);
            }
        }
        return m0Var;
    }

    /* renamed from: i */
    private static C7753f0 m21345i(C7762i iVar, String str) {
        for (C7753f0 f0Var : iVar.m21394j().values()) {
            if (f0Var.m21436b().equals(str)) {
                return f0Var;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static C7771m0<C7762i> m21344j(Context context, String str) {
        return m21343k(context, str, "asset_" + str);
    }

    /* renamed from: k */
    public static C7771m0<C7762i> m21343k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m21346h(str2, new Callable() { // from class: h2.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7767k0 m;
                m = C7781q.m21341m(applicationContext, str, str2);
                return m;
            }
        });
    }

    /* renamed from: l */
    public static C7767k0<C7762i> m21342l(Context context, String str) {
        return m21341m(context, str, "asset_" + str);
    }

    /* renamed from: m */
    public static C7767k0<C7762i> m21341m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m21339o(context.getAssets().open(str), str2);
            }
            return m21329y(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C7767k0<>(e);
        }
    }

    /* renamed from: n */
    public static C7771m0<C7762i> m21340n(final InputStream inputStream, final String str) {
        return m21346h(str, new Callable() { // from class: h2.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7767k0 o;
                o = C7781q.m21339o(inputStream, str);
                return o;
            }
        });
    }

    /* renamed from: o */
    public static C7767k0<C7762i> m21339o(InputStream inputStream, String str) {
        return m21338p(inputStream, str, true);
    }

    /* renamed from: p */
    private static C7767k0<C7762i> m21338p(InputStream inputStream, String str, boolean z) {
        try {
            return m21337q(AbstractC12777c.m5517H(C7366m.m22819d(C7366m.m22811l(inputStream))), str);
        } finally {
            if (z) {
                C12949j.m4969c(inputStream);
            }
        }
    }

    /* renamed from: q */
    public static C7767k0<C7762i> m21337q(AbstractC12777c cVar, String str) {
        return m21336r(cVar, str, true);
    }

    /* renamed from: r */
    private static C7767k0<C7762i> m21336r(AbstractC12777c cVar, String str, boolean z) {
        try {
            try {
                C7762i a = C12360w.m7076a(cVar);
                if (str != null) {
                    C10476g.m13086b().m13085c(str, a);
                }
                C7767k0<C7762i> k0Var = new C7767k0<>(a);
                if (z) {
                    C12949j.m4969c(cVar);
                }
                return k0Var;
            } catch (Exception e) {
                C7767k0<C7762i> k0Var2 = new C7767k0<>(e);
                if (z) {
                    C12949j.m4969c(cVar);
                }
                return k0Var2;
            }
        } catch (Throwable th2) {
            if (z) {
                C12949j.m4969c(cVar);
            }
            throw th2;
        }
    }

    /* renamed from: s */
    public static C7771m0<C7762i> m21335s(Context context, int i) {
        return m21334t(context, i, m21354J(context, i));
    }

    /* renamed from: t */
    public static C7771m0<C7762i> m21334t(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m21346h(str, new Callable() { // from class: h2.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7767k0 H;
                H = C7781q.m21356H(weakReference, applicationContext, i, str);
                return H;
            }
        });
    }

    /* renamed from: u */
    public static C7767k0<C7762i> m21333u(Context context, int i) {
        return m21332v(context, i, m21354J(context, i));
    }

    /* renamed from: v */
    public static C7767k0<C7762i> m21332v(Context context, int i, String str) {
        try {
            BufferedSource d = C7366m.m22819d(C7366m.m22811l(context.getResources().openRawResource(i)));
            if (m21362B(d).booleanValue()) {
                return m21329y(new ZipInputStream(d.mo9739E0()), str);
            }
            return m21339o(d.mo9739E0(), str);
        } catch (Resources.NotFoundException e) {
            return new C7767k0<>(e);
        }
    }

    /* renamed from: w */
    public static C7771m0<C7762i> m21331w(Context context, String str) {
        return m21330x(context, str, "url_" + str);
    }

    /* renamed from: x */
    public static C7771m0<C7762i> m21330x(final Context context, final String str, final String str2) {
        return m21346h(str2, new Callable() { // from class: h2.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7767k0 I;
                I = C7781q.m21355I(context, str, str2);
                return I;
            }
        });
    }

    /* renamed from: y */
    public static C7767k0<C7762i> m21329y(ZipInputStream zipInputStream, String str) {
        try {
            return m21328z(zipInputStream, str);
        } finally {
            C12949j.m4969c(zipInputStream);
        }
    }

    /* renamed from: z */
    private static C7767k0<C7762i> m21328z(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C7762i iVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    iVar = m21336r(AbstractC12777c.m5517H(C7366m.m22819d(C7366m.m22811l(zipInputStream))), null, false).m21379b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (iVar == null) {
                return new C7767k0<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C7753f0 i = m21345i(iVar, (String) entry.getKey());
                if (i != null) {
                    i.m21432f(C12949j.m4960l((Bitmap) entry.getValue(), i.m21433e(), i.m21435c()));
                }
            }
            for (Map.Entry<String, C7753f0> entry2 : iVar.m21394j().entrySet()) {
                if (entry2.getValue().m21437a() == null) {
                    return new C7767k0<>(new IllegalStateException("There is no image for " + entry2.getValue().m21436b()));
                }
            }
            if (str != null) {
                C10476g.m13086b().m13085c(str, iVar);
            }
            return new C7767k0<>(iVar);
        } catch (IOException e) {
            return new C7767k0<>(e);
        }
    }
}
