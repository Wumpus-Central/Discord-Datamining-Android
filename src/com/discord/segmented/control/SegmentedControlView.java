package com.discord.segmented.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.view.C1369a;
import androidx.core.view.C1559w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.segmented.control.databinding.SegmentedControlBinding;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9610j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.C9683w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.AbstractC9689c;
import kotlin.properties.C9687a;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(m15074d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010Y\u001a\u00020X\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010Z\u0012\b\b\u0002\u0010\\\u001a\u00020\f¢\u0006\u0004\b]\u0010^J5\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0002J0\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0014R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R-\u0010+\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\f8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R-\u0010/\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\f8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R-\u00106\u001a\u0002002\b\b\u0001\u0010$\u001a\u0002008G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010:\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R-\u0010>\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\f8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(\"\u0004\b=\u0010*R+\u0010B\u001a\u0002002\u0006\u0010$\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b@\u00103\"\u0004\bA\u00105R-\u0010F\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\f8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(\"\u0004\bE\u0010*R+\u0010J\u001a\u0002002\u0006\u0010$\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010&\u001a\u0004\bH\u00103\"\u0004\bI\u00105R7\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001d0K2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0K8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010&\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR7\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001d0K2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0K8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010&\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR\u0016\u0010V\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006_"}, m15073d2 = {"Lcom/discord/segmented/control/SegmentedControlView;", "Landroid/widget/FrameLayout;", "T", "initialValue", "", "labelsChanged", "Lkotlin/properties/ReadWriteProperty;", "", "updateViewOnChange", "(Ljava/lang/Object;Z)Lkotlin/properties/ReadWriteProperty;", "", "updateView", "", "index", "Landroid/widget/TextView;", "getLabelView", "animate", "animateSelection", "maybeUpdateSegmentWidth", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, ViewProps.ON_LAYOUT, "Lcom/discord/segmented/control/databinding/SegmentedControlBinding;", "binding", "Lcom/discord/segmented/control/databinding/SegmentedControlBinding;", "Lkotlin/Function2;", "", "onSegmentSelected", "Lkotlin/jvm/functions/Function2;", "getOnSegmentSelected", "()Lkotlin/jvm/functions/Function2;", "setOnSegmentSelected", "(Lkotlin/jvm/functions/Function2;)V", "<set-?>", "containerBgColor$delegate", "Lkotlin/properties/ReadWriteProperty;", "getContainerBgColor", "()I", "setContainerBgColor", "(I)V", "containerBgColor", "selectedSegmentBgColor$delegate", "getSelectedSegmentBgColor", "setSelectedSegmentBgColor", "selectedSegmentBgColor", "", "cornerRadiusPx$delegate", "getCornerRadiusPx", "()F", "setCornerRadiusPx", "(F)V", "cornerRadiusPx", "selectedIndex$delegate", "getSelectedIndex", "setSelectedIndex", "selectedIndex", "segmentTextColor$delegate", "getSegmentTextColor", "setSegmentTextColor", "segmentTextColor", "segmentFontSizeSp$delegate", "getSegmentFontSizeSp", "setSegmentFontSizeSp", "segmentFontSizeSp", "selectedSegmentTextColor$delegate", "getSelectedSegmentTextColor", "setSelectedSegmentTextColor", "selectedSegmentTextColor", "selectedSegmentFontSizeSp$delegate", "getSelectedSegmentFontSizeSp", "setSelectedSegmentFontSizeSp", "selectedSegmentFontSizeSp", "", "labels$delegate", "getLabels", "()Ljava/util/List;", "setLabels", "(Ljava/util/List;)V", "labels", "accessibilityRoleDescriptions$delegate", "getAccessibilityRoleDescriptions", "setAccessibilityRoleDescriptions", "accessibilityRoleDescriptions", "segmentWidth", "I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "segmented_control_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SegmentedControlView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9656f0.m14681e(new C9683w(SegmentedControlView.class, "containerBgColor", "getContainerBgColor()I", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "selectedSegmentBgColor", "getSelectedSegmentBgColor()I", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "cornerRadiusPx", "getCornerRadiusPx()F", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "selectedIndex", "getSelectedIndex()I", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "segmentTextColor", "getSegmentTextColor()I", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "segmentFontSizeSp", "getSegmentFontSizeSp()F", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "selectedSegmentTextColor", "getSelectedSegmentTextColor()I", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "selectedSegmentFontSizeSp", "getSelectedSegmentFontSizeSp()F", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "labels", "getLabels()Ljava/util/List;", 0)), C9656f0.m14681e(new C9683w(SegmentedControlView.class, "accessibilityRoleDescriptions", "getAccessibilityRoleDescriptions()Ljava/util/List;", 0))};
    private final ReadWriteProperty accessibilityRoleDescriptions$delegate;
    private final SegmentedControlBinding binding;
    private final ReadWriteProperty containerBgColor$delegate;
    private final ReadWriteProperty cornerRadiusPx$delegate;
    private final ReadWriteProperty labels$delegate;
    private Function2<? super Integer, ? super String, Unit> onSegmentSelected;
    private final ReadWriteProperty segmentFontSizeSp$delegate;
    private final ReadWriteProperty segmentTextColor$delegate;
    private int segmentWidth;
    private final ReadWriteProperty selectedIndex$delegate;
    private final ReadWriteProperty selectedSegmentBgColor$delegate;
    private final ReadWriteProperty selectedSegmentFontSizeSp$delegate;
    private final ReadWriteProperty selectedSegmentTextColor$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedControlView(Context context) {
        this(context, null, 0, 6, null);
        C9677q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ SegmentedControlView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void animateSelection(boolean z) {
        long j;
        ViewPropertyAnimator animate = this.binding.selectedSegmentBg.animate();
        if (z) {
            j = 150;
        } else {
            j = 0;
        }
        animate.setDuration(j).setInterpolator(new DecelerateInterpolator()).translationX(getSelectedIndex() * this.binding.selectedSegmentBg.getWidth());
    }

    private final TextView getLabelView(final int i) {
        TextView textView;
        View childAt = this.binding.segmentContainer.getChildAt(i);
        if (childAt instanceof TextView) {
            textView = (TextView) childAt;
        } else {
            textView = null;
        }
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(getContext());
        C1559w0.m36990q0(textView2, new C1369a() { // from class: com.discord.segmented.control.SegmentedControlView$getLabelView$1$1
            @Override // androidx.core.view.C1369a
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                C9677q.m14633g(host, "host");
                C9677q.m14633g(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                boolean z = true;
                info.m37367l0(true);
                if (i != this.getSelectedIndex()) {
                    z = false;
                }
                info.m37341y0(z);
                info.m37347v0(this.getAccessibilityRoleDescriptions().get(i));
            }
        });
        this.binding.segmentContainer.addView(textView2, new LinearLayout.LayoutParams(0, -1, 1.0f));
        return textView2;
    }

    private final void maybeUpdateSegmentWidth() {
        int i;
        View childAt = this.binding.segmentContainer.getChildAt(0);
        if (childAt != null) {
            i = childAt.getWidth();
        } else {
            i = 0;
        }
        if (this.segmentWidth != i) {
            this.segmentWidth = i;
            CardView cardView = this.binding.selectedSegmentBg;
            C9677q.m14634f(cardView, "binding.selectedSegmentBg");
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                cardView.setLayoutParams(layoutParams);
                ViewMeasureExtensionsKt.measureAndLayout(this);
                updateView$default(this, false, 1, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateView(boolean z) {
        if (z) {
            this.binding.segmentContainer.removeAllViews();
        }
        this.binding.rootCardView.setRadius(getCornerRadiusPx());
        this.binding.rootCardView.setCardBackgroundColor(getContainerBgColor());
        this.binding.selectedSegmentBg.setCardBackgroundColor(getSelectedSegmentBgColor());
        final int i = 0;
        for (Object obj : getLabels()) {
            int i2 = i + 1;
            if (i < 0) {
                C9610j.m14810s();
            }
            final String str = (String) obj;
            TextView labelView = getLabelView(i);
            labelView.setText(str);
            labelView.setGravity(17);
            DiscordFontUtilsKt.setDiscordFont(labelView, DiscordFont.PrimarySemibold);
            labelView.setTextSize(getSegmentFontSizeSp());
            labelView.setTextColor(getSegmentTextColor());
            labelView.setOnClickListener(new View.OnClickListener() { // from class: com.discord.segmented.control.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SegmentedControlView.updateView$lambda$3$lambda$2$lambda$1(SegmentedControlView.this, i, str, view);
                }
            });
            if (i == getSelectedIndex()) {
                labelView.setTextSize(getSelectedSegmentFontSizeSp());
                labelView.setTextColor(getSelectedSegmentTextColor());
            }
            i = i2;
        }
        ViewMeasureExtensionsKt.measureAndLayout(this);
        animateSelection(!z);
    }

    static /* synthetic */ void updateView$default(SegmentedControlView segmentedControlView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        segmentedControlView.updateView(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateView$lambda$3$lambda$2$lambda$1(SegmentedControlView this$0, int i, String label, View view) {
        C9677q.m14633g(this$0, "this$0");
        C9677q.m14633g(label, "$label");
        Function2<? super Integer, ? super String, Unit> function2 = this$0.onSegmentSelected;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), label);
        }
    }

    private final <T> ReadWriteProperty<Object, T> updateViewOnChange(final T t, final boolean z) {
        C9687a aVar = C9687a.f25836a;
        return new AbstractC9689c<T>(t) { // from class: com.discord.segmented.control.SegmentedControlView$updateViewOnChange$$inlined$observable$1
            @Override // kotlin.properties.AbstractC9689c
            protected void afterChange(KProperty<?> property, T t2, T t3) {
                C9677q.m14633g(property, "property");
                if (!C9677q.m14638b(t3, t2)) {
                    this.updateView(z);
                }
            }
        };
    }

    static /* synthetic */ ReadWriteProperty updateViewOnChange$default(SegmentedControlView segmentedControlView, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return segmentedControlView.updateViewOnChange(obj, z);
    }

    public final List<String> getAccessibilityRoleDescriptions() {
        return (List) this.accessibilityRoleDescriptions$delegate.getValue(this, $$delegatedProperties[9]);
    }

    public final int getContainerBgColor() {
        return ((Number) this.containerBgColor$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final float getCornerRadiusPx() {
        return ((Number) this.cornerRadiusPx$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    public final List<String> getLabels() {
        return (List) this.labels$delegate.getValue(this, $$delegatedProperties[8]);
    }

    public final Function2<Integer, String, Unit> getOnSegmentSelected() {
        return this.onSegmentSelected;
    }

    public final float getSegmentFontSizeSp() {
        return ((Number) this.segmentFontSizeSp$delegate.getValue(this, $$delegatedProperties[5])).floatValue();
    }

    public final int getSegmentTextColor() {
        return ((Number) this.segmentTextColor$delegate.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final int getSelectedIndex() {
        return ((Number) this.selectedIndex$delegate.getValue(this, $$delegatedProperties[3])).intValue();
    }

    public final int getSelectedSegmentBgColor() {
        return ((Number) this.selectedSegmentBgColor$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final float getSelectedSegmentFontSizeSp() {
        return ((Number) this.selectedSegmentFontSizeSp$delegate.getValue(this, $$delegatedProperties[7])).floatValue();
    }

    public final int getSelectedSegmentTextColor() {
        return ((Number) this.selectedSegmentTextColor$delegate.getValue(this, $$delegatedProperties[6])).intValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        maybeUpdateSegmentWidth();
    }

    public final void setAccessibilityRoleDescriptions(List<String> list) {
        C9677q.m14633g(list, "<set-?>");
        this.accessibilityRoleDescriptions$delegate.setValue(this, $$delegatedProperties[9], list);
    }

    public final void setContainerBgColor(int i) {
        this.containerBgColor$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setCornerRadiusPx(float f) {
        this.cornerRadiusPx$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f));
    }

    public final void setLabels(List<String> list) {
        C9677q.m14633g(list, "<set-?>");
        this.labels$delegate.setValue(this, $$delegatedProperties[8], list);
    }

    public final void setOnSegmentSelected(Function2<? super Integer, ? super String, Unit> function2) {
        this.onSegmentSelected = function2;
    }

    public final void setSegmentFontSizeSp(float f) {
        this.segmentFontSizeSp$delegate.setValue(this, $$delegatedProperties[5], Float.valueOf(f));
    }

    public final void setSegmentTextColor(int i) {
        this.segmentTextColor$delegate.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setSelectedIndex(int i) {
        this.selectedIndex$delegate.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }

    public final void setSelectedSegmentBgColor(int i) {
        this.selectedSegmentBgColor$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setSelectedSegmentFontSizeSp(float f) {
        this.selectedSegmentFontSizeSp$delegate.setValue(this, $$delegatedProperties[7], Float.valueOf(f));
    }

    public final void setSelectedSegmentTextColor(int i) {
        this.selectedSegmentTextColor$delegate.setValue(this, $$delegatedProperties[6], Integer.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List i2;
        List i3;
        C9677q.m14633g(context, "context");
        SegmentedControlBinding inflate = SegmentedControlBinding.inflate(LayoutInflater.from(context), this, true);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        float f = context.getResources().getDisplayMetrics().density * 2.0f;
        inflate.selectedSegmentBg.setElevation(f);
        inflate.segmentContainer.setElevation(f);
        inflate.segmentContainer.setOutlineProvider(null);
        this.containerBgColor$delegate = updateViewOnChange$default(this, 0, false, 2, null);
        this.selectedSegmentBgColor$delegate = updateViewOnChange$default(this, 0, false, 2, null);
        this.cornerRadiusPx$delegate = updateViewOnChange$default(this, Float.valueOf(SizeUtilsKt.getDpToPx(4)), false, 2, null);
        this.selectedIndex$delegate = updateViewOnChange$default(this, 0, false, 2, null);
        this.segmentTextColor$delegate = updateViewOnChange$default(this, 0, false, 2, null);
        Float valueOf = Float.valueOf(0.0f);
        this.segmentFontSizeSp$delegate = updateViewOnChange$default(this, valueOf, false, 2, null);
        this.selectedSegmentTextColor$delegate = updateViewOnChange$default(this, 0, false, 2, null);
        this.selectedSegmentFontSizeSp$delegate = updateViewOnChange$default(this, valueOf, false, 2, null);
        i2 = C9610j.m14820i();
        this.labels$delegate = updateViewOnChange(i2, true);
        i3 = C9610j.m14820i();
        this.accessibilityRoleDescriptions$delegate = updateViewOnChange(i3, true);
    }
}
