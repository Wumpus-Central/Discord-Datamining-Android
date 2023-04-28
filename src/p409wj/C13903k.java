package p409wj;

import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p307qj.EnumC12246q;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m15073d2 = {"Lwj/k;", "", "", "toString", "Lqj/q;", "a", "Lqj/q;", "protocol", "", "b", "I", "code", "c", "Ljava/lang/String;", "message", "<init>", "(Lqj/q;ILjava/lang/String;)V", "d", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: wj.k */
/* loaded from: classes8.dex */
public final class C13903k {

    /* renamed from: d */
    public static final C13904a f31344d = new C13904a(null);

    /* renamed from: a */
    public final EnumC12246q f31345a;

    /* renamed from: b */
    public final int f31346b;

    /* renamed from: c */
    public final String f31347c;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, m15073d2 = {"Lwj/k$a;", "", "", "statusLine", "Lwj/k;", "a", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: wj.k$a */
    /* loaded from: classes8.dex */
    public static final class C13904a {
        private C13904a() {
        }

        public /* synthetic */ C13904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13903k m2340a(String statusLine) {
            boolean H;
            int i;
            EnumC12246q qVar;
            String str;
            boolean H2;
            C9971q.m14633g(statusLine, "statusLine");
            H = C12718u.m5736H(statusLine, "HTTP/1.", false, 2, null);
            if (H) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    qVar = EnumC12246q.HTTP_1_0;
                } else if (charAt == 1) {
                    qVar = EnumC12246q.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            } else {
                H2 = C12718u.m5736H(statusLine, "ICY ", false, 2, null);
                if (H2) {
                    qVar = EnumC12246q.HTTP_1_0;
                    i = 4;
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            }
            int i2 = i + 3;
            if (statusLine.length() >= i2) {
                try {
                    String substring = statusLine.substring(i, i2);
                    C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() <= i2) {
                        str = "";
                    } else if (statusLine.charAt(i2) == ' ') {
                        str = statusLine.substring(i + 4);
                        C9971q.m14634f(str, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    return new C13903k(qVar, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }

    public C13903k(EnumC12246q protocol, int i, String message) {
        C9971q.m14633g(protocol, "protocol");
        C9971q.m14633g(message, "message");
        this.f31345a = protocol;
        this.f31346b = i;
        this.f31347c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f31345a == EnumC12246q.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f31346b);
        sb2.append(' ');
        sb2.append(this.f31347c);
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
