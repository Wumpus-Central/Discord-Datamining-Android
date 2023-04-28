package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.Utils;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ConcatNode extends Node {
    private static final NumberFormat sFormatter;
    private final int[] mInputIDs;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        sFormatter = instance;
        instance.setMinimumFractionDigits(0);
        instance.setGroupingUsed(false);
    }

    public ConcatNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        this.mInputIDs = Utils.processIntArray(readableMap.getArray("input"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public String evaluate() {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (true) {
            int[] iArr = this.mInputIDs;
            if (i >= iArr.length) {
                return sb2.toString();
            }
            Object value = this.mNodesManager.findNodeById(iArr[i], Node.class).value();
            if (value instanceof Double) {
                value = sFormatter.format((Double) value);
            }
            sb2.append(value);
            i++;
        }
    }
}
