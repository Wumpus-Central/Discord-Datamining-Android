.class public final synthetic Li0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Li0/o0;

.field public final synthetic b:Li0/o0$i;


# direct methods
.method public synthetic constructor <init>(Li0/o0;Li0/o0$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/i0;->a:Li0/o0;

    iput-object p2, p0, Li0/i0;->b:Li0/o0$i;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li0/i0;->a:Li0/o0;

    iget-object v1, p0, Li0/i0;->b:Li0/o0$i;

    invoke-static {v0, v1, p1}, Li0/o0;->q(Li0/o0;Li0/o0$i;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
