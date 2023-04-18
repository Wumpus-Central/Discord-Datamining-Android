.class Ld2/a$q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->F(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Z

.field final synthetic l:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Z)V
    .locals 0

    iput-object p1, p0, Ld2/a$q0;->l:Ld2/a;

    iput-boolean p2, p0, Ld2/a$q0;->k:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/a$q0;->l:Ld2/a;

    iget-boolean v1, p0, Ld2/a$q0;->k:Z

    invoke-static {v0, v1}, Ld2/a;->P(Ld2/a;Z)V

    return-void
.end method
