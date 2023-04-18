.class Lcom/yalantis/ucrop/UCropActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yalantis/ucrop/view/widget/HorizontalProgressWheelView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yalantis/ucrop/UCropActivity;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yalantis/ucrop/UCropActivity;


# direct methods
.method constructor <init>(Lcom/yalantis/ucrop/UCropActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/UCropActivity$c;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$c;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yalantis/ucrop/view/a;->z()V

    return-void
.end method

.method public b(FF)V
    .locals 1

    iget-object p2, p0, Lcom/yalantis/ucrop/UCropActivity$c;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {p2}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object p2

    const/high16 v0, 0x42280000    # 42.0f

    div-float/2addr p1, v0

    invoke-virtual {p2, p1}, Lcom/yalantis/ucrop/view/a;->x(F)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$c;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->f(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yalantis/ucrop/view/a;->t()V

    return-void
.end method
