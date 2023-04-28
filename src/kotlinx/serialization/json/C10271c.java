package kotlinx.serialization.json;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\bR \u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\bR \u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\r\u0010\u001aR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\"\u0010\bR\"\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010\u0016\u001a\u0004\b\u001d\u0010(¨\u0006,"}, m15073d2 = {"Lkotlinx/serialization/json/c;", "", "", "toString", "", "a", "Z", "e", "()Z", "encodeDefaults", "b", "g", "ignoreUnknownKeys", "c", "m", "isLenient", "d", "allowStructuredMapKeys", "i", "prettyPrint", "f", "getExplicitNulls$annotations", "()V", "explicitNulls", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "getPrettyPrintIndent$annotations", "prettyPrintIndent", "h", "coerceInputValues", "l", "useArrayPolymorphism", "classDiscriminator", "k", "allowSpecialFloatingPointValues", "useAlternativeNames", "Lkotlinx/serialization/json/p;", "namingStrategy", "Lkotlinx/serialization/json/p;", "()Lkotlinx/serialization/json/p;", "getNamingStrategy$annotations", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLkotlinx/serialization/json/p;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.c */
/* loaded from: classes8.dex */
public final class C10271c {

    /* renamed from: a */
    private final boolean f22571a;

    /* renamed from: b */
    private final boolean f22572b;

    /* renamed from: c */
    private final boolean f22573c;

    /* renamed from: d */
    private final boolean f22574d;

    /* renamed from: e */
    private final boolean f22575e;

    /* renamed from: f */
    private final boolean f22576f;

    /* renamed from: g */
    private final String f22577g;

    /* renamed from: h */
    private final boolean f22578h;

    /* renamed from: i */
    private final boolean f22579i;

    /* renamed from: j */
    private final String f22580j;

    /* renamed from: k */
    private final boolean f22581k;

    /* renamed from: l */
    private final boolean f22582l;

    public C10271c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String prettyPrintIndent, boolean z7, boolean z8, String classDiscriminator, boolean z9, boolean z10, AbstractC10290p pVar) {
        C9971q.m14633g(prettyPrintIndent, "prettyPrintIndent");
        C9971q.m14633g(classDiscriminator, "classDiscriminator");
        this.f22571a = z;
        this.f22572b = z2;
        this.f22573c = z3;
        this.f22574d = z4;
        this.f22575e = z5;
        this.f22576f = z6;
        this.f22577g = prettyPrintIndent;
        this.f22578h = z7;
        this.f22579i = z8;
        this.f22580j = classDiscriminator;
        this.f22581k = z9;
        this.f22582l = z10;
    }

    /* renamed from: a */
    public final boolean m13743a() {
        return this.f22581k;
    }

    /* renamed from: b */
    public final boolean m13742b() {
        return this.f22574d;
    }

    /* renamed from: c */
    public final String m13741c() {
        return this.f22580j;
    }

    /* renamed from: d */
    public final boolean m13740d() {
        return this.f22578h;
    }

    /* renamed from: e */
    public final boolean m13739e() {
        return this.f22571a;
    }

    /* renamed from: f */
    public final boolean m13738f() {
        return this.f22576f;
    }

    /* renamed from: g */
    public final boolean m13737g() {
        return this.f22572b;
    }

    /* renamed from: h */
    public final AbstractC10290p m13736h() {
        return null;
    }

    /* renamed from: i */
    public final boolean m13735i() {
        return this.f22575e;
    }

    /* renamed from: j */
    public final String m13734j() {
        return this.f22577g;
    }

    /* renamed from: k */
    public final boolean m13733k() {
        return this.f22582l;
    }

    /* renamed from: l */
    public final boolean m13732l() {
        return this.f22579i;
    }

    /* renamed from: m */
    public final boolean m13731m() {
        return this.f22573c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f22571a + ", ignoreUnknownKeys=" + this.f22572b + ", isLenient=" + this.f22573c + ", allowStructuredMapKeys=" + this.f22574d + ", prettyPrint=" + this.f22575e + ", explicitNulls=" + this.f22576f + ", prettyPrintIndent='" + this.f22577g + "', coerceInputValues=" + this.f22578h + ", useArrayPolymorphism=" + this.f22579i + ", classDiscriminator='" + this.f22580j + "', allowSpecialFloatingPointValues=" + this.f22581k + ", useAlternativeNames=" + this.f22582l + ", namingStrategy=" + ((Object) null) + ')';
    }

    public /* synthetic */ C10271c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, AbstractC10290p pVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & Spliterator.NONNULL) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & Spliterator.IMMUTABLE) == 0 ? z9 : false, (i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0 ? z10 : true, (i & 4096) != 0 ? null : pVar);
    }
}
