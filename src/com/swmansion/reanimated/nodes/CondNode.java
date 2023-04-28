package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.MapUtils;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes8.dex */
public class CondNode extends Node {
    private final int mCondID;
    private final int mElseBlockID;
    private final int mIfBlockID;

    public CondNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        int i2;
        this.mCondID = MapUtils.getInt(readableMap, "cond", "Reanimated: First argument passed to cond node is either of wrong type or is missing.");
        this.mIfBlockID = MapUtils.getInt(readableMap, "ifBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
        if (readableMap.hasKey("elseBlock")) {
            i2 = MapUtils.getInt(readableMap, "elseBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
        } else {
            i2 = -1;
        }
        this.mElseBlockID = i2;
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        Object nodeValue = this.mNodesManager.getNodeValue(this.mCondID);
        if (!(nodeValue instanceof Number) || ((Number) nodeValue).doubleValue() == 0.0d) {
            int i = this.mElseBlockID;
            if (i != -1) {
                return this.mNodesManager.getNodeValue(i);
            }
            return Node.ZERO;
        }
        int i2 = this.mIfBlockID;
        if (i2 != -1) {
            return this.mNodesManager.getNodeValue(i2);
        }
        return Node.ZERO;
    }
}
