package p450yj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, m15073d2 = {"Lyj/b;", "", "", "k", "I", "a", "()I", "httpCode", "<init>", "(Ljava/lang/String;II)V", "A", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.b */
/* loaded from: classes8.dex */
public enum EnumC14449b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: A */
    public static final C14450a f39495A = new C14450a(null);

    /* renamed from: k */
    private final int f32675k;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m15073d2 = {"Lyj/b$a;", "", "", "code", "Lyj/b;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.b$a */
    /* loaded from: classes8.dex */
    public static final class C14450a {
        private C14450a() {
        }

        public /* synthetic */ C14450a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC14449b m575a(int i) {
            EnumC14449b[] values;
            for (EnumC14449b bVar : EnumC14449b.values()) {
                if (bVar.m576a() == i) {
                    return bVar;
                }
            }
            return null;
        }
    }

    EnumC14449b(int i) {
        this.f32675k = i;
    }

    /* renamed from: a */
    public final int m576a() {
        return this.f32675k;
    }
}
