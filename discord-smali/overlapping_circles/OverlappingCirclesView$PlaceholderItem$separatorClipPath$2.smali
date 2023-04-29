.class final Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;-><init>(Landroid/content/Context;IZIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/graphics/Path;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/Path;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $separatorSizePx:I

.field final synthetic this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;


# direct methods
.method constructor <init>(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;I)V
    .locals 0

    iput-object p1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->$separatorSizePx:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/graphics/Path;
    .locals 5

    .line 2
    sget-object v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->Companion:Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;

    .line 3
    iget-object v1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;

    invoke-static {v1}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->access$getRadius$p(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;)F

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;

    invoke-static {v2}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->access$getRadius$p(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;)F

    move-result v2

    iget-object v3, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;

    invoke-static {v3}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->access$getOverlapPx$p(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    .line 5
    iget-object v3, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;

    invoke-static {v3}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;->access$getRadius$p(Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;)F

    move-result v3

    .line 6
    iget v4, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->$separatorSizePx:I

    .line 7
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;->getClippingPathForSeparator(FFFI)Landroid/graphics/Path;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem$separatorClipPath$2;->invoke()Landroid/graphics/Path;

    move-result-object v0

    return-object v0
.end method
