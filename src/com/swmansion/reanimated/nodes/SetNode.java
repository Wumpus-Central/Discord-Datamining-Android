package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.MapUtils;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes8.dex */
public class SetNode extends Node {
    private int mValueNodeID;
    private int mWhatNodeID;

    public SetNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        this.mWhatNodeID = MapUtils.getInt(readableMap, "what", "Reanimated: First argument passed to set node is either of wrong type or is missing.");
        this.mValueNodeID = MapUtils.getInt(readableMap, "value", "Reanimated: Second argument passed to set node is either of wrong type or is missing.");
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        Object nodeValue = this.mNodesManager.getNodeValue(this.mValueNodeID);
        ((ValueNode) this.mNodesManager.findNodeById(this.mWhatNodeID, ValueNode.class)).setValue(nodeValue);
        return nodeValue;
    }
}
