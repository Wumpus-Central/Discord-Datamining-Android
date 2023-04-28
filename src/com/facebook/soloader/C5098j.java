package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.AbstractC5112r;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.j */
/* loaded from: classes7.dex */
public class C5098j extends AbstractC5112r {

    /* renamed from: i */
    protected final File f8768i;

    /* renamed from: j */
    protected final String f8769j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.soloader.j$b */
    /* loaded from: classes7.dex */
    public static final class C5100b extends AbstractC5112r.C5114b implements Comparable {

        /* renamed from: m */
        final ZipEntry f8770m;

        /* renamed from: n */
        final int f8771n;

        C5100b(String str, ZipEntry zipEntry, int i) {
            super(str, m30740a(zipEntry));
            this.f8770m = zipEntry;
            this.f8771n = i;
        }

        /* renamed from: a */
        private static String m30740a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f8809k.compareTo(((C5100b) obj).f8809k);
        }
    }

    /* renamed from: com.facebook.soloader.j$c */
    /* loaded from: classes7.dex */
    protected class C5101c extends AbstractC5112r.AbstractC5119g {

        /* renamed from: k */
        private C5100b[] f8772k;

        /* renamed from: l */
        private final ZipFile f8773l;

        /* renamed from: m */
        private final AbstractC5112r f8774m;

        /* renamed from: com.facebook.soloader.j$c$a */
        /* loaded from: classes7.dex */
        private final class C5102a extends AbstractC5112r.AbstractC5117e {

            /* renamed from: k */
            private int f8776k;

            private C5102a() {
            }

            @Override // com.facebook.soloader.AbstractC5112r.AbstractC5117e
            /* renamed from: b */
            public boolean mo30689b() {
                C5101c.this.m30737l();
                if (this.f8776k < C5101c.this.f8772k.length) {
                    return true;
                }
                return false;
            }

            @Override // com.facebook.soloader.AbstractC5112r.AbstractC5117e
            /* renamed from: g */
            public AbstractC5112r.AbstractC5116d mo30688g() {
                C5101c.this.m30737l();
                C5100b[] bVarArr = C5101c.this.f8772k;
                int i = this.f8776k;
                this.f8776k = i + 1;
                C5100b bVar = bVarArr[i];
                InputStream inputStream = C5101c.this.f8773l.getInputStream(bVar.f8770m);
                try {
                    return new AbstractC5112r.C5118f(bVar, inputStream);
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5101c(AbstractC5112r rVar) {
            this.f8773l = new ZipFile(C5098j.this.f8768i);
            this.f8774m = rVar;
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5119g
        /* renamed from: b */
        public final AbstractC5112r.C5115c mo30685b() {
            return new AbstractC5112r.C5115c(m30737l());
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5119g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8773l.close();
        }

        @Override // com.facebook.soloader.AbstractC5112r.AbstractC5119g
        /* renamed from: g */
        public final AbstractC5112r.AbstractC5117e mo30684g() {
            return new C5102a();
        }

        /* renamed from: l */
        final C5100b[] m30737l() {
            if (this.f8772k == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C5098j.this.f8769j);
                String[] k = SysUtil.m30767k();
                Enumeration<? extends ZipEntry> entries = this.f8773l.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int e = SysUtil.m30773e(k, group);
                        if (e >= 0) {
                            linkedHashSet.add(group);
                            C5100b bVar = (C5100b) hashMap.get(group2);
                            if (bVar == null || e < bVar.f8771n) {
                                hashMap.put(group2, new C5100b(group2, zipEntry, e));
                            }
                        }
                    }
                }
                this.f8774m.m30693x((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                C5100b[] bVarArr = (C5100b[]) hashMap.values().toArray(new C5100b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    C5100b bVar2 = bVarArr[i2];
                    if (mo30736n(bVar2.f8770m, bVar2.f8809k)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                C5100b[] bVarArr2 = new C5100b[i];
                int i3 = 0;
                for (C5100b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.f8772k = bVarArr2;
            }
            return this.f8772k;
        }

        /* renamed from: n */
        protected boolean mo30736n(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public C5098j(Context context, String str, File file, String str2) {
        super(context, str);
        this.f8768i = file;
        this.f8769j = str2;
    }
}
