.class public final synthetic Lw/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/u1;

.field public final synthetic l:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Lw/u1;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/s1;->k:Lw/u1;

    iput-object p2, p0, Lw/s1;->l:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/s1;->k:Lw/u1;

    iget-object v1, p0, Lw/s1;->l:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1}, Lw/u1;->g(Lw/u1;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
