.class Ld2/u$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/u;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/u;


# direct methods
.method constructor <init>(Ld2/u;)V
    .locals 0

    iput-object p1, p0, Ld2/u$e;->k:Ld2/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ld2/u$e;->k:Ld2/u;

    invoke-static {v0}, Ld2/u;->p(Ld2/u;)V

    return-void
.end method
