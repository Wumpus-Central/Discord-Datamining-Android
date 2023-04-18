.class Ld2/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->D(Ld2/d1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/d1;

.field final synthetic l:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ld2/d1;)V
    .locals 0

    iput-object p1, p0, Ld2/a$d;->l:Ld2/a;

    iput-object p2, p0, Ld2/a$d;->k:Ld2/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/a$d;->l:Ld2/a;

    iget-object v1, p0, Ld2/a$d;->k:Ld2/d1;

    invoke-static {v0, v1}, Ld2/a;->V(Ld2/a;Ld2/d1;)V

    return-void
.end method
