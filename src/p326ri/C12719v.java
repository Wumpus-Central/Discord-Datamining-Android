package p326ri;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import eg.C6884j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9897e;
import kotlin.collections.C9899f;
import kotlin.collections.C9905i;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.C9986a;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import nf.C11098x;
import p267of.AbstractC11283p;
import p306qi.C12200o;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000`\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\"\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0000\u001a\u0012\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000\u001a\u0012\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0000\u001a\u001a\u0010\u001d\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000\u001a\u0012\u0010\u001e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0000\u001a4\u0010$\u001a\u00020\"*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0000\u001a\u001c\u0010&\u001a\u00020\"*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001c\u0010'\u001a\u00020\"*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001c\u0010(\u001a\u00020\"*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001c\u0010)\u001a\u00020\"*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u0010,\u001a\u00020\u0002*\u00020\u00002\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u0010-\u001a\u00020\u0002*\u00020\u00002\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a=\u0010/\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\b/\u00100\u001aG\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u000103*\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\b4\u00105\u001a&\u00106\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u00108\u001a\u00020\u0002*\u00020\u00002\u0006\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u00109\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u0010:\u001a\u00020\u0002*\u00020\u00002\u0006\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001f\u0010;\u001a\u00020\"*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\"H\u0086\u0002\u001a\u001f\u0010<\u001a\u00020\"*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"H\u0086\u0002\u001a?\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0?*\u00020\u00002\u0006\u0010=\u001a\u00020*2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\b@\u0010A\u001aG\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0?*\u00020\u00002\u000e\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070B2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010D\u001a\u0010\u0010F\u001a\u00020E2\u0006\u0010>\u001a\u00020\u0002H\u0000\u001a?\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070?*\u00020\u00002\u0012\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070B\"\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002¢\u0006\u0004\bG\u0010H\u001a?\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00002\u0012\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070B\"\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010K\u001a0\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00002\n\u0010=\u001a\u00020*\"\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002\u001a1\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\bM\u0010N\u001a\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070?*\u00020\u0000\u001a\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u0000\"\u0015\u0010S\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u0015\u0010V\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, m15073d2 = {"", "V0", "", "length", "", "padChar", "i0", "", "j0", "Lkotlin/ranges/IntRange;", "range", "G0", "delimiter", "missingDelimiterValue", "N0", "O0", "H0", "I0", "R0", "S0", "L0", "startIndex", "endIndex", "replacement", "t0", "prefix", "p0", "suffix", "q0", "s0", "r0", "thisOffset", "other", "otherOffset", "", "ignoreCase", "o0", "char", "C0", "N", "D0", "O", "", "chars", "a0", "f0", "last", "W", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "R", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "U", "string", "V", "b0", "c0", "K", "J", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "k0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "l0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "u0", "A0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "", "w0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "v0", "x0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "g0", "h0", "S", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "T", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/text/StringsKt")
/* renamed from: ri.v */
/* loaded from: classes8.dex */
public class C12719v extends C12718u {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ri.v$a */
    /* loaded from: classes8.dex */
    public static final class C12720a extends AbstractC9973s implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: k */
        final /* synthetic */ char[] f28577k;

        /* renamed from: l */
        final /* synthetic */ boolean f28578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12720a(char[] cArr, boolean z) {
            super(2);
            this.f28577k = cArr;
            this.f28578l = z;
        }

        /* renamed from: a */
        public final Pair<Integer, Integer> m5659a(CharSequence $receiver, int i) {
            C9971q.m14633g($receiver, "$this$$receiver");
            int a0 = C12719v.m5685a0($receiver, this.f28577k, i, this.f28578l);
            if (a0 < 0) {
                return null;
            }
            return C11098x.m10921a(Integer.valueOf(a0), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m5659a(charSequence, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ri.v$b */
    /* loaded from: classes8.dex */
    public static final class C12721b extends AbstractC9973s implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: k */
        final /* synthetic */ List<String> f28579k;

        /* renamed from: l */
        final /* synthetic */ boolean f28580l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12721b(List<String> list, boolean z) {
            super(2);
            this.f28579k = list;
            this.f28580l = z;
        }

        /* renamed from: a */
        public final Pair<Integer, Integer> m5658a(CharSequence $receiver, int i) {
            C9971q.m14633g($receiver, "$this$$receiver");
            Pair R = C12719v.m5699R($receiver, this.f28579k, i, this.f28580l, false);
            if (R != null) {
                return C11098x.m10921a(R.m15065c(), Integer.valueOf(((String) R.m15064d()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m5658a(charSequence, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Lkotlin/ranges/IntRange;", "it", "", "a", "(Lkotlin/ranges/IntRange;)Ljava/lang/String;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ri.v$c */
    /* loaded from: classes8.dex */
    public static final class C12722c extends AbstractC9973s implements Function1<IntRange, String> {

        /* renamed from: k */
        final /* synthetic */ CharSequence f28581k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12722c(CharSequence charSequence) {
            super(1);
            this.f28581k = charSequence;
        }

        /* renamed from: a */
        public final String invoke(IntRange it) {
            C9971q.m14633g(it, "it");
            return C12719v.m5719G0(this.f28581k, it);
        }
    }

    /* renamed from: A0 */
    public static final Sequence<String> m5725A0(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        Sequence<String> y;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(delimiters, "delimiters");
        y = C12200o.m7420y(m5672n0(charSequence, delimiters, 0, z, i, 2, null), new C12722c(charSequence));
        return y;
    }

    /* renamed from: B0 */
    public static /* synthetic */ Sequence m5724B0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m5725A0(charSequence, strArr, z, i);
    }

    /* renamed from: C0 */
    public static final boolean m5723C0(CharSequence charSequence, char c, boolean z) {
        C9971q.m14633g(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C12692c.m5866d(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: D0 */
    public static final boolean m5722D0(CharSequence charSequence, CharSequence prefix, boolean z) {
        boolean H;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(prefix, "prefix");
        if (z || !(charSequence instanceof String) || !(prefix instanceof String)) {
            return m5671o0(charSequence, 0, prefix, 0, prefix.length(), z);
        }
        H = C12718u.m5736H((String) charSequence, (String) prefix, false, 2, null);
        return H;
    }

    /* renamed from: E0 */
    public static /* synthetic */ boolean m5721E0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5723C0(charSequence, c, z);
    }

    /* renamed from: F0 */
    public static /* synthetic */ boolean m5720F0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5722D0(charSequence, charSequence2, z);
    }

    /* renamed from: G0 */
    public static final String m5719G0(CharSequence charSequence, IntRange range) {
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(range, "range");
        return charSequence.subSequence(range.m14607p().intValue(), range.m14608j().intValue() + 1).toString();
    }

    /* renamed from: H0 */
    public static final String m5718H0(String str, char c, String missingDelimiterValue) {
        int Y;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(missingDelimiterValue, "missingDelimiterValue");
        Y = m5687Y(str, c, 0, false, 6, null);
        if (Y == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(Y + 1, str.length());
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: I0 */
    public static String m5716I0(String str, String delimiter, String missingDelimiterValue) {
        int Z;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(delimiter, "delimiter");
        C9971q.m14633g(missingDelimiterValue, "missingDelimiterValue");
        Z = m5686Z(str, delimiter, 0, false, 6, null);
        if (Z == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(Z + delimiter.length(), str.length());
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: J */
    public static final boolean m5715J(CharSequence charSequence, char c, boolean z) {
        int Y;
        C9971q.m14633g(charSequence, "<this>");
        Y = m5687Y(charSequence, c, 0, z, 2, null);
        if (Y >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J0 */
    public static /* synthetic */ String m5714J0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m5718H0(str, c, str2);
    }

    /* renamed from: K */
    public static final boolean m5713K(CharSequence charSequence, CharSequence other, boolean z) {
        int Z;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(other, "other");
        if (other instanceof String) {
            Z = m5686Z(charSequence, (String) other, 0, z, 2, null);
            if (Z >= 0) {
                return true;
            }
        } else if (m5688X(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public static /* synthetic */ String m5712K0(String str, String str2, String str3, int i, Object obj) {
        String I0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        I0 = m5716I0(str, str2, str3);
        return I0;
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m5711L(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5715J(charSequence, c, z);
    }

    /* renamed from: L0 */
    public static String m5710L0(String str, char c, String missingDelimiterValue) {
        int d0;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(missingDelimiterValue, "missingDelimiterValue");
        d0 = m5682d0(str, c, 0, false, 6, null);
        if (d0 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(d0 + 1, str.length());
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m5709M(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5713K(charSequence, charSequence2, z);
    }

    /* renamed from: M0 */
    public static /* synthetic */ String m5708M0(String str, char c, String str2, int i, Object obj) {
        String L0;
        if ((i & 2) != 0) {
            str2 = str;
        }
        L0 = m5710L0(str, c, str2);
        return L0;
    }

    /* renamed from: N */
    public static final boolean m5707N(CharSequence charSequence, char c, boolean z) {
        int T;
        C9971q.m14633g(charSequence, "<this>");
        if (charSequence.length() > 0) {
            T = m5695T(charSequence);
            if (C12692c.m5866d(charSequence.charAt(T), c, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N0 */
    public static final String m5706N0(String str, char c, String missingDelimiterValue) {
        int Y;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(missingDelimiterValue, "missingDelimiterValue");
        Y = m5687Y(str, c, 0, false, 6, null);
        if (Y == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, Y);
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: O */
    public static final boolean m5705O(CharSequence charSequence, CharSequence suffix, boolean z) {
        boolean s;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(suffix, "suffix");
        if (z || !(charSequence instanceof String) || !(suffix instanceof String)) {
            return m5671o0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z);
        }
        s = C12718u.m5733s((String) charSequence, (String) suffix, false, 2, null);
        return s;
    }

    /* renamed from: O0 */
    public static final String m5704O0(String str, String delimiter, String missingDelimiterValue) {
        int Z;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(delimiter, "delimiter");
        C9971q.m14633g(missingDelimiterValue, "missingDelimiterValue");
        Z = m5686Z(str, delimiter, 0, false, 6, null);
        if (Z == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, Z);
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: P */
    public static /* synthetic */ boolean m5703P(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5707N(charSequence, c, z);
    }

    /* renamed from: P0 */
    public static /* synthetic */ String m5702P0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m5706N0(str, c, str2);
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m5701Q(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5705O(charSequence, charSequence2, z);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ String m5700Q0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m5704O0(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final Pair<Integer, String> m5699R(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        C9986a aVar;
        Object obj;
        Object obj2;
        boolean x;
        int T;
        int g;
        int c;
        Object q0;
        int i2;
        if (z || collection.size() != 1) {
            if (!z2) {
                c = C6884j.m23961c(i, 0);
                aVar = new IntRange(c, charSequence.length());
            } else {
                T = m5695T(charSequence);
                g = C6884j.m23957g(i, T);
                aVar = C6884j.m23952l(g, 0);
            }
            if (charSequence instanceof String) {
                int a = aVar.m14605a();
                int b = aVar.m14604b();
                int f = aVar.m14603f();
                if ((f > 0 && a <= b) || (f < 0 && b <= a)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            x = C12718u.m5728x(str, 0, (String) charSequence, a, str.length(), z);
                            if (x) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (a == b) {
                                break;
                            }
                            a += f;
                        } else {
                            return C11098x.m10921a(Integer.valueOf(a), str2);
                        }
                    }
                }
            } else {
                int a2 = aVar.m14605a();
                int b2 = aVar.m14604b();
                int f2 = aVar.m14603f();
                if ((f2 > 0 && a2 <= b2) || (f2 < 0 && b2 <= a2)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (m5671o0(str3, 0, charSequence, a2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (a2 == b2) {
                                break;
                            }
                            a2 += f2;
                        } else {
                            return C11098x.m10921a(Integer.valueOf(a2), str4);
                        }
                    }
                }
            }
            return null;
        }
        q0 = C9914r.m14748q0(collection);
        String str5 = (String) q0;
        if (!z2) {
            i2 = m5686Z(charSequence, str5, i, false, 4, null);
        } else {
            i2 = m5681e0(charSequence, str5, i, false, 4, null);
        }
        if (i2 < 0) {
            return null;
        }
        return C11098x.m10921a(Integer.valueOf(i2), str5);
    }

    /* renamed from: R0 */
    public static final String m5698R0(String str, char c, String missingDelimiterValue) {
        int d0;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(missingDelimiterValue, "missingDelimiterValue");
        d0 = m5682d0(str, c, 0, false, 6, null);
        if (d0 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, d0);
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: S */
    public static IntRange m5697S(CharSequence charSequence) {
        C9971q.m14633g(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    /* renamed from: S0 */
    public static String m5696S0(String str, String delimiter, String missingDelimiterValue) {
        int e0;
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(delimiter, "delimiter");
        C9971q.m14633g(missingDelimiterValue, "missingDelimiterValue");
        e0 = m5681e0(str, delimiter, 0, false, 6, null);
        if (e0 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, e0);
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: T */
    public static int m5695T(CharSequence charSequence) {
        C9971q.m14633g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: T0 */
    public static /* synthetic */ String m5694T0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m5698R0(str, c, str2);
    }

    /* renamed from: U */
    public static final int m5693U(CharSequence charSequence, char c, int i, boolean z) {
        C9971q.m14633g(charSequence, "<this>");
        if (z || !(charSequence instanceof String)) {
            return m5685a0(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    /* renamed from: U0 */
    public static /* synthetic */ String m5692U0(String str, String str2, String str3, int i, Object obj) {
        String S0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        S0 = m5696S0(str, str2, str3);
        return S0;
    }

    /* renamed from: V */
    public static final int m5691V(CharSequence charSequence, String string, int i, boolean z) {
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(string, "string");
        if (z || !(charSequence instanceof String)) {
            return m5688X(charSequence, string, i, charSequence.length(), z, false, 16, null);
        }
        return ((String) charSequence).indexOf(string, i);
    }

    /* renamed from: V0 */
    public static CharSequence m5690V0(CharSequence charSequence) {
        int i;
        boolean c;
        C9971q.m14633g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            c = C12690b.m5868c(charSequence.charAt(i));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* JADX WARN: Incorrect condition in loop: B:16:0x0052 */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int m5689W(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x0015
            kotlin.ranges.IntRange r11 = new kotlin.ranges.IntRange
            int r8 = eg.C6882h.m23978c(r8, r0)
            int r0 = r6.length()
            int r9 = eg.C6882h.m23974g(r9, r0)
            r11.<init>(r8, r9)
            goto L_0x0025
        L_0x0015:
            int r11 = p326ri.C12707l.m5800T(r6)
            int r8 = eg.C6882h.m23974g(r8, r11)
            int r9 = eg.C6882h.m23978c(r9, r0)
            kotlin.ranges.a r11 = eg.C6882h.m23969l(r8, r9)
        L_0x0025:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L_0x0059
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0059
            int r8 = r11.m14605a()
            int r9 = r11.m14604b()
            int r11 = r11.m14603f()
            if (r11 <= 0) goto L_0x003d
            if (r8 <= r9) goto L_0x0041
        L_0x003d:
            if (r11 >= 0) goto L_0x0081
            if (r9 > r8) goto L_0x0081
        L_0x0041:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r7.length()
            r3 = r8
            r5 = r10
            boolean r0 = p326ri.C12707l.m5766x(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0055
            return r8
        L_0x0055:
            if (r8 == r9) goto L_0x0081
            int r8 = r8 + r11
            goto L_0x0041
        L_0x0059:
            int r8 = r11.m14605a()
            int r9 = r11.m14604b()
            int r11 = r11.m14603f()
            if (r11 <= 0) goto L_0x0069
            if (r8 <= r9) goto L_0x006d
        L_0x0069:
            if (r11 >= 0) goto L_0x0081
            if (r9 > r8) goto L_0x0081
        L_0x006d:
            r1 = 0
            int r4 = r7.length()
            r0 = r7
            r2 = r6
            r3 = r8
            r5 = r10
            boolean r0 = m5671o0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x007d
            return r8
        L_0x007d:
            if (r8 == r9) goto L_0x0081
            int r8 = r8 + r11
            goto L_0x006d
        L_0x0081:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p326ri.C12719v.m5689W(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    /* renamed from: X */
    static /* synthetic */ int m5688X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m5689W(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: Y */
    public static /* synthetic */ int m5687Y(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5693U(charSequence, c, i, z);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m5686Z(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5691V(charSequence, str, i, z);
    }

    /* renamed from: a0 */
    public static final int m5685a0(CharSequence charSequence, char[] chars, int i, boolean z) {
        int c;
        int T;
        boolean z2;
        char g0;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(chars, "chars");
        if (z || chars.length != 1 || !(charSequence instanceof String)) {
            c = C6884j.m23961c(i, 0);
            T = m5695T(charSequence);
            AbstractC11283p g = new IntRange(c, T).iterator();
            while (g.hasNext()) {
                int nextInt = g.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = chars.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C12692c.m5866d(chars[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        g0 = C9899f.m14930g0(chars);
        return ((String) charSequence).indexOf(g0, i);
    }

    /* renamed from: b0 */
    public static final int m5684b0(CharSequence charSequence, char c, int i, boolean z) {
        C9971q.m14633g(charSequence, "<this>");
        if (z || !(charSequence instanceof String)) {
            return m5680f0(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    /* renamed from: c0 */
    public static final int m5683c0(CharSequence charSequence, String string, int i, boolean z) {
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(string, "string");
        if (z || !(charSequence instanceof String)) {
            return m5689W(charSequence, string, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(string, i);
    }

    /* renamed from: d0 */
    public static /* synthetic */ int m5682d0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m5695T(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5684b0(charSequence, c, i, z);
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m5681e0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m5695T(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5683c0(charSequence, str, i, z);
    }

    /* renamed from: f0 */
    public static final int m5680f0(CharSequence charSequence, char[] chars, int i, boolean z) {
        int T;
        int g;
        char g0;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(chars, "chars");
        if (z || chars.length != 1 || !(charSequence instanceof String)) {
            T = m5695T(charSequence);
            for (g = C6884j.m23957g(i, T); -1 < g; g--) {
                char charAt = charSequence.charAt(g);
                int length = chars.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C12692c.m5866d(chars[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return g;
                }
            }
            return -1;
        }
        g0 = C9899f.m14930g0(chars);
        return ((String) charSequence).lastIndexOf(g0, i);
    }

    /* renamed from: g0 */
    public static final Sequence<String> m5679g0(CharSequence charSequence) {
        C9971q.m14633g(charSequence, "<this>");
        return m5724B0(charSequence, new String[]{"\r\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r"}, false, 0, 6, null);
    }

    /* renamed from: h0 */
    public static final List<String> m5678h0(CharSequence charSequence) {
        List<String> E;
        C9971q.m14633g(charSequence, "<this>");
        E = C12200o.m7436E(m5679g0(charSequence));
        return E;
    }

    /* renamed from: i0 */
    public static final CharSequence m5677i0(CharSequence charSequence, int i, char c) {
        C9971q.m14633g(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            AbstractC11283p g = new IntRange(1, i - charSequence.length()).iterator();
            while (g.hasNext()) {
                g.nextInt();
                sb2.append(c);
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    /* renamed from: j0 */
    public static String m5676j0(String str, int i, char c) {
        C9971q.m14633g(str, "<this>");
        return m5677i0(str, i, c).toString();
    }

    /* renamed from: k0 */
    private static final Sequence<IntRange> m5675k0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m5665u0(i2);
        return new C12696e(charSequence, i, i2, new C12720a(cArr, z));
    }

    /* renamed from: l0 */
    private static final Sequence<IntRange> m5674l0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        List d;
        m5665u0(i2);
        d = C9897e.m14991d(strArr);
        return new C12696e(charSequence, i, i2, new C12721b(d, z));
    }

    /* renamed from: m0 */
    static /* synthetic */ Sequence m5673m0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m5675k0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: n0 */
    static /* synthetic */ Sequence m5672n0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m5674l0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: o0 */
    public static final boolean m5671o0(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C12692c.m5866d(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p0 */
    public static String m5670p0(String str, CharSequence prefix) {
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(prefix, "prefix");
        if (!m5720F0(str, prefix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: q0 */
    public static String m5669q0(String str, CharSequence suffix) {
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(suffix, "suffix");
        if (!m5701Q(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: r0 */
    public static String m5668r0(String str, CharSequence delimiter) {
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(delimiter, "delimiter");
        return m5667s0(str, delimiter, delimiter);
    }

    /* renamed from: s0 */
    public static final String m5667s0(String str, CharSequence prefix, CharSequence suffix) {
        C9971q.m14633g(str, "<this>");
        C9971q.m14633g(prefix, "prefix");
        C9971q.m14633g(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !m5720F0(str, prefix, false, 2, null) || !m5701Q(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length(), str.length() - suffix.length());
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: t0 */
    public static CharSequence m5666t0(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(replacement, "replacement");
        if (i2 >= i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i);
            C9971q.m14634f(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(replacement);
            sb2.append(charSequence, i2, charSequence.length());
            C9971q.m14634f(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: u0 */
    public static final void m5665u0(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: v0 */
    public static final List<String> m5664v0(CharSequence charSequence, char[] delimiters, boolean z, int i) {
        Iterable<IntRange> l;
        int t;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m5662x0(charSequence, String.valueOf(delimiters[0]), z, i);
        }
        l = C12200o.m7433l(m5673m0(charSequence, delimiters, 0, z, i, 2, null));
        t = C9907k.m14809t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        for (IntRange intRange : l) {
            arrayList.add(m5719G0(charSequence, intRange));
        }
        return arrayList;
    }

    /* renamed from: w0 */
    public static final List<String> m5663w0(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        Iterable<IntRange> l;
        int t;
        C9971q.m14633g(charSequence, "<this>");
        C9971q.m14633g(delimiters, "delimiters");
        boolean z2 = true;
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m5662x0(charSequence, str, z, i);
            }
        }
        l = C12200o.m7433l(m5672n0(charSequence, delimiters, 0, z, i, 2, null));
        t = C9907k.m14809t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        for (IntRange intRange : l) {
            arrayList.add(m5719G0(charSequence, intRange));
        }
        return arrayList;
    }

    /* renamed from: x0 */
    private static final List<String> m5662x0(CharSequence charSequence, String str, boolean z, int i) {
        List<String> d;
        boolean z2;
        m5665u0(i);
        int i2 = 0;
        int V = m5691V(charSequence, str, 0, z);
        if (V == -1 || i == 1) {
            d = C9905i.m14825d(charSequence.toString());
            return d;
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2) {
            i3 = C6884j.m23957g(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, V).toString());
            i2 = str.length() + V;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            V = m5691V(charSequence, str, i2, z);
        } while (V != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: y0 */
    public static /* synthetic */ List m5661y0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m5664v0(charSequence, cArr, z, i);
    }

    /* renamed from: z0 */
    public static /* synthetic */ List m5660z0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m5663w0(charSequence, strArr, z, i);
    }
}
