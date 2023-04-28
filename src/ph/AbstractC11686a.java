package ph;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import ph.AbstractC11724q;

/* renamed from: ph.a */
/* loaded from: classes8.dex */
public abstract class AbstractC11686a implements AbstractC11724q {

    /* renamed from: k */
    protected int f26100k = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C11742w m9034b() {
        return new C11742w(this);
    }

    /* renamed from: i */
    public void m9033i(OutputStream outputStream) {
        int c = mo8781c();
        C11695f J = C11695f.m8951J(outputStream, C11695f.m8894u(C11695f.m8892v(c) + c));
        J.m8905o0(c);
        mo8780d(J);
        J.m8952I();
    }

    /* renamed from: ph.a$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC0372a<BuilderType extends AbstractC0372a> implements AbstractC11724q.AbstractC11725a {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l */
        public static C11742w m9031l(AbstractC11724q qVar) {
            return new C11742w(qVar);
        }

        /* renamed from: k */
        public abstract BuilderType mo8777g(C11694e eVar, C11697g gVar);

        /* renamed from: ph.a$a$a */
        /* loaded from: classes8.dex */
        static final class C0373a extends FilterInputStream {

            /* renamed from: k */
            private int f26101k;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0373a(InputStream inputStream, int i) {
                super(inputStream);
                this.f26101k = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f26101k);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f26101k <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f26101k--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                long skip = super.skip(Math.min(j, this.f26101k));
                if (skip >= 0) {
                    this.f26101k = (int) (this.f26101k - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.f26101k;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f26101k -= read;
                }
                return read;
            }
        }
    }
}
