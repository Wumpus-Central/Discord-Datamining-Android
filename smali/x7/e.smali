.class public final synthetic Lx7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/n;


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx7/e;->k:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx7/e;->k:I

    invoke-static {v0}, Lx7/c$b;->c(I)Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0
.end method
