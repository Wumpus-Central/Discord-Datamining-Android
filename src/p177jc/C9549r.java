package p177jc;

import java.util.Arrays;
import java.util.List;

/* renamed from: jc.r */
/* loaded from: classes3.dex */
public class C9549r extends C9550s {

    /* renamed from: k */
    private final List<C9523d<?>> f21160k;

    public C9549r(List<C9523d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f21160k = list;
    }
}
