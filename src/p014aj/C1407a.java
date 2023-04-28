package p014aj;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b \u0010\u0014R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R \u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b#\u0010\u0014¨\u0006'"}, m15073d2 = {"Laj/a;", "", "", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "", "a", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "serialName", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "f", "elementNames", "", "d", "Ljava/util/Set;", "uniqueNames", "e", "elementDescriptors", "elementAnnotations", "g", "elementOptionality", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: aj.a */
/* loaded from: classes8.dex */
public final class C1407a {

    /* renamed from: a */
    private final String f451a;

    /* renamed from: b */
    private List<? extends Annotation> f452b;

    /* renamed from: c */
    private final List<String> f453c = new ArrayList();

    /* renamed from: d */
    private final Set<String> f454d = new HashSet();

    /* renamed from: e */
    private final List<SerialDescriptor> f455e = new ArrayList();

    /* renamed from: f */
    private final List<List<Annotation>> f456f = new ArrayList();

    /* renamed from: g */
    private final List<Boolean> f457g = new ArrayList();

    public C1407a(String serialName) {
        List<? extends Annotation> i;
        C9971q.m14633g(serialName, "serialName");
        this.f451a = serialName;
        i = C9906j.m14820i();
        this.f452b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ void m41145b(C1407a aVar, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C9906j.m14820i();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        aVar.m41146a(str, serialDescriptor, list, z);
    }

    /* renamed from: a */
    public final void m41146a(String elementName, SerialDescriptor descriptor, List<? extends Annotation> annotations, boolean z) {
        C9971q.m14633g(elementName, "elementName");
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(annotations, "annotations");
        if (this.f454d.add(elementName)) {
            this.f453c.add(elementName);
            this.f455e.add(descriptor);
            this.f456f.add(annotations);
            this.f457g.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f451a).toString());
    }

    /* renamed from: c */
    public final List<Annotation> m41144c() {
        return this.f452b;
    }

    /* renamed from: d */
    public final List<List<Annotation>> m41143d() {
        return this.f456f;
    }

    /* renamed from: e */
    public final List<SerialDescriptor> m41142e() {
        return this.f455e;
    }

    /* renamed from: f */
    public final List<String> m41141f() {
        return this.f453c;
    }

    /* renamed from: g */
    public final List<Boolean> m41140g() {
        return this.f457g;
    }

    /* renamed from: h */
    public final void m41139h(List<? extends Annotation> list) {
        C9971q.m14633g(list, "<set-?>");
        this.f452b = list;
    }
}
