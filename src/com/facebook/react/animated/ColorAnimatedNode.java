package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.view.ColorUtil;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
class ColorAnimatedNode extends AnimatedNode implements AnimatedNodeWithUpdateableConfig {
    private int mANodeId;
    private int mBNodeId;
    private int mGNodeId;
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;
    private ReadableMap mNativeColor;
    private boolean mNativeColorApplied;
    private int mRNodeId;
    private final ReactApplicationContext mReactApplicationContext;

    public ColorAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager, ReactApplicationContext reactApplicationContext) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mReactApplicationContext = reactApplicationContext;
        onUpdateConfig(readableMap);
    }

    private Context getContext() {
        Activity currentActivity = this.mReactApplicationContext.getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        return getContextHelper(this);
    }

    private static Context getContextHelper(AnimatedNode animatedNode) {
        List<AnimatedNode> list = animatedNode.mChildren;
        if (list != null) {
            Iterator<AnimatedNode> it = list.iterator();
            if (it.hasNext()) {
                AnimatedNode next = it.next();
                if (!(next instanceof PropsAnimatedNode)) {
                    return getContextHelper(next);
                }
                View connectedView = ((PropsAnimatedNode) next).getConnectedView();
                if (connectedView != null) {
                    return connectedView.getContext();
                }
                return null;
            }
        }
        return null;
    }

    private void tryApplyNativeColor() {
        Context context;
        if (this.mNativeColor != null && !this.mNativeColorApplied && (context = getContext()) != null) {
            int intValue = ColorPropConverter.getColor(this.mNativeColor, context).intValue();
            ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mRNodeId)).mValue = Color.red(intValue);
            ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mGNodeId)).mValue = Color.green(intValue);
            ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mBNodeId)).mValue = Color.blue(intValue);
            ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mANodeId)).mValue = Color.alpha(intValue) / 255.0d;
            this.mNativeColorApplied = true;
        }
    }

    public int getColor() {
        tryApplyNativeColor();
        return ColorUtil.normalize(((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mRNodeId)).getValue(), ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mGNodeId)).getValue(), ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mBNodeId)).getValue(), ((ValueAnimatedNode) this.mNativeAnimatedNodesManager.getNodeById(this.mANodeId)).getValue());
    }

    @Override // com.facebook.react.animated.AnimatedNodeWithUpdateableConfig
    public void onUpdateConfig(ReadableMap readableMap) {
        this.mRNodeId = readableMap.getInt("r");
        this.mGNodeId = readableMap.getInt("g");
        this.mBNodeId = readableMap.getInt("b");
        this.mANodeId = readableMap.getInt("a");
        this.mNativeColor = readableMap.getMap("nativeColor");
        this.mNativeColorApplied = false;
        tryApplyNativeColor();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "ColorAnimatedNode[" + this.mTag + "]: r: " + this.mRNodeId + " g: " + this.mGNodeId + " b: " + this.mBNodeId + " a: " + this.mANodeId;
    }
}
