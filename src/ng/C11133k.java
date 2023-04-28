package ng;

import gh.C7651y;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9911o;
import kotlin.collections.C9922x;
import kotlin.jvm.internal.C9971q;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11138d;
import p407wh.EnumC13886e;

/* renamed from: ng.k */
/* loaded from: classes8.dex */
public final class C11133k {

    /* renamed from: a */
    public static final C11133k f24701a;

    /* renamed from: b */
    private static final Set<String> f24702b;

    /* renamed from: c */
    private static final Set<String> f24703c;

    /* renamed from: d */
    private static final Set<String> f24704d;

    /* renamed from: e */
    private static final Set<String> f24705e;

    /* renamed from: f */
    private static final Set<String> f24706f;

    /* renamed from: g */
    private static final Set<String> f24707g;

    static {
        Set<String> m;
        Set l;
        Set l2;
        Set l3;
        Set l4;
        Set l5;
        Set<String> l6;
        Set l7;
        Set l8;
        Set l9;
        Set l10;
        Set l11;
        Set<String> l12;
        Set l13;
        Set<String> l14;
        Set l15;
        Set<String> l16;
        C11133k kVar = new C11133k();
        f24701a = kVar;
        C7651y yVar = C7651y.f16655a;
        m = C9922x.m14713m(yVar.m21792f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f24702b = m;
        l = C9922x.m14714l(kVar.m10827b(), yVar.m21792f("List", "sort(Ljava/util/Comparator;)V"));
        l2 = C9922x.m14714l(l, yVar.m21793e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        l3 = C9922x.m14714l(l2, yVar.m21793e("Double", "isInfinite()Z", "isNaN()Z"));
        l4 = C9922x.m14714l(l3, yVar.m21793e("Float", "isInfinite()Z", "isNaN()Z"));
        l5 = C9922x.m14714l(l4, yVar.m21793e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        l6 = C9922x.m14714l(l5, yVar.m21793e("CharSequence", "isEmpty()Z"));
        f24703c = l6;
        l7 = C9922x.m14714l(yVar.m21793e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), yVar.m21792f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V"));
        l8 = C9922x.m14714l(l7, yVar.m21793e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"));
        l9 = C9922x.m14714l(l8, yVar.m21793e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        l10 = C9922x.m14714l(l9, yVar.m21792f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"));
        l11 = C9922x.m14714l(l10, yVar.m21792f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V"));
        l12 = C9922x.m14714l(l11, yVar.m21792f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f24704d = l12;
        l13 = C9922x.m14714l(yVar.m21792f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), yVar.m21792f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"));
        l14 = C9922x.m14714l(l13, yVar.m21792f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        f24705e = l14;
        Set<String> a = kVar.m10828a();
        String[] b = yVar.m21796b("D");
        l15 = C9922x.m14714l(a, yVar.m21793e("Float", (String[]) Arrays.copyOf(b, b.length)));
        String[] b2 = yVar.m21796b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        l16 = C9922x.m14714l(l15, yVar.m21793e("String", (String[]) Arrays.copyOf(b2, b2.length)));
        f24706f = l16;
        String[] b3 = yVar.m21796b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f24707g = yVar.m21793e("Throwable", (String[]) Arrays.copyOf(b3, b3.length));
    }

    private C11133k() {
    }

    /* renamed from: a */
    private final Set<String> m10828a() {
        List<EnumC13886e> l;
        C7651y yVar = C7651y.f16655a;
        EnumC13886e eVar = EnumC13886e.BYTE;
        l = C9906j.m14817l(EnumC13886e.BOOLEAN, eVar, EnumC13886e.DOUBLE, EnumC13886e.FLOAT, eVar, EnumC13886e.INT, EnumC13886e.LONG, EnumC13886e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC13886e eVar2 : l) {
            String b = eVar2.m2389g().m10798g().m10771b();
            C9971q.m14634f(b, "it.wrapperFqName.shortName().asString()");
            String[] b2 = yVar.m21796b("Ljava/lang/String;");
            C9911o.m14801y(linkedHashSet, yVar.m21793e(b, (String[]) Arrays.copyOf(b2, b2.length)));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    private final Set<String> m10827b() {
        List<EnumC13886e> l;
        C7651y yVar = C7651y.f16655a;
        l = C9906j.m14817l(EnumC13886e.BOOLEAN, EnumC13886e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC13886e eVar : l) {
            String b = eVar.m2389g().m10798g().m10771b();
            C9971q.m14634f(b, "it.wrapperFqName.shortName().asString()");
            C9911o.m14801y(linkedHashSet, yVar.m21793e(b, eVar.m2391e() + "Value()" + eVar.m2392d()));
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public final Set<String> m10826c() {
        return f24702b;
    }

    /* renamed from: d */
    public final Set<String> m10825d() {
        return f24706f;
    }

    /* renamed from: e */
    public final Set<String> m10824e() {
        return f24703c;
    }

    /* renamed from: f */
    public final Set<String> m10823f() {
        return f24705e;
    }

    /* renamed from: g */
    public final Set<String> m10822g() {
        return f24707g;
    }

    /* renamed from: h */
    public final Set<String> m10821h() {
        return f24704d;
    }

    /* renamed from: i */
    public final boolean m10820i(C11138d fqName) {
        C9971q.m14633g(fqName, "fqName");
        if (C9971q.m14638b(fqName, C10434k.C10435a.f22916i) || C10434k.m13329e(fqName)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m10819j(C11138d fqName) {
        C9971q.m14633g(fqName, "fqName");
        if (m10820i(fqName)) {
            return true;
        }
        C11136b n = C11105c.f24626a.m10896n(fqName);
        if (n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n.m10816b().m10803b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
