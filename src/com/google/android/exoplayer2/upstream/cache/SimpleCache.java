package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.AbstractC5293a;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p100f9.AbstractC7094f;
import p100f9.C7092d;
import p100f9.C7093e;
import p100f9.C7095g;
import p119g9.C7510a;
import p119g9.C7558r;
import p131h7.AbstractC7932b;

/* loaded from: classes5.dex */
public final class SimpleCache implements AbstractC5293a {

    /* renamed from: l */
    private static final HashSet<File> f9781l = new HashSet<>();

    /* renamed from: a */
    private final File f9782a;

    /* renamed from: b */
    private final AbstractC5299d f9783b;

    /* renamed from: c */
    private final C5304h f9784c;

    /* renamed from: d */
    private final C5301f f9785d;

    /* renamed from: e */
    private final HashMap<String, ArrayList<AbstractC5293a.AbstractC5294b>> f9786e;

    /* renamed from: f */
    private final Random f9787f;

    /* renamed from: g */
    private final boolean f9788g;

    /* renamed from: h */
    private long f9789h;

    /* renamed from: i */
    private long f9790i;

    /* renamed from: j */
    private boolean f9791j;

    /* renamed from: k */
    private AbstractC5293a.C0145a f9792k;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.SimpleCache$a */
    /* loaded from: classes5.dex */
    class C5292a extends Thread {

        /* renamed from: k */
        final /* synthetic */ ConditionVariable f9793k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5292a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f9793k = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (SimpleCache.this) {
                this.f9793k.open();
                SimpleCache.this.m29595p();
                SimpleCache.this.f9783b.mo23405f();
            }
        }
    }

    public SimpleCache(File file, AbstractC5299d dVar, AbstractC7932b bVar) {
        this(file, dVar, bVar, null, false, false);
    }

    /* renamed from: k */
    private void m29600k(C5308i iVar) {
        this.f9784c.m29528m(iVar.f15471k).m29554a(iVar);
        this.f9790i += iVar.f15473m;
        m29591t(iVar);
    }

    /* renamed from: m */
    private static void m29598m(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            C7558r.m22109c("SimpleCache", str);
            throw new AbstractC5293a.C0145a(str);
        }
    }

    /* renamed from: n */
    private static long m29597n(File file) {
        long j;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            j = 0;
        } else {
            j = Math.abs(nextLong);
        }
        String l = Long.toString(j, 16);
        File file2 = new File(file, l + ".uid");
        if (file2.createNewFile()) {
            return j;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* renamed from: o */
    private C5308i m29596o(String str, long j, long j2) {
        C5308i d;
        C5302g g = this.f9784c.m29534g(str);
        if (g == null) {
            return C5308i.m29497g(str, j, j2);
        }
        while (true) {
            d = g.m29551d(j, j2);
            if (!d.f15474n || d.f15475o.length() == d.f15473m) {
                break;
            }
            m29586y();
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m29595p() {
        if (!this.f9782a.exists()) {
            try {
                m29598m(this.f9782a);
            } catch (AbstractC5293a.C0145a e) {
                this.f9792k = e;
                return;
            }
        }
        File[] listFiles = this.f9782a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f9782a;
            C7558r.m22109c("SimpleCache", str);
            this.f9792k = new AbstractC5293a.C0145a(str);
            return;
        }
        long r = m29593r(listFiles);
        this.f9789h = r;
        if (r == -1) {
            try {
                this.f9789h = m29597n(this.f9782a);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.f9782a;
                C7558r.m22108d("SimpleCache", str2, e2);
                this.f9792k = new AbstractC5293a.C0145a(str2, e2);
                return;
            }
        }
        try {
            this.f9784c.m29527n(this.f9789h);
            C5301f fVar = this.f9785d;
            if (fVar != null) {
                fVar.m29558e(this.f9789h);
                Map<String, C5300e> b = this.f9785d.m29561b();
                m29594q(this.f9782a, true, listFiles, b);
                this.f9785d.m29556g(b.keySet());
            } else {
                m29594q(this.f9782a, true, listFiles, null);
            }
            this.f9784c.m29523r();
            try {
                this.f9784c.m29522s();
            } catch (IOException e3) {
                C7558r.m22108d("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.f9782a;
            C7558r.m22108d("SimpleCache", str3, e4);
            this.f9792k = new AbstractC5293a.C0145a(str3, e4);
        }
    }

    /* renamed from: q */
    private void m29594q(File file, boolean z, File[] fileArr, Map<String, C5300e> map) {
        C5300e eVar;
        long j;
        long j2;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    m29594q(file2, false, file2.listFiles(), map);
                } else if (!z || (!C5304h.m29526o(name) && !name.endsWith(".uid"))) {
                    if (map != null) {
                        eVar = map.remove(name);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        j2 = eVar.f9824a;
                        j = eVar.f9825b;
                    } else {
                        j = -9223372036854775807L;
                        j2 = -1;
                    }
                    C5308i e = C5308i.m29499e(file2, j2, j, this.f9784c);
                    if (e != null) {
                        m29600k(e);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    /* renamed from: r */
    private static long m29593r(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return m29588w(name);
                } catch (NumberFormatException unused) {
                    C7558r.m22109c("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    /* renamed from: s */
    private static synchronized boolean m29592s(File file) {
        boolean add;
        synchronized (SimpleCache.class) {
            add = f9781l.add(file.getAbsoluteFile());
        }
        return add;
    }

    /* renamed from: t */
    private void m29591t(C5308i iVar) {
        ArrayList<AbstractC5293a.AbstractC5294b> arrayList = this.f9786e.get(iVar.f15471k);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo23407d(this, iVar);
            }
        }
        this.f9783b.mo23407d(this, iVar);
    }

    /* renamed from: u */
    private void m29590u(C7092d dVar) {
        ArrayList<AbstractC5293a.AbstractC5294b> arrayList = this.f9786e.get(dVar.f15471k);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo23409b(this, dVar);
            }
        }
        this.f9783b.mo23409b(this, dVar);
    }

    /* renamed from: v */
    private void m29589v(C5308i iVar, C7092d dVar) {
        ArrayList<AbstractC5293a.AbstractC5294b> arrayList = this.f9786e.get(iVar.f15471k);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo23410a(this, iVar, dVar);
            }
        }
        this.f9783b.mo23410a(this, iVar, dVar);
    }

    /* renamed from: w */
    private static long m29588w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    /* renamed from: x */
    private void m29587x(C7092d dVar) {
        C5302g g = this.f9784c.m29534g(dVar.f15471k);
        if (g != null && g.m29545j(dVar)) {
            this.f9790i -= dVar.f15473m;
            if (this.f9785d != null) {
                String name = dVar.f15475o.getName();
                try {
                    this.f9785d.m29557f(name);
                } catch (IOException unused) {
                    C7558r.m22104h("SimpleCache", "Failed to remove file index entry for: " + name);
                }
            }
            this.f9784c.m29525p(g.f9830b);
            m29590u(dVar);
        }
    }

    /* renamed from: y */
    private void m29586y() {
        ArrayList arrayList = new ArrayList();
        for (C5302g gVar : this.f9784c.m29533h()) {
            Iterator<C5308i> it = gVar.m29550e().iterator();
            while (it.hasNext()) {
                C5308i next = it.next();
                if (next.f15475o.length() != next.f15473m) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m29587x((C7092d) arrayList.get(i));
        }
    }

    /* renamed from: z */
    private C5308i m29585z(String str, C5308i iVar) {
        boolean z;
        if (!this.f9788g) {
            return iVar;
        }
        String name = ((File) C7510a.m22367e(iVar.f15475o)).getName();
        long j = iVar.f15473m;
        long currentTimeMillis = System.currentTimeMillis();
        C5301f fVar = this.f9785d;
        if (fVar != null) {
            try {
                fVar.m29555h(name, j, currentTimeMillis);
            } catch (IOException unused) {
                C7558r.m22104h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C5308i k = this.f9784c.m29534g(str).m29544k(iVar, currentTimeMillis, z);
        m29589v(iVar, k);
        return k;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: a */
    public synchronized File mo29584a(String str, long j, long j2) {
        boolean z;
        C5302g g;
        File file;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        m29599l();
        g = this.f9784c.m29534g(str);
        C7510a.m22367e(g);
        C7510a.m22366f(g.m29548g(j, j2));
        if (!this.f9782a.exists()) {
            m29598m(this.f9782a);
            m29586y();
        }
        this.f9783b.mo23406e(this, str, j, j2);
        file = new File(this.f9782a, Integer.toString(this.f9787f.nextInt(10)));
        if (!file.exists()) {
            m29598m(file);
        }
        return C5308i.m29495i(file, g.f9829a, j, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: b */
    public synchronized AbstractC7094f mo29583b(String str) {
        boolean z;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        return this.f9784c.m29531j(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: c */
    public synchronized C7092d mo29582c(String str, long j, long j2) {
        boolean z;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        m29599l();
        C5308i o = m29596o(str, j, j2);
        if (o.f15474n) {
            return m29585z(str, o);
        } else if (this.f9784c.m29528m(str).m29546i(j, o.f15473m)) {
            return o;
        } else {
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: d */
    public synchronized void mo29581d(C7092d dVar) {
        boolean z;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        C5302g gVar = (C5302g) C7510a.m22367e(this.f9784c.m29534g(dVar.f15471k));
        gVar.m29543l(dVar.f15472l);
        this.f9784c.m29525p(gVar.f9830b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: e */
    public synchronized void mo29580e(C7092d dVar) {
        boolean z;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        m29587x(dVar);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: f */
    public synchronized void mo29579f(String str, C7095g gVar) {
        boolean z;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        m29599l();
        this.f9784c.m29536e(str, gVar);
        try {
            this.f9784c.m29522s();
        } catch (IOException e) {
            throw new AbstractC5293a.C0145a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: g */
    public synchronized C7092d mo29578g(String str, long j, long j2) {
        boolean z;
        C7092d c;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        m29599l();
        while (true) {
            c = mo29582c(str, j, j2);
            if (c == null) {
                wait();
            }
        }
        return c;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a
    /* renamed from: h */
    public synchronized void mo29577h(File file, long j) {
        boolean z;
        boolean z2 = true;
        if (!this.f9791j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C5308i iVar = (C5308i) C7510a.m22367e(C5308i.m29498f(file, j, this.f9784c));
            C5302g gVar = (C5302g) C7510a.m22367e(this.f9784c.m29534g(iVar.f15471k));
            C7510a.m22366f(gVar.m29548g(iVar.f15472l, iVar.f15473m));
            long a = C7093e.m23429a(gVar.m29552c());
            if (a != -1) {
                if (iVar.f15472l + iVar.f15473m > a) {
                    z2 = false;
                }
                C7510a.m22366f(z2);
            }
            if (this.f9785d != null) {
                try {
                    this.f9785d.m29555h(file.getName(), iVar.f15473m, iVar.f15476p);
                } catch (IOException e) {
                    throw new AbstractC5293a.C0145a(e);
                }
            }
            m29600k(iVar);
            try {
                this.f9784c.m29522s();
                notifyAll();
            } catch (IOException e2) {
                throw new AbstractC5293a.C0145a(e2);
            }
        }
    }

    /* renamed from: l */
    public synchronized void m29599l() {
        AbstractC5293a.C0145a aVar = this.f9792k;
        if (aVar != null) {
            throw aVar;
        }
    }

    public SimpleCache(File file, AbstractC5299d dVar, AbstractC7932b bVar, byte[] bArr, boolean z, boolean z2) {
        this(file, dVar, new C5304h(bVar, file, bArr, z, z2), (bVar == null || z2) ? null : new C5301f(bVar));
    }

    SimpleCache(File file, AbstractC5299d dVar, C5304h hVar, C5301f fVar) {
        if (m29592s(file)) {
            this.f9782a = file;
            this.f9783b = dVar;
            this.f9784c = hVar;
            this.f9785d = fVar;
            this.f9786e = new HashMap<>();
            this.f9787f = new Random();
            this.f9788g = dVar.mo23408c();
            this.f9789h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C5292a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
