package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes7.dex */
class DiffClampAnimatedNode extends ValueAnimatedNode {
    private final int mInputNodeTag;
    private double mLastValue = 0.0d;
    private final double mMax;
    private final double mMin;
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;

    public DiffClampAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mInputNodeTag = readableMap.getInt("input");
        this.mMin = readableMap.getDouble("min");
        this.mMax = readableMap.getDouble("max");
        this.mValue = 0.0d;
    }

    private double getInputNodeValue() {
        AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(this.mInputNodeTag);
        if (nodeById != null && (nodeById instanceof ValueAnimatedNode)) {
            return ((ValueAnimatedNode) nodeById).getValue();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "DiffClampAnimatedNode[" + this.mTag + "]: InputNodeTag: " + this.mInputNodeTag + " min: " + this.mMin + " max: " + this.mMax + " lastValue: " + this.mLastValue + " super: " + super.prettyPrint();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        double inputNodeValue = getInputNodeValue();
        double d = inputNodeValue - this.mLastValue;
        this.mLastValue = inputNodeValue;
        this.mValue = Math.min(Math.max(this.mValue + d, this.mMin), this.mMax);
    }
}
