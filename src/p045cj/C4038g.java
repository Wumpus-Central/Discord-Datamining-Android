package p045cj;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lcj/g;", "", "", "f", "e", "", "c", "", "esc", "b", "a", "", "cl", "d", "", "[C", "ESCAPE_2_CHAR", "", "[B", "CHAR_TO_TOKEN", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.g */
/* loaded from: classes8.dex */
public final class C4038g {

    /* renamed from: a */
    public static final C4038g f6635a;

    /* renamed from: b */
    public static final char[] f6636b = new char[117];

    /* renamed from: c */
    public static final byte[] f6637c = new byte[126];

    static {
        C4038g gVar = new C4038g();
        f6635a = gVar;
        gVar.m32970f();
        gVar.m32971e();
    }

    private C4038g() {
    }

    /* renamed from: a */
    private final void m32975a(char c, char c2) {
        m32974b(c, c2);
    }

    /* renamed from: b */
    private final void m32974b(int i, char c) {
        if (c != 'u') {
            f6636b[c] = (char) i;
        }
    }

    /* renamed from: c */
    private final void m32973c(char c, byte b) {
        m32972d(c, b);
    }

    /* renamed from: d */
    private final void m32972d(int i, byte b) {
        f6637c[i] = b;
    }

    /* renamed from: e */
    private final void m32971e() {
        for (int i = 0; i < 33; i++) {
            m32972d(i, Byte.MAX_VALUE);
        }
        m32972d(9, (byte) 3);
        m32972d(10, (byte) 3);
        m32972d(13, (byte) 3);
        m32972d(32, (byte) 3);
        m32973c(',', (byte) 4);
        m32973c(':', (byte) 5);
        m32973c('{', (byte) 6);
        m32973c('}', (byte) 7);
        m32973c('[', (byte) 8);
        m32973c(']', (byte) 9);
        m32973c('\"', (byte) 1);
        m32973c('\\', (byte) 2);
    }

    /* renamed from: f */
    private final void m32970f() {
        for (int i = 0; i < 32; i++) {
            m32974b(i, 'u');
        }
        m32974b(8, 'b');
        m32974b(9, 't');
        m32974b(10, 'n');
        m32974b(12, 'f');
        m32974b(13, 'r');
        m32975a('/', '/');
        m32975a('\"', '\"');
        m32975a('\\', '\\');
    }
}
