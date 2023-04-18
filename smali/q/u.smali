.class public final synthetic Lq/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/k;


# direct methods
.method public synthetic constructor <init>(Lw/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/u;->k:Lw/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/u;->k:Lw/k;

    invoke-static {v0}, Lq/w$a;->e(Lw/k;)V

    return-void
.end method
