.class public final synthetic Lw/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/u1;

.field public final synthetic l:Lw/u1$a;

.field public final synthetic m:Lw/u1$a;


# direct methods
.method public synthetic constructor <init>(Lw/u1;Lw/u1$a;Lw/u1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/r1;->k:Lw/u1;

    iput-object p2, p0, Lw/r1;->l:Lw/u1$a;

    iput-object p3, p0, Lw/r1;->m:Lw/u1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw/r1;->k:Lw/u1;

    iget-object v1, p0, Lw/r1;->l:Lw/u1$a;

    iget-object v2, p0, Lw/r1;->m:Lw/u1$a;

    invoke-static {v0, v1, v2}, Lw/u1;->f(Lw/u1;Lw/u1$a;Lw/u1$a;)V

    return-void
.end method
