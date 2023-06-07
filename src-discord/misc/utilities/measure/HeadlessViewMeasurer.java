package com.discord.misc.utilities.measure;

import android.util.Size;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0018B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J'\u0010\f\u001a\u00020\r\"\b\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u0002H\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0011J1\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0017R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer;", "T", "Landroid/view/View;", "", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "shadowView", "Landroid/view/View;", "getMeasureSpecMode", "", "size", "measure", "Landroid/util/Size;", "view", "measureBounds", "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "(Landroid/view/View;Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;)Landroid/util/Size;", "context", "Landroid/content/Context;", "configureView", "Lkotlin/Function1;", "", "measure$misc_utilities_release", "MeasureBounds", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeadlessViewMeasurer<T extends View> {
    private final Class<T> clazz;
    private T shadowView;

    public HeadlessViewMeasurer(Class<T> clazz) {
        q.g(clazz, "clazz");
        this.clazz = clazz;
    }

    private final int getMeasureSpecMode(int i10) {
        return i10 == 0 ? 0 : 1073741824;
    }

    private final <T extends View> Size measure(T t10, MeasureBounds measureBounds) {
        int i10;
        Integer widthPx = measureBounds.getWidthPx();
        int i11 = 0;
        if (widthPx != null) {
            i10 = widthPx.intValue();
        } else {
            i10 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, getMeasureSpecMode(i10));
        Integer heightPx = measureBounds.getHeightPx();
        if (heightPx != null) {
            i11 = heightPx.intValue();
        }
        t10.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i11, getMeasureSpecMode(i11)));
        return new Size(t10.getMeasuredWidth(), t10.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.getContext() != r8) goto L_0x0022;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Size measure$misc_utilities_release(android.content.Context r8, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r9, com.discord.misc.utilities.measure.HeadlessViewMeasurer.MeasureBounds r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.g(r8, r0)
            java.lang.String r0 = "configureView"
            kotlin.jvm.internal.q.g(r9, r0)
            java.lang.String r0 = "measureBounds"
            kotlin.jvm.internal.q.g(r10, r0)
            T extends android.view.View r0 = r7.shadowView
            r1 = 0
            java.lang.String r2 = "shadowView"
            if (r0 == 0) goto L_0x0022
            if (r0 != 0) goto L_0x001c
            kotlin.jvm.internal.q.y(r2)
            r0 = r1
        L_0x001c:
            android.content.Context r0 = r0.getContext()
            if (r0 == r8) goto L_0x0041
        L_0x0022:
            java.lang.Class<T extends android.view.View> r0 = r7.clazz
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r8
            java.lang.Object r8 = r0.newInstance(r3)
            java.lang.String r0 = "null cannot be cast to non-null type T of com.discord.misc.utilities.measure.HeadlessViewMeasurer"
            kotlin.jvm.internal.q.e(r8, r0)
            android.view.View r8 = (android.view.View) r8
            r7.shadowView = r8
        L_0x0041:
            T extends android.view.View r8 = r7.shadowView
            if (r8 != 0) goto L_0x0049
            kotlin.jvm.internal.q.y(r2)
            r8 = r1
        L_0x0049:
            r9.invoke(r8)
            T extends android.view.View r8 = r7.shadowView
            if (r8 != 0) goto L_0x0054
            kotlin.jvm.internal.q.y(r2)
            goto L_0x0055
        L_0x0054:
            r1 = r8
        L_0x0055:
            android.util.Size r8 = r7.measure(r1, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.measure.HeadlessViewMeasurer.measure$misc_utilities_release(android.content.Context, kotlin.jvm.functions.Function1, com.discord.misc.utilities.measure.HeadlessViewMeasurer$MeasureBounds):android.util.Size");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "", "widthPx", "", "heightPx", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeightPx", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidthPx", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "equals", "", "other", "hashCode", "toString", "", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MeasureBounds {
        private final Integer heightPx;
        private final Integer widthPx;

        public MeasureBounds() {
            this(null, null, 3, null);
        }

        public MeasureBounds(Integer num, Integer num2) {
            this.widthPx = num;
            this.heightPx = num2;
        }

        public static /* synthetic */ MeasureBounds copy$default(MeasureBounds measureBounds, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = measureBounds.widthPx;
            }
            if ((i10 & 2) != 0) {
                num2 = measureBounds.heightPx;
            }
            return measureBounds.copy(num, num2);
        }

        public final Integer component1() {
            return this.widthPx;
        }

        public final Integer component2() {
            return this.heightPx;
        }

        public final MeasureBounds copy(Integer num, Integer num2) {
            return new MeasureBounds(num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MeasureBounds)) {
                return false;
            }
            MeasureBounds measureBounds = (MeasureBounds) obj;
            return q.b(this.widthPx, measureBounds.widthPx) && q.b(this.heightPx, measureBounds.heightPx);
        }

        public final Integer getHeightPx() {
            return this.heightPx;
        }

        public final Integer getWidthPx() {
            return this.widthPx;
        }

        public int hashCode() {
            Integer num = this.widthPx;
            int i10 = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.heightPx;
            if (num2 != null) {
                i10 = num2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Integer num = this.widthPx;
            Integer num2 = this.heightPx;
            return "MeasureBounds(widthPx=" + num + ", heightPx=" + num2 + ")";
        }

        public /* synthetic */ MeasureBounds(Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
        }
    }
}
