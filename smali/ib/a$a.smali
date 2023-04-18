.class Lib/a$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/a;->b(Lib/d;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lib/d;


# direct methods
.method constructor <init>(Lib/d;)V
    .locals 0

    iput-object p1, p0, Lib/a$a;->a:Lib/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lib/a$a;->a:Lib/d;

    invoke-interface {p1}, Lib/d;->b()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lib/a$a;->a:Lib/d;

    invoke-interface {p1}, Lib/d;->a()V

    return-void
.end method
