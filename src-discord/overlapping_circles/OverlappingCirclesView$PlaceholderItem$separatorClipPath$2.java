package com.discord.overlapping_circles;

import android.graphics.Path;
import com.discord.overlapping_circles.OverlappingCirclesView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Path;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OverlappingCirclesView$PlaceholderItem$separatorClipPath$2 extends s implements Function0<Path> {
    final /* synthetic */ int $separatorSizePx;
    final /* synthetic */ OverlappingCirclesView.PlaceholderItem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlappingCirclesView$PlaceholderItem$separatorClipPath$2(OverlappingCirclesView.PlaceholderItem placeholderItem, int i10) {
        super(0);
        this.this$0 = placeholderItem;
        this.$separatorSizePx = i10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Path invoke() {
        float f10;
        float f11;
        int i10;
        float f12;
        OverlappingCirclesView.Companion companion = OverlappingCirclesView.Companion;
        f10 = this.this$0.radius;
        f11 = this.this$0.radius;
        i10 = this.this$0.overlapPx;
        float f13 = f11 - i10;
        f12 = this.this$0.radius;
        return companion.getClippingPathForSeparator(f10, f13, f12, this.$separatorSizePx);
    }
}