package p330s1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C2094a;
import androidx.concurrent.futures.C2119d;
import androidx.core.content.p017pm.AbstractC2352a;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p120gc.AbstractFutureC7576b;
import p330s1.C12773b;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public class C12762a extends AbstractC2352a<AbstractFutureC7576b<Void>> {

    /* renamed from: h */
    private static final Object f28636h = new Object();

    /* renamed from: i */
    private static volatile C12762a f28637i;

    /* renamed from: a */
    final Context f28638a;

    /* renamed from: b */
    final Map<String, C12773b.C12774a> f28639b = new C2094a();

    /* renamed from: c */
    final Map<String, AbstractFutureC7576b<?>> f28640c = new C2094a();

    /* renamed from: d */
    final ExecutorService f28641d;

    /* renamed from: e */
    private final ExecutorService f28642e;

    /* renamed from: f */
    final File f28643f;

    /* renamed from: g */
    final File f28644g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0408a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ List f28645k;

        RunnableC0408a(List list) {
            this.f28645k = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12762a.this.m5540h(this.f28645k);
            C12773b.m5522f(this.f28645k, C12762a.this.f28643f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$b */
    /* loaded from: classes.dex */
    public class RunnableC12763b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractFutureC7576b f28647k;

        /* renamed from: l */
        final /* synthetic */ C2119d f28648l;

        RunnableC12763b(AbstractFutureC7576b bVar, C2119d dVar) {
            this.f28647k = bVar;
            this.f28648l = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28647k.get();
                this.f28648l.mo38953p(null);
            } catch (Exception e) {
                this.f28648l.mo38952q(e);
            }
        }
    }

    /* renamed from: s1.a$c */
    /* loaded from: classes.dex */
    class RunnableC12764c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ File f28650k;

        RunnableC12764c(File file) {
            this.f28650k = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C12762a.m5539i(this.f28650k);
                C12762a.m5539i(C12762a.this.f28644g);
                C12762a aVar = C12762a.this;
                aVar.f28639b.putAll(C12773b.m5526b(aVar.f28643f, aVar.f28638a));
                C12762a.this.m5540h(new ArrayList(C12762a.this.f28639b.values()));
            } catch (Exception e) {
                Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$d */
    /* loaded from: classes.dex */
    public class RunnableC12765d implements Runnable {

        /* renamed from: k */
        final /* synthetic */ List f28652k;

        /* renamed from: l */
        final /* synthetic */ C2119d f28653l;

        RunnableC12765d(List list, C2119d dVar) {
            this.f28652k = list;
            this.f28653l = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : this.f28652k) {
                C12762a.this.f28639b.remove(str);
                AbstractFutureC7576b<?> remove = C12762a.this.f28640c.remove(str);
                if (remove != null) {
                    remove.cancel(false);
                }
            }
            C12762a.this.m5532p(this.f28653l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$e */
    /* loaded from: classes.dex */
    public class RunnableC12766e implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C2119d f28655k;

        RunnableC12766e(C2119d dVar) {
            this.f28655k = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12762a.this.f28639b.clear();
            for (AbstractFutureC7576b<?> bVar : C12762a.this.f28640c.values()) {
                bVar.cancel(false);
            }
            C12762a.this.f28640c.clear();
            C12762a.this.m5532p(this.f28655k);
        }
    }

    /* renamed from: s1.a$f */
    /* loaded from: classes.dex */
    class CallableC12767f implements Callable<ArrayList<ShortcutInfoCompat>> {
        CallableC12767f() {
        }

        /* renamed from: a */
        public ArrayList<ShortcutInfoCompat> call() {
            ArrayList<ShortcutInfoCompat> arrayList = new ArrayList<>();
            for (C12773b.C12774a aVar : C12762a.this.f28639b.values()) {
                arrayList.add(new ShortcutInfoCompat.C2351a(aVar.f28676c).m38085a());
            }
            return arrayList;
        }
    }

    /* renamed from: s1.a$g */
    /* loaded from: classes.dex */
    class CallableC12768g implements Callable<C12773b.C12774a> {

        /* renamed from: a */
        final /* synthetic */ String f28658a;

        CallableC12768g(String str) {
            this.f28658a = str;
        }

        /* renamed from: a */
        public C12773b.C12774a call() {
            return C12762a.this.f28639b.get(this.f28658a);
        }
    }

    /* renamed from: s1.a$h */
    /* loaded from: classes.dex */
    class CallableC12769h implements Callable<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C12773b.C12774a f28660a;

        CallableC12769h(C12773b.C12774a aVar) {
            this.f28660a = aVar;
        }

        /* renamed from: a */
        public Bitmap call() {
            return BitmapFactory.decodeFile(this.f28660a.f28675b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$i */
    /* loaded from: classes.dex */
    public class RunnableC12770i implements Runnable {

        /* renamed from: k */
        final /* synthetic */ List f28662k;

        /* renamed from: l */
        final /* synthetic */ C2119d f28663l;

        /* renamed from: s1.a$i$a */
        /* loaded from: classes.dex */
        class RunnableC0409a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ String f28665k;

            /* renamed from: l */
            final /* synthetic */ AbstractFutureC7576b f28666l;

            RunnableC0409a(String str, AbstractFutureC7576b bVar) {
                this.f28665k = str;
                this.f28666l = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12762a.this.f28640c.remove(this.f28665k);
                if (!this.f28666l.isCancelled()) {
                    try {
                        this.f28666l.get();
                    } catch (Exception e) {
                        RunnableC12770i.this.f28663l.mo38952q(e);
                    }
                }
            }
        }

        RunnableC12770i(List list, C2119d dVar) {
            this.f28662k = list;
            this.f28663l = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            for (ShortcutInfoCompat shortcutInfoCompat : this.f28662k) {
                Set<String> c = shortcutInfoCompat.m38095c();
                if (c != null && !c.isEmpty()) {
                    C12773b.C12774a f = C12762a.this.m5542f(shortcutInfoCompat);
                    IconCompat e = shortcutInfoCompat.m38093e();
                    if (f.f28675b != null) {
                        bitmap = e.m37870m();
                    } else {
                        bitmap = null;
                    }
                    String f2 = shortcutInfoCompat.m38092f();
                    C12762a.this.f28639b.put(f2, f);
                    if (bitmap != null) {
                        AbstractFutureC7576b<Void> o = C12762a.this.m5533o(bitmap, f.f28675b);
                        AbstractFutureC7576b<?> put = C12762a.this.f28640c.put(f2, o);
                        if (put != null) {
                            put.cancel(false);
                        }
                        o.mo1409a(new RunnableC0409a(f2, o), C12762a.this.f28641d);
                    }
                }
            }
            C12762a.this.m5532p(this.f28663l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$j */
    /* loaded from: classes.dex */
    public class RunnableC12771j implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Bitmap f28668k;

        /* renamed from: l */
        final /* synthetic */ String f28669l;

        RunnableC12771j(Bitmap bitmap, String str) {
            this.f28668k = bitmap;
            this.f28669l = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12762a.this.m5534n(this.f28668k, this.f28669l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1.a$k */
    /* loaded from: classes.dex */
    public class RunnableC12772k implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C2119d f28671k;

        /* renamed from: l */
        final /* synthetic */ Runnable f28672l;

        RunnableC12772k(C2119d dVar, Runnable runnable) {
            this.f28671k = dVar;
            this.f28672l = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f28671k.isCancelled()) {
                try {
                    this.f28672l.run();
                    this.f28671k.mo38953p(null);
                } catch (Exception e) {
                    this.f28671k.mo38952q(e);
                }
            }
        }
    }

    C12762a(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.f28638a = context.getApplicationContext();
        this.f28641d = executorService;
        this.f28642e = executorService2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.f28644g = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.f28643f = new File(file, "targets.xml");
        executorService.submit(new RunnableC12764c(file));
    }

    /* renamed from: g */
    static ExecutorService m5541g() {
        return new ThreadPoolExecutor(0, 1, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: i */
    static boolean m5539i(File file) {
        if (file.exists() && !file.isDirectory() && !file.delete()) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }

    /* renamed from: j */
    public static C12762a m5538j(Context context) {
        if (f28637i == null) {
            synchronized (f28636h) {
                if (f28637i == null) {
                    f28637i = new C12762a(context, m5541g(), m5541g());
                }
            }
        }
        return f28637i;
    }

    /* renamed from: q */
    private AbstractFutureC7576b<Void> m5531q(Runnable runnable) {
        C2119d s = C2119d.m38951s();
        this.f28642e.submit(new RunnableC12772k(s, runnable));
        return s;
    }

    @Override // androidx.core.content.p017pm.AbstractC2352a
    /* renamed from: b */
    public List<ShortcutInfoCompat> mo5546b() {
        return (List) this.f28641d.submit(new CallableC12767f()).get();
    }

    /* renamed from: e */
    public AbstractFutureC7576b<Void> mo5547a(List<ShortcutInfoCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            arrayList.add(new ShortcutInfoCompat.C2351a(shortcutInfoCompat).m38085a());
        }
        C2119d s = C2119d.m38951s();
        this.f28641d.submit(new RunnableC12770i(arrayList, s));
        return s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 != 5) goto L_0x003b;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p330s1.C12773b.C12774a m5542f(androidx.core.content.p017pm.ShortcutInfoCompat r5) {
        /*
            r4 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r5.m38093e()
            r1 = 0
            if (r0 == 0) goto L_0x003b
            int r2 = r0.m37866q()
            r3 = 1
            if (r2 == r3) goto L_0x0025
            r3 = 2
            if (r2 == r3) goto L_0x0015
            r0 = 5
            if (r2 == r0) goto L_0x0025
            goto L_0x003b
        L_0x0015:
            android.content.Context r2 = r4.f28638a
            android.content.res.Resources r2 = r2.getResources()
            int r0 = r0.m37869n()
            java.lang.String r0 = r2.getResourceName(r0)
            r2 = r1
            goto L_0x003d
        L_0x0025:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r4.f28644g
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r0.<init>(r2, r3)
            java.lang.String r0 = r0.getAbsolutePath()
            r2 = r0
            r0 = r1
            goto L_0x003d
        L_0x003b:
            r0 = r1
            r2 = r0
        L_0x003d:
            androidx.core.content.pm.ShortcutInfoCompat$a r3 = new androidx.core.content.pm.ShortcutInfoCompat$a
            r3.<init>(r5)
            androidx.core.content.pm.ShortcutInfoCompat$a r5 = r3.m38081e(r1)
            androidx.core.content.pm.ShortcutInfoCompat r5 = r5.m38085a()
            s1.b$a r1 = new s1.b$a
            r1.<init>(r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p330s1.C12762a.m5542f(androidx.core.content.pm.ShortcutInfoCompat):s1.b$a");
    }

    /* renamed from: h */
    void m5540h(List<C12773b.C12774a> list) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        for (C12773b.C12774a aVar : list) {
            if (!TextUtils.isEmpty(aVar.f28675b)) {
                arrayList.add(aVar.f28675b);
            }
        }
        for (File file : this.f28644g.listFiles()) {
            if (!arrayList.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* renamed from: k */
    public IconCompat m5537k(String str) {
        int i;
        Bitmap bitmap;
        C12773b.C12774a aVar = (C12773b.C12774a) this.f28641d.submit(new CallableC12768g(str)).get();
        if (aVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(aVar.f28674a)) {
            try {
                i = this.f28638a.getResources().getIdentifier(aVar.f28674a, null, null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i != 0) {
                return IconCompat.m37872k(this.f28638a, i);
            }
        }
        if (TextUtils.isEmpty(aVar.f28675b) || (bitmap = (Bitmap) this.f28642e.submit(new CallableC12769h(aVar)).get()) == null) {
            return null;
        }
        return IconCompat.m37875h(bitmap);
    }

    /* renamed from: l */
    public AbstractFutureC7576b<Void> mo5545c() {
        C2119d s = C2119d.m38951s();
        this.f28641d.submit(new RunnableC12766e(s));
        return s;
    }

    /* renamed from: m */
    public AbstractFutureC7576b<Void> mo5544d(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        C2119d s = C2119d.m38951s();
        this.f28641d.submit(new RunnableC12765d(arrayList, s));
        return s;
    }

    /* renamed from: n */
    void m5534n(Bitmap bitmap, String str) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                try {
                    if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                        fileOutputStream.close();
                        return;
                    }
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                    throw new RuntimeException("Unable to compress bitmap for saving " + str);
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e);
                throw new RuntimeException("Unable to write bitmap to file " + str, e);
            }
        } else {
            throw new IllegalArgumentException("path is empty");
        }
    }

    /* renamed from: o */
    AbstractFutureC7576b<Void> m5533o(Bitmap bitmap, String str) {
        return m5531q(new RunnableC12771j(bitmap, str));
    }

    /* renamed from: p */
    void m5532p(C2119d<Void> dVar) {
        AbstractFutureC7576b<Void> q = m5531q(new RunnableC0408a(new ArrayList(this.f28639b.values())));
        q.mo1409a(new RunnableC12763b(q, dVar), this.f28641d);
    }
}
