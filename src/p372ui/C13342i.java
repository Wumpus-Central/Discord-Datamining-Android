package p372ui;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0012\u001b\u001aB\u0016\b\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0088\u0001\u0016\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m15073d2 = {"Lui/i;", "T", "", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "h", "(Ljava/lang/Object;)Z", "isClosed", "c", "b", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.i */
/* loaded from: classes8.dex */
public final class C13342i<T> {

    /* renamed from: b */
    public static final C13344b f29905b = new C13344b(null);

    /* renamed from: c */
    private static final C13345c f29906c = new C13345c();

    /* renamed from: a */
    private final Object f29907a;

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lui/i$a;", "Lui/i$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.i$a */
    /* loaded from: classes8.dex */
    public static final class C13343a extends C13345c {

        /* renamed from: a */
        public final Throwable f29908a;

        public C13343a(Throwable th2) {
            this.f29908a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C13343a) && C9971q.m14638b(this.f29908a, ((C13343a) obj).f29908a);
        }

        public int hashCode() {
            Throwable th2 = this.f29908a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // p372ui.C13342i.C13345c
        public String toString() {
            return "Closed(" + this.f29908a + ')';
        }
    }

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m15073d2 = {"Lui/i$b;", "", "E", "value", "Lui/i;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lui/i$c;", "failed", "Lui/i$c;", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.i$b */
    /* loaded from: classes8.dex */
    public static final class C13344b {
        private C13344b() {
        }

        public /* synthetic */ C13344b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <E> Object m3898a(Throwable th2) {
            return C13342i.m3906c(new C13343a(th2));
        }

        /* renamed from: b */
        public final <E> Object m3897b() {
            return C13342i.m3906c(C13342i.f29906c);
        }

        /* renamed from: c */
        public final <E> Object m3896c(E e) {
            return C13342i.m3906c(e);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"Lui/i$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.i$c */
    /* loaded from: classes8.dex */
    public static class C13345c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C13342i(Object obj) {
        this.f29907a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13342i m3907b(Object obj) {
        return new C13342i(obj);
    }

    /* renamed from: c */
    public static <T> Object m3906c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m3905d(Object obj, Object obj2) {
        return (obj2 instanceof C13342i) && C9971q.m14638b(obj, ((C13342i) obj2).m3899j());
    }

    /* renamed from: e */
    public static final Throwable m3904e(Object obj) {
        C13343a aVar = obj instanceof C13343a ? (C13343a) obj : null;
        if (aVar != null) {
            return aVar.f29908a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final T m3903f(Object obj) {
        Throwable th2;
        if (!(obj instanceof C13345c)) {
            return obj;
        }
        if (!(obj instanceof C13343a) || (th2 = ((C13343a) obj).f29908a) == null) {
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        throw th2;
    }

    /* renamed from: g */
    public static int m3902g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m3901h(Object obj) {
        return obj instanceof C13343a;
    }

    /* renamed from: i */
    public static String m3900i(Object obj) {
        if (obj instanceof C13343a) {
            return ((C13343a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m3905d(this.f29907a, obj);
    }

    public int hashCode() {
        return m3902g(this.f29907a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m3899j() {
        return this.f29907a;
    }

    public String toString() {
        return m3900i(this.f29907a);
    }
}
