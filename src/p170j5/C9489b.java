package p170j5;

/* renamed from: j5.b */
/* loaded from: classes7.dex */
public final class C9489b {

    /* renamed from: a */
    public static final C9490c f21011a = new C9490c("JPEG", "jpeg");

    /* renamed from: b */
    public static final C9490c f21012b = new C9490c("PNG", "png");

    /* renamed from: c */
    public static final C9490c f21013c = new C9490c("GIF", "gif");

    /* renamed from: d */
    public static final C9490c f21014d = new C9490c("BMP", "bmp");

    /* renamed from: e */
    public static final C9490c f21015e = new C9490c("ICO", "ico");

    /* renamed from: f */
    public static final C9490c f21016f = new C9490c("WEBP_SIMPLE", "webp");

    /* renamed from: g */
    public static final C9490c f21017g = new C9490c("WEBP_LOSSLESS", "webp");

    /* renamed from: h */
    public static final C9490c f21018h = new C9490c("WEBP_EXTENDED", "webp");

    /* renamed from: i */
    public static final C9490c f21019i = new C9490c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j */
    public static final C9490c f21020j = new C9490c("WEBP_ANIMATED", "webp");

    /* renamed from: k */
    public static final C9490c f21021k = new C9490c("HEIF", "heif");

    /* renamed from: l */
    public static final C9490c f21022l = new C9490c("DNG", "dng");

    /* renamed from: a */
    public static boolean m16146a(C9490c cVar) {
        return cVar == f21016f || cVar == f21017g || cVar == f21018h || cVar == f21019i;
    }

    /* renamed from: b */
    public static boolean m16145b(C9490c cVar) {
        return m16146a(cVar) || cVar == f21020j;
    }
}
