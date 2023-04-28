package p045cj;

import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import nf.C11075i;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0003J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\nH&J\b\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001fH\u0004J\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0004J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001dH\u0000¢\u0006\u0004\b(\u0010)J\u0006\u0010*\u001a\u00020\u001dJ\u0010\u0010,\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\nJ\b\u0010-\u001a\u00020\u0002H\u0016J\u001a\u00100\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\nH&J\u0010\u00101\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\nJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0007H&J\u0006\u00105\u001a\u00020\u0007J \u00106\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0005J\u0006\u00107\u001a\u00020\u0007J\u0006\u00108\u001a\u00020\u0007J\u0018\u0010;\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0014J\u000e\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\nJ\b\u0010>\u001a\u00020\u0007H\u0016J\u000e\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0007J\"\u0010C\u001a\u00020'2\u0006\u0010A\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010B\u001a\u00020\u0007J\u0006\u0010E\u001a\u00020DJ\u0006\u0010F\u001a\u00020\nJ\u0006\u0010G\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00028\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bH\u0010-R\u0014\u0010K\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010LR&\u0010U\u001a\u00060Nj\u0002`O8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, m15073d2 = {"Lcj/a;", "", "", "lastPosition", "current", "c", "currentPosition", "", "u", "K", "", "P", "startPosition", "b", "", "source", "startPos", "d", "B", ViewProps.START, "h", "literalSuffix", "", "j", "v", ViewProps.POSITION, "G", "L", "f", "", "m", "", "D", "w", "expected", "n", "o", "O", "expectedToken", "", "z", "(B)Ljava/lang/Void;", "E", "doConsume", "M", "I", "keyToMatch", "isLenient", "l", "F", "endPos", "J", "k", "q", "r", "t", "s", "fromIndex", "toIndex", "e", "allowLenientStrings", "H", "toString", "key", "A", "message", "hint", "x", "", "p", "g", "i", "a", "Lcj/c0;", "Lcj/c0;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "C", "()Ljava/lang/CharSequence;", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.a */
/* loaded from: classes8.dex */
public abstract class AbstractC4024a {

    /* renamed from: a */
    protected int f6613a;

    /* renamed from: c */
    private String f6615c;

    /* renamed from: b */
    public final C4030c0 f6614b = new C4030c0();

    /* renamed from: d */
    private StringBuilder f6616d = new StringBuilder();

    /* renamed from: B */
    private final int m33069B(CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        char charAt = charSequence.charAt(i);
        boolean z3 = true;
        if ('0' > charAt || charAt >= ':') {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return charAt - '0';
        }
        char c = 'a';
        if ('a' > charAt || charAt >= 'g') {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            c = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z3 = false;
            }
            if (!z3) {
                m33039y(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                throw new C11075i();
            }
        }
        return (charAt - c) + 10;
    }

    /* renamed from: K */
    private final String m33063K() {
        String str = this.f6615c;
        C9971q.m14636d(str);
        this.f6615c = null;
        return str;
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m33061N(AbstractC4024a aVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return aVar.m33062M(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    /* renamed from: P */
    private final boolean m33059P() {
        return mo32909C().charAt(this.f6613a - 1) != '\"';
    }

    /* renamed from: b */
    private final int m33057b(int i) {
        int G = mo32908G(i);
        if (G != -1) {
            int i2 = G + 1;
            char charAt = mo32909C().charAt(G);
            if (charAt == 'u') {
                return m33055d(mo32909C(), i2);
            }
            char b = C4026b.m33026b(charAt);
            if (b != 0) {
                this.f6616d.append(b);
                return i2;
            }
            m33039y(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new C11075i();
        }
        m33039y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new C11075i();
    }

    /* renamed from: c */
    private final int m33056c(int i, int i2) {
        m33054e(i, i2);
        return m33057b(i2 + 1);
    }

    /* renamed from: d */
    private final int m33055d(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.f6613a = i;
            m33042v();
            if (this.f6613a + 4 < charSequence.length()) {
                return m33055d(charSequence, this.f6613a);
            }
            m33039y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new C11075i();
        }
        this.f6616d.append((char) ((m33069B(charSequence, i) << 12) + (m33069B(charSequence, i + 1) << 8) + (m33069B(charSequence, i + 2) << 4) + m33069B(charSequence, i + 3)));
        return i2;
    }

    /* renamed from: h */
    private final boolean m33052h(int i) {
        int G = mo32908G(i);
        if (G >= mo32909C().length() || G == -1) {
            m33039y(this, "EOF", 0, null, 6, null);
            throw new C11075i();
        }
        int i2 = G + 1;
        int charAt = mo32909C().charAt(G) | ' ';
        if (charAt == 102) {
            m33050j("alse", i2);
            return false;
        } else if (charAt == 116) {
            m33050j("rue", i2);
            return true;
        } else {
            m33039y(this, "Expected valid boolean literal prefix, but had '" + m33045s() + '\'', 0, null, 6, null);
            throw new C11075i();
        }
    }

    /* renamed from: j */
    private final void m33050j(String str, int i) {
        if (mo32909C().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (mo32909C().charAt(i + i2) | ' ')) {
                    m33039y(this, "Expected valid boolean literal prefix, but had '" + m33045s() + '\'', 0, null, 6, null);
                    throw new C11075i();
                }
            }
            this.f6613a = i + str.length();
            return;
        }
        m33039y(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new C11075i();
    }

    /* renamed from: u */
    private final String m33043u(int i, int i2) {
        m33054e(i, i2);
        String sb2 = this.f6616d.toString();
        C9971q.m14634f(sb2, "escapedString.toString()");
        this.f6616d.setLength(0);
        return sb2;
    }

    /* renamed from: y */
    public static /* synthetic */ Void m33039y(AbstractC4024a aVar, String str, int i, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = aVar.f6613a;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return aVar.m33040x(str, i, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    /* renamed from: A */
    public final void m33070A(String key) {
        int e0;
        C9971q.m14633g(key, "key");
        e0 = C12719v.m5681e0(m33064J(0, this.f6613a), key, 0, false, 6, null);
        m33040x("Encountered an unknown key '" + key + '\'', e0, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new C11075i();
    }

    /* renamed from: C */
    protected abstract CharSequence mo32909C();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean m33068D(char c) {
        boolean z = false;
        if (((c == '}' || c == ']') || c == ':') || c == ',') {
            z = true;
        }
        return !z;
    }

    /* renamed from: E */
    public final byte m33067E() {
        CharSequence C = mo32909C();
        int i = this.f6613a;
        while (true) {
            int G = mo32908G(i);
            if (G != -1) {
                char charAt = C.charAt(G);
                if (charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t') {
                    i = G + 1;
                } else {
                    this.f6613a = G;
                    return C4026b.m33027a(charAt);
                }
            } else {
                this.f6613a = G;
                return (byte) 10;
            }
        }
    }

    /* renamed from: F */
    public final String m33066F(boolean z) {
        String str;
        byte E = m33067E();
        if (z) {
            if (E != 1 && E != 0) {
                return null;
            }
            str = m33045s();
        } else if (E != 1) {
            return null;
        } else {
            str = m33047q();
        }
        this.f6615c = str;
        return str;
    }

    /* renamed from: G */
    public abstract int mo32908G(int i);

    /* renamed from: H */
    public final void m33065H(boolean z) {
        Object g0;
        Object g02;
        ArrayList arrayList = new ArrayList();
        byte E = m33067E();
        if (E == 8 || E == 6) {
            while (true) {
                byte E2 = m33067E();
                boolean z2 = true;
                if (E2 != 1) {
                    if (!(E2 == 8 || E2 == 6)) {
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(Byte.valueOf(E2));
                    } else if (E2 == 9) {
                        g02 = C9914r.m14758g0(arrayList);
                        if (((Number) g02).byteValue() == 8) {
                            C9911o.m14803B(arrayList);
                        } else {
                            int i = this.f6613a;
                            throw C4025a0.m33033e(i, "found ] instead of } at path: " + this.f6614b, mo32909C());
                        }
                    } else if (E2 == 7) {
                        g0 = C9914r.m14758g0(arrayList);
                        if (((Number) g0).byteValue() == 6) {
                            C9911o.m14803B(arrayList);
                        } else {
                            int i2 = this.f6613a;
                            throw C4025a0.m33033e(i2, "found } instead of ] at path: " + this.f6614b, mo32909C());
                        }
                    } else if (E2 == 10) {
                        m33039y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                        throw new C11075i();
                    }
                    mo32901m();
                    if (arrayList.size() == 0) {
                        return;
                    }
                } else if (z) {
                    m33045s();
                } else {
                    mo32903k();
                }
            }
        } else {
            m33045s();
        }
    }

    /* renamed from: I */
    public abstract int mo32907I();

    /* renamed from: J */
    public String m33064J(int i, int i2) {
        return mo32909C().subSequence(i, i2).toString();
    }

    /* renamed from: L */
    public abstract boolean mo32906L();

    /* renamed from: M */
    public final boolean m33062M(boolean z) {
        int G = mo32908G(mo32907I());
        int length = mo32909C().length() - G;
        if (length < 4 || G == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != mo32909C().charAt(G + i)) {
                return false;
            }
        }
        if (length > 4 && C4026b.m33027a(mo32909C().charAt(G + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.f6613a = G + 4;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m33060O(char c) {
        int i = this.f6613a - 1;
        this.f6613a = i;
        if (i < 0 || c != '\"' || !C9971q.m14638b(m33045s(), "null")) {
            m33038z(C4026b.m33027a(c));
            throw new C11075i();
        } else {
            m33040x("Expected string literal but 'null' literal was found", this.f6613a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new C11075i();
        }
    }

    /* renamed from: e */
    protected void m33054e(int i, int i2) {
        this.f6616d.append(mo32909C(), i, i2);
    }

    /* renamed from: f */
    public abstract boolean mo32904f();

    /* renamed from: g */
    public final boolean m33053g() {
        return m33052h(mo32907I());
    }

    /* renamed from: i */
    public final boolean m33051i() {
        boolean z;
        int I = mo32907I();
        if (I != mo32909C().length()) {
            if (mo32909C().charAt(I) == '\"') {
                I++;
                z = true;
            } else {
                z = false;
            }
            boolean h = m33052h(I);
            if (z) {
                if (this.f6613a == mo32909C().length()) {
                    m33039y(this, "EOF", 0, null, 6, null);
                    throw new C11075i();
                } else if (mo32909C().charAt(this.f6613a) == '\"') {
                    this.f6613a++;
                } else {
                    m33039y(this, "Expected closing quotation mark", 0, null, 6, null);
                    throw new C11075i();
                }
            }
            return h;
        }
        m33039y(this, "EOF", 0, null, 6, null);
        throw new C11075i();
    }

    /* renamed from: k */
    public abstract String mo32903k();

    /* renamed from: l */
    public abstract String mo32902l(String str, boolean z);

    /* renamed from: m */
    public abstract byte mo32901m();

    /* renamed from: n */
    public final byte m33049n(byte b) {
        byte m = mo32901m();
        if (m == b) {
            return m;
        }
        m33038z(b);
        throw new C11075i();
    }

    /* renamed from: o */
    public abstract void mo32900o(char c);

    /* renamed from: p */
    public final long m33048p() {
        boolean z;
        boolean z2;
        int G = mo32908G(mo32907I());
        if (G >= mo32909C().length() || G == -1) {
            m33039y(this, "EOF", 0, null, 6, null);
            throw new C11075i();
        }
        if (mo32909C().charAt(G) == '\"') {
            G++;
            if (G != mo32909C().length()) {
                z = true;
            } else {
                m33039y(this, "EOF", 0, null, 6, null);
                throw new C11075i();
            }
        } else {
            z = false;
        }
        int i = G;
        long j = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (z3) {
            char charAt = mo32909C().charAt(i);
            if (charAt != '-') {
                if (C4026b.m33027a(charAt) != 0) {
                    break;
                }
                i++;
                if (i != mo32909C().length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i2 = charAt - '0';
                if (i2 < 0 || i2 >= 10) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    j = (j * 10) - i2;
                    if (j > 0) {
                        m33039y(this, "Numeric value overflow", 0, null, 6, null);
                        throw new C11075i();
                    }
                } else {
                    m33039y(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                    throw new C11075i();
                }
            } else if (i == G) {
                i++;
                z4 = true;
            } else {
                m33039y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new C11075i();
            }
        }
        if (G == i || (z4 && G == i - 1)) {
            m33039y(this, "Expected numeric literal", 0, null, 6, null);
            throw new C11075i();
        }
        if (z) {
            if (!z3) {
                m33039y(this, "EOF", 0, null, 6, null);
                throw new C11075i();
            } else if (mo32909C().charAt(i) == '\"') {
                i++;
            } else {
                m33039y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new C11075i();
            }
        }
        this.f6613a = i;
        if (z4) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        m33039y(this, "Numeric value overflow", 0, null, 6, null);
        throw new C11075i();
    }

    /* renamed from: q */
    public final String m33047q() {
        if (this.f6615c != null) {
            return m33063K();
        }
        return mo32903k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final String m33046r(CharSequence source, int i, int i2) {
        String str;
        int G;
        C9971q.m14633g(source, "source");
        char charAt = source.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                G = mo32908G(m33056c(i, i2));
                if (G == -1) {
                    m33039y(this, "EOF", G, null, 4, null);
                    throw new C11075i();
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    m33054e(i, i2);
                    G = mo32908G(i2);
                    if (G == -1) {
                        m33039y(this, "EOF", G, null, 4, null);
                        throw new C11075i();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            z = true;
            i = G;
            i2 = i;
            charAt = source.charAt(i2);
        }
        if (!z) {
            str = m33064J(i, i2);
        } else {
            str = m33043u(i, i2);
        }
        this.f6613a = i2 + 1;
        return str;
    }

    /* renamed from: s */
    public final String m33045s() {
        String str;
        if (this.f6615c != null) {
            return m33063K();
        }
        int I = mo32907I();
        if (I >= mo32909C().length() || I == -1) {
            m33039y(this, "EOF", I, null, 4, null);
            throw new C11075i();
        }
        byte a = C4026b.m33027a(mo32909C().charAt(I));
        if (a == 1) {
            return m33047q();
        }
        if (a == 0) {
            boolean z = false;
            while (C4026b.m33027a(mo32909C().charAt(I)) == 0) {
                I++;
                if (I >= mo32909C().length()) {
                    m33054e(this.f6613a, I);
                    int G = mo32908G(I);
                    if (G == -1) {
                        this.f6613a = I;
                        return m33043u(0, 0);
                    }
                    I = G;
                    z = true;
                }
            }
            if (!z) {
                str = m33064J(this.f6613a, I);
            } else {
                str = m33043u(this.f6613a, I);
            }
            this.f6613a = I;
            return str;
        }
        m33039y(this, "Expected beginning of the string, but got " + mo32909C().charAt(I), 0, null, 6, null);
        throw new C11075i();
    }

    /* renamed from: t */
    public final String m33044t() {
        String s = m33045s();
        if (!C9971q.m14638b(s, "null") || !m33059P()) {
            return s;
        }
        m33039y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new C11075i();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) mo32909C()) + "', currentPosition=" + this.f6613a + ')';
    }

    /* renamed from: v */
    public void m33042v() {
    }

    /* renamed from: w */
    public final void m33041w() {
        if (mo32901m() != 10) {
            m33039y(this, "Expected EOF after parsing, but had " + mo32909C().charAt(this.f6613a - 1) + " instead", 0, null, 6, null);
            throw new C11075i();
        }
    }

    /* renamed from: x */
    public final Void m33040x(String message, int i, String hint) {
        boolean z;
        String str;
        C9971q.m14633g(message, "message");
        C9971q.m14633g(hint, "hint");
        if (hint.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C4025a0.m33033e(i, message + " at path: " + this.f6614b.m32993a() + str, mo32909C());
    }

    /* renamed from: z */
    public final Void m33038z(byte b) {
        String str;
        String str2;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        if (this.f6613a == mo32909C().length() || this.f6613a <= 0) {
            str2 = "EOF";
        } else {
            str2 = String.valueOf(mo32909C().charAt(this.f6613a - 1));
        }
        m33039y(this, "Expected " + str + ", but had '" + str2 + "' instead", this.f6613a - 1, null, 4, null);
        throw new C11075i();
    }
}
