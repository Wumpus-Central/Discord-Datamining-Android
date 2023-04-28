package p326ri;

import eg.C6884j;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¨\u0006\r"}, m15073d2 = {"Ljava/util/regex/Matcher;", "", "from", "", "input", "Lkotlin/text/MatchResult;", "e", "f", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "g", "groupIndex", "h", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ri.i */
/* loaded from: classes8.dex */
public final class C12704i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final MatchResult m5825e(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C12700h(matcher, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final MatchResult m5824f(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C12700h(matcher, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final IntRange m5823g(java.util.regex.MatchResult matchResult) {
        IntRange q;
        q = C6884j.m23947q(matchResult.start(), matchResult.end());
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final IntRange m5822h(java.util.regex.MatchResult matchResult, int i) {
        IntRange q;
        q = C6884j.m23947q(matchResult.start(i), matchResult.end(i));
        return q;
    }
}
