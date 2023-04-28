package p045cj;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11075i;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R\u001a\u0010\u0018\u001a\u00020\u000f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Lcj/q0;", "Lcj/a;", "", ViewProps.POSITION, "G", "", "m", "", "L", "f", "I", "", "expected", "", "o", "", "k", "keyToMatch", "isLenient", "l", "e", "Ljava/lang/String;", "Q", "()Ljava/lang/String;", "source", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.q0 */
/* loaded from: classes8.dex */
public final class C4064q0 extends AbstractC4024a {

    /* renamed from: e */
    private final String f6689e;

    public C4064q0(String source) {
        C9971q.m14633g(source, "source");
        this.f6689e = source;
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: G */
    public int mo32908G(int i) {
        if (i < mo32909C().length()) {
            return i;
        }
        return -1;
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: I */
    public int mo32907I() {
        char charAt;
        int i = this.f6613a;
        if (i == -1) {
            return i;
        }
        while (i < mo32909C().length() && ((charAt = mo32909C().charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.f6613a = i;
        return i;
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: L */
    public boolean mo32906L() {
        int I = mo32907I();
        if (I == mo32909C().length() || I == -1 || mo32909C().charAt(I) != ',') {
            return false;
        }
        this.f6613a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public String mo32909C() {
        return this.f6689e;
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: f */
    public boolean mo32904f() {
        int i = this.f6613a;
        if (i == -1) {
            return false;
        }
        while (i < mo32909C().length()) {
            char charAt = mo32909C().charAt(i);
            if (charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t') {
                i++;
            } else {
                this.f6613a = i;
                return m33068D(charAt);
            }
        }
        this.f6613a = i;
        return false;
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: k */
    public String mo32903k() {
        int Y;
        mo32900o('\"');
        int i = this.f6613a;
        Y = C12719v.m5687Y(mo32909C(), '\"', i, false, 4, null);
        if (Y != -1) {
            for (int i2 = i; i2 < Y; i2++) {
                if (mo32909C().charAt(i2) == '\\') {
                    return m33046r(mo32909C(), this.f6613a, i2);
                }
            }
            this.f6613a = Y + 1;
            String substring = mo32909C().substring(i, Y);
            C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        m33038z((byte) 1);
        throw new C11075i();
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: l */
    public String mo32902l(String keyToMatch, boolean z) {
        String str;
        String str2;
        C9971q.m14633g(keyToMatch, "keyToMatch");
        int i = this.f6613a;
        try {
            if (mo32901m() != 6) {
                return null;
            }
            if (z) {
                str = mo32903k();
            } else {
                str = m33044t();
            }
            if (!C9971q.m14638b(str, keyToMatch)) {
                return null;
            }
            if (mo32901m() != 5) {
                return null;
            }
            if (z) {
                str2 = m33047q();
            } else {
                str2 = m33044t();
            }
            return str2;
        } finally {
            this.f6613a = i;
        }
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: m */
    public byte mo32901m() {
        byte a;
        String Q = mo32909C();
        do {
            int i = this.f6613a;
            if (i == -1 || i >= Q.length()) {
                return (byte) 10;
            }
            int i2 = this.f6613a;
            this.f6613a = i2 + 1;
            a = C4026b.m33027a(Q.charAt(i2));
        } while (a == 3);
        return a;
    }

    @Override // p045cj.AbstractC4024a
    /* renamed from: o */
    public void mo32900o(char c) {
        if (this.f6613a == -1) {
            m33060O(c);
        }
        String Q = mo32909C();
        while (this.f6613a < Q.length()) {
            int i = this.f6613a;
            this.f6613a = i + 1;
            char charAt = Q.charAt(i);
            if (!(charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                if (charAt != c) {
                    m33060O(c);
                } else {
                    return;
                }
            }
        }
        m33060O(c);
    }
}
