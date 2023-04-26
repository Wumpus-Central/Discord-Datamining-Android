.class public final Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;-><init>(Landroid/content/Context;IIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $this_doOnPreDraw:Landroid/view/View;

.field final synthetic this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1;->$this_doOnPreDraw:Landroid/view/View;

    iput-object p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1;->this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1;->$this_doOnPreDraw:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1;->this$0:Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v3, v0}, Lcg/h;->c(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 32
    .line 33
    const-string v1, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
