package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, m15073d2 = {"Lbj/b1;", "Lbj/b2;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "e0", "nestedName", "f0", "descriptor", "d0", "parentName", "childName", "c0", "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.b1 */
/* loaded from: classes8.dex */
public abstract class AbstractC3626b1 extends AbstractC3627b2<String> {
    /* renamed from: c0 */
    protected String mo33010c0(String parentName, String childName) {
        boolean z;
        C9971q.m14633g(parentName, "parentName");
        C9971q.m14633g(childName, "childName");
        if (parentName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return childName;
        }
        return parentName + '.' + childName;
    }

    /* renamed from: d0 */
    protected String mo32957d0(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return descriptor.mo13680e(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public final String mo33947Y(SerialDescriptor serialDescriptor, int i) {
        C9971q.m14633g(serialDescriptor, "<this>");
        return m33951f0(mo32957d0(serialDescriptor, i));
    }

    /* renamed from: f0 */
    protected final String m33951f0(String nestedName) {
        C9971q.m14633g(nestedName, "nestedName");
        String X = m33948X();
        if (X == null) {
            X = "";
        }
        return mo33010c0(X, nestedName);
    }
}
