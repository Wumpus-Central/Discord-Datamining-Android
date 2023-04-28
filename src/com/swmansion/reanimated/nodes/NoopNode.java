package com.swmansion.reanimated.nodes;

import com.swmansion.reanimated.NodesManager;

/* loaded from: classes8.dex */
public class NoopNode extends ValueNode {
    public NoopNode(NodesManager nodesManager) {
        super(-2, null, nodesManager);
    }

    @Override // com.swmansion.reanimated.nodes.Node
    public void addChild(Node node) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public void markUpdated() {
    }

    @Override // com.swmansion.reanimated.nodes.Node
    public void removeChild(Node node) {
    }

    @Override // com.swmansion.reanimated.nodes.ValueNode
    public void setValue(Object obj) {
    }
}
