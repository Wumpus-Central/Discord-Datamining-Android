package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.horcrux.rnsvg.NativeSvgViewModuleSpec;

@ReactModule(name = SvgViewModule.NAME)
/* loaded from: classes6.dex */
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.SvgViewModule$a */
    /* loaded from: classes6.dex */
    public class RunnableC5937a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ int f11792k;

        /* renamed from: l */
        final /* synthetic */ ReadableMap f11793l;

        /* renamed from: m */
        final /* synthetic */ Callback f11794m;

        /* renamed from: n */
        final /* synthetic */ int f11795n;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a */
        /* loaded from: classes6.dex */
        class RunnableC0169a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a */
            /* loaded from: classes6.dex */
            class RunnableC0170a implements Runnable {
                RunnableC0170a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC5937a aVar = RunnableC5937a.this;
                    SvgViewModule.toDataURL(aVar.f11792k, aVar.f11793l, aVar.f11794m, aVar.f11795n + 1);
                }
            }

            RunnableC0169a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(RunnableC5937a.this.f11792k);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new RunnableC0170a());
                }
            }
        }

        /* renamed from: com.horcrux.svg.SvgViewModule$a$b */
        /* loaded from: classes6.dex */
        class RunnableC5938b implements Runnable {
            RunnableC5938b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC5937a aVar = RunnableC5937a.this;
                SvgViewModule.toDataURL(aVar.f11792k, aVar.f11793l, aVar.f11794m, aVar.f11795n + 1);
            }
        }

        RunnableC5937a(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.f11792k = i;
            this.f11793l = readableMap;
            this.f11794m = callback;
            this.f11795n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f11792k);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f11792k, new RunnableC0169a());
            } else if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new RunnableC5938b());
            } else {
                ReadableMap readableMap = this.f11793l;
                if (readableMap != null) {
                    this.f11794m.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f11793l.getInt("height")));
                } else {
                    this.f11794m.invoke(svgViewByTag.toDataURL());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new RunnableC5937a(i, readableMap, callback, i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.horcrux.rnsvg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d, ReadableMap readableMap, Callback callback) {
        toDataURL(d.intValue(), readableMap, callback, 0);
    }
}
