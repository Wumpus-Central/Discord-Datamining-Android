.class public final synthetic Lq/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/j0;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lq/j0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/z;->k:Lq/j0;

    iput-object p2, p0, Lq/z;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/z;->k:Lq/j0;

    iget-object v1, p0, Lq/z;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lq/j0;->p(Lq/j0;Ljava/lang/String;)V

    return-void
.end method
