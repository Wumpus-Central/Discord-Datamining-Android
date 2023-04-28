package p143hj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p143hj.AbstractC8041a;
import p143hj.AbstractC8086w;

/* renamed from: hj.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8044b<U extends AbstractC8086w, P extends AbstractC8041a<U>> implements AbstractC8067j0<U, P>, Comparator<U> {

    /* renamed from: k */
    private final List<U> f17426k;

    /* renamed from: l */
    private final boolean f17427l;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8044b(boolean z, U... uArr) {
        this(Arrays.asList(uArr), z);
    }

    /* renamed from: b */
    public int compare(U u, U u2) {
        return Double.compare(u2.getLength(), u.getLength());
    }

    private AbstractC8044b(List<U> list, boolean z) {
        if (!list.isEmpty()) {
            Collections.sort(list, this);
            int size = list.size();
            int i = 0;
            while (i < size) {
                U u = list.get(i);
                i++;
                for (int i2 = i; i2 < size; i2++) {
                    if (u.equals(list.get(i2))) {
                        throw new IllegalArgumentException("Duplicate unit: " + u);
                    }
                }
            }
            this.f17426k = Collections.unmodifiableList(list);
            this.f17427l = z;
            return;
        }
        throw new IllegalArgumentException("Missing units.");
    }
}
