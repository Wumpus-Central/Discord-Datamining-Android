.class public final synthetic Lw/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lfc/b;

.field public final synthetic l:Landroidx/concurrent/futures/c$a;

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Lfc/b;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/x0;->k:Lfc/b;

    iput-object p2, p0, Lw/x0;->l:Landroidx/concurrent/futures/c$a;

    iput-wide p3, p0, Lw/x0;->m:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lw/x0;->k:Lfc/b;

    iget-object v1, p0, Lw/x0;->l:Landroidx/concurrent/futures/c$a;

    iget-wide v2, p0, Lw/x0;->m:J

    invoke-static {v0, v1, v2, v3}, Lw/b1;->b(Lfc/b;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method
