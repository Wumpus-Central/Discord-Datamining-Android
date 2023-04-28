package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.MapUtils;
import com.swmansion.reanimated.NodesManager;

/* loaded from: classes8.dex */
public class AlwaysNode extends Node implements FinalNode {
    private int mNodeToBeEvaluated;

    public AlwaysNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        this.mNodeToBeEvaluated = MapUtils.getInt(readableMap, "what", "Reanimated: Argument passed to always node is either of wrong type or is missing.");
    }

    @Override // com.swmansion.reanimated.nodes.FinalNode
    public void update() {
        value();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public Double evaluate() {
        this.mNodesManager.findNodeById(this.mNodeToBeEvaluated, Node.class).value();
        return Node.ZERO;
    }
}
