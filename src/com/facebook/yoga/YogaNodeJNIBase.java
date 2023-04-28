package com.facebook.yoga;

import com.facebook.yoga.YogaNode;
import java.util.ArrayList;
import java.util.List;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public abstract class YogaNodeJNIBase extends YogaNode implements Cloneable {
    @AbstractC6709a
    private float[] arr;

    /* renamed from: k */
    private YogaNodeJNIBase f8862k;

    /* renamed from: l */
    private List<YogaNodeJNIBase> f8863l;

    /* renamed from: m */
    private YogaMeasureFunction f8864m;
    @AbstractC6709a
    private int mLayoutDirection;

    /* renamed from: n */
    private YogaBaselineFunction f8865n;

    /* renamed from: o */
    protected long f8866o;

    /* renamed from: p */
    private Object f8867p;

    /* renamed from: q */
    private boolean f8868q;

    /* renamed from: com.facebook.yoga.YogaNodeJNIBase$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C5121a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8869a;

        static {
            int[] iArr = new int[EnumC5127e.values().length];
            f8869a = iArr;
            try {
                iArr[EnumC5127e.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8869a[EnumC5127e.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8869a[EnumC5127e.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8869a[EnumC5127e.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8869a[EnumC5127e.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8869a[EnumC5127e.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f8868q = true;
        if (j != 0) {
            this.f8866o = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    /* renamed from: n0 */
    private void m30620n0(YogaNode yogaNode) {
        Object o0 = m30618o0();
        if (o0 instanceof YogaNode.AbstractC5120a) {
            ((YogaNode.AbstractC5120a) o0).m30671a(this, yogaNode);
        }
    }

    /* renamed from: q0 */
    private static YogaValue m30615q0(long j) {
        return new YogaValue(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @AbstractC6709a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.f8863l;
        if (list != null) {
            list.remove(i);
            this.f8863l.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f8862k = this;
            return yogaNodeJNIBase.f8866o;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: A */
    public void mo30670A(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: B */
    public void mo30669B(YogaBaselineFunction yogaBaselineFunction) {
        boolean z;
        this.f8865n = yogaBaselineFunction;
        long j = this.f8866o;
        if (yogaBaselineFunction != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(j, z);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: C */
    public void mo30668C(EnumC5127e eVar, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f8866o, eVar.m30594b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: D */
    public void mo30667D(Object obj) {
        this.f8867p = obj;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: E */
    public void mo30666E(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f8866o, yogaDirection.m30676b());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: F */
    public void mo30665F(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f8866o, yogaDisplay.m30675a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: G */
    public void mo30664G(float f) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: H */
    public void mo30663H(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: I */
    public void mo30662I() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f8866o);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: J */
    public void mo30661J(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: K */
    public void mo30660K(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f8866o, yogaFlexDirection.m30674a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: L */
    public void mo30659L(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: M */
    public void mo30658M(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: N */
    public void mo30657N(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: O */
    public void mo30656O() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f8866o);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: P */
    public void mo30655P(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: Q */
    public void mo30654Q(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f8866o, yogaJustify.m30673a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: R */
    public void mo30653R(EnumC5127e eVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f8866o, eVar.m30594b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: S */
    public void mo30652S(EnumC5127e eVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f8866o, eVar.m30594b());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: T */
    public void mo30651T(EnumC5127e eVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f8866o, eVar.m30594b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: U */
    public void mo30650U(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: V */
    public void mo30649V(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: W */
    public void mo30648W(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: X */
    public void mo30647X(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: Y */
    public void mo30646Y(YogaMeasureFunction yogaMeasureFunction) {
        boolean z;
        this.f8864m = yogaMeasureFunction;
        long j = this.f8866o;
        if (yogaMeasureFunction != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(j, z);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: Z */
    public void mo30645Z(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: a */
    public void mo30644a(YogaNode yogaNode, int i) {
        if (yogaNode instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) yogaNode;
            if (yogaNodeJNIBase.f8862k == null) {
                if (this.f8863l == null) {
                    this.f8863l = new ArrayList(4);
                }
                this.f8863l.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.f8862k = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.f8866o, yogaNodeJNIBase.f8866o, i);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: a0 */
    public void mo30643a0(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: b0 */
    public void mo30642b0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f8866o, f);
    }

    @AbstractC6709a
    public final float baseline(float f, float f2) {
        return this.f8865n.baseline(this, f, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: c */
    public void mo30641c(float f, float f2) {
        m30620n0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f8863l;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.m30620n0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f8866o;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f8866o, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: c0 */
    public void mo30640c0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: d */
    public void mo30639d() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f8866o);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: d0 */
    public void mo30638d0(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f8866o, yogaOverflow.m30605a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: e */
    public float mo30637e() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f8866o);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: e0 */
    public void mo30636e0(EnumC5127e eVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f8866o, eVar.m30594b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: f */
    public YogaValue mo30635f() {
        return m30615q0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f8866o));
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: f0 */
    public void mo30634f0(EnumC5127e eVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f8866o, eVar.m30594b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: g0 */
    public void mo30633g0(EnumC5127e eVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f8866o, eVar.m30594b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: h */
    public YogaDirection mo30632h() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        return YogaDirection.m30677a(i);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: h0 */
    public void mo30631h0(EnumC5127e eVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f8866o, eVar.m30594b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: i0 */
    public void mo30630i0(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f8866o, yogaPositionType.m30604a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: j */
    public float mo30629j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: j0 */
    public void mo30628j0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: k */
    public float mo30627k(EnumC5127e eVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        float f = fArr[0];
        if ((((int) f) & 2) != 2) {
            return 0.0f;
        }
        if ((((int) f) & 1) != 1) {
            i = 4;
        }
        int i2 = 10 - i;
        switch (C5121a.f8869a[eVar.ordinal()]) {
            case 1:
                return this.arr[i2];
            case 2:
                return this.arr[i2 + 1];
            case 3:
                return this.arr[i2 + 2];
            case 4:
                return this.arr[i2 + 3];
            case 5:
                if (mo30632h() == YogaDirection.RTL) {
                    return this.arr[i2 + 2];
                }
                return this.arr[i2];
            case 6:
                if (mo30632h() == YogaDirection.RTL) {
                    return this.arr[i2];
                }
                return this.arr[i2 + 2];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: k0 */
    public void mo30626k0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f8866o);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: l */
    public float mo30625l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: l0 */
    public void mo30624l0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f8866o, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: m */
    public float mo30623m() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: m0 */
    public void mo30622m0(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f8866o, yogaWrap.m30601a());
    }

    @AbstractC6709a
    public final long measure(float f, int i, float f2, int i2) {
        if (mo30612t()) {
            return this.f8864m.measure(this, f, YogaMeasureMode.m30672a(i), f2, YogaMeasureMode.m30672a(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: n */
    public float mo30621n() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: o */
    public YogaValue mo30619o(EnumC5127e eVar) {
        return m30615q0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f8866o, eVar.m30594b()));
    }

    /* renamed from: o0 */
    public Object m30618o0() {
        return this.f8867p;
    }

    /* renamed from: p0 */
    public YogaNodeJNIBase mo30610v(int i) {
        List<YogaNodeJNIBase> list = this.f8863l;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.f8862k = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f8866o, remove.f8866o);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: q */
    public YogaValue mo30616q() {
        return m30615q0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f8866o));
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: r */
    public boolean mo30614r() {
        float[] fArr = this.arr;
        if (fArr == null) {
            return this.f8868q;
        }
        if ((((int) fArr[0]) & 16) == 16) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: s */
    public boolean mo30613s() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f8866o);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: t */
    public boolean mo30612t() {
        return this.f8864m != null;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: u */
    public void mo30611u() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f8868q = false;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: w */
    public void mo30609w() {
        this.f8864m = null;
        this.f8865n = null;
        this.f8867p = null;
        this.arr = null;
        this.f8868q = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f8866o);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: x */
    public void mo30608x(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f8866o, yogaAlign.m30678a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: y */
    public void mo30607y(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f8866o, yogaAlign.m30678a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: z */
    public void mo30606z(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f8866o, yogaAlign.m30678a());
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaNodeJNIBase(YogaConfig yogaConfig) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((AbstractC5124b) yogaConfig).f8897a));
    }
}
