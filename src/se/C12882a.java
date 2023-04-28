package se;

import kotlin.Metadata;
import p163j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, m15073d2 = {"", "imageFormat", "", "a", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: se.a */
/* loaded from: classes6.dex */
public final class C12882a {
    /* renamed from: a */
    public static final String m5194a(int i) {
        switch (i) {
            case 32:
            case 36:
                return "raw";
            case 34:
                return "private";
            case 35:
            case 39:
            case 40:
                return "yuv";
            case Spliterator.NONNULL /* 256 */:
                return "jpeg";
            case 1144402265:
                return "depth-16";
            case 1212500294:
                return "heic";
            case 1768253795:
                return "jpeg-depth";
            default:
                return "unknown";
        }
    }
}
