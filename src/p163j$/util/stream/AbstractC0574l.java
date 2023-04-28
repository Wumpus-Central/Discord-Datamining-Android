package p163j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* renamed from: j$.util.stream.l */
/* loaded from: classes2.dex */
public abstract class AbstractC0574l {

    /* renamed from: a */
    public static final /* synthetic */ int f20685a = 0;

    static {
        EnumC0562i iVar = EnumC0562i.CONCURRENT;
        EnumC0562i iVar2 = EnumC0562i.UNORDERED;
        EnumC0562i iVar3 = EnumC0562i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(iVar, iVar2, iVar3));
        Collections.unmodifiableSet(EnumSet.of(iVar, iVar2));
        Collections.unmodifiableSet(EnumSet.of(iVar3));
        Collections.unmodifiableSet(EnumSet.of(iVar2, iVar3));
        Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m16335a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
