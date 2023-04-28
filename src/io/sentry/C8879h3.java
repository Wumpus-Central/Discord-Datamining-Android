package io.sentry;

import io.sentry.C8879h3;
import io.sentry.clientreport.C8823b;
import io.sentry.exception.C8859b;
import io.sentry.util.C9111k;
import io.sentry.vendor.C9121a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import p163j$.util.Spliterator;

/* renamed from: io.sentry.h3 */
/* loaded from: classes8.dex */
public final class C8879h3 {

    /* renamed from: d */
    private static final Charset f19566d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C8897i3 f19567a;

    /* renamed from: b */
    private final Callable<byte[]> f19568b;

    /* renamed from: c */
    private byte[] f19569c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.h3$a */
    /* loaded from: classes8.dex */
    public static class C8880a {

        /* renamed from: a */
        private byte[] f19570a;

        /* renamed from: b */
        private final Callable<byte[]> f19571b;

        public C8880a(Callable<byte[]> callable) {
            this.f19571b = callable;
        }

        /* renamed from: b */
        private static byte[] m17771b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        /* renamed from: a */
        public byte[] m17772a() {
            Callable<byte[]> callable;
            if (this.f19570a == null && (callable = this.f19571b) != null) {
                this.f19570a = callable.call();
            }
            return m17771b(this.f19570a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8879h3(C8897i3 i3Var, byte[] bArr) {
        this.f19567a = (C8897i3) C9111k.m16995a(i3Var, "SentryEnvelopeItemHeader is required.");
        this.f19569c = bArr;
        this.f19568b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ byte[] m17811A(AbstractC8924l0 l0Var, C8823b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f19566d));
            l0Var.mo17607a(bVar, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ Integer m17810B(C8880a aVar) {
        return Integer.valueOf(aVar.m17772a().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ byte[] m17808D(AbstractC8924l0 l0Var, AbstractC8926l2 l2Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f19566d));
            l0Var.mo17607a(l2Var, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ Integer m17807E(C8880a aVar) {
        return Integer.valueOf(aVar.m17772a().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ byte[] m17805G(File file, long j, C9137w1 w1Var, AbstractC8924l0 l0Var) {
        if (file.exists()) {
            String c = C9121a.m16968c(m17799M(file.getPath(), j), 3);
            if (!c.isEmpty()) {
                w1Var.m16886F(c);
                w1Var.m16887E();
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f19566d));
                            l0Var.mo17607a(w1Var, bufferedWriter);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            return byteArray;
                        } catch (Throwable th2) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (IOException e) {
                        throw new C8859b(String.format("Failed to serialize profiling trace data\n%s", e.getMessage()));
                    }
                } finally {
                    file.delete();
                }
            } else {
                throw new C8859b("Profiling trace file is empty");
            }
        } else {
            throw new C8859b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ Integer m17804H(C8880a aVar) {
        return Integer.valueOf(aVar.m17772a().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ byte[] m17802J(AbstractC8924l0 l0Var, C9157y3 y3Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f19566d));
            l0Var.mo17607a(y3Var, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ Integer m17801K(C8880a aVar) {
        return Integer.valueOf(aVar.m17772a().length);
    }

    /* renamed from: M */
    private static byte[] m17799M(String str, long j) {
        try {
            File file = new File(str);
            if (!file.isFile()) {
                throw new C8859b(String.format("Reading the item %s failed, because the file located at the path is not a file.", str));
            } else if (!file.canRead()) {
                throw new C8859b(String.format("Reading the item %s failed, because can't read the file.", str));
            } else if (file.length() <= j) {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[Spliterator.IMMUTABLE];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                throw new C8859b(String.format("Dropping item, because its size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
            }
        } catch (IOException | SecurityException e) {
            throw new C8859b(String.format("Reading the item %s failed.\n%s", str, e.getMessage()));
        }
    }

    /* renamed from: p */
    public static C8879h3 m17783p(final C8804b bVar, final long j) {
        final C8880a aVar = new C8880a(new Callable() { // from class: io.sentry.g3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] z;
                z = C8879h3.m17773z(C8804b.this, j);
                return z;
            }
        });
        return new C8879h3(new C8897i3(EnumC8935m3.Attachment, new Callable() { // from class: io.sentry.t2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer x;
                x = C8879h3.m17775x(C8879h3.C8880a.this);
                return x;
            }
        }, bVar.m18046d(), bVar.m18045e(), bVar.m18048b()), new Callable() { // from class: io.sentry.u2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a;
                a = C8879h3.C8880a.this.m17772a();
                return a;
            }
        });
    }

    /* renamed from: q */
    public static C8879h3 m17782q(final AbstractC8924l0 l0Var, final C8823b bVar) {
        C9111k.m16995a(l0Var, "ISerializer is required.");
        C9111k.m16995a(bVar, "ClientReport is required.");
        final C8880a aVar = new C8880a(new Callable() { // from class: io.sentry.a3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] A;
                A = C8879h3.m17811A(AbstractC8924l0.this, bVar);
                return A;
            }
        });
        return new C8879h3(new C8897i3(EnumC8935m3.resolve(bVar), new Callable() { // from class: io.sentry.b3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer B;
                B = C8879h3.m17810B(C8879h3.C8880a.this);
                return B;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.c3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a;
                a = C8879h3.C8880a.this.m17772a();
                return a;
            }
        });
    }

    /* renamed from: r */
    public static C8879h3 m17781r(final AbstractC8924l0 l0Var, final AbstractC8926l2 l2Var) {
        C9111k.m16995a(l0Var, "ISerializer is required.");
        C9111k.m16995a(l2Var, "SentryEvent is required.");
        final C8880a aVar = new C8880a(new Callable() { // from class: io.sentry.d3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] D;
                D = C8879h3.m17808D(AbstractC8924l0.this, l2Var);
                return D;
            }
        });
        return new C8879h3(new C8897i3(EnumC8935m3.resolve(l2Var), new Callable() { // from class: io.sentry.e3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer E;
                E = C8879h3.m17807E(C8879h3.C8880a.this);
                return E;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.f3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a;
                a = C8879h3.C8880a.this.m17772a();
                return a;
            }
        });
    }

    /* renamed from: s */
    public static C8879h3 m17780s(final C9137w1 w1Var, final long j, final AbstractC8924l0 l0Var) {
        final File B = w1Var.m16890B();
        final C8880a aVar = new C8880a(new Callable() { // from class: io.sentry.v2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] G;
                G = C8879h3.m17805G(B, j, w1Var, l0Var);
                return G;
            }
        });
        return new C8879h3(new C8897i3(EnumC8935m3.Profile, new Callable() { // from class: io.sentry.w2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer H;
                H = C8879h3.m17804H(C8879h3.C8880a.this);
                return H;
            }
        }, "application-json", B.getName()), new Callable() { // from class: io.sentry.x2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a;
                a = C8879h3.C8880a.this.m17772a();
                return a;
            }
        });
    }

    /* renamed from: t */
    public static C8879h3 m17779t(final AbstractC8924l0 l0Var, final C9157y3 y3Var) {
        C9111k.m16995a(l0Var, "ISerializer is required.");
        C9111k.m16995a(y3Var, "Session is required.");
        final C8880a aVar = new C8880a(new Callable() { // from class: io.sentry.s2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] J;
                J = C8879h3.m17802J(AbstractC8924l0.this, y3Var);
                return J;
            }
        });
        return new C8879h3(new C8897i3(EnumC8935m3.Session, new Callable() { // from class: io.sentry.y2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer K;
                K = C8879h3.m17801K(C8879h3.C8880a.this);
                return K;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.z2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a;
                a = C8879h3.C8880a.this.m17772a();
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ Integer m17775x(C8880a aVar) {
        return Integer.valueOf(aVar.m17772a().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ byte[] m17773z(C8804b bVar, long j) {
        if (bVar.m18047c() != null) {
            if (bVar.m18047c().length <= j) {
                return bVar.m18047c();
            }
            throw new C8859b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", bVar.m18045e(), Integer.valueOf(bVar.m18047c().length), Long.valueOf(j)));
        } else if (bVar.m18044f() != null) {
            return m17799M(bVar.m18044f(), j);
        } else {
            throw new C8859b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes or a path is set.", bVar.m18045e()));
        }
    }

    /* renamed from: u */
    public C8823b m17778u(AbstractC8924l0 l0Var) {
        C8897i3 i3Var = this.f19567a;
        if (i3Var == null || i3Var.m17763b() != EnumC8935m3.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m17777v()), f19566d));
        try {
            C8823b bVar = (C8823b) l0Var.mo17605c(bufferedReader, C8823b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: v */
    public byte[] m17777v() {
        Callable<byte[]> callable;
        if (this.f19569c == null && (callable = this.f19568b) != null) {
            this.f19569c = callable.call();
        }
        return this.f19569c;
    }

    /* renamed from: w */
    public C8897i3 m17776w() {
        return this.f19567a;
    }

    C8879h3(C8897i3 i3Var, Callable<byte[]> callable) {
        this.f19567a = (C8897i3) C9111k.m16995a(i3Var, "SentryEnvelopeItemHeader is required.");
        this.f19568b = (Callable) C9111k.m16995a(callable, "DataFactory is required.");
        this.f19569c = null;
    }
}
