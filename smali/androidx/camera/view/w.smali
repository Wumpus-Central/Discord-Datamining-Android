.class public final synthetic Landroidx/camera/view/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/view/a0;

.field public final synthetic b:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/a0;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/w;->a:Landroidx/camera/view/a0;

    iput-object p2, p0, Landroidx/camera/view/w;->b:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/w;->a:Landroidx/camera/view/a0;

    iget-object v1, p0, Landroidx/camera/view/w;->b:Landroid/view/Surface;

    invoke-static {v0, v1, p1}, Landroidx/camera/view/a0;->m(Landroidx/camera/view/a0;Landroid/view/Surface;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
