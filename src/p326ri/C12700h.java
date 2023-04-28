package p326ri;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import p267of.AbstractC11263a;
import p267of.AbstractC11267c;
import p306qi.C12200o;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001f¨\u0006#"}, m15073d2 = {"Lri/h;", "Lkotlin/text/MatchResult;", "next", "Ljava/util/regex/Matcher;", "a", "Ljava/util/regex/Matcher;", "matcher", "", "b", "Ljava/lang/CharSequence;", "input", "Lri/g;", "c", "Lri/g;", "d", "()Lri/g;", "groups", "", "", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ri.h */
/* loaded from: classes8.dex */
public final class C12700h implements MatchResult {

    /* renamed from: a */
    private final Matcher f28556a;

    /* renamed from: b */
    private final CharSequence f28557b;

    /* renamed from: c */
    private final AbstractC12699g f28558c = new C12702b();

    /* renamed from: d */
    private List<String> f28559d;

    @Metadata(m15074d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m15073d2 = {"ri/h$a", "Lof/c;", "", "", "index", "f", "a", "()I", "size", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ri.h$a */
    /* loaded from: classes8.dex */
    public static final class C12701a extends AbstractC11267c<String> {
        C12701a() {
        }

        @Override // p267of.AbstractC11263a
        /* renamed from: a */
        public int mo5832a() {
            return C12700h.this.m5837f().groupCount() + 1;
        }

        /* renamed from: b */
        public /* bridge */ boolean m5836b(String str) {
            return super.contains(str);
        }

        @Override // p267of.AbstractC11263a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m5836b((String) obj);
        }

        /* renamed from: f */
        public String get(int i) {
            String group = C12700h.this.m5837f().group(i);
            return group == null ? "" : group;
        }

        /* renamed from: g */
        public /* bridge */ int m5834g(String str) {
            return super.indexOf(str);
        }

        /* renamed from: i */
        public /* bridge */ int m5833i(String str) {
            return super.lastIndexOf(str);
        }

        @Override // p267of.AbstractC11267c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m5834g((String) obj);
        }

        @Override // p267of.AbstractC11267c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m5833i((String) obj);
        }
    }

    @Metadata(m15074d1 = {"\u0000%\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H\u0096\u0002J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0096\u0002R\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m15073d2 = {"ri/h$b", "", "Lof/a;", "Lri/f;", "", "isEmpty", "", "iterator", "", "index", "get", "a", "()I", "size", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ri.h$b */
    /* loaded from: classes8.dex */
    public static final class C12702b extends AbstractC11263a<C12698f> implements AbstractC12699g {

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "it", "Lri/f;", "a", "(I)Lri/f;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: ri.h$b$a */
        /* loaded from: classes8.dex */
        static final class C12703a extends AbstractC9973s implements Function1<Integer, C12698f> {
            C12703a() {
                super(1);
            }

            /* renamed from: a */
            public final C12698f m5830a(int i) {
                return C12702b.this.get(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C12698f invoke(Integer num) {
                return m5830a(num.intValue());
            }
        }

        C12702b() {
        }

        @Override // p267of.AbstractC11263a
        /* renamed from: a */
        public int mo5832a() {
            return C12700h.this.m5837f().groupCount() + 1;
        }

        /* renamed from: b */
        public /* bridge */ boolean m5831b(C12698f fVar) {
            return super.contains(fVar);
        }

        @Override // p267of.AbstractC11263a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof C12698f)) {
                return false;
            }
            return m5831b((C12698f) obj);
        }

        @Override // p326ri.AbstractC12699g
        public C12698f get(int i) {
            IntRange h;
            h = C12704i.m5822h(C12700h.this.m5837f(), i);
            if (h.m14607p().intValue() < 0) {
                return null;
            }
            String group = C12700h.this.m5837f().group(i);
            C9971q.m14634f(group, "matchResult.group(index)");
            return new C12698f(group, h);
        }

        @Override // p267of.AbstractC11263a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<C12698f> iterator() {
            IntRange j;
            Sequence K;
            Sequence y;
            j = C9906j.m14819j(this);
            K = C9914r.m14782K(j);
            y = C12200o.m7420y(K, new C12703a());
            return y.iterator();
        }
    }

    public C12700h(Matcher matcher, CharSequence input) {
        C9971q.m14633g(matcher, "matcher");
        C9971q.m14633g(input, "input");
        this.f28556a = matcher;
        this.f28557b = input;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final java.util.regex.MatchResult m5837f() {
        return this.f28556a;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: a */
    public MatchResult.C9990b mo5842a() {
        return MatchResult.C9989a.m14591a(this);
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: b */
    public List<String> mo5841b() {
        if (this.f28559d == null) {
            this.f28559d = new C12701a();
        }
        List<String> list = this.f28559d;
        C9971q.m14636d(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: c */
    public IntRange mo5840c() {
        IntRange g;
        g = C12704i.m5823g(m5837f());
        return g;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: d */
    public AbstractC12699g mo5839d() {
        return this.f28558c;
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String group = m5837f().group();
        C9971q.m14634f(group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int i;
        MatchResult e;
        int end = m5837f().end();
        if (m5837f().end() == m5837f().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f28557b.length()) {
            return null;
        }
        Matcher matcher = this.f28556a.pattern().matcher(this.f28557b);
        C9971q.m14634f(matcher, "matcher.pattern().matcher(input)");
        e = C12704i.m5825e(matcher, i2, this.f28557b);
        return e;
    }
}
