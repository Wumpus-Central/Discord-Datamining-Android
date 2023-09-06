package com.discord.segmented.control;

import android.annotation.SuppressLint;
import android.graphics.Color;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.discord.segmented.control.events.ValueChangeEvent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDSegmentedControlManagerDelegate;
import com.facebook.react.viewmanagers.DCDSegmentedControlManagerInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import lf.p;

@ReactModule(name = SegmentedControlViewManager.NAME)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001!B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0015J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0017J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u001aH\u0017J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0017J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u001aH\u0017J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u001eH\u0017J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u001eH\u0017J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/segmented/control/SegmentedControlViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/segmented/control/SegmentedControlView;", "Lcom/facebook/react/viewmanagers/DCDSegmentedControlManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDSegmentedControlManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAccessibilityRoleDescriptions", "", "view", "value", "Lcom/facebook/react/bridge/ReadableArray;", "setBackgroundColor", "setCornerRadius", "", "setCustomSelectedTintColor", "setSelectedSegmentIndex", "setSelectedTitleAttributes", "Lcom/facebook/react/bridge/ReadableMap;", "setTitleAttributes", "setValues", "Companion", "segmented_control_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SegmentedControlViewManager extends SimpleViewManager<SegmentedControlView> implements DCDSegmentedControlManagerInterface<SegmentedControlView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDSegmentedControl";
    private final ReactEvents reactEvents = new ReactEvents(x.a("onValueChange", f0.b(ValueChangeEvent.class)));
    private final DCDSegmentedControlManagerDelegate<SegmentedControlView, SegmentedControlViewManager> delegate = new DCDSegmentedControlManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/segmented/control/SegmentedControlViewManager$Companion;", "", "()V", "NAME", "", "segmented_control_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    @SuppressLint({"InflateParams"})
    public SegmentedControlView createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        SegmentedControlView segmentedControlView = new SegmentedControlView(reactContext, null, 0, 6, null);
        segmentedControlView.setOnSegmentSelected(new SegmentedControlViewManager$createViewInstance$1$1(this, reactContext, segmentedControlView));
        return segmentedControlView;
    }

    
    @Override 
    public DCDSegmentedControlManagerDelegate<SegmentedControlView, SegmentedControlViewManager> getDelegate() {
        return this.delegate;
    }

    @ReactProp(name = "accessibilityRoleDescriptions")
    public void setAccessibilityRoleDescriptions(SegmentedControlView view, ReadableArray readableArray) {
        q.h(view, "view");
        if (readableArray != null) {
            IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = sizeRange.iterator();
            while (it.hasNext()) {
                String string = readableArray.getString(((p) it).nextInt());
                if (string != null) {
                    arrayList.add(string);
                }
            }
            view.setAccessibilityRoleDescriptions(arrayList);
        }
    }

    @ReactProp(name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(SegmentedControlView view, String str) {
        q.h(view, "view");
        if (str != null) {
            view.setContainerBgColor(Color.parseColor(str));
        }
    }

    @ReactProp(name = "cornerRadius")
    public void setCornerRadius(SegmentedControlView view, int i10) {
        q.h(view, "view");
        view.setCornerRadiusPx(SizeUtilsKt.getDpToPx(i10));
    }

    @ReactProp(name = "customSelectedTintColor")
    public void setCustomSelectedTintColor(SegmentedControlView view, String str) {
        q.h(view, "view");
        if (str != null) {
            view.setSelectedSegmentBgColor(Color.parseColor(str));
        }
    }

    @ReactProp(name = "selectedSegmentIndex")
    public void setSelectedSegmentIndex(SegmentedControlView view, int i10) {
        q.h(view, "view");
        view.setSelectedIndex(i10);
    }

    @ReactProp(name = "selectedTitleAttributes")
    public void setSelectedTitleAttributes(SegmentedControlView view, ReadableMap readableMap) {
        q.h(view, "view");
        if (readableMap != null) {
            view.setSelectedSegmentTextColor(readableMap.getInt("textColor"));
            view.setSelectedSegmentFontSizeSp(readableMap.getInt(ViewProps.FONT_SIZE));
        }
    }

    @ReactProp(name = "titleAttributes")
    public void setTitleAttributes(SegmentedControlView view, ReadableMap readableMap) {
        q.h(view, "view");
        if (readableMap != null) {
            view.setSegmentTextColor(readableMap.getInt("textColor"));
            view.setSegmentFontSizeSp(readableMap.getInt(ViewProps.FONT_SIZE));
        }
    }

    @ReactProp(name = "values")
    public void setValues(SegmentedControlView view, ReadableArray readableArray) {
        q.h(view, "view");
        if (readableArray != null) {
            IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(readableArray);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = sizeRange.iterator();
            while (it.hasNext()) {
                String string = readableArray.getString(((p) it).nextInt());
                if (string != null) {
                    arrayList.add(string);
                }
            }
            view.setLabels(arrayList);
        }
    }
}
