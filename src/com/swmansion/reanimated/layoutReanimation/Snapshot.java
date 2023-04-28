package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class Snapshot {
    public static final String CURRENT_GLOBAL_ORIGIN_X = "currentGlobalOriginX";
    public static final String CURRENT_GLOBAL_ORIGIN_Y = "currentGlobalOriginY";
    public static final String CURRENT_HEIGHT = "currentHeight";
    public static final String CURRENT_ORIGIN_X = "currentOriginX";
    public static final String CURRENT_ORIGIN_Y = "currentOriginY";
    public static final String CURRENT_WIDTH = "currentWidth";
    public static final String GLOBAL_ORIGIN_X = "globalOriginX";
    public static final String GLOBAL_ORIGIN_Y = "globalOriginY";
    public static final String HEIGHT = "height";
    public static final String ORIGIN_X = "originX";
    public static final String ORIGIN_Y = "originY";
    public static final String TARGET_GLOBAL_ORIGIN_X = "targetGlobalOriginX";
    public static final String TARGET_GLOBAL_ORIGIN_Y = "targetGlobalOriginY";
    public static final String TARGET_HEIGHT = "targetHeight";
    public static final String TARGET_ORIGIN_X = "targetOriginX";
    public static final String TARGET_ORIGIN_Y = "targetOriginY";
    public static final String TARGET_WIDTH = "targetWidth";
    public static final String WIDTH = "width";
    public static ArrayList<String> currentKeysToTransform;
    public static ArrayList<String> targetKeysToTransform;
    public int globalOriginX;
    public int globalOriginY;
    public int height;
    public int originX;
    public int originY;
    public ViewGroup parent;
    public ViewManager parentViewManager;
    public View view;
    public ViewManager viewManager;
    public int width;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Snapshot(View view, NativeViewHierarchyManager nativeViewHierarchyManager) {
        this.parent = (ViewGroup) view.getParent();
        try {
            this.viewManager = nativeViewHierarchyManager.resolveViewManager(view.getId());
            this.parentViewManager = nativeViewHierarchyManager.resolveViewManager(this.parent.getId());
        } catch (IllegalViewOperationException | NullPointerException unused) {
        }
        this.width = view.getWidth();
        this.height = view.getHeight();
        this.originX = view.getLeft();
        this.originY = view.getTop();
        this.view = view;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.globalOriginX = iArr[0];
        this.globalOriginY = iArr[1];
        targetKeysToTransform = new ArrayList<>(Arrays.asList(TARGET_WIDTH, TARGET_HEIGHT, TARGET_ORIGIN_X, TARGET_ORIGIN_Y, TARGET_GLOBAL_ORIGIN_X, TARGET_GLOBAL_ORIGIN_Y));
        currentKeysToTransform = new ArrayList<>(Arrays.asList(CURRENT_WIDTH, CURRENT_HEIGHT, CURRENT_ORIGIN_X, CURRENT_ORIGIN_Y, CURRENT_GLOBAL_ORIGIN_X, CURRENT_GLOBAL_ORIGIN_Y));
    }

    private void addCurrentConfig(HashMap<String, Object> hashMap) {
        hashMap.put(CURRENT_ORIGIN_Y, Integer.valueOf(this.originY));
        hashMap.put(CURRENT_ORIGIN_X, Integer.valueOf(this.originX));
        hashMap.put(CURRENT_GLOBAL_ORIGIN_Y, Integer.valueOf(this.globalOriginY));
        hashMap.put(CURRENT_GLOBAL_ORIGIN_X, Integer.valueOf(this.globalOriginX));
        hashMap.put(CURRENT_HEIGHT, Integer.valueOf(this.height));
        hashMap.put(CURRENT_WIDTH, Integer.valueOf(this.width));
    }

    private void addTargetConfig(HashMap<String, Object> hashMap) {
        hashMap.put(TARGET_ORIGIN_Y, Integer.valueOf(this.originY));
        hashMap.put(TARGET_ORIGIN_X, Integer.valueOf(this.originX));
        hashMap.put(TARGET_GLOBAL_ORIGIN_Y, Integer.valueOf(this.globalOriginY));
        hashMap.put(TARGET_GLOBAL_ORIGIN_X, Integer.valueOf(this.globalOriginX));
        hashMap.put(TARGET_HEIGHT, Integer.valueOf(this.height));
        hashMap.put(TARGET_WIDTH, Integer.valueOf(this.width));
    }

    public HashMap<String, Object> toCurrentMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        addCurrentConfig(hashMap);
        return hashMap;
    }

    public HashMap<String, Object> toLayoutMap(Snapshot snapshot) {
        HashMap<String, Object> targetMap = snapshot.toTargetMap();
        addCurrentConfig(targetMap);
        return targetMap;
    }

    public HashMap<String, Object> toTargetMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        addTargetConfig(hashMap);
        return hashMap;
    }
}
