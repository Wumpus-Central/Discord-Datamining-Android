package com.reactnativecommunity.slider;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.slider.ReactSlidingCompleteEvent;
import com.facebook.yoga.C5128f;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class ReactSliderManager extends SimpleViewManager<C6134a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new C6132a();
    public static final String REACT_CLASS = "RNCSlider";
    private static final int STYLE = 16842875;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.slider.ReactSliderManager$a */
    /* loaded from: classes6.dex */
    public class C6132a implements SeekBar.OnSeekBarChangeListener {
        C6132a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C6136b(seekBar.getId(), ((C6134a) seekBar).toRealProgress(i), z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            C6134a aVar = (C6134a) seekBar;
            aVar.m26202b(true);
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C6139e(seekBar.getId(), aVar.toRealProgress(seekBar.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            C6134a aVar = (C6134a) seekBar;
            aVar.m26202b(false);
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C6138d(seekBar.getId(), aVar.toRealProgress(seekBar.getProgress())));
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C6136b(seekBar.getId(), aVar.toRealProgress(seekBar.getProgress()), !aVar.m26201c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.slider.ReactSliderManager$b */
    /* loaded from: classes6.dex */
    public static class C6133b extends LayoutShadowNode implements YogaMeasureFunction {

        /* renamed from: a */
        private int f12488a;

        /* renamed from: b */
        private int f12489b;

        /* renamed from: c */
        private boolean f12490c;

        /* synthetic */ C6133b(C6132a aVar) {
            this();
        }

        private void initMeasureFunction() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f12490c) {
                C6134a aVar = new C6134a(getThemedContext(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f12488a = aVar.getMeasuredWidth();
                this.f12489b = aVar.getMeasuredHeight();
                this.f12490c = true;
            }
            return C5128f.m30592b(this.f12488a, this.f12489b);
        }

        private C6133b() {
            initMeasureFunction();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m30830of(ReactSlidingCompleteEvent.EVENT_NAME, MapBuilder.m30831of("registrationName", "onRNCSliderSlidingComplete"), "topSlidingStart", MapBuilder.m30831of("registrationName", "onRNCSliderSlidingStart"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return C6133b.class;
    }

    @ReactProp(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(C6134a aVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        aVar.setAccessibilityIncrements(arrayList2);
    }

    @ReactProp(name = "accessibilityUnits")
    public void setAccessibilityUnits(C6134a aVar, String str) {
        aVar.setAccessibilityUnits(str);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ENABLED)
    public void setEnabled(C6134a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @ReactProp(defaultBoolean = false, name = "inverted")
    public void setInverted(C6134a aVar, boolean z) {
        if (z) {
            aVar.setScaleX(-1.0f);
        } else {
            aVar.setScaleX(1.0f);
        }
    }

    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(C6134a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(C6134a aVar, double d) {
        aVar.setMaxValue(d);
    }

    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(C6134a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(C6134a aVar, double d) {
        aVar.setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "step")
    public void setStep(C6134a aVar, double d) {
        aVar.setStep(d);
    }

    @ReactProp(name = "thumbImage")
    public void setThumbImage(C6134a aVar, ReadableMap readableMap) {
        String str;
        if (readableMap != null) {
            str = readableMap.getString("uri");
        } else {
            str = null;
        }
        aVar.setThumbImage(str);
    }

    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C6134a aVar, Integer num) {
        if (aVar.getThumb() == null) {
            return;
        }
        if (num == null) {
            aVar.getThumb().clearColorFilter();
        } else {
            aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 0.0d, name = "value")
    public void setValue(C6134a aVar, double d) {
        if (!aVar.m26201c()) {
            aVar.setValue(d);
            if (aVar.isAccessibilityFocused() && Build.VERSION.SDK_INT > 29) {
                aVar.setupAccessibility((int) d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, C6134a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new C6133b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C6134a createViewInstance(ThemedReactContext themedReactContext) {
        C6134a aVar = new C6134a(themedReactContext, null, STYLE);
        aVar.setSplitTrack(false);
        return aVar;
    }
}
