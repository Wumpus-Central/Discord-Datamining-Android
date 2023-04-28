package p314r5;

import com.facebook.common.references.CloseableReference;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import p005a4.AbstractC1262c;
import p005a4.C1263d;
import p334s5.AbstractC12785a;
import p414x3.C13925a;

/* renamed from: r5.a */
/* loaded from: classes7.dex */
public class C12387a {

    /* renamed from: a */
    private final CloseableReference.AbstractC4770c f27839a;

    /* renamed from: r5.a$a */
    /* loaded from: classes7.dex */
    class C0396a implements CloseableReference.AbstractC4770c {

        /* renamed from: a */
        final /* synthetic */ AbstractC12785a f27840a;

        C0396a(AbstractC12785a aVar) {
            this.f27840a = aVar;
        }

        @Override // com.facebook.common.references.CloseableReference.AbstractC4770c
        /* renamed from: a */
        public void mo6970a(C1263d<Object> dVar, Throwable th2) {
            String str;
            this.f27840a.mo5480a(dVar, th2);
            Object f = dVar.m41508f();
            if (f != null) {
                str = f.getClass().getName();
            } else {
                str = "<value is null>";
            }
            C13925a.m2302J("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(dVar)), str, C12387a.m6971d(th2));
        }

        @Override // com.facebook.common.references.CloseableReference.AbstractC4770c
        /* renamed from: b */
        public boolean mo6969b() {
            return this.f27840a.mo5479b();
        }
    }

    public C12387a(AbstractC12785a aVar) {
        this.f27839a = new C0396a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m6971d(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public <U extends Closeable> CloseableReference<U> m6973b(U u) {
        return CloseableReference.m32034U(u, this.f27839a);
    }

    /* renamed from: c */
    public <T> CloseableReference<T> m6972c(T t, AbstractC1262c<T> cVar) {
        return CloseableReference.m32032b0(t, cVar, this.f27839a);
    }
}
