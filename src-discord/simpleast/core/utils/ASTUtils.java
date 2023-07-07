package com.discord.simpleast.core.utils;

import com.discord.simpleast.core.node.Node;
import java.util.Collection;

/* loaded from: classes8.dex */
public class ASTUtils {
    public static void traversePostOrder(Collection<? extends Node> collection, NodeProcessor nodeProcessor) {
        for (Node node : collection) {
            traversePostOrderSubtree(node, nodeProcessor);
        }
    }

    private static void traversePostOrderSubtree(Node node, NodeProcessor nodeProcessor) {
        if (node.hasChildren()) {
            for (Node node2 : node.getChildren()) {
                traversePostOrderSubtree(node2, nodeProcessor);
            }
        }
        nodeProcessor.processNode(node);
    }

    public static void traversePreOrder(Collection<? extends Node> collection, NodeProcessor nodeProcessor) {
        for (Node node : collection) {
            traversePreOrderSubtree(node, nodeProcessor);
        }
    }

    private static void traversePreOrderSubtree(Node node, NodeProcessor nodeProcessor) {
        nodeProcessor.processNode(node);
        if (node.hasChildren()) {
            for (Node node2 : node.getChildren()) {
                traversePreOrderSubtree(node2, nodeProcessor);
            }
        }
    }
}
