package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes8.dex */
public class ValueNode extends Node {
    private Object mValue;

    public ValueNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        if (readableMap == null || !readableMap.hasKey("value")) {
            this.mValue = null;
            return;
        }
        ReadableType type = readableMap.getType("value");
        if (type == ReadableType.String) {
            this.mValue = readableMap.getString("value");
        } else if (type == ReadableType.Number) {
            this.mValue = Double.valueOf(readableMap.getDouble("value"));
        } else if (type == ReadableType.Null) {
            this.mValue = null;
        } else {
            throw new IllegalStateException("Not supported value type. Must be boolean, number or string");
        }
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        return this.mValue;
    }

    public void setValue(Object obj) {
        this.mValue = obj;
        forceUpdateMemoizedValue(obj);
    }
}
