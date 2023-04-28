package p294q5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.react.uimanager.ViewDefaults;
import p039c6.AbstractC3768a;
import p294q5.C11994b;
import p346t5.AbstractC12962c;

/* renamed from: q5.b */
/* loaded from: classes7.dex */
public class C11994b<T extends C11994b> {

    /* renamed from: a */
    private int f26843a = 100;

    /* renamed from: b */
    private int f26844b = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: c */
    private boolean f26845c;

    /* renamed from: d */
    private boolean f26846d;

    /* renamed from: e */
    private boolean f26847e;

    /* renamed from: f */
    private boolean f26848f;

    /* renamed from: g */
    private Bitmap.Config f26849g;

    /* renamed from: h */
    private Bitmap.Config f26850h;

    /* renamed from: i */
    private AbstractC12962c f26851i;

    /* renamed from: j */
    private ColorSpace f26852j;

    /* renamed from: k */
    private boolean f26853k;

    public C11994b() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f26849g = config;
        this.f26850h = config;
    }

    /* renamed from: a */
    public ImageDecodeOptions m8053a() {
        return new ImageDecodeOptions(this);
    }

    /* renamed from: b */
    public Bitmap.Config m8052b() {
        return this.f26850h;
    }

    /* renamed from: c */
    public Bitmap.Config m8051c() {
        return this.f26849g;
    }

    /* renamed from: d */
    public AbstractC3768a m8050d() {
        return null;
    }

    /* renamed from: e */
    public ColorSpace m8049e() {
        return this.f26852j;
    }

    /* renamed from: f */
    public AbstractC12962c m8048f() {
        return this.f26851i;
    }

    /* renamed from: g */
    public boolean m8047g() {
        return this.f26847e;
    }

    /* renamed from: h */
    public boolean m8046h() {
        return this.f26845c;
    }

    /* renamed from: i */
    public boolean m8045i() {
        return this.f26853k;
    }

    /* renamed from: j */
    public boolean m8044j() {
        return this.f26848f;
    }

    /* renamed from: k */
    public int m8043k() {
        return this.f26844b;
    }

    /* renamed from: l */
    public int m8042l() {
        return this.f26843a;
    }

    /* renamed from: m */
    public boolean m8041m() {
        return this.f26846d;
    }
}
