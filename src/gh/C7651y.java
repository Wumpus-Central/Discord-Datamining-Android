package gh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* renamed from: gh.y */
/* loaded from: classes8.dex */
public final class C7651y {

    /* renamed from: a */
    public static final C7651y f16655a = new C7651y();

    /* renamed from: gh.y$a */
    /* loaded from: classes8.dex */
    static final class C7652a extends AbstractC9973s implements Function1<String, CharSequence> {

        /* renamed from: k */
        public static final C7652a f16656k = new C7652a();

        C7652a() {
            super(1);
        }

        public final CharSequence invoke(String it) {
            C9971q.m14633g(it, "it");
            return C7651y.f16655a.m21795c(it);
        }
    }

    private C7651y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final String m21795c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* renamed from: b */
    public final String[] m21796b(String... signatures) {
        C9971q.m14633g(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: d */
    public final Set<String> m21794d(String internalName, String... signatures) {
        C9971q.m14633g(internalName, "internalName");
        C9971q.m14633g(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Set<String> m21793e(String name, String... signatures) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signatures, "signatures");
        return m21794d(m21790h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    /* renamed from: f */
    public final Set<String> m21792f(String name, String... signatures) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(signatures, "signatures");
        return m21794d(m21789i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    /* renamed from: g */
    public final String m21791g(String name) {
        C9971q.m14633g(name, "name");
        return "java/util/function/" + name;
    }

    /* renamed from: h */
    public final String m21790h(String name) {
        C9971q.m14633g(name, "name");
        return "java/lang/" + name;
    }

    /* renamed from: i */
    public final String m21789i(String name) {
        C9971q.m14633g(name, "name");
        return "java/util/" + name;
    }

    /* renamed from: j */
    public final String m21788j(String name, List<String> parameters, String ret) {
        String e0;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(parameters, "parameters");
        C9971q.m14633g(ret, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('(');
        e0 = C9914r.m14760e0(parameters, "", null, null, 0, null, C7652a.f16656k, 30, null);
        sb2.append(e0);
        sb2.append(')');
        sb2.append(m21795c(ret));
        return sb2.toString();
    }

    /* renamed from: k */
    public final String m21787k(String internalName, String jvmDescriptor) {
        C9971q.m14633g(internalName, "internalName");
        C9971q.m14633g(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
