package bj;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p449yi.C14429a;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a \u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u000b"}, m15073d2 = {"", "seen", "goldenMask", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "b", "", "seenArray", "goldenMaskArray", "a", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.n1 */
/* loaded from: classes8.dex */
public final class C3681n1 {
    /* renamed from: a */
    public static final void m33819a(int[] seenArray, int[] goldenMaskArray, SerialDescriptor descriptor) {
        C9971q.m14633g(seenArray, "seenArray");
        C9971q.m14633g(goldenMaskArray, "goldenMaskArray");
        C9971q.m14633g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i = 0; i < length; i++) {
            int i2 = goldenMaskArray[i] & (~seenArray[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(descriptor.mo13680e((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new C14429a(arrayList, descriptor.mo13676i());
    }

    /* renamed from: b */
    public static final void m33818b(int i, int i2, SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.mo13680e(i4));
            }
            i3 >>>= 1;
        }
        throw new C14429a(arrayList, descriptor.mo13676i());
    }
}
