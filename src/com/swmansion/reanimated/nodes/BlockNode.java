package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.Utils;

/* loaded from: classes8.dex */
public class BlockNode extends Node {
    private final int[] mBlock;

    public BlockNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        this.mBlock = Utils.processIntArray(readableMap.getArray("block"));
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        Object obj = null;
        int i = 0;
        while (true) {
            int[] iArr = this.mBlock;
            if (i >= iArr.length) {
                return obj;
            }
            obj = this.mNodesManager.findNodeById(iArr[i], Node.class).value();
            i++;
        }
    }
}
