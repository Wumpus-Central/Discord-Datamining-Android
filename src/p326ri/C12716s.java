package p326ri;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"", "", "k", "(Ljava/lang/String;)Ljava/lang/Double;", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/text/StringsKt")
/* renamed from: ri.s */
/* loaded from: classes8.dex */
public class C12716s extends C12715r {
    /* renamed from: k */
    public static Double m5749k(String str) {
        C9971q.m14633g(str, "<this>");
        try {
            if (C12706k.f28574b.m14583g(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
