package p288q;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;
import p355u.C13168h;

/* renamed from: q.y1 */
/* loaded from: classes.dex */
class C11951y1 {

    /* renamed from: d */
    private static final Size f26751d = new Size(1920, 1080);

    /* renamed from: e */
    private static final Object f26752e = new Object();

    /* renamed from: f */
    private static volatile C11951y1 f26753f;

    /* renamed from: a */
    private final DisplayManager f26754a;

    /* renamed from: b */
    private volatile Size f26755b = null;

    /* renamed from: c */
    private final C13168h f26756c = new C13168h();

    private C11951y1(Context context) {
        this.f26754a = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
    }

    /* renamed from: a */
    private Size m8150a() {
        Size size;
        Point point = new Point();
        m8148c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f26751d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f26756c.m4429a(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C11951y1 m8149b(Context context) {
        if (f26753f == null) {
            synchronized (f26752e) {
                if (f26753f == null) {
                    f26753f = new C11951y1(context);
                }
            }
        }
        return f26753f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Display m8148c() {
        Display[] displays = this.f26754a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                if (i2 * i3 > i) {
                    display = display2;
                    i = i2 * i3;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Size m8147d() {
        if (this.f26755b != null) {
            return this.f26755b;
        }
        this.f26755b = m8150a();
        return this.f26755b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m8146e() {
        this.f26755b = m8150a();
    }
}
