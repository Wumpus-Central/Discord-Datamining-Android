.class Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$c;

.field final synthetic b:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;->b:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;

    iput-object p2, p0, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;->a:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;->b:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;->a:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$c;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;->n(FLandroidx/swiperefreshlayout/widget/CircularProgressDrawable$c;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;->b:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;->a:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$c;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, p1, v1, v2}, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;->b(FLandroidx/swiperefreshlayout/widget/CircularProgressDrawable$c;Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/CircularProgressDrawable$a;->b:Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
