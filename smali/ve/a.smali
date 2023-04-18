.class public final synthetic Lve/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lve/b;

.field public final synthetic b:Lve/c;


# direct methods
.method public synthetic constructor <init>(Lve/b;Lve/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lve/a;->a:Lve/b;

    iput-object p2, p0, Lve/a;->b:Lve/c;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lve/a;->a:Lve/b;

    iget-object v1, p0, Lve/a;->b:Lve/c;

    invoke-static {v0, v1, p1}, Lve/b;->a(Lve/b;Lve/c;Landroid/animation/ValueAnimator;)V

    return-void
.end method
