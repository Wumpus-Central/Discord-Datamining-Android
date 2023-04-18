.class public final synthetic Landroidx/camera/core/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/c2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/c2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/b2;->a:Landroidx/camera/core/c2;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b2;->a:Landroidx/camera/core/c2;

    invoke-static {v0, p1}, Landroidx/camera/core/c2;->c(Landroidx/camera/core/c2;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
