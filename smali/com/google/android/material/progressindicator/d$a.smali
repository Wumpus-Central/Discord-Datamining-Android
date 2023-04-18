.class Lcom/google/android/material/progressindicator/d$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/progressindicator/d;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/progressindicator/d;


# direct methods
.method constructor <init>(Lcom/google/android/material/progressindicator/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/progressindicator/d$a;->a:Lcom/google/android/material/progressindicator/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/material/progressindicator/d$a;->a:Lcom/google/android/material/progressindicator/d;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/material/progressindicator/d;->i(Lcom/google/android/material/progressindicator/d;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/material/progressindicator/d$a;->a:Lcom/google/android/material/progressindicator/d;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/google/android/material/progressindicator/d;->k(Lcom/google/android/material/progressindicator/d;)Lcom/google/android/material/progressindicator/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v1, v1, Lcom/google/android/material/progressindicator/b;->c:[I

    .line 19
    .line 20
    array-length v1, v1

    .line 21
    rem-int/2addr v0, v1

    .line 22
    invoke-static {p1, v0}, Lcom/google/android/material/progressindicator/d;->j(Lcom/google/android/material/progressindicator/d;I)I

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method
