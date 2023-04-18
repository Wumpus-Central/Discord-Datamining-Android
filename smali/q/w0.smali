.class public final synthetic Lq/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lq/r0$c;

.field public final synthetic b:Lw/n0$a;


# direct methods
.method public synthetic constructor <init>(Lq/r0$c;Lw/n0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/w0;->a:Lq/r0$c;

    iput-object p2, p0, Lq/w0;->b:Lw/n0$a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq/w0;->a:Lq/r0$c;

    iget-object v1, p0, Lq/w0;->b:Lw/n0$a;

    invoke-static {v0, v1, p1}, Lq/r0$c;->b(Lq/r0$c;Lw/n0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
