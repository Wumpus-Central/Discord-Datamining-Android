package nf;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001f\u001cB\u0016\b\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0088\u0001\u0016\u0092\u0001\u0004\u0018\u00010\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m15073d2 = {"Lnf/s;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "f", "(Ljava/lang/Object;)I", "", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "k", "Ljava/lang/Object;", "getValue$annotations", "()V", "value", "h", "(Ljava/lang/Object;)Z", "isSuccess", "g", "isFailure", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "l", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.s */
/* loaded from: classes8.dex */
public final class C11090s<T> implements Serializable {

    /* renamed from: l */
    public static final C11091a f24606l = new C11091a(null);

    /* renamed from: k */
    private final Object f24607k;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lnf/s$a;", "", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.s$a */
    /* loaded from: classes8.dex */
    public static final class C11091a {
        private C11091a() {
        }

        public /* synthetic */ C11091a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m15073d2 = {"Lnf/s$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "k", "Ljava/lang/Throwable;", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.s$b */
    /* loaded from: classes8.dex */
    public static final class C11092b implements Serializable {

        /* renamed from: k */
        public final Throwable f24608k;

        public C11092b(Throwable exception) {
            C9971q.m14633g(exception, "exception");
            this.f24608k = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C11092b) && C9971q.m14638b(this.f24608k, ((C11092b) obj).f24608k);
        }

        public int hashCode() {
            return this.f24608k.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f24608k + ')';
        }
    }

    private /* synthetic */ C11090s(Object obj) {
        this.f24607k = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11090s m10941a(Object obj) {
        return new C11090s(obj);
    }

    /* renamed from: b */
    public static <T> Object m10940b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m10939c(Object obj, Object obj2) {
        return (obj2 instanceof C11090s) && C9971q.m14638b(obj, ((C11090s) obj2).m10932j());
    }

    /* renamed from: d */
    public static final boolean m10938d(Object obj, Object obj2) {
        return C9971q.m14638b(obj, obj2);
    }

    /* renamed from: e */
    public static final Throwable m10937e(Object obj) {
        if (obj instanceof C11092b) {
            return ((C11092b) obj).f24608k;
        }
        return null;
    }

    /* renamed from: f */
    public static int m10936f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m10935g(Object obj) {
        return obj instanceof C11092b;
    }

    /* renamed from: h */
    public static final boolean m10934h(Object obj) {
        return !(obj instanceof C11092b);
    }

    /* renamed from: i */
    public static String m10933i(Object obj) {
        if (obj instanceof C11092b) {
            return ((C11092b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m10939c(this.f24607k, obj);
    }

    public int hashCode() {
        return m10936f(this.f24607k);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m10932j() {
        return this.f24607k;
    }

    public String toString() {
        return m10933i(this.f24607k);
    }
}
