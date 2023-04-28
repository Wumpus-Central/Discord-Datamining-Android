package io.sentry.cache;

import io.sentry.C8875h;
import io.sentry.C8879h3;
import io.sentry.C8951o3;
import io.sentry.C9025q2;
import io.sentry.C9157y3;
import io.sentry.EnumC8935m3;
import io.sentry.EnumC8942n3;
import io.sentry.transport.C9082r;
import io.sentry.util.C9111k;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: io.sentry.cache.d */
/* loaded from: classes8.dex */
public class C8820d extends AbstractC8818b implements AbstractC8821e {

    /* renamed from: p */
    private final Map<C9025q2, String> f19500p = new WeakHashMap();

    public C8820d(C8951o3 o3Var, String str, int i) {
        super(o3Var, str, i);
    }

    /* renamed from: A */
    private File m17967A() {
        return new File(this.f19498m.getAbsolutePath(), "session.json");
    }

    /* renamed from: B */
    private synchronized File m17966B(C9025q2 q2Var) {
        String str;
        String str2;
        if (this.f19500p.containsKey(q2Var)) {
            str = this.f19500p.get(q2Var);
        } else {
            if (q2Var.m17206c().m17190a() != null) {
                str2 = q2Var.m17206c().m17190a().toString();
            } else {
                str2 = UUID.randomUUID().toString();
            }
            String str3 = str2 + ".envelope";
            this.f19500p.put(q2Var, str3);
            str = str3;
        }
        return new File(this.f19498m.getAbsolutePath(), str);
    }

    /* renamed from: C */
    private Date m17965C(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), AbstractC8818b.f19495o));
            String readLine = bufferedReader.readLine();
            this.f19496k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Crash marker file has %s timestamp.", readLine);
            Date d = C8875h.m17844d(readLine);
            bufferedReader.close();
            return d;
        } catch (IOException e) {
            this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            this.f19496k.getLogger().mo17724a(EnumC8942n3.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    /* renamed from: E */
    private void m17963E(File file, C9025q2 q2Var) {
        Iterable<C8879h3> d = q2Var.m17205d();
        if (d.iterator().hasNext()) {
            C8879h3 next = d.iterator().next();
            if (EnumC8935m3.Session.equals(next.m17776w().m17763b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.m17777v()), AbstractC8818b.f19495o));
                    C9157y3 y3Var = (C9157y3) this.f19497l.mo17605c(bufferedReader, C9157y3.class);
                    if (y3Var == null) {
                        this.f19496k.getLogger().mo17722c(EnumC8942n3.ERROR, "Item of type %s returned null by the parser.", next.m17776w().m17763b());
                    } else {
                        m17960H(file, y3Var);
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, "Item failed to process.", th2);
                }
            } else {
                this.f19496k.getLogger().mo17722c(EnumC8942n3.INFO, "Current envelope has a different envelope type %s", next.m17776w().m17763b());
            }
        } else {
            this.f19496k.getLogger().mo17722c(EnumC8942n3.INFO, "Current envelope %s is empty", file.getAbsolutePath());
        }
    }

    /* renamed from: F */
    private void m17962F() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f19496k.getCacheDirPath(), "last_crash"));
            fileOutputStream.write(C8875h.m17842f(C8875h.m17846b()).getBytes(AbstractC8818b.f19495o));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    /* renamed from: G */
    private void m17961G(File file, C9025q2 q2Var) {
        if (file.exists()) {
            this.f19496k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f19496k.getLogger().mo17722c(EnumC8942n3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f19497l.mo17606b(q2Var, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f19496k.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    /* renamed from: H */
    private void m17960H(File file, C9157y3 y3Var) {
        if (file.exists()) {
            this.f19496k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Overwriting session to offline storage: %s", y3Var.m16763i());
            if (!file.delete()) {
                this.f19496k.getLogger().mo17722c(EnumC8942n3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC8818b.f19495o));
            try {
                this.f19497l.mo17607a(y3Var, bufferedWriter);
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f19496k.getLogger().mo17724a(EnumC8942n3.ERROR, th4, "Error writing Session to offline storage: %s", y3Var.m16763i());
        }
    }

    /* renamed from: y */
    private File[] m17958y() {
        File[] listFiles;
        if (!m17978f() || (listFiles = this.f19498m.listFiles(new FilenameFilter() { // from class: io.sentry.cache.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean endsWith;
                endsWith = str.endsWith(".envelope");
                return endsWith;
            }
        })) == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* renamed from: z */
    public static AbstractC8821e m17957z(C8951o3 o3Var) {
        String cacheDirPath = o3Var.getCacheDirPath();
        int maxCacheItems = o3Var.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new C8820d(o3Var, cacheDirPath, maxCacheItems);
        }
        o3Var.getLogger().mo17722c(EnumC8942n3.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return C9082r.m17115a();
    }

    @Override // io.sentry.cache.AbstractC8821e
    /* renamed from: d */
    public void mo17114d(C9025q2 q2Var) {
        C9111k.m16995a(q2Var, "Envelope is required.");
        File B = m17966B(q2Var);
        if (B.exists()) {
            this.f19496k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Discarding envelope from cache: %s", B.getAbsolutePath());
            if (!B.delete()) {
                this.f19496k.getLogger().mo17722c(EnumC8942n3.ERROR, "Failed to delete envelope: %s", B.getAbsolutePath());
                return;
            }
            return;
        }
        this.f19496k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Envelope was not cached: %s", B.getAbsolutePath());
    }

    @Override // java.lang.Iterable
    public Iterator<C9025q2> iterator() {
        File[] y = m17958y();
        ArrayList arrayList = new ArrayList(y.length);
        for (File file : y) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f19497l.mo17604d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                    break;
                }
            } catch (FileNotFoundException unused) {
                this.f19496k.getLogger().mo17722c(EnumC8942n3.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                this.f19496k.getLogger().mo17723b(EnumC8942n3.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo17113o(io.sentry.C9025q2 r13, io.sentry.C9116v r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.C8820d.mo17113o(io.sentry.q2, io.sentry.v):void");
    }
}
