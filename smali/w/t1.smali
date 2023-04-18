.class public final synthetic Lw/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/u1$a;

.field public final synthetic l:Lw/u1$b;


# direct methods
.method public synthetic constructor <init>(Lw/u1$a;Lw/u1$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/t1;->k:Lw/u1$a;

    iput-object p2, p0, Lw/t1;->l:Lw/u1$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/t1;->k:Lw/u1$a;

    iget-object v1, p0, Lw/t1;->l:Lw/u1$b;

    invoke-static {v0, v1}, Lw/u1$a;->b(Lw/u1$a;Lw/u1$b;)V

    return-void
.end method
