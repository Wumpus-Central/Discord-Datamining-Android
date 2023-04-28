package com.airbnb.android.react.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.C2733w0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.WeakHashMap;
import p126h2.C7756h;
import p126h2.EnumC7782q0;

/* loaded from: classes.dex */
class LottieAnimationViewManager extends SimpleViewManager<C7756h> {
    private static final int COMMAND_PAUSE = 3;
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RESET = 2;
    private static final int COMMAND_RESUME = 4;
    private static final String REACT_CLASS = "LottieAnimationView";
    private static final String TAG = "LottieAnimationViewManager";
    private static final int VERSION = 1;
    private Map<C7756h, C4096a> propManagersMap = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$a */
    /* loaded from: classes.dex */
    public class C4088a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C7756h f6728a;

        C4088a(C7756h hVar) {
            this.f6728a = hVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f6728a, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f6728a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$b */
    /* loaded from: classes.dex */
    public class RunnableC4089b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ ReadableArray f6730k;

        /* renamed from: l */
        final /* synthetic */ C7756h f6731l;

        /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$b$a */
        /* loaded from: classes.dex */
        class View$OnAttachStateChangeListenerC4090a implements View.OnAttachStateChangeListener {
            View$OnAttachStateChangeListenerC4090a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                C7756h hVar = (C7756h) view;
                hVar.setProgress(0.0f);
                hVar.playAnimation();
                hVar.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                RunnableC4089b.this.f6731l.removeOnAttachStateChangeListener(this);
            }
        }

        RunnableC4089b(ReadableArray readableArray, C7756h hVar) {
            this.f6730k = readableArray;
            this.f6731l = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f6730k.getInt(0);
            int i2 = this.f6730k.getInt(1);
            if (!(i == -1 || i2 == -1)) {
                if (i > i2) {
                    this.f6731l.m21431A(i2, i);
                    if (this.f6731l.getSpeed() > 0.0f) {
                        this.f6731l.m21410w();
                    }
                } else {
                    this.f6731l.m21431A(i, i2);
                    if (this.f6731l.getSpeed() < 0.0f) {
                        this.f6731l.m21410w();
                    }
                }
            }
            if (C2733w0.m37030T(this.f6731l)) {
                this.f6731l.setProgress(0.0f);
                this.f6731l.playAnimation();
                return;
            }
            this.f6731l.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC4090a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$c */
    /* loaded from: classes.dex */
    public class RunnableC4091c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C7756h f6734k;

        RunnableC4091c(C7756h hVar) {
            this.f6734k = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2733w0.m37030T(this.f6734k)) {
                this.f6734k.m21422k();
                this.f6734k.setProgress(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$d */
    /* loaded from: classes.dex */
    public class RunnableC4092d implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C7756h f6736k;

        RunnableC4092d(C7756h hVar) {
            this.f6736k = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2733w0.m37030T(this.f6736k)) {
                this.f6736k.pauseAnimation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$e */
    /* loaded from: classes.dex */
    public class RunnableC4093e implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C7756h f6738k;

        RunnableC4093e(C7756h hVar) {
            this.f6738k = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2733w0.m37030T(this.f6738k)) {
                this.f6738k.m21411v();
            }
        }
    }

    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$f */
    /* loaded from: classes.dex */
    class RunnableC4094f implements Runnable {

        /* renamed from: k */
        final /* synthetic */ String f6740k;

        /* renamed from: l */
        final /* synthetic */ C7756h f6741l;

        /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$f$a */
        /* loaded from: classes.dex */
        class RunnableC4095a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ String f6743k;

            RunnableC4095a(String str) {
                this.f6743k = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC4094f fVar = RunnableC4094f.this;
                LottieAnimationViewManager.this.getOrCreatePropertyManager(fVar.f6741l).m32858b(this.f6743k);
                RunnableC4094f fVar2 = RunnableC4094f.this;
                LottieAnimationViewManager.this.getOrCreatePropertyManager(fVar2.f6741l).m32859a();
            }
        }

        RunnableC4094f(String str, C7756h hVar) {
            this.f6740k = str;
            this.f6741l = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(this.f6740k).openStream()));
                String str = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        str = str + readLine;
                    } else {
                        bufferedReader.close();
                        new Handler(Looper.getMainLooper()).post(new RunnableC4095a(str));
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error loading animation from URL: " + e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4096a getOrCreatePropertyManager(C7756h hVar) {
        C4096a aVar = this.propManagersMap.get(hVar);
        if (aVar != null) {
            return aVar;
        }
        C4096a aVar2 = new C4096a(hVar);
        this.propManagersMap.put(hVar, aVar2);
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOnAnimationFinishEvent(C7756h hVar, boolean z) {
        ReactContext reactContext;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", z);
        Context context = hVar.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                reactContext = null;
                break;
            } else if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (reactContext != null) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(hVar.getId(), "animationFinish", createMap);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m30828of("play", 1, "reset", 2, "pause", 3, "resume", 4);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put("animationFinish", MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30831of("bubbled", "onAnimationFinish"))).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.builder().put("VERSION", 1).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "cacheComposition")
    public void setCacheComposition(C7756h hVar, boolean z) {
        hVar.setCacheComposition(z);
    }

    @ReactProp(name = "colorFilters")
    public void setColorFilters(C7756h hVar, ReadableArray readableArray) {
        getOrCreatePropertyManager(hVar).m32856d(readableArray);
    }

    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(C7756h hVar, boolean z) {
        getOrCreatePropertyManager(hVar).m32855e(z);
    }

    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(C7756h hVar, String str) {
        getOrCreatePropertyManager(hVar).m32854f(str);
    }

    @ReactProp(name = "loop")
    public void setLoop(C7756h hVar, boolean z) {
        getOrCreatePropertyManager(hVar).m32853g(z);
    }

    @ReactProp(name = "progress")
    public void setProgress(C7756h hVar, float f) {
        getOrCreatePropertyManager(hVar).m32852h(Float.valueOf(f));
    }

    @ReactProp(name = "renderMode")
    public void setRenderMode(C7756h hVar, String str) {
        EnumC7782q0 q0Var;
        if ("AUTOMATIC".equals(str)) {
            q0Var = EnumC7782q0.AUTOMATIC;
        } else if ("HARDWARE".equals(str)) {
            q0Var = EnumC7782q0.HARDWARE;
        } else if ("SOFTWARE".equals(str)) {
            q0Var = EnumC7782q0.SOFTWARE;
        } else {
            q0Var = null;
        }
        getOrCreatePropertyManager(hVar).m32851i(q0Var);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(C7756h hVar, String str) {
        ImageView.ScaleType scaleType;
        if ("cover".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if ("contain".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        } else if ("center".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER;
        } else {
            scaleType = null;
        }
        getOrCreatePropertyManager(hVar).m32850j(scaleType);
    }

    @ReactProp(name = "sourceJson")
    public void setSourceJson(C7756h hVar, String str) {
        getOrCreatePropertyManager(hVar).m32858b(str);
    }

    @ReactProp(name = "sourceName")
    public void setSourceName(C7756h hVar, String str) {
        if (!str.contains(".")) {
            str = str + ".json";
        }
        getOrCreatePropertyManager(hVar).m32857c(str);
    }

    @ReactProp(name = "sourceURL")
    public void setSourceURL(C7756h hVar, String str) {
        new Thread(new RunnableC4094f(str, hVar)).start();
    }

    @ReactProp(name = "speed")
    public void setSpeed(C7756h hVar, double d) {
        getOrCreatePropertyManager(hVar).m32849k((float) d);
    }

    @ReactProp(name = "textFiltersAndroid")
    public void setTextFilters(C7756h hVar, ReadableArray readableArray) {
        getOrCreatePropertyManager(hVar).m32848l(readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C7756h createViewInstance(ThemedReactContext themedReactContext) {
        C7756h hVar = new C7756h(themedReactContext);
        hVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        hVar.m21424i(new C4088a(hVar));
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C7756h hVar) {
        super.onAfterUpdateTransaction((LottieAnimationViewManager) hVar);
        getOrCreatePropertyManager(hVar).m32859a();
    }

    public void receiveCommand(C7756h hVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            new Handler(Looper.getMainLooper()).post(new RunnableC4089b(readableArray, hVar));
        } else if (i == 2) {
            new Handler(Looper.getMainLooper()).post(new RunnableC4091c(hVar));
        } else if (i == 3) {
            new Handler(Looper.getMainLooper()).post(new RunnableC4092d(hVar));
        } else if (i == 4) {
            new Handler(Looper.getMainLooper()).post(new RunnableC4093e(hVar));
        }
    }
}
