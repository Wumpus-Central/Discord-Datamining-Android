package id.zelory.compressor.constraint;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p232mf.AbstractC10594a;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m15073d2 = {"Lid/zelory/compressor/constraint/Compression;", "", "Lmf/a;", "constraint", "", "a", "", "Ljava/util/List;", "b", "()Ljava/util/List;", "constraints", "<init>", "()V", "compressor_release"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class Compression {

    /* renamed from: a */
    private final List<AbstractC10594a> f18292a = new ArrayList();

    /* renamed from: a */
    public final void m19870a(AbstractC10594a constraint) {
        C9971q.m14632h(constraint, "constraint");
        this.f18292a.add(constraint);
    }

    /* renamed from: b */
    public final List<AbstractC10594a> m19869b() {
        return this.f18292a;
    }
}
