package com.discord.overlapping_circles;

import android.graphics.Path;
import com.discord.overlapping_circles.OverlappingCirclesView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Landroid/graphics/Path;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class OverlappingCirclesView$PlaceholderItem$separatorClipPath$2 extends AbstractC9973s implements Function0<Path> {
    final /* synthetic */ int $separatorSizePx;
    final /* synthetic */ OverlappingCirclesView.PlaceholderItem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlappingCirclesView$PlaceholderItem$separatorClipPath$2(OverlappingCirclesView.PlaceholderItem placeholderItem, int i) {
        super(0);
        this.this$0 = placeholderItem;
        this.$separatorSizePx = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Path invoke() {
        float f;
        float f2;
        int i;
        float f3;
        OverlappingCirclesView.Companion companion = OverlappingCirclesView.Companion;
        f = this.this$0.radius;
        f2 = this.this$0.radius;
        i = this.this$0.overlapPx;
        float f4 = f2 - i;
        f3 = this.this$0.radius;
        return companion.getClippingPathForSeparator(f, f4, f3, this.$separatorSizePx);
    }
}
