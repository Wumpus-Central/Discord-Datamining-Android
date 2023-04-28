package bi;

import kh.AbstractC9869a;
import kh.AbstractC9874c;
import kotlin.jvm.internal.C9971q;
import p159ih.C8544c;
import p268og.AbstractC11299a1;

/* renamed from: bi.g */
/* loaded from: classes8.dex */
public final class C3577g {

    /* renamed from: a */
    private final AbstractC9874c f5805a;

    /* renamed from: b */
    private final C8544c f5806b;

    /* renamed from: c */
    private final AbstractC9869a f5807c;

    /* renamed from: d */
    private final AbstractC11299a1 f5808d;

    public C3577g(AbstractC9874c nameResolver, C8544c classProto, AbstractC9869a metadataVersion, AbstractC11299a1 sourceElement) {
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(classProto, "classProto");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        C9971q.m14633g(sourceElement, "sourceElement");
        this.f5805a = nameResolver;
        this.f5806b = classProto;
        this.f5807c = metadataVersion;
        this.f5808d = sourceElement;
    }

    /* renamed from: a */
    public final AbstractC9874c m34064a() {
        return this.f5805a;
    }

    /* renamed from: b */
    public final C8544c m34063b() {
        return this.f5806b;
    }

    /* renamed from: c */
    public final AbstractC9869a m34062c() {
        return this.f5807c;
    }

    /* renamed from: d */
    public final AbstractC11299a1 m34061d() {
        return this.f5808d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3577g)) {
            return false;
        }
        C3577g gVar = (C3577g) obj;
        return C9971q.m14638b(this.f5805a, gVar.f5805a) && C9971q.m14638b(this.f5806b, gVar.f5806b) && C9971q.m14638b(this.f5807c, gVar.f5807c) && C9971q.m14638b(this.f5808d, gVar.f5808d);
    }

    public int hashCode() {
        return (((((this.f5805a.hashCode() * 31) + this.f5806b.hashCode()) * 31) + this.f5807c.hashCode()) * 31) + this.f5808d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f5805a + ", classProto=" + this.f5806b + ", metadataVersion=" + this.f5807c + ", sourceElement=" + this.f5808d + ')';
    }
}
