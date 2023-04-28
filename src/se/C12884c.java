package se;

import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\n*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m15073d2 = {"Landroid/util/Size;", "size1", "size2", "", "a", "", "c", "(Landroid/util/Size;)I", "bigger", "Landroid/util/SizeF;", "", "b", "(Landroid/util/SizeF;)F", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: se.c */
/* loaded from: classes6.dex */
public final class C12884c {
    /* renamed from: a */
    public static final boolean m5192a(Size size1, Size size2) {
        C9971q.m14633g(size1, "size1");
        C9971q.m14633g(size2, "size2");
        if (size1.getWidth() * size1.getHeight() == size2.getWidth() * size2.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final float m5191b(SizeF sizeF) {
        C9971q.m14633g(sizeF, "<this>");
        return Math.max(sizeF.getWidth(), sizeF.getHeight());
    }

    /* renamed from: c */
    public static final int m5190c(Size size) {
        C9971q.m14633g(size, "<this>");
        return Math.max(size.getWidth(), size.getHeight());
    }
}
