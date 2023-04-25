.class public Lcom/yalantis/ucrop/view/UCropView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private k:Lcom/yalantis/ucrop/view/GestureCropImageView;

.field private final l:Lcom/yalantis/ucrop/view/OverlayView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/yalantis/ucrop/view/UCropView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    sget v0, Lef/e;->d:I

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 4
    sget p3, Lef/d;->b:I

    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/yalantis/ucrop/view/GestureCropImageView;

    iput-object p3, p0, Lcom/yalantis/ucrop/view/UCropView;->k:Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 5
    sget p3, Lef/d;->y:I

    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/yalantis/ucrop/view/OverlayView;

    iput-object p3, p0, Lcom/yalantis/ucrop/view/UCropView;->l:Lcom/yalantis/ucrop/view/OverlayView;

    .line 6
    sget-object v0, Lef/h;->U:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 7
    invoke-virtual {p3, p1}, Lcom/yalantis/ucrop/view/OverlayView;->g(Landroid/content/res/TypedArray;)V

    .line 8
    iget-object p2, p0, Lcom/yalantis/ucrop/view/UCropView;->k:Lcom/yalantis/ucrop/view/GestureCropImageView;

    invoke-virtual {p2, p1}, Lcom/yalantis/ucrop/view/a;->y(Landroid/content/res/TypedArray;)V

    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 10
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/UCropView;->c()V

    return-void
.end method

.method static synthetic a(Lcom/yalantis/ucrop/view/UCropView;)Lcom/yalantis/ucrop/view/OverlayView;
    .locals 0

    iget-object p0, p0, Lcom/yalantis/ucrop/view/UCropView;->l:Lcom/yalantis/ucrop/view/OverlayView;

    return-object p0
.end method

.method static synthetic b(Lcom/yalantis/ucrop/view/UCropView;)Lcom/yalantis/ucrop/view/GestureCropImageView;
    .locals 0

    iget-object p0, p0, Lcom/yalantis/ucrop/view/UCropView;->k:Lcom/yalantis/ucrop/view/GestureCropImageView;

    return-object p0
.end method

.method private c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/UCropView;->k:Lcom/yalantis/ucrop/view/GestureCropImageView;

    .line 2
    .line 3
    new-instance v1, Lcom/yalantis/ucrop/view/UCropView$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/yalantis/ucrop/view/UCropView$a;-><init>(Lcom/yalantis/ucrop/view/UCropView;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/yalantis/ucrop/view/a;->setCropBoundsChangeListener(Lff/c;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/yalantis/ucrop/view/UCropView;->l:Lcom/yalantis/ucrop/view/OverlayView;

    .line 12
    .line 13
    new-instance v1, Lcom/yalantis/ucrop/view/UCropView$b;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/yalantis/ucrop/view/UCropView$b;-><init>(Lcom/yalantis/ucrop/view/UCropView;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/yalantis/ucrop/view/OverlayView;->setOverlayViewChangeListener(Lff/d;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method public getCropImageView()Lcom/yalantis/ucrop/view/GestureCropImageView;
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/UCropView;->k:Lcom/yalantis/ucrop/view/GestureCropImageView;

    return-object v0
.end method

.method public getOverlayView()Lcom/yalantis/ucrop/view/OverlayView;
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/UCropView;->l:Lcom/yalantis/ucrop/view/OverlayView;

    return-object v0
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
