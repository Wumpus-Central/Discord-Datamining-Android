.class public final synthetic Lw/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/t0;

.field public final synthetic l:Lw/a2$a;


# direct methods
.method public synthetic constructor <init>(Lw/t0;Lw/a2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/s0;->k:Lw/t0;

    iput-object p2, p0, Lw/s0;->l:Lw/a2$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/s0;->k:Lw/t0;

    iget-object v1, p0, Lw/s0;->l:Lw/a2$a;

    invoke-static {v0, v1}, Lw/t0;->a(Lw/t0;Lw/a2$a;)V

    return-void
.end method
