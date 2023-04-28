package kotlin.text;

import com.facebook.react.uimanager.ViewProps;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import p306qi.C12193m;
import p326ri.C12704i;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u0011\b\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001b\u0010!J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0004J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fJ\"\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0012J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006#"}, m15073d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "input", "", "g", "a", "", "startIndex", "Lkotlin/text/MatchResult;", "b", "Lkotlin/sequences/Sequence;", "d", "f", "", "replacement", "h", "Lkotlin/Function1;", ViewProps.TRANSFORM, "i", "toString", "Ljava/util/regex/Pattern;", "j", "k", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "pattern", "(Ljava/lang/String;)V", "Lri/j;", "option", "(Ljava/lang/String;Lri/j;)V", "l", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class Regex implements Serializable {

    /* renamed from: l */
    public static final C9991a f22112l = new C9991a(null);

    /* renamed from: k */
    private final Pattern f22113k;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, m15073d2 = {"Lkotlin/text/Regex$a;", "", "", "flags", "b", "", "literal", "c", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.text.Regex$a */
    /* loaded from: classes8.dex */
    public static final class C9991a {
        private C9991a() {
        }

        public /* synthetic */ C9991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final int m14578b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        /* renamed from: c */
        public final String m14577c(String literal) {
            C9971q.m14633g(literal, "literal");
            String quote = Pattern.quote(literal);
            C9971q.m14634f(quote, "quote(literal)");
            return quote;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Lkotlin/text/MatchResult;", "a", "()Lkotlin/text/MatchResult;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.text.Regex$b */
    /* loaded from: classes8.dex */
    public static final class C9992b extends AbstractC9973s implements Function0<MatchResult> {

        /* renamed from: l */
        final /* synthetic */ CharSequence f22115l;

        /* renamed from: m */
        final /* synthetic */ int f22116m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9992b(CharSequence charSequence, int i) {
            super(0);
            this.f22115l = charSequence;
            this.f22116m = i;
        }

        /* renamed from: a */
        public final MatchResult invoke() {
            return Regex.this.m14588b(this.f22115l, this.f22116m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlin.text.Regex$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C9993c extends C9968n implements Function1<MatchResult, MatchResult> {

        /* renamed from: k */
        public static final C9993c f22117k = new C9993c();

        C9993c() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* renamed from: i */
        public final MatchResult invoke(MatchResult p0) {
            C9971q.m14633g(p0, "p0");
            return p0.next();
        }
    }

    public Regex(Pattern nativePattern) {
        C9971q.m14633g(nativePattern, "nativePattern");
        this.f22113k = nativePattern;
    }

    /* renamed from: c */
    public static /* synthetic */ MatchResult m14587c(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.m14588b(charSequence, i);
    }

    /* renamed from: e */
    public static /* synthetic */ Sequence m14585e(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.m14586d(charSequence, i);
    }

    /* renamed from: a */
    public final boolean m14589a(CharSequence input) {
        C9971q.m14633g(input, "input");
        return this.f22113k.matcher(input).find();
    }

    /* renamed from: b */
    public final MatchResult m14588b(CharSequence input, int i) {
        MatchResult e;
        C9971q.m14633g(input, "input");
        Matcher matcher = this.f22113k.matcher(input);
        C9971q.m14634f(matcher, "nativePattern.matcher(input)");
        e = C12704i.m5825e(matcher, i, input);
        return e;
    }

    /* renamed from: d */
    public final Sequence<MatchResult> m14586d(CharSequence input, int i) {
        Sequence<MatchResult> j;
        C9971q.m14633g(input, "input");
        if (i < 0 || i > input.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + input.length());
        }
        j = C12193m.m7443j(new C9992b(input, i), C9993c.f22117k);
        return j;
    }

    /* renamed from: f */
    public final MatchResult m14584f(CharSequence input) {
        MatchResult f;
        C9971q.m14633g(input, "input");
        Matcher matcher = this.f22113k.matcher(input);
        C9971q.m14634f(matcher, "nativePattern.matcher(input)");
        f = C12704i.m5824f(matcher, input);
        return f;
    }

    /* renamed from: g */
    public final boolean m14583g(CharSequence input) {
        C9971q.m14633g(input, "input");
        return this.f22113k.matcher(input).matches();
    }

    /* renamed from: h */
    public final String m14582h(CharSequence input, String replacement) {
        C9971q.m14633g(input, "input");
        C9971q.m14633g(replacement, "replacement");
        String replaceAll = this.f22113k.matcher(input).replaceAll(replacement);
        C9971q.m14634f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: i */
    public final String m14581i(CharSequence input, Function1<? super MatchResult, ? extends CharSequence> transform) {
        C9971q.m14633g(input, "input");
        C9971q.m14633g(transform, "transform");
        int i = 0;
        MatchResult c = m14587c(this, input, 0, 2, null);
        if (c == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, i, c.mo5840c().m14607p().intValue());
            sb2.append((CharSequence) transform.invoke(c));
            i = c.mo5840c().m14608j().intValue() + 1;
            c = c.next();
            if (i >= length) {
                break;
            }
        } while (c != null);
        if (i < length) {
            sb2.append(input, i, length);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "sb.toString()");
        return sb3;
    }

    /* renamed from: j */
    public final Pattern m14580j() {
        return this.f22113k;
    }

    public String toString() {
        String pattern = this.f22113k.toString();
        C9971q.m14634f(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C9971q.m14634f(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2, p326ri.EnumC12705j r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.f22112l
            int r3 = r3.m5820b()
            int r3 = kotlin.text.Regex.C9991a.m14579a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.C9971q.m14634f(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, ri.j):void");
    }
}
