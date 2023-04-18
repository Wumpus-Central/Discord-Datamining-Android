.class Ld2/a$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->I(Ld2/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/f;

.field final synthetic l:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ld2/f;)V
    .locals 0

    iput-object p1, p0, Ld2/a$t;->l:Ld2/a;

    iput-object p2, p0, Ld2/a$t;->k:Ld2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/a$t;->l:Ld2/a;

    iget-object v1, p0, Ld2/a$t;->k:Ld2/f;

    invoke-static {v0, v1}, Ld2/a;->e0(Ld2/a;Ld2/f;)V

    return-void
.end method
