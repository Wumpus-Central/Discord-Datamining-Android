.class public final Landroidx/core/view/GestureDetectorCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/GestureDetectorCompat$b;,
        Landroidx/core/view/GestureDetectorCompat$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/core/view/GestureDetectorCompat$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/core/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroidx/core/view/GestureDetectorCompat$b;

    invoke-direct {v0, p1, p2, p3}, Landroidx/core/view/GestureDetectorCompat$b;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    iput-object v0, p0, Landroidx/core/view/GestureDetectorCompat;->a:Landroidx/core/view/GestureDetectorCompat$a;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/view/GestureDetectorCompat;->a:Landroidx/core/view/GestureDetectorCompat$a;

    invoke-interface {v0, p1}, Landroidx/core/view/GestureDetectorCompat$a;->b(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
