package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.NodesManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class EventNode extends Node implements RCTEventEmitter {
    private final List<EventMap> mMapping;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public static class EventMap {
        private final int nodeID;
        private final String[] path;

        public EventMap(ReadableArray readableArray) {
            int size = readableArray.size() - 1;
            this.path = new String[size];
            for (int i = 0; i < size; i++) {
                this.path[i] = readableArray.getString(i);
            }
            this.nodeID = readableArray.getInt(size);
        }

        public Double lookupValue(ReadableMap readableMap) {
            String[] strArr;
            int i = 0;
            while (readableMap != null) {
                String[] strArr2 = this.path;
                if (i >= strArr2.length - 1) {
                    break;
                }
                String str = strArr2[i];
                if (readableMap.hasKey(str)) {
                    readableMap = readableMap.getMap(str);
                } else {
                    readableMap = null;
                }
                i++;
            }
            if (readableMap == null) {
                return null;
            }
            String str2 = this.path[strArr.length - 1];
            if (readableMap.hasKey(str2)) {
                return Double.valueOf(readableMap.getDouble(str2));
            }
            return null;
        }
    }

    public EventNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        this.mMapping = processMapping(readableMap.getArray("argMapping"));
    }

    private static List<EventMap> processMapping(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new EventMap(readableArray.getArray(i)));
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap != null) {
            for (int i2 = 0; i2 < this.mMapping.size(); i2++) {
                EventMap eventMap = this.mMapping.get(i2);
                Double lookupValue = eventMap.lookupValue(writableMap);
                if (lookupValue != null) {
                    ((ValueNode) this.mNodesManager.findNodeById(eventMap.nodeID, ValueNode.class)).setValue(lookupValue);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Animated events must have event data.");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by animated events");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.Node
    public Double evaluate() {
        return Node.ZERO;
    }
}
