package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import p326ri.AbstractC12699g;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m15073d2 = {"Lkotlin/text/MatchResult;", "", "next", "Lkotlin/ranges/IntRange;", "c", "()Lkotlin/ranges/IntRange;", "range", "", "getValue", "()Ljava/lang/String;", "value", "Lri/g;", "d", "()Lri/g;", "groups", "", "b", "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchResult$b;", "a", "()Lkotlin/text/MatchResult$b;", "destructured", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public interface MatchResult {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlin.text.MatchResult$a */
    /* loaded from: classes8.dex */
    public static final class C9989a {
        /* renamed from: a */
        public static C9990b m14591a(MatchResult matchResult) {
            return new C9990b(matchResult);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m15073d2 = {"Lkotlin/text/MatchResult$b;", "", "Lkotlin/text/MatchResult;", "a", "Lkotlin/text/MatchResult;", "()Lkotlin/text/MatchResult;", "match", "<init>", "(Lkotlin/text/MatchResult;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.text.MatchResult$b */
    /* loaded from: classes8.dex */
    public static final class C9990b {

        /* renamed from: a */
        private final MatchResult f22111a;

        public C9990b(MatchResult match) {
            C9971q.m14633g(match, "match");
            this.f22111a = match;
        }

        /* renamed from: a */
        public final MatchResult m14590a() {
            return this.f22111a;
        }
    }

    /* renamed from: a */
    C9990b mo5842a();

    /* renamed from: b */
    List<String> mo5841b();

    /* renamed from: c */
    IntRange mo5840c();

    /* renamed from: d */
    AbstractC12699g mo5839d();

    String getValue();

    MatchResult next();
}
