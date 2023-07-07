package com.discord.segmented.control;

import android.annotation.SuppressLint;
import android.graphics.Color;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.discord.segmented.control.events.ValueChangeEvent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import gf.x;
import hf.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0015J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0007J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/segmented/control/SegmentedControlViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/segmented/control/SegmentedControlView;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "accessibilityRoleDescriptions", "", "view", "Lcom/facebook/react/bridge/ReadableArray;", "cornerRadius", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "customSelectedTintColor", "", "getExportedCustomDirectEventTypeConstants", "", "", "getName", "selectedSegmentIndex", "selectedTitleAttributes", "attributes", "Lcom/facebook/react/bridge/ReadableMap;", "setBackgroundColor", ViewProps.BACKGROUND_COLOR, "titleAttributes", "values", "segmented_control_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SegmentedControlViewManager extends SimpleViewManager<SegmentedControlView> {
    private final ReactEvents reactEvents = new ReactEvents(x.a("onValueChange", f0.b(ValueChangeEvent.class)));

    @ReactProp(name = "accessibilityRoleDescriptions")
    public final void accessibilityRoleDescriptions(SegmentedControlView view, ReadableArray accessibilityRoleDescriptions) {
        q.g(view, "view");
        q.g(accessibilityRoleDescriptions, "accessibilityRoleDescriptions");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(accessibilityRoleDescriptions);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            String string = accessibilityRoleDescriptions.getString(((p) it).nextInt());
            if (string != null) {
                arrayList.add(string);
            }
        }
        view.setAccessibilityRoleDescriptions(arrayList);
    }

    @ReactProp(name = "cornerRadius")
    public final void cornerRadius(SegmentedControlView view, int i10) {
        q.g(view, "view");
        view.setCornerRadiusPx(SizeUtilsKt.getDpToPx(i10));
    }

    @ReactProp(name = "customSelectedTintColor")
    public final void customSelectedTintColor(SegmentedControlView view, String customSelectedTintColor) {
        q.g(view, "view");
        q.g(customSelectedTintColor, "customSelectedTintColor");
        view.setSelectedSegmentBgColor(Color.parseColor(customSelectedTintColor));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDSegmentedControl";
    }

    @ReactProp(name = "selectedSegmentIndex")
    public final void selectedSegmentIndex(SegmentedControlView view, int i10) {
        q.g(view, "view");
        view.setSelectedIndex(i10);
    }

    @ReactProp(name = "selectedTitleAttributes")
    public final void selectedTitleAttributes(SegmentedControlView view, ReadableMap attributes) {
        q.g(view, "view");
        q.g(attributes, "attributes");
        view.setSelectedSegmentTextColor(attributes.getInt("textColor"));
        view.setSelectedSegmentFontSizeSp(attributes.getInt(ViewProps.FONT_SIZE));
    }

    @ReactProp(name = ViewProps.BACKGROUND_COLOR)
    public final void setBackgroundColor(SegmentedControlView view, String backgroundColor) {
        q.g(view, "view");
        q.g(backgroundColor, "backgroundColor");
        view.setContainerBgColor(Color.parseColor(backgroundColor));
    }

    @ReactProp(name = "titleAttributes")
    public final void titleAttributes(SegmentedControlView view, ReadableMap attributes) {
        q.g(view, "view");
        q.g(attributes, "attributes");
        view.setSegmentTextColor(attributes.getInt("textColor"));
        view.setSegmentFontSizeSp(attributes.getInt(ViewProps.FONT_SIZE));
    }

    @ReactProp(name = "values")
    public final void values(SegmentedControlView view, ReadableArray values) {
        q.g(view, "view");
        q.g(values, "values");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(values);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            String string = values.getString(((p) it).nextInt());
            if (string != null) {
                arrayList.add(string);
            }
        }
        view.setLabels(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @SuppressLint({"InflateParams"})
    public SegmentedControlView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        SegmentedControlView segmentedControlView = new SegmentedControlView(reactContext, null, 0, 6, null);
        segmentedControlView.setOnSegmentSelected(new SegmentedControlViewManager$createViewInstance$1$1(this, segmentedControlView));
        return segmentedControlView;
    }
}
