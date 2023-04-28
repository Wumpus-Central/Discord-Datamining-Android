package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.UpdateContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes8.dex */
public abstract class Node {
    private List<Node> mChildren;
    private final Map<String, Long> mLastLoopID;
    private final Map<String, Object> mMemoizedValue = new HashMap();
    protected final int mNodeID;
    protected final NodesManager mNodesManager;
    protected final UpdateContext mUpdateContext;
    public static final Double ZERO = Double.valueOf(0.0d);
    public static final Double ONE = Double.valueOf(1.0d);

    public Node(int i, ReadableMap readableMap, NodesManager nodesManager) {
        HashMap hashMap = new HashMap();
        this.mLastLoopID = hashMap;
        hashMap.put("", -1L);
        this.mNodeID = i;
        this.mNodesManager = nodesManager;
        this.mUpdateContext = nodesManager.updateContext;
    }

    private static void findAndUpdateNodes(Node node, Set<Node> set, Stack<FinalNode> stack) {
        if (!set.contains(node)) {
            set.add(node);
            List<Node> list = node.mChildren;
            if (list != null) {
                for (Node node2 : list) {
                    findAndUpdateNodes(node2, set, stack);
                }
            }
            if (node instanceof FinalNode) {
                stack.push((FinalNode) node);
            }
        }
    }

    public static void runUpdates(UpdateContext updateContext) {
        UiThreadUtil.assertOnUiThread();
        ArrayList<Node> arrayList = updateContext.updatedNodes;
        HashSet hashSet = new HashSet();
        Stack stack = new Stack();
        for (int i = 0; i < arrayList.size(); i++) {
            findAndUpdateNodes(arrayList.get(i), hashSet, stack);
            if (i == arrayList.size() - 1) {
                while (!stack.isEmpty()) {
                    ((FinalNode) stack.pop()).update();
                }
            }
        }
        arrayList.clear();
        updateContext.updateLoopID++;
    }

    public void addChild(Node node) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.add(node);
        node.dangerouslyRescheduleEvaluate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dangerouslyRescheduleEvaluate() {
        this.mLastLoopID.put(this.mUpdateContext.callID, -1L);
        markUpdated();
    }

    public final Double doubleValue() {
        Object value = value();
        if (value == null) {
            return ZERO;
        }
        if (value instanceof Double) {
            return (Double) value;
        }
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (!(value instanceof Boolean)) {
            throw new IllegalStateException("Value of node " + this + " cannot be cast to a number");
        } else if (((Boolean) value).booleanValue()) {
            return ONE;
        } else {
            return ZERO;
        }
    }

    protected abstract Object evaluate();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void forceUpdateMemoizedValue(Object obj) {
        this.mMemoizedValue.put(this.mUpdateContext.callID, obj);
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void markUpdated() {
        UiThreadUtil.assertOnUiThread();
        this.mUpdateContext.updatedNodes.add(this);
        this.mNodesManager.postRunUpdatesAfterAnimation();
    }

    public void onDrop() {
    }

    public void removeChild(Node node) {
        List<Node> list = this.mChildren;
        if (list != null) {
            list.remove(node);
        }
    }

    public final Object value() {
        if (this.mLastLoopID.containsKey(this.mUpdateContext.callID)) {
            long longValue = this.mLastLoopID.get(this.mUpdateContext.callID).longValue();
            UpdateContext updateContext = this.mUpdateContext;
            if (longValue >= updateContext.updateLoopID) {
                return this.mMemoizedValue.get(updateContext.callID);
            }
        }
        Map<String, Long> map = this.mLastLoopID;
        UpdateContext updateContext2 = this.mUpdateContext;
        map.put(updateContext2.callID, Long.valueOf(updateContext2.updateLoopID));
        Object evaluate = evaluate();
        this.mMemoizedValue.put(this.mUpdateContext.callID, evaluate);
        return evaluate;
    }
}
