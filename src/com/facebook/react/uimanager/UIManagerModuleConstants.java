package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.events.TouchEventType;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
class UIManagerModuleConstants {
    public static final String ACTION_DISMISSED = "dismissed";
    public static final String ACTION_ITEM_SELECTED = "itemSelected";

    UIManagerModuleConstants() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map getBubblingEventTypeConstants() {
        return MapBuilder.builder().put("topChange", MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30830of("bubbled", "onChange", "captured", "onChangeCapture"))).put("topSelect", MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30830of("bubbled", "onSelect", "captured", "onSelectCapture"))).put(TouchEventType.getJSEventName(TouchEventType.START), MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30830of("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).put(TouchEventType.getJSEventName(TouchEventType.MOVE), MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30830of("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).put(TouchEventType.getJSEventName(TouchEventType.END), MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30830of("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).put(TouchEventType.getJSEventName(TouchEventType.CANCEL), MapBuilder.m30831of("phasedRegistrationNames", MapBuilder.m30830of("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).build();
    }

    public static Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("UIView", MapBuilder.m30831of("ContentMode", MapBuilder.m30829of("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        newHashMap.put("StyleConstants", MapBuilder.m30831of("PointerEventsValues", MapBuilder.m30828of(ViewProps.NONE, Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        newHashMap.put("PopupMenu", MapBuilder.m30830of(ACTION_DISMISSED, ACTION_DISMISSED, ACTION_ITEM_SELECTED, ACTION_ITEM_SELECTED));
        newHashMap.put("AccessibilityEventTypes", MapBuilder.m30829of("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return newHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map getDirectEventTypeConstants() {
        return MapBuilder.builder().put("topContentSizeChange", MapBuilder.m30831of("registrationName", "onContentSizeChange")).put("topLayout", MapBuilder.m30831of("registrationName", ViewProps.ON_LAYOUT)).put("topLoadingError", MapBuilder.m30831of("registrationName", "onLoadingError")).put("topLoadingFinish", MapBuilder.m30831of("registrationName", "onLoadingFinish")).put("topLoadingStart", MapBuilder.m30831of("registrationName", "onLoadingStart")).put("topSelectionChange", MapBuilder.m30831of("registrationName", "onSelectionChange")).put("topMessage", MapBuilder.m30831of("registrationName", "onMessage")).put("topClick", MapBuilder.m30831of("registrationName", "onClick")).put("topScrollBeginDrag", MapBuilder.m30831of("registrationName", "onScrollBeginDrag")).put("topScrollEndDrag", MapBuilder.m30831of("registrationName", "onScrollEndDrag")).put("topScroll", MapBuilder.m30831of("registrationName", "onScroll")).put("topMomentumScrollBegin", MapBuilder.m30831of("registrationName", "onMomentumScrollBegin")).put("topMomentumScrollEnd", MapBuilder.m30831of("registrationName", "onMomentumScrollEnd")).build();
    }
}
