.class public final synthetic Lq/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lq/k3;

.field public final synthetic b:Landroidx/camera/core/d3;


# direct methods
.method public synthetic constructor <init>(Lq/k3;Landroidx/camera/core/d3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/i3;->a:Lq/k3;

    iput-object p2, p0, Lq/i3;->b:Landroidx/camera/core/d3;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq/i3;->a:Lq/k3;

    iget-object v1, p0, Lq/i3;->b:Landroidx/camera/core/d3;

    invoke-static {v0, v1, p1}, Lq/k3;->b(Lq/k3;Landroidx/camera/core/d3;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
