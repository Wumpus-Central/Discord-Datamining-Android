package p290q1;

import android.content.Context;
import androidx.core.util.C2512c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: q1.b */
/* loaded from: classes.dex */
public class C11962b<D> {

    /* renamed from: a */
    int f26778a;

    /* renamed from: b */
    AbstractC11963a<D> f26779b;

    /* renamed from: c */
    Context f26780c;

    /* renamed from: d */
    boolean f26781d = false;

    /* renamed from: e */
    boolean f26782e = false;

    /* renamed from: f */
    boolean f26783f = true;

    /* renamed from: g */
    boolean f26784g = false;

    /* renamed from: h */
    boolean f26785h = false;

    /* renamed from: q1.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC11963a<D> {
        /* renamed from: a */
        void mo8108a(C11962b<D> bVar, D d);
    }

    public C11962b(Context context) {
        this.f26780c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m8129a() {
        this.f26782e = true;
        m8120j();
    }

    /* renamed from: b */
    public boolean m8128b() {
        return mo8119k();
    }

    /* renamed from: c */
    public void m8127c() {
        this.f26785h = false;
    }

    /* renamed from: d */
    public String m8126d(D d) {
        StringBuilder sb2 = new StringBuilder(64);
        C2512c.m37602a(d, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: e */
    public void m8125e() {
    }

    /* renamed from: f */
    public void m8124f(D d) {
        AbstractC11963a<D> aVar = this.f26779b;
        if (aVar != null) {
            aVar.mo8108a(this, d);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo8123g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f26778a);
        printWriter.print(" mListener=");
        printWriter.println(this.f26779b);
        if (this.f26781d || this.f26784g || this.f26785h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f26781d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f26784g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f26785h);
        }
        if (this.f26782e || this.f26783f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f26782e);
            printWriter.print(" mReset=");
            printWriter.println(this.f26783f);
        }
    }

    /* renamed from: h */
    public void m8122h() {
        mo8117m();
    }

    /* renamed from: i */
    public boolean m8121i() {
        return this.f26782e;
    }

    /* renamed from: j */
    protected void m8120j() {
    }

    /* renamed from: k */
    protected boolean mo8119k() {
        throw null;
    }

    /* renamed from: l */
    public void m8118l() {
        if (this.f26781d) {
            m8122h();
        } else {
            this.f26784g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo8117m() {
    }

    /* renamed from: n */
    protected void m8116n() {
    }

    /* renamed from: o */
    protected void mo6639o() {
        throw null;
    }

    /* renamed from: p */
    protected void m8115p() {
    }

    /* renamed from: q */
    public void m8114q(int i, AbstractC11963a<D> aVar) {
        if (this.f26779b == null) {
            this.f26779b = aVar;
            this.f26778a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: r */
    public void m8113r() {
        m8116n();
        this.f26783f = true;
        this.f26781d = false;
        this.f26782e = false;
        this.f26784g = false;
        this.f26785h = false;
    }

    /* renamed from: s */
    public void m8112s() {
        if (this.f26785h) {
            m8118l();
        }
    }

    /* renamed from: t */
    public final void m8111t() {
        this.f26781d = true;
        this.f26783f = false;
        this.f26782e = false;
        mo6639o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C2512c.m37602a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f26778a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m8110u() {
        this.f26781d = false;
        m8115p();
    }

    /* renamed from: v */
    public void m8109v(AbstractC11963a<D> aVar) {
        AbstractC11963a<D> aVar2 = this.f26779b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.f26779b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
