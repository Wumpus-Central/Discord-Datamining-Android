.class public final synthetic Lq/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lq/h2;

.field public final synthetic b:Landroidx/camera/core/g0;


# direct methods
.method public synthetic constructor <init>(Lq/h2;Landroidx/camera/core/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/e2;->a:Lq/h2;

    iput-object p2, p0, Lq/e2;->b:Landroidx/camera/core/g0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq/e2;->a:Lq/h2;

    iget-object v1, p0, Lq/e2;->b:Landroidx/camera/core/g0;

    invoke-static {v0, v1, p1}, Lq/h2;->f(Lq/h2;Landroidx/camera/core/g0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
