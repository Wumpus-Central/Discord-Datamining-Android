package p183jj;

import java.text.ParsePosition;
import p143hj.AbstractC8080q;

/* renamed from: jj.s */
/* loaded from: classes8.dex */
public class C9675s {

    /* renamed from: a */
    private ParsePosition f21506a;

    /* renamed from: b */
    private String f21507b;

    /* renamed from: c */
    private AbstractC8080q<?> f21508c;

    /* renamed from: d */
    private boolean f21509d;

    public C9675s() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15669a() {
        this.f21506a.setErrorIndex(-1);
        this.f21507b = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15668b() {
        this.f21509d = false;
    }

    /* renamed from: c */
    public int m15667c() {
        return this.f21506a.getErrorIndex();
    }

    /* renamed from: d */
    public String m15666d() {
        return this.f21507b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public ParsePosition m15665e() {
        return this.f21506a;
    }

    /* renamed from: f */
    public int m15664f() {
        return this.f21506a.getIndex();
    }

    /* renamed from: g */
    public AbstractC8080q<?> m15663g() {
        if (this.f21508c == null) {
            this.f21508c = new C9678v(0, false);
        }
        return this.f21508c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC8080q<?> m15662h() {
        return this.f21508c;
    }

    /* renamed from: i */
    public boolean m15661i() {
        return this.f21506a.getErrorIndex() != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m15660j() {
        return this.f21509d;
    }

    /* renamed from: k */
    public void m15659k(int i, String str) {
        if (i >= 0) {
            if (str == null || str.isEmpty()) {
                str = "Error occurred at position: " + i;
            }
            this.f21507b = str;
            this.f21506a.setErrorIndex(i);
            return;
        }
        throw new IllegalArgumentException("Undefined error index: " + i);
    }

    /* renamed from: l */
    public void m15658l(int i) {
        if (i >= 0) {
            this.f21506a.setIndex(i);
            return;
        }
        throw new IllegalArgumentException("Undefined position: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m15657m(AbstractC8080q<?> qVar) {
        this.f21508c = qVar;
    }

    /* renamed from: n */
    public void m15656n() {
        if (!m15661i()) {
            this.f21507b = "Warning state active.";
            this.f21506a.setErrorIndex(m15664f());
        }
        this.f21509d = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[position=");
        sb2.append(m15664f());
        sb2.append(", error-index=");
        sb2.append(m15667c());
        sb2.append(", error-message=\"");
        sb2.append(this.f21507b);
        sb2.append('\"');
        if (this.f21509d) {
            sb2.append(", warning-active");
        }
        if (this.f21508c != null) {
            sb2.append(", raw-values=");
            sb2.append(this.f21508c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public C9675s(int i) {
        if (i >= 0) {
            this.f21506a = new ParsePosition(i);
            this.f21507b = "";
            this.f21508c = null;
            this.f21509d = false;
            return;
        }
        throw new IllegalArgumentException("Undefined: " + i);
    }
}
