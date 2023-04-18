.class Lg2/e0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg2/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg2/e0;


# direct methods
.method constructor <init>(Lg2/e0;)V
    .locals 0

    iput-object p1, p0, Lg2/e0$a;->a:Lg2/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lg2/e0$a;->a:Lg2/e0;

    .line 2
    .line 3
    invoke-static {p1}, Lg2/e0;->n(Lg2/e0;)Lo2/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lg2/e0$a;->a:Lg2/e0;

    .line 10
    .line 11
    invoke-static {p1}, Lg2/e0;->n(Lg2/e0;)Lo2/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lg2/e0$a;->a:Lg2/e0;

    .line 16
    .line 17
    invoke-static {v0}, Lg2/e0;->o(Lg2/e0;)Ls2/g;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ls2/g;->k()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1, v0}, Lo2/c;->M(F)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
    .line 29
    .line 30
    .line 31
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
