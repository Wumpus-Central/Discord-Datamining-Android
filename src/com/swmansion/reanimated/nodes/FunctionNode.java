package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes8.dex */
public class FunctionNode extends Node {
    private final int mWhatNodeID;

    public FunctionNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        this.mWhatNodeID = readableMap.getInt("what");
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        return this.mNodesManager.findNodeById(this.mWhatNodeID, Node.class).value();
    }
}
