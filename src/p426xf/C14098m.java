package p426xf;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0006"}, m15073d2 = {"Ljava/io/File;", "Lxf/i;", "direction", "Lxf/h;", "e", "f", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/io/FilesKt")
/* renamed from: xf.m */
/* loaded from: classes8.dex */
public class C14098m extends C14097l {
    /* renamed from: e */
    public static final C14087h m1685e(File file, EnumC14094i direction) {
        C9971q.m14633g(file, "<this>");
        C9971q.m14633g(direction, "direction");
        return new C14087h(file, direction);
    }

    /* renamed from: f */
    public static final C14087h m1684f(File file) {
        C9971q.m14633g(file, "<this>");
        return m1685e(file, EnumC14094i.BOTTOM_UP);
    }
}
