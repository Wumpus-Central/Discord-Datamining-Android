package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.Utils;

/* loaded from: classes8.dex */
public class OperatorNode extends Node {
    private final int[] mInputIDs;
    private final Node[] mInputNodes;
    private final Operator mOperator;
    private static final Operator ADD = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.1
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return d.doubleValue() + d2.doubleValue();
        }
    };
    private static final Operator SUB = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.2
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return d.doubleValue() - d2.doubleValue();
        }
    };
    private static final Operator MULTIPLY = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.3
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return d.doubleValue() * d2.doubleValue();
        }
    };
    private static final Operator DIVIDE = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.4
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return d.doubleValue() / d2.doubleValue();
        }
    };
    private static final Operator POW = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.5
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return Math.pow(d.doubleValue(), d2.doubleValue());
        }
    };
    private static final Operator MODULO = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.6
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return ((d.doubleValue() % d2.doubleValue()) + d2.doubleValue()) % d2.doubleValue();
        }
    };
    private static final Operator SQRT = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.7
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.sqrt(d.doubleValue());
        }
    };
    private static final Operator LOG = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.8
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.log(d.doubleValue());
        }
    };
    private static final Operator SIN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.9
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.sin(d.doubleValue());
        }
    };
    private static final Operator COS = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.10
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.cos(d.doubleValue());
        }
    };
    private static final Operator TAN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.11
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.tan(d.doubleValue());
        }
    };
    private static final Operator ACOS = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.12
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.acos(d.doubleValue());
        }
    };
    private static final Operator ASIN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.13
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.asin(d.doubleValue());
        }
    };
    private static final Operator ATAN = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.14
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.atan(d.doubleValue());
        }
    };
    private static final Operator EXP = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.15
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.exp(d.doubleValue());
        }
    };
    private static final Operator ROUND = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.16
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.round(d.doubleValue());
        }
    };
    private static final Operator ABS = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.17
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.abs(d.doubleValue());
        }
    };
    private static final Operator FLOOR = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.18
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.floor(d.doubleValue());
        }
    };
    private static final Operator CEIL = new SingleOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.19
        @Override // com.swmansion.reanimated.nodes.OperatorNode.SingleOperator
        public double eval(Double d) {
            return Math.ceil(d.doubleValue());
        }
    };
    private static final Operator MIN = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.20
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return Math.min(d.doubleValue(), d2.doubleValue());
        }
    };
    private static final Operator MAX = new ReduceOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.21
        @Override // com.swmansion.reanimated.nodes.OperatorNode.ReduceOperator
        public double reduce(Double d, Double d2) {
            return Math.max(d.doubleValue(), d2.doubleValue());
        }
    };
    private static final Operator AND = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.22
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            boolean truthy = OperatorNode.truthy(nodeArr[0].value());
            for (int i = 1; i < nodeArr.length && truthy; i++) {
                if (!truthy || !OperatorNode.truthy(nodeArr[i].value())) {
                    truthy = false;
                } else {
                    truthy = true;
                }
            }
            if (truthy) {
                return 1.0d;
            }
            return 0.0d;
        }
    };

    /* renamed from: OR */
    private static final Operator f37673OR = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.23
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            boolean truthy = OperatorNode.truthy(nodeArr[0].value());
            for (int i = 1; i < nodeArr.length && !truthy; i++) {
                if (truthy || OperatorNode.truthy(nodeArr[i].value())) {
                    truthy = true;
                } else {
                    truthy = false;
                }
            }
            if (truthy) {
                return 1.0d;
            }
            return 0.0d;
        }
    };
    private static final Operator NOT = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.24
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            return OperatorNode.truthy(nodeArr[0].value()) ? 0.0d : 1.0d;
        }
    };
    private static final Operator DEFINED = new Operator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.25
        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            Object value = nodeArr[0].value();
            if (value == null || ((value instanceof Double) && ((Double) value).isNaN())) {
                return 0.0d;
            }
            return 1.0d;
        }
    };
    private static final Operator LESS_THAN = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.26
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() >= d2.doubleValue()) ? false : true;
        }
    };

    /* renamed from: EQ */
    private static final Operator f37672EQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.27
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d, Double d2) {
            return (d == null || d2 == null) ? d == d2 : d.doubleValue() == d2.doubleValue();
        }
    };
    private static final Operator GREATER_THAN = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.28
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d, Double d2) {
            return (d == null || d2 == null || d.doubleValue() <= d2.doubleValue()) ? false : true;
        }
    };
    private static final Operator LESS_OR_EQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.29
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d, Double d2) {
            return d.doubleValue() <= d2.doubleValue();
        }
    };
    private static final Operator GREATER_OR_EQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.30
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d, Double d2) {
            return d.doubleValue() >= d2.doubleValue();
        }
    };
    private static final Operator NEQ = new CompOperator() { // from class: com.swmansion.reanimated.nodes.OperatorNode.31
        @Override // com.swmansion.reanimated.nodes.OperatorNode.CompOperator
        public boolean eval(Double d, Double d2) {
            return (d == null || d2 == null) ? d == d2 : d.doubleValue() != d2.doubleValue();
        }
    };

    /* loaded from: classes8.dex */
    private static abstract class CompOperator implements Operator {
        private CompOperator() {
        }

        public abstract boolean eval(Double d, Double d2);

        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            return eval((Double) nodeArr[0].value(), (Double) nodeArr[1].value()) ? 1.0d : 0.0d;
        }
    }

    /* loaded from: classes8.dex */
    private interface Operator {
        double evaluate(Node[] nodeArr);
    }

    /* loaded from: classes8.dex */
    private static abstract class ReduceOperator implements Operator {
        private ReduceOperator() {
        }

        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            double doubleValue = nodeArr[0].doubleValue().doubleValue();
            for (int i = 1; i < nodeArr.length; i++) {
                doubleValue = reduce(Double.valueOf(doubleValue), nodeArr[i].doubleValue());
            }
            return doubleValue;
        }

        public abstract double reduce(Double d, Double d2);
    }

    /* loaded from: classes8.dex */
    private static abstract class SingleOperator implements Operator {
        private SingleOperator() {
        }

        public abstract double eval(Double d);

        @Override // com.swmansion.reanimated.nodes.OperatorNode.Operator
        public double evaluate(Node[] nodeArr) {
            return eval((Double) nodeArr[0].value());
        }
    }

    public OperatorNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        int[] processIntArray = Utils.processIntArray(readableMap.getArray("input"));
        this.mInputIDs = processIntArray;
        this.mInputNodes = new Node[processIntArray.length];
        String string = readableMap.getString("op");
        if ("add".equals(string)) {
            this.mOperator = ADD;
        } else if ("sub".equals(string)) {
            this.mOperator = SUB;
        } else if ("multiply".equals(string)) {
            this.mOperator = MULTIPLY;
        } else if ("divide".equals(string)) {
            this.mOperator = DIVIDE;
        } else if ("pow".equals(string)) {
            this.mOperator = POW;
        } else if ("modulo".equals(string)) {
            this.mOperator = MODULO;
        } else if ("sqrt".equals(string)) {
            this.mOperator = SQRT;
        } else if ("log".equals(string)) {
            this.mOperator = LOG;
        } else if ("sin".equals(string)) {
            this.mOperator = SIN;
        } else if ("cos".equals(string)) {
            this.mOperator = COS;
        } else if ("tan".equals(string)) {
            this.mOperator = TAN;
        } else if ("acos".equals(string)) {
            this.mOperator = ACOS;
        } else if ("asin".equals(string)) {
            this.mOperator = ASIN;
        } else if ("atan".equals(string)) {
            this.mOperator = ATAN;
        } else if ("exp".equals(string)) {
            this.mOperator = EXP;
        } else if ("round".equals(string)) {
            this.mOperator = ROUND;
        } else if ("and".equals(string)) {
            this.mOperator = AND;
        } else if ("or".equals(string)) {
            this.mOperator = f37673OR;
        } else if ("not".equals(string)) {
            this.mOperator = NOT;
        } else if ("defined".equals(string)) {
            this.mOperator = DEFINED;
        } else if ("lessThan".equals(string)) {
            this.mOperator = LESS_THAN;
        } else if ("eq".equals(string)) {
            this.mOperator = f37672EQ;
        } else if ("greaterThan".equals(string)) {
            this.mOperator = GREATER_THAN;
        } else if ("lessOrEq".equals(string)) {
            this.mOperator = LESS_OR_EQ;
        } else if ("greaterOrEq".equals(string)) {
            this.mOperator = GREATER_OR_EQ;
        } else if ("neq".equals(string)) {
            this.mOperator = NEQ;
        } else if ("abs".equals(string)) {
            this.mOperator = ABS;
        } else if ("floor".equals(string)) {
            this.mOperator = FLOOR;
        } else if ("ceil".equals(string)) {
            this.mOperator = CEIL;
        } else if ("max".equals(string)) {
            this.mOperator = MAX;
        } else if ("min".equals(string)) {
            this.mOperator = MIN;
        } else {
            throw new JSApplicationIllegalArgumentException("Unrecognized operator " + string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean truthy(Object obj) {
        return obj != null && !obj.equals(Double.valueOf(0.0d));
    }

    @Override // com.swmansion.reanimated.nodes.Node
    protected Object evaluate() {
        int i = 0;
        while (true) {
            int[] iArr = this.mInputIDs;
            if (i >= iArr.length) {
                return Double.valueOf(this.mOperator.evaluate(this.mInputNodes));
            }
            this.mInputNodes[i] = this.mNodesManager.findNodeById(iArr[i], Node.class);
            i++;
        }
    }
}
