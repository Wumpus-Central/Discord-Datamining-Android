.class Lcom/facebook/react/views/image/ReactImageView$RoundingOutlineProvider;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/image/ReactImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RoundingOutlineProvider"
.end annotation


# instance fields
.field radius:Ljava/lang/Float;

.field final synthetic this$0:Lcom/facebook/react/views/image/ReactImageView;


# direct methods
.method private constructor <init>(Lcom/facebook/react/views/image/ReactImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$RoundingOutlineProvider;->this$0:Lcom/facebook/react/views/image/ReactImageView;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$RoundingOutlineProvider;->radius:Ljava/lang/Float;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/views/image/ReactImageView;Lcom/facebook/react/views/image/ReactImageView$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/views/image/ReactImageView$RoundingOutlineProvider;-><init>(Lcom/facebook/react/views/image/ReactImageView;)V

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView$RoundingOutlineProvider;->radius:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method
