.class Lcf/u$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf/u;->k(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcf/u;


# direct methods
.method constructor <init>(Lcf/u;)V
    .locals 0

    iput-object p1, p0, Lcf/u$a;->k:Lcf/u;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcf/u$a;->k:Lcf/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v0, v1}, Lcf/u;->a(Lcf/u;F)F

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcf/u$a;->k:Lcf/u;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {v0, p1}, Lcf/u;->b(Lcf/u;F)F

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcf/u$a;->k:Lcf/u;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-static {p1, v0}, Lcf/u;->c(Lcf/u;I)I

    .line 23
    .line 24
    .line 25
    return v0
    .line 26
    .line 27
.end method
