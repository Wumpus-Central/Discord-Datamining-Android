.class Landroidx/core/widget/NestedScrollView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method static a(Landroid/view/ViewGroup;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result p0

    return p0
.end method
