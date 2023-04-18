.class public final synthetic Lri/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/a1;


# instance fields
.field public final synthetic k:Lri/d;

.field public final synthetic l:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lri/d;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lri/c;->k:Lri/d;

    iput-object p2, p0, Lri/c;->l:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, Lri/c;->k:Lri/d;

    iget-object v1, p0, Lri/c;->l:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lri/d;->M0(Lri/d;Ljava/lang/Runnable;)V

    return-void
.end method
