package p312r3;

import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p057d4.AbstractC6394a;
import p057d4.C6397d;
import p276p3.AbstractC11526a;
import p276p3.C11527b;
import p292q3.AbstractC11980a;
import p292q3.AbstractC11989i;
import p312r3.AbstractC12373c;
import p378v3.AbstractC13423b;
import p378v3.C13422a;
import p378v3.C13424c;
import p394w3.C13730c;
import p394w3.C13740j;

/* renamed from: r3.a */
/* loaded from: classes7.dex */
public class C12364a implements AbstractC12373c {

    /* renamed from: f */
    private static final Class<?> f27756f = C12364a.class;

    /* renamed from: g */
    static final long f27757g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final File f27758a;

    /* renamed from: b */
    private final boolean f27759b;

    /* renamed from: c */
    private final File f27760c;

    /* renamed from: d */
    private final AbstractC11980a f27761d;

    /* renamed from: e */
    private final AbstractC6394a f27762e = C6397d.m25631a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r3.a$b */
    /* loaded from: classes7.dex */
    public class C12365b implements AbstractC13423b {

        /* renamed from: a */
        private final List<AbstractC12373c.AbstractC12374a> f27763a;

        private C12365b() {
            this.f27763a = new ArrayList();
        }

        @Override // p378v3.AbstractC13423b
        /* renamed from: a */
        public void mo3752a(File file) {
        }

        @Override // p378v3.AbstractC13423b
        /* renamed from: b */
        public void mo3751b(File file) {
            C12367d u = C12364a.this.m7053u(file);
            if (u != null && u.f27769a == ".cnt") {
                this.f27763a.add(new C12366c(u.f27770b, file));
            }
        }

        @Override // p378v3.AbstractC13423b
        /* renamed from: c */
        public void mo3750c(File file) {
        }

        /* renamed from: d */
        public List<AbstractC12373c.AbstractC12374a> m7047d() {
            return Collections.unmodifiableList(this.f27763a);
        }
    }

    /* renamed from: r3.a$c */
    /* loaded from: classes7.dex */
    static class C12366c implements AbstractC12373c.AbstractC12374a {

        /* renamed from: a */
        private final String f27765a;

        /* renamed from: b */
        private final C11527b f27766b;

        /* renamed from: c */
        private long f27767c;

        /* renamed from: d */
        private long f27768d;

        @Override // p312r3.AbstractC12373c.AbstractC12374a
        /* renamed from: a */
        public long mo7038a() {
            if (this.f27768d < 0) {
                this.f27768d = this.f27766b.m9452d().lastModified();
            }
            return this.f27768d;
        }

        /* renamed from: b */
        public C11527b m7046b() {
            return this.f27766b;
        }

        @Override // p312r3.AbstractC12373c.AbstractC12374a
        public String getId() {
            return this.f27765a;
        }

        @Override // p312r3.AbstractC12373c.AbstractC12374a
        public long getSize() {
            if (this.f27767c < 0) {
                this.f27767c = this.f27766b.size();
            }
            return this.f27767c;
        }

        private C12366c(String str, File file) {
            C13740j.m2834g(file);
            this.f27765a = (String) C13740j.m2834g(str);
            this.f27766b = C11527b.m9454b(file);
            this.f27767c = -1L;
            this.f27768d = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r3.a$d */
    /* loaded from: classes7.dex */
    public static class C12367d {

        /* renamed from: a */
        public final String f27769a;

        /* renamed from: b */
        public final String f27770b;

        /* renamed from: b */
        public static C12367d m7044b(File file) {
            String s;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (s = C12364a.m7055s(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (s.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new C12367d(s, substring);
        }

        /* renamed from: a */
        public File m7045a(File file) {
            return File.createTempFile(this.f27770b + ".", ".tmp", file);
        }

        /* renamed from: c */
        public String m7043c(String str) {
            return str + File.separator + this.f27770b + this.f27769a;
        }

        public String toString() {
            return this.f27769a + "(" + this.f27770b + ")";
        }

        private C12367d(String str, String str2) {
            this.f27769a = str;
            this.f27770b = str2;
        }
    }

    /* renamed from: r3.a$e */
    /* loaded from: classes7.dex */
    private static class C12368e extends IOException {
        public C12368e(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    /* renamed from: r3.a$f */
    /* loaded from: classes7.dex */
    class C12369f implements AbstractC12373c.AbstractC12375b {

        /* renamed from: a */
        private final String f27771a;

        /* renamed from: b */
        final File f27772b;

        public C12369f(String str, File file) {
            this.f27771a = str;
            this.f27772b = file;
        }

        @Override // p312r3.AbstractC12373c.AbstractC12375b
        /* renamed from: a */
        public AbstractC11526a mo7037a(Object obj) {
            return m7042c(obj, C12364a.this.f27762e.now());
        }

        /* JADX WARN: Finally extract failed */
        @Override // p312r3.AbstractC12373c.AbstractC12375b
        /* renamed from: b */
        public void mo7036b(AbstractC11989i iVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f27772b);
                try {
                    C13730c cVar = new C13730c(fileOutputStream);
                    iVar.mo8059a(cVar);
                    cVar.flush();
                    long b = cVar.m2855b();
                    fileOutputStream.close();
                    if (this.f27772b.length() != b) {
                        throw new C12368e(b, this.f27772b.length());
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e) {
                C12364a.this.f27761d.mo8070a(AbstractC11980a.EnumC0380a.WRITE_UPDATE_FILE_NOT_FOUND, C12364a.f27756f, "updateResource", e);
                throw e;
            }
        }

        /* renamed from: c */
        public AbstractC11526a m7042c(Object obj, long j) {
            AbstractC11980a.EnumC0380a aVar;
            File q = C12364a.this.m7057q(this.f27771a);
            try {
                C13424c.m3748b(this.f27772b, q);
                if (q.exists()) {
                    q.setLastModified(j);
                }
                return C11527b.m9454b(q);
            } catch (C13424c.C13427d e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    aVar = AbstractC11980a.EnumC0380a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof C13424c.C0435c) {
                    aVar = AbstractC11980a.EnumC0380a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    aVar = AbstractC11980a.EnumC0380a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    aVar = AbstractC11980a.EnumC0380a.WRITE_RENAME_FILE_OTHER;
                }
                C12364a.this.f27761d.mo8070a(aVar, C12364a.f27756f, "commit", e);
                throw e;
            }
        }

        @Override // p312r3.AbstractC12373c.AbstractC12375b
        /* renamed from: e */
        public boolean mo7035e() {
            return !this.f27772b.exists() || this.f27772b.delete();
        }
    }

    /* renamed from: r3.a$g */
    /* loaded from: classes7.dex */
    private class C12370g implements AbstractC13423b {

        /* renamed from: a */
        private boolean f27774a;

        private C12370g() {
        }

        /* renamed from: d */
        private boolean m7041d(File file) {
            C12367d u = C12364a.this.m7053u(file);
            boolean z = false;
            if (u == null) {
                return false;
            }
            String str = u.f27769a;
            if (str == ".tmp") {
                return m7040e(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            C13740j.m2832i(z);
            return true;
        }

        /* renamed from: e */
        private boolean m7040e(File file) {
            return file.lastModified() > C12364a.this.f27762e.now() - C12364a.f27757g;
        }

        @Override // p378v3.AbstractC13423b
        /* renamed from: a */
        public void mo3752a(File file) {
            if (!C12364a.this.f27758a.equals(file) && !this.f27774a) {
                file.delete();
            }
            if (this.f27774a && file.equals(C12364a.this.f27760c)) {
                this.f27774a = false;
            }
        }

        @Override // p378v3.AbstractC13423b
        /* renamed from: b */
        public void mo3751b(File file) {
            if (!this.f27774a || !m7041d(file)) {
                file.delete();
            }
        }

        @Override // p378v3.AbstractC13423b
        /* renamed from: c */
        public void mo3750c(File file) {
            if (!this.f27774a && file.equals(C12364a.this.f27760c)) {
                this.f27774a = true;
            }
        }
    }

    public C12364a(File file, int i, AbstractC11980a aVar) {
        C13740j.m2834g(file);
        this.f27758a = file;
        this.f27759b = m7049y(file, aVar);
        this.f27760c = new File(file, m7050x(i));
        this.f27761d = aVar;
        m7066B();
    }

    /* renamed from: A */
    private boolean m7067A(String str, boolean z) {
        File q = m7057q(str);
        boolean exists = q.exists();
        if (z && exists) {
            q.setLastModified(this.f27762e.now());
        }
        return exists;
    }

    /* renamed from: B */
    private void m7066B() {
        boolean z = true;
        if (this.f27758a.exists()) {
            if (!this.f27760c.exists()) {
                C13422a.m3754b(this.f27758a);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                C13424c.m3749a(this.f27760c);
            } catch (C13424c.C13425a unused) {
                AbstractC11980a aVar = this.f27761d;
                AbstractC11980a.EnumC0380a aVar2 = AbstractC11980a.EnumC0380a.WRITE_CREATE_DIR;
                Class<?> cls = f27756f;
                aVar.mo8070a(aVar2, cls, "version directory could not be created: " + this.f27760c, null);
            }
        }
    }

    /* renamed from: p */
    private long m7058p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static String m7055s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    /* renamed from: t */
    private String m7054t(String str) {
        C12367d dVar = new C12367d(".cnt", str);
        return dVar.m7043c(m7051w(dVar.f27770b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public C12367d m7053u(File file) {
        C12367d b = C12367d.m7044b(file);
        if (b != null && m7052v(b.f27770b).equals(file.getParentFile())) {
            return b;
        }
        return null;
    }

    /* renamed from: v */
    private File m7052v(String str) {
        return new File(m7051w(str));
    }

    /* renamed from: w */
    private String m7051w(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f27760c + File.separator + valueOf;
    }

    /* renamed from: x */
    static String m7050x(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    /* renamed from: y */
    private static boolean m7049y(File file, AbstractC11980a aVar) {
        IOException e;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
            } catch (IOException e2) {
                e = e2;
            }
            try {
                return file.getCanonicalPath().contains(externalStorageDirectory.toString());
            } catch (IOException e3) {
                e = e3;
                AbstractC11980a.EnumC0380a aVar2 = AbstractC11980a.EnumC0380a.OTHER;
                Class<?> cls = f27756f;
                aVar.mo8070a(aVar2, cls, "failed to read folder to check if external: " + ((String) null), e);
                return false;
            }
        } catch (Exception e4) {
            aVar.mo8070a(AbstractC11980a.EnumC0380a.OTHER, f27756f, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    /* renamed from: z */
    private void m7048z(File file, String str) {
        try {
            C13424c.m3749a(file);
        } catch (C13424c.C13425a e) {
            this.f27761d.mo8070a(AbstractC11980a.EnumC0380a.WRITE_CREATE_DIR, f27756f, str, e);
            throw e;
        }
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: a */
    public void mo7016a() {
        C13422a.m3755a(this.f27758a);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: b */
    public void mo7015b() {
        C13422a.m3753c(this.f27758a, new C12370g());
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: c */
    public boolean mo7014c(String str, Object obj) {
        return m7067A(str, true);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: d */
    public AbstractC12373c.AbstractC12375b mo7013d(String str, Object obj) {
        C12367d dVar = new C12367d(".tmp", str);
        File v = m7052v(dVar.f27770b);
        if (!v.exists()) {
            m7048z(v, "insert");
        }
        try {
            return new C12369f(str, dVar.m7045a(v));
        } catch (IOException e) {
            this.f27761d.mo8070a(AbstractC11980a.EnumC0380a.WRITE_CREATE_TEMPFILE, f27756f, "insert", e);
            throw e;
        }
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: e */
    public boolean mo7012e(String str, Object obj) {
        return m7067A(str, false);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: f */
    public AbstractC11526a mo7011f(String str, Object obj) {
        File q = m7057q(str);
        if (!q.exists()) {
            return null;
        }
        q.setLastModified(this.f27762e.now());
        return C11527b.m9453c(q);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: h */
    public long mo7009h(AbstractC12373c.AbstractC12374a aVar) {
        return m7058p(((C12366c) aVar).m7046b().m9452d());
    }

    @Override // p312r3.AbstractC12373c
    public boolean isExternal() {
        return this.f27759b;
    }

    /* renamed from: q */
    File m7057q(String str) {
        return new File(m7054t(str));
    }

    /* renamed from: r */
    public List<AbstractC12373c.AbstractC12374a> mo7010g() {
        C12365b bVar = new C12365b();
        C13422a.m3753c(this.f27760c, bVar);
        return bVar.m7047d();
    }

    @Override // p312r3.AbstractC12373c
    public long remove(String str) {
        return m7058p(m7057q(str));
    }
}
