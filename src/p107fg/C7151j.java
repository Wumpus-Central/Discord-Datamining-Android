package p107fg;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KType;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u001b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lfg/j;", "", "", "toString", "Lfg/k;", "a", "Lkotlin/reflect/KType;", "b", "", "hashCode", "other", "", "equals", "Lfg/k;", "d", "()Lfg/k;", "variance", "Lkotlin/reflect/KType;", "c", "()Lkotlin/reflect/KType;", "type", "<init>", "(Lfg/k;Lkotlin/reflect/KType;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: fg.j */
/* loaded from: classes8.dex */
public final class C7151j {

    /* renamed from: c */
    public static final C7152a f15543c = new C7152a(null);

    /* renamed from: d */
    public static final C7151j f15544d = new C7151j(null, null);

    /* renamed from: a */
    private final EnumC7154k f15545a;

    /* renamed from: b */
    private final KType f15546b;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m15073d2 = {"Lfg/j$a;", "", "Lkotlin/reflect/KType;", "type", "Lfg/j;", "d", "a", "b", "c", "()Lfg/j;", "STAR", "star", "Lfg/j;", "getStar$annotations", "()V", "<init>", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: fg.j$a */
    /* loaded from: classes8.dex */
    public static final class C7152a {
        private C7152a() {
        }

        public /* synthetic */ C7152a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7151j m23333a(KType type) {
            C9971q.m14633g(type, "type");
            return new C7151j(EnumC7154k.IN, type);
        }

        /* renamed from: b */
        public final C7151j m23332b(KType type) {
            C9971q.m14633g(type, "type");
            return new C7151j(EnumC7154k.OUT, type);
        }

        /* renamed from: c */
        public final C7151j m23331c() {
            return C7151j.f15544d;
        }

        /* renamed from: d */
        public final C7151j m23330d(KType type) {
            C9971q.m14633g(type, "type");
            return new C7151j(EnumC7154k.INVARIANT, type);
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: fg.j$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7153b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15547a;

        static {
            int[] iArr = new int[EnumC7154k.values().length];
            try {
                iArr[EnumC7154k.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7154k.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7154k.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15547a = iArr;
        }
    }

    public C7151j(EnumC7154k kVar, KType kType) {
        boolean z;
        boolean z2;
        String str;
        this.f15545a = kVar;
        this.f15546b = kType;
        boolean z3 = true;
        if (kVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (kType == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z != z2 ? false : z3)) {
            if (kVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: a */
    public final EnumC7154k m23337a() {
        return this.f15545a;
    }

    /* renamed from: b */
    public final KType m23336b() {
        return this.f15546b;
    }

    /* renamed from: c */
    public final KType m23335c() {
        return this.f15546b;
    }

    /* renamed from: d */
    public final EnumC7154k m23334d() {
        return this.f15545a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7151j)) {
            return false;
        }
        C7151j jVar = (C7151j) obj;
        return this.f15545a == jVar.f15545a && C9971q.m14638b(this.f15546b, jVar.f15546b);
    }

    public int hashCode() {
        EnumC7154k kVar = this.f15545a;
        int i = 0;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        KType kType = this.f15546b;
        if (kType != null) {
            i = kType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        int i;
        EnumC7154k kVar = this.f15545a;
        if (kVar == null) {
            i = -1;
        } else {
            i = C7153b.f15547a[kVar.ordinal()];
        }
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.f15546b);
        }
        if (i == 2) {
            return "in " + this.f15546b;
        } else if (i == 3) {
            return "out " + this.f15546b;
        } else {
            throw new C11088q();
        }
    }
}
